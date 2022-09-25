// 多重捕获的工作原理
// 多重 catch 块的工作原理。很简单：try 块中发生异常时，执行移动到第一个 catch 块。
// 如果 catch 块括号中指示的类型与抛出异常的类型匹配，则在该块内部开始执行。”否则，我们移动到下一个 catch 块，其中执行相同的检查
// 如果 catch 块用完还未捕获异常，则异常会重新抛出并且当前方法会异常终止。
// 与异常类型一致的 catch 块会立即执行。
// 但实际情况有点复杂。类可以继承其他类。如果 Cow 类继承了 Animal 类，则 Cow 对象不仅会被 Cow 变量引用，也会被 Animal 变量引用。
// 所有的异常继承 Exception 或 RuntimeException（这也继承 Exception），它们仍然可以使用‘catch (Exception e)’或‘catch (RuntimeException e)’。
// 我们可以得出两个结论。首先，你可以使用‘catch (Exception e)’捕获任何异常。其次，catch 块的顺序很重要。
// 下面是一些示例。除以 0 后发生的 ArithmeticException 会在第二个 catch 块被捕获.

/* 代码
try
{
    System.out.println("调用 method1 之前。");
    int a = 1 / 0;
    System.out.println("调用 method1 之后。这将永远不会显示。");
}
catch (NullPointerException e)
{
    System.out.println("空引用。已捕获异常。");
}
catch (ArithmeticException e)
{
    System.out.println("除以零。已捕获异常。");
}
catch (Exception e)
{
    System.out.println("其他任何错误。已捕获异常。");
}
 */

// 在下例中，ArithmeticException 会在第一个 catch 块被捕获，因为所有的异常继承 Exception，即 Exception 涵盖所有异常。
/*
try
{
    System.out.println("调用 method1 之前。");
    int a = 1/0;
    System.out.println("调用 method1 之后。这将永远不会显示。");
}
catch (Exception e)
{
    System.out.println("其他任何错误。已捕获异常。");
}
catch (NullPointerException e)
{
    System.out.println("空引用。已捕获异常。");
}
catch (ArithmeticException e)
{
    System.out.println("除以零。已捕获异常。");
}
 */

// 在下例中，ArithmeticException 不会被捕获。它会被重新抛回到调用方法。
/*
try
{
    System.out.println("调用 method1 之前。");
    int a = 1/0;
    System.out.println("调用 method1 之后。这将永远不会显示。");
}
catch (NullPointerException e)
{
    System.out.println("空引用。已捕获异常。");
}
 */
