package com.frankie.demo.lambda.crazy;

/**
 * @author: Yao Frankie
 * @date: 2020/9/9 17:22
 */
public class Test {

    private static final String NAME = "yaofrankie";

    public static void main(String[] args) {

        // 1. 类名::类方法
        // Converter c = s -> Integer.parseInt(s);
        Converter c1 = Integer::parseInt;
        Integer ans = c1.convert("10");
        // System.out.println(ans);

        // 2. 类名::实例方法
        // SubStringFI sub = (s, l, r) -> s.substring(l, r);
        SubStringFI sub = String::substring;
        String subName = sub.substring(NAME, 3, 10);
        // System.out.println(subName);

        // 3. 特定对象::实例方法
        // Converter c3 = s -> NAME.indexOf(s);
        Converter c3 = NAME::indexOf;
        Integer idx = c3.convert("an");
        // System.out.println(idx);

        // 4. 类名::new
        // Build build = (a, b) -> new User(a, b);
        Build build = User::new;
        User user = build.buildUser(NAME, 24);
        System.out.println(user);
    }
}
