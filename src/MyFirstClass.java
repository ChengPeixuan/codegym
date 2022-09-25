import java.util.Scanner;

public class MyFirstClass {
    public static void main(String[] args) {
        int a, b, c;
        String s1, s2;
        System.out.println("输入两个数字");
        a = new Scanner(System.in).nextInt();
        b = new Scanner(System.in).nextInt();
        c = a + b;
        System.out.println("总和为" + c);
    }
}
