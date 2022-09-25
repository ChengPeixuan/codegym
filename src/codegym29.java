// 堆栈跟踪
// 想象下达给某个员工的一堆指令。你可能会收到比这些更急的新任务，或者取消一些任务。这意味着，这些任务不会按收到的顺序执行。最近收到的最紧急任务会最先执行，按这种方式构建元素就构成了 堆栈。
// Java 为此有一个特殊集合 － 堆栈。这个集合中有多种方法可“添加元素”和“获取元素”。你可能已经猜到了，最后添加的元素会是最先获取的元素。
// 想象一下，在 Java 程序中，方法 A 调用方法 B，B 调用方法 C，C 接着调用方法 D。如要退出方法 B，我们必须首先退出方法 C，退 C 就要首先退出方法 D。这种行为就像一个堆栈。
// 为何说像一个堆栈?:
// 例如，为了获取一堆任务中的中间部分，你就要首先完成最上面的任务。
// 函数调用也是如此。方法 A 调用方法 B，B 又调用方法 C。要退出 A，你必须先退出 B，而退出 B 又要退出 C
// 整个堆栈的概念是不是可以归结为“获取最后添加的纸”和“你只能首先退出最后输入的方法”。
// 函数调用的顺序称为“调用堆栈”，或简称为“堆栈”。最后一个调用的函数是第一个终止的函数。

// 获取并显示当前调用堆栈
public class codegym29 {
    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        method3();
    }

    public static void method3() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }
    }
}

/*
结果：
getStackTrace
method3
method2
method1
main
 */

// StackTraceElement：Java 机器跟踪所有函数调用。为此，它有一个特殊的集合 － 堆栈。当一个函数调用另一个，则 Java 机器在堆栈中放入一个新的 StackTraceElement 对象。函数完成后，该元素会从堆栈中移除。这意味着堆栈始终存储“函数调用堆栈”当前状态的最新信息。
// 每个 StackTraceElement 对象包含所调用方法的信息。特别是，你可以使用 getMethodName 方法获取方法名称。
// 从上述示例中可看出它的工作原理：
// 1) 我们获取了调用堆栈。
// 2) 我们使用 for-each 循环来遍历。你最好没忘记那个概念。
// 3) 我们将方法名称输出到 System.out。
