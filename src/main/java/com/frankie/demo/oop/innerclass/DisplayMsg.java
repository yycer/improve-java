package com.frankie.demo.oop.innerclass;

/**
 * @author: Yao Frankie
 * @date: 2020/9/9 16:06
 */
public class DisplayMsg {

    public void displayMsg(Message m){
        System.out.println(m.greet());
    }

    public static void main(String[] args) {
        DisplayMsg dm = new DisplayMsg();
//        dm.displayMsg(new Message() {
//            @Override
//            public String greet() {
//                return "Hello yyc";
//            }
//        });

        dm.displayMsg(() -> "Hi Frankie");
    }
}
