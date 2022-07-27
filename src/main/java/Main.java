import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static Callable<Integer> getCallableInteger() {
        // your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

//        return new Callable<Integer>() {
//            @Override
//            public Integer call() throws Exception {
//                return num;
//            }
//        };
        System.out.println("hi");
        return null;
    }
    getCallableInteger();
}