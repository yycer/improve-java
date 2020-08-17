/**
 * @author: Yao Frankie
 * @date: 2020/8/17 12:46
 */
public class AnonymousClassTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class.");
            }
        }).start();
    }
}
