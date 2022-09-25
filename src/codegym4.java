import java.util.Scanner;

public class codegym4 {
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

/*
如果名称后面跟着圆括号，那么这是在声明一个新方法。
如果后面没有括号，那么这是在声明一个变量。
1.String name;变量名称为 name，它是一个 String。

2.String getName(){

};方法名称为 getName，它会返回一个 String。
 */

// 编写一个小程序时，必须首先创建一个类，在其中声明一个main方法，只有这样才可以在该方法中编写代码。

