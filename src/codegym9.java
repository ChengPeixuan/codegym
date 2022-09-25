public class codegym9 {
    public static void main(String[] args) {
        System.out.print("西班牙");
        System.out.print("的");
        System.out.print("雨");
        // 西班牙的雨

        System.out.print("西班牙");
        System.out.println("的");
        System.out.print("雨");
        // 西班牙的
        // 雨

        System.out.println("西班牙");
        System.out.println("的");
        System.out.println("雨");
        // 西班牙
        // 的
        // 雨

        int a = 5, b = 6;
        System.out.print(a);
        System.out.print(b);
        // 56

        int c = 5, d = 6;
        System.out.print(" " + c + " " + d);
        //  5 6

        int e = 5, f = 6;
        System.out.print("总和为 " + (e + f));
        // 总和为 11
    }
}

/*
这三个示例是等效的
1.
Cat cat = new Cat("奥斯卡");
System.out.println("猫是 " + cat);
2.
Cat cat = new Cat("奥斯卡");
System.out.println("猫是 " + cat.toString());
3.
Cat cat = new Cat("奥斯卡");
String catText = cat.toString();
System.out.println("猫是 " + catText);
 */

/*
“但是我的程序显示‘猫是 com.codegym.lesson3.Cat@1fb8ee3’。这到底是什么意思？”
“Object 类的标准 toString() 方法返回一个包含类名和对象内存地址（以十六进制形式表示）的字符串。”
“嗯。这种方法可能会带来什么好处？”
“你可以在类中编写自己的 toString() 实现。到时候将调用此方法。”
 */

// 如果我们将字符串、数字和猫相加，那么数字和猫都会被转换为字符串。下面是一些示例:
/*
class cat{
    Cat cat = new Cat();
    String text = "猫是 " + cat;
}
*/
