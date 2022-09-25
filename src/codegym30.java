// 异常讲解
/*
异常是一种特殊的机制，可以让我们在程序中处理错误。以下是程序中可能发生的一些错误示例：
1.程序可能会在硬盘已满时尝试写入文件。
2.程序可能会尝试在存储空引用的变量上调用方法。
3.该程序可能会尝试将数字除以 0。”
所有这些动作都会导致错误。通常，结果是程序立即终止，因为在这种情况下继续执行代码没有意义。

每个函数都将返回其工作状态。0 表示它正常运行。任何其他值将意味着出现了错误，返回值就是一个错误代码。
异常和错误处理机制完美解决了这个问题。下面是此代码的工作方式：

1.发生错误时，Java 机器会创建一个特殊对象（异常），并在其中保存所有错误信息。不同错误有不同的异常。

2.异常会导致程序立即退出当前函数以及下一个函数，依此类推，直到退出 main 方法为止。然后程序终止。程序员也可以说，Java 机器‘解开调用堆栈’。
 */

// 程序并不总是终止。因为有一种捕获异常的方法。我们可以在适当的地方编写特殊的代码，以捕获要关注的异常并对其进行处理。这很重要。
// 特殊的 try-catch 结构就为此而生。下面是此代码的工作方式：
// 捕获异常（除以 0）并继续工作的程序示例。
public class codegym30 {
    public static void main(String[] args) {
        System.out.println("程序启动");

        try {
            System.out.println("调用 method1 之前");
            method1();
            System.out.println("调用 method1 之后。这将永远不会显示");
        }
        catch (Exception e) {
            System.out.println("已捕获异常");
        }

        System.out.println("程序仍在运行");
    }

    public static void method1() {
        int a = 100;
        int b = 0;
        System.out.println(a / b);
    }
}

// 屏幕输出：
/*
程序启动
调用 method1 之前
已捕获异常
程序仍在运行
 */

/*
但是‘调用 method1 之后。这将永远不会显示’为何不会显示在屏幕上？
在第 25 行中，我们除以 0，这将导致错误，出现异常。Java 机器创建一个 ArithmeticException 对象及错误信息。对象是异常。
method1 方法中出现异常。这将导致方法立即终止。如果不用 try-catch 块，这将导致 main 方法终止。
如果 try 块中发生异常，它则会在 catch 块被捕获。该 try 块剩余的代码不会被执行。相反，catch 块将开始执行。
换句话说，代码的工作方式如下：

1.如果 try 块中发生异常，代码会在发生异常的位置停止执行，此时 catch 块开始执行。

2.如果没有异常发生，那么 try 块执行到最后，而且 catch 块不会执行。

想象一下，在每个方法调用之后，我们都会检查该方法是正常返回还是由于异常而突然终止。如果发生异常，那么我们继续执行 catch 块（如果有）来捕获异常。如果没有 catch 块，那么我们终止当前方法，然后调用我们的方法执行相同的检查。

catch 语句中的‘Exception’:
所有的异常都是继承 Exception 类的类。我们可以在 catch 块中指定异常类来捕获特定的异常，或者我们指定它们的公有父类 Exception 来捕获所有异常。然后，我们可以从变量 e 中获取所有必要的错误信息（它存储了异常对象的参考信息）。
 */

// 如果我的方法中发生了不同的异常，我能否区别处理？
class yichang {
    public static void main(String[] args) {
        System.out.println("程序启动");

        try {
            System.out.println("调用 method1 之前");
            method1();
            System.out.println("调用 method1 之后。这将永远不会显示");
        }
        catch (NullPointerException e) {
            System.out.println("空引用。已捕获异常");
        }
        catch (ArithmeticException e) {
            System.out.println("除以零。已捕获异常");
        }
        catch (Exception e) {
            System.out.println("其他任何错误。已捕获异常");
        }

        System.out.println("程序仍在运行");
    }

    public static void method1() {
        int a = 100;
        int b = 0;
        System.out.println(a / b);
    }
}
// 该 try 块可以与多个捕获特定类型异常的 catch 块配对。

// 在 Java 中，异常分为两种：已检查和未检查（即必须捕获的异常和不必捕获的异常）。默认情况下，必须捕获所有异常。

//  Java 机器抛出的异常:
// 如果方法中抛出（发生）ClassNotFoundException 或 FileNotFoundException，那么程序员仅需在方法声明中指出它们。这些就是已检查异常。通常看似来如下所示：
/* 已检查异常示例
1.public static void method1() throws ClassNotFoundException, FileNotFoundException
2.public static void main() throws IOException
3.public static void main() // 不抛出任何异常

 */
