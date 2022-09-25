// 变量作用域的详细介绍

/*
┏
┃public class Variables
┃┏
┃┏
┃┃   private static String TEXT = "结束。";
┃┃  ┗━━━━━━━━━━━━━━━━━━━┛
┃┃   public static void main (String[] args)
┃┃ ┏                         ┗━━━━━━━┛
┃┃ ┃ {
┃┃ ┃    System.out.println("你好");
┃┃ ┃    String s = "你好！";
┃┃ ┃  ┏┗━━━━┛
┃┃ ┃  ┃ System.out.println(s);
┃┃ ┃  ┃ if (args != NULL)
┃┃ ┃  ┃ {
┃┃ ┃  ┃    String s2 = s;
┃┃ ┃  ┃   ┗━━━━┛
┃┃ ┃  ┃  ┏
┃┃ ┃  ┃  ┃ System.out.println(s2);
┃┃ ┃  ┃  ┗
┃┃ ┃  ┃ }
┃┃ ┃  ┃ Variables variables = new Variables();
┃┃ ┃  ┃ System.out.println(variables.instanceVariable);
┃┃ ┃  ┃ System.out.println(TEXT);
┃┃ ┃  ┗
┃┃ ┃ }
┃┃ ┗
┃┃   public String instanceVariable;
┃┃  ┗━━━━━━━━━━━━━━━┛
┃┃   public Variables()
┃┃   {
┃┃      instanceVariable = "实例变量测试。";
┃┃   }
┃┃}
┃┗
┗
 */

/*
1.在方法中声明的变量从其声明开始到方法结束一直存在（可见）。

2.在代码块中声明的变量在代码块结束之前一直存在。

3.方法的参数在方法返回前一直存在。

4.对象中的变量在包含它们的对象的整个生命周期中都存在。它们的可见性也可以由特殊访问修饰符控制。

5.static（类）变量在程序运行的整个过程中都存在。它们的可见性也可以由访问修饰符定义。
 */

/*
在方法内声明的所有变量从声明开始到方法结束一直存在（可见）
如果变量是在代码块中声明的，则它在代码块结束之前一直存在
如果变量是方法参数，则它在方法的整个主体中都存在（可见）
如果变量是实例变量，则它链接到某个对象，并且在对象存在期间一直存在。如果没有对象，则该变量没有任何实例。可以从类的所有方法中访问变量（即变量可见），无论这些方法是在该变量之前还是之后声明的。将为每个对象创建一个新变量。该变量独立于其他对象。不能从 static 方法访问实例变量。”
如果变量被声明为 static，即标记有关键字 static，则它在类存在期间一直存在。JVM 通常在首次使用类时将其加载到内存中。static 变量也是在此时进行初始化的
 */

// 包含两个 count 变量的示例
public class codegym12 {
    public int count = 0;     // 声明实例变量

    public void run() {
        count = 15;           // 访问实例变量
        int count = 10;       // 声明局部方法变量
        count++;             // 访问方法变量
    }
}

/*
//static（类）变量
ClassName.variableName
下面是一些示例：
        Cat.catsCount
 */

/*
// 非 static（实例）变量
this.variableName
下面是一些示例：
        this.catsCount
 */

// static方法的工作原理
/*
使用 <对象> 点 <方法名称> 调用方法时，实际上是在调用类方法，并将该对象作为第一个参数进行传递。
在方法内，对象称为‘this’。方法中的所有操作都是针对此对象及其数据执行的
在调用 static 方法时，不会向它传递任何对象。换言之，‘this’等于 null。这就是 static 方法无法访问非 static 变量和方法的原因
（因为它没有‘this’传递给这些方法)
 */

