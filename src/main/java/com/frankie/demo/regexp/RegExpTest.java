package com.frankie.demo.regexp;

import com.frankie.demo.basiclib.SystemTest;

import java.security.cert.PKIXParameters;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: Yao Frankie
 * @date: 2020/9/13 11:40
 */
public class RegExpTest {

    public static void main(String[] args) {

//        detectHTMLTags();
        detectHTMLLinks();
    }

    private static void detectHTMLLinks() {

        String s = "<div class=\"more-info\"><a href=\"http://www.quackit.com/html/examples/html_links_examples.cfm\">More Link Examples...</a></div>";

        String pattern = "href=(.*)</";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(s);
        if (m.find()){
            System.out.println(m.group(0));
        }

    }

    private static void detectHTMLTags() {

        var s = new String[2];
        s[0] = "<p><a href=\"http://www.quackit.com/html/tutorial/html_links.cfm\">Example Link</a></p>";
        s[1] = "<div class=\"more-info\"><a href=\"http://www.quackit.com/html/examples/html_links_examples.cfm\">More Link Examples...</a></div>";

        SortedSet<String> tags = new TreeSet<String>();
        for(int i = 0; i < 2; i++)
        {
            Pattern p = Pattern.compile("<\\b(\\w+)\\b.*?>");
            Matcher m = p.matcher(s[i]);
            while(m.find())
            {
                System.out.println(m.group(1));
                tags.add(m.group(1));
            }
        }
        System.out.println(tags);

        StringBuilder sb = new StringBuilder();
        sb.append("123");
        sb.setLength(sb.length() - 1);
    }
}
