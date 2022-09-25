// static 变量和方法
// 当我们在类中声明变量时，我们会定义这些变量是只创建一次，还是该类的每个实例（对象）都将有自己的副本。默认情况下，将为每个对象创建变量的一个新副本。它看起来是这样的：
// 类声明：
class Cattt{                        // 类
    String name;                 // 变量
    Cattt(String name) {            // 构造方法
        this.name = name;        // 变量初始化
    }
}
// main方法中的代码：
/*
Cat cat1 = new Cat("奥斯卡"); // 创建一个 name 变量包含“奥斯卡”的对象
Cat cat2 = new Cat("米西"); // 创建一个 name 变量包含“米西”的对象
System.out.println(cat1.name);
System.out.println(cat2.name);
 */

// 尽管是在同一个类 (Cat) 中声明的，变量 cat1.name 和 cat2.name 却包含不同的值，因为它们引用不同的对象
// 但是，类的每个实例只能存在 static 变量的一个副本，并且必须使用类名访问该副本。
// 类声明：
class Catttt{                 // 类

    String name;            // 实例（非 static）变量
    static int catCount;    // static 变量

    Catttt(String name){
        this.name = name;
        Cat.catCount++;   // 将 static 变量加 1
    }
}

// main方法中的代码
/*
System.out.println(Cat.catCount);
Cat cat1 = new Cat("奥斯卡");

System.out.println(Cat.catCount);
Cat cat2 = new Cat("米西");

System.out.println(cat1.name);
System.out.println(cat2.name);
System.out.println(Cat.catCount);
 */

// Java 方法分为两个类别。实例方法是在对象上调用的，并且可以访问该对象的数据。static 方法没有该访问权限，因为它们根本没有对象引用。但是，它们可以引用类的 static 变量和其他 static 方法
// static 方法无法处理非 static 方法或非 static 变量！
// 每个实例变量都包含在一个对象中。只有当你具有对该对象的引用时，才可以访问它。static 方法没有此类引用。
// 实例方法有这种引用吗？:是的，它被间接传递给实例方法。对调用实例方法的对象的引用被间接传递给该实例方法。存储此引用的变量称为 this。this 使得方法始终可以访问对象的数据或调用同一对象上的另一个非 static 方法。
// 将 null（而不是对象引用）传递给 static 方法。这就是它们不能处理非 static 变量和方法的原因。它们根本没有对与这些变量和方法相关联的对象的引用。

// 以下是非static方法的工作原理：
// 代码看起来如下所示：
/*
Cat cat = new Cat();
String name = cat.getName();
cat.setAge(17);
cat.setChildren(cat1, cat2, cat3);
 */
// 实际发生的情况如下：
/*
Cat cat = new Cat();
String name = Cat.getName(cat);
Cat.setAge(cat, 17);
Cat.setChildren(cat, cat1, cat2, cat3);
 */
// 使用 <对象>.<方法名称> 调用方法时，实际上是在调用类方法，并将该对象作为第一个参数进行传递。在方法内，对象称为‘this’。方法中的所有操作都是针对此对象及其数据执行的。

// 下面是static方法的工作原理
// 代码看起来如下所示：
/*
Cat cat1 = new Cat();
Cat cat2 = new Cat();
int catCount = Cat.getAllCatsCount();
 */
// 实际发生的情况如下：
/*
Cat cat1 = new Cat();
Cat cat2 = new Cat();
int catCount = Cat.getAllCatsCount(null);
 */
// 调用 static 方法时，不会向它传递任何对象。换言之，‘this’等于 null。这就是 static 方法无法访问非 static 变量和方法的原因（因为它没有任何内容明确地传递给非 static 方法）。


// 如果变量或方法前面有关键字 static，则为 static。既然限制如此严格，为什么需要这种方法呢？”

// 首先，我们不必传递对象引用即可使用 static 方法和变量。
// 第二，有时需要只有一个变量副本。例如，System.out（System 类的 static out 变量）。
// 第三，有时你需要先调用一个方法，然后才能创建对象。
// 为什么认为 main() 方法是 static？它是 static，因此程序员可以在任意对象创建之前，在将类加载到内存后立即调用它。

// 除了static方法，还有static类
// 示例：
class StaticClassExample {
    private static int catCount = 0;

    public static void main(String[] args) throws Exception {
        Cat bella = new Cat("贝拉");
        Cat tiger = new Cat("泰格");

        System.out.println("Cat 计数 " + catCount);
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
            StaticClassExample.catCount++;
        }
    }
}

// 你可以根据需要创建任意数量的 Cat 对象。但这不适用于 static 变量。static 变量只能存在一个副本。
// 在类声明中使用 static 修饰符的主要目的是控制 Cat 和 StaticClassExample 类之间的关系。想法大致如下：Cat 类不链接到 StaticClassExample 对象，并且无法访问 StaticClassExample 类的实例（非 static）变量。



