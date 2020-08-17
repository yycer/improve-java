/**
 * @author: Yao Frankie
 * @date: 2020/8/17 12:58
 */
public class Demo {

    public static void main(String[] args) {

    }

    /**
     * 在一个类中创建内部类
     */
//    public class CommonInnerClass implements Runnable{
//        @Override
//        public void run() {
//            System.out.println("Common inner class.");
//        }
//    }

    /**
     * 匿名内部类
     */
    private Runnable task1 = new Runnable() {
        @Override
        public void run() {
            System.out.println("Anonymous class.");
        }
    };
//
//    /**
//     * 方法内部创建内部类
//     */
//    public void work(){
//        class WorkInnerClass implements Runnable{
//            @Override
//            public void run() {
//                System.out.println("Work inner class.");
//            }
//        }
//        new WorkInnerClass().run();
//    }
}
