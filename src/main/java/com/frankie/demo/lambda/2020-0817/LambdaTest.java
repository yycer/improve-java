/**
 * @author: Yao Frankie
 * @date: 2020/8/17 12:50
 */
public class LambdaTest {

    public static void main(String[] args) {
        new Thread(() -> System.out.println("Lambda.")).start();
    }
}
