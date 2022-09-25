public class codegym7 {
    public static void main(String[] args) {
        Student jen = new Student();
        jen.name = "珍";
        jen.age = 21;

        Student beth = new Student();
        beth.name = "贝丝";
        beth.age = 15;

        System.out.println("珍的年龄为 " + jen.age);
        System.out.println("贝丝的年龄为 " + beth.age);

        ageSwap(jen, beth); // ~~~~~~~

        System.out.println("珍的年龄为 " + jen.age);
        System.out.println("贝丝的年龄为 " + beth.age);
    }

    private static void ageSwap(Student a, Student b) {
        int c = a.age;
        a.age = b.age;
        b.age = c;
    }

    static class Student {
        String name;
        int age;
    }
}
/*
珍的年龄为 21
贝丝的年龄为 15
珍的年龄为 15
贝丝的年龄为 21
 */

class MethodCall1 {
    public static void main(String[] args) {
        print4("我喜欢移动它，移动它。");
    }
    public static void print4(String s) {
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
}

// 编写了一个函数，该函数将在屏幕上将传递的字符串显示四次。然后，在第 40 行调用了 print4 函数
// 当程序到达第 40 行时，它将跳到第 42 行~~~~~~并将值"我喜欢移动它，移动它"赋给变量s。
// 接下来将执行 43-46 行。函数完成，程序将重新回到第 41 行开始执行~~~~~~
// 不仅可以将参数（值）传递给函数，函数还可以返回其工作结果（返回值）。这是通过关键字 return 完成的

class MethodCall2 {
    public static void main(String[] args) {
        int a = 5, b = 7;
        int m = min(a, b);
        System.out.println("最小值为 "+ m);
    }
    public static int min(int c, int d) {    // 看58行的格式~~~~~~
        int m2;
        if (c < d)
            m2 = c; // 只能是m+2 m2
        else
            m2 = d;

        return m2;
    }
}

/*
“函数计算出某个值，然后使用 return 语句将该值传递给调用它的任何函数。至少，我看到的就是这样。”
“你说的很对！”
“但是这里的 void 类型是什么呢？”
“有些函数只是执行操作，但不计算和返回任何值，例如我们的 main() 方法。特殊的 return 类型 void 就是针对此类功能而创建的。”
“如果函数不返回任何内容，为什么不声明无内容呢？”
“还记得我们如何声明变量吗？类型和名称。对于函数，我们声明类型、名称和括号。函数名称后跟括号是你调用函数的方式。”
“因此，发明一个‘void 类型’比将函数分为两个类别（返回值的类别和不返回值的类别）更容易？”
“的确如此。你真是一个聪明的孩子。”
“我们如何返回 void 类型呢？”
“我们不需要返回。它的工作原理如下。当执行 return 语句时，Java 机器会计算单词‘return’右侧的表达式的值，
将此值存储在内存的特殊部分，然后立即结束函数。在调用函数的位置使用存储的值，作为函数调用的结果你可以在我前面给出的示例中看到这一点。”
“你是指将 int m = min(a,b) 转换为 m = m2 的部分？”
“是的。函数完成后，一切都像将该函数的返回值写入其位置一样。在你的大脑中重复此短语，并查看上一示例中的代码。”
 */




