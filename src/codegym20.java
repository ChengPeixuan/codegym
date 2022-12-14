// 对象可见性和null引用
// 对象的生存期。创建对象后，只要有一个变量正在存储其地址（至少有一个对该对象的引用），则该对象存在（存活）
// 如果不再有任何引用，则该对象死亡。下面是一些示例
/*
public class MainClass
{
   public static void main (String[] args)
   {
    ┏ Tommy
    ┃ Cat cat = new Cat("汤米");
    ┃ cat = null;
    ┗
    ┏ Sammy
    ┃ Cat cat1 = new Cat("萨米");
    ┃┏ Missy
    ┃┃Cat cat2 = new Cat("米西");
    ┃┃cat2 = cat1;
    ┃┗
    ┃┏ Ginger
    ┃┃cat1 = new Cat("金杰");
    ┃┃cat2 = null;
    ┃┗
    ┗
   }
}
Tommy 对象从创建起只存在一行。引用该对象的唯一变量在下一行中被设置为 null，因此该对象被 Java 虚拟机 (JVM) 销毁。
Sammy 对象在创建后存储在 cat1 变量中。或者，更准确地说，该变量存储对该对象的引用。在几行之后，此引用被复制到 cat2。然后将对另一个对象的引用保存到 cat1。现在，只有 cat2 引用 Sammy。最后，在 main 方法的最后一行，对该对象的最后一个剩余引用被设置为 null。
Missy 对象在创建后只存在一行。在下一行，cat2 变量被设置为另一个值，对 Missy 的引用丢失。无法再访问该对象，因此系统将其视为垃圾（即该对象已死亡）。
Ginger 对象自创建后一直存在，直至方法结束。在方法结尾，cat2 变量被销毁，紧接着 Ginger 被销毁。
 */

// 但是，如果在方法内部创建一个 Cat 对象，并将其引用存储在某个实例变量中，则只要 Cat 对象被仍然存活的另一个对象引用，该对象就将存在。
// 实际上，对象通常不会立即被系统销毁。Java 虚拟机会不时地执行‘垃圾回收’，销毁已标记为删除的对象。
// 另外，如果我们不再需要变量引用某个对象，可以将该变量设置为 null，或为其分配对另一个对象的引用。

// 使用finalize终结对象
// Java 虚拟机在销毁对象之前调用 finalize() 方法。该方法用于释放系统资源或执行其他清理任务
// Object 类包含 finalize() 方法，这意味着所有其他类都是如此（因为所有 Java 类都是从 Object 类派生的）。可以直接在类中实现自己的 finalize() 方法。
/*
 示例：
 class Cattt {
    String name;
    Cattt(String name) {
        this.name = name;
    }
    protected void finalize() throws Throwable {
        System.out.println(name + " 已销毁");
    }
}
 */

// Java 虚拟机决定是否调用此方法。通常，在方法内部创建并在方法完成时声明为垃圾的对象会立即销毁，而无需调用 finalize()。此方法更像是备份，而不是可靠的解决方法。最佳选择是在对象仍处于存活状态时释放所有系统资源（通过将对其他对象的引用设置为 null）。
// 在 Java 中，很难意外销毁某个对象。如果你引用了某个对象，则该对象处于存活状态。
// 你不能更改对对象的引用，也不能增加或减少这些引用。另外，你也不能创建对某个对象的引用。你只能对引用赋值或将其设置为 null。
// 如果我删除对某个对象的所有引用（或设置为 null），我将再也无法获得对该对象的引用或访问该对象。
