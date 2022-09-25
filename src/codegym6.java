// 计算半径为5的圆周长
public class codegym6 {
    public static void main(String[] args){
        printCircleCircumference(5);
    }
    public static void printCircleCircumference(int radius){
        double pi = 3.14;
        double c = 2*pi*radius;
        System.out.println(c);
    }
}


/*
我们的第一个转换器！
convertCelsiusToFahrenheit(int celsius) 方法接受以摄氏度为单位的值。
该方法应转换温度并返回以华氏度为单位的值。
摄氏度 (TC) 和华氏度 (TF) 之间的关系如下：
TF = (9 / 5) * TC + 32。

请考虑以下示例：
将值 41 传递给 convertCelsiusToFahrenheit 方法。
*/
class TCtoTF{
    public static void main(String[] args){
        System.out.println(convertCelsiusToFahrenheit(41));
    }
    public static double convertCelsiusToFahrenheit(int celsius){
        double fahrenheit = (9/5.0) * celsius + 32; //必须是5.0，是5错误
        return fahrenheit;
        // 更好的写法：return (9/5.0) * celsius + 32;
    }
}

/*
在 Person 类中，声明以下变量：String name, int age, int weight, int money.
在 main 方法中，创建一个 Person 对象，并在变量 person 中存储对该对象的引用。

提示：使用以下构造方法创建一个 Person 对象，并将该对象的引用赋值给变量 person：
VariableType variableName = new TypeOfObjectBeingCreated();
 */

class taskperson{ //~~~~~~两个类别写反位置
    public static void main(String[] agrs){
        Person person = new Person();//~~~~~~~~~
    }
    public static class Person{
        String name;
        int age;
        int weight;
        int money;
    }
}

/*
在 public static void hackSalary(int a) 方法中，将薪水增加 1000 美元，并显示以下内容：“你的薪水为：每月 <a+1000> 美元。”
其中 <a+1000> 是增加了 1000 之后的薪水。
 */
class tasksalary {
    public static void main(String[] args) {
        hackSalary(7000);
    }

    public static void hackSalary(int a) {
        int salary;
        salary = a + 1000;
        System.out.println("你的薪水为：每月 "+salary+" 美元。");
    }
}


/*
一旦没有变量引用某个对象，该对象就会被标记为垃圾，Java 机器在下次收集垃圾时会将其销毁。
只要对象至少有一个引用，该对象即被视为活跃对象并且不会被销毁。
如果你想尽快处理对象，可以通过为引用该对象的所有变量赋值 null 来清除该对象的所有引用。
 */
class cC{
    /*
    Cat = cat; // 声明名为cat的Cat引用变量，变量cat的值为null

    new Cat(); // 创建Cat对象。后面必须加()~~~~~~~~~~~~~~~

    Cat cat = new Cat(); // 创建名为cat的Cat引用变量。创建新的Cat对象。将对新创建的对象的引用赋给变量cat

    String s1 = new String;
    String s2 = "";
    // 创建两个相同的空字符串

    Cat kitty = new Cat();
    // 第一个Cat，C必须大写~~~~~~~~~~~~~~~
    Cat smokey = new Cat();
    smokey = kitty;
    // 创建两个对象。将对这两个对象的引用赋给两个不同的变量
    // 然后，将变量smokey设置为等于对变量kitty所引用的对象的引用。两个变量现在都引用最先创建的对象。

    Cat kitty = new Cat();
    Cat smokey = null;
    smokey = kitty;
    kitty = null;
    // 创建一个Cat对象，并将其引用赋给第一个变量kitty，第二个变量smokey存储一个空null引用
    // 两个变量引用同一个对象
    // 现在，只有smokey（而不是kitty）引用对象

    int a = 5, b =6;
    int a = 5, b = a + 1;

    Date date = new Date(); // 创建日期对象，初始化为当前的日期和时间

    // boolean变量只接受值true和false
    boolean isTure = true; // 将boolean变量初始化为true [isTure是一个变量]
    boolean isLess = (5 > 6); // 将false赋给isLess变量

     */
}

/*
创建 3 个 Dog 对象。
将每个实例存储在单独的变量中。
将它们命名为“马克斯”、“贝拉”和“杰克”。
要求：
程序不应该在屏幕上显示文本。
main 方法只能有三个 Dog 变量。
这些变量必须立即赋值。
必须为每个 Dog 对象指定一个名称。
Dog 类必须有一个名为 name 的单个变量~~~~~~
Dog 类不能包含方法。
 */
class taskdog {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "马克斯";
        Dog dog2 = new Dog();
        dog2.name = "贝拉";
        Dog dog3 = new Dog();
        dog3.name = "杰克";
    }
    public static class Dog {
        public String name;
    }
}

/*
分清楚变量和对象~~~~~~~~
创建 10 个 Cat 变量和 8 个 Cat 对象。
要求：
程序不应该在屏幕上显示文本。
main 方法必须有 10 个 Cat 变量。
在 main 方法中，必须在创建时立即初始化 8 个变量。
Cat 类中不能有任何变量。
Cat 类中不能有任何方法。

class cats {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        Cat cat7 = new Cat();
        Cat cat8 = new Cat();
        Cat cat9;
        Cat cat10;
    }

    public static class Cat {

    }
}

/*
创建 Cat、Dog、Fish 和 Woman 对象。
        为每个动物指定主人。
        要求：
        •	程序不应该在屏幕上显示文本。
        •	在 main 方法中，创建 Cat、Dog、Fish 和 Woman 对象，并将这些对象的引用存储在变量中。
        •	在 main 方法中，将 Woman 对象设置为每个动物的主人。
        •	Cat、Dog 和 Fish 类只能有一个名为 owner 的 Woman 变量。
        •	Woman 类中不能有变量。

package zh.codegym.task.task02.task0213;

class master {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Woman woman = new Woman();
        cat.owner = woman;
        dog.owner = woman;
        fish.owner = woman;
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}
 */




/*
┏
        ┃public class Variables
┃┏
        ┃┏
        ┃┃   private static String TEXT = "结束。";
        ┃┃  ┗━━━━━━━━━━━━━━┛
        ┃┃   public static void main (String[] args)
        // 变量的可见性也可以由特殊的访问修饰符定义：public 和 private
        // 1. public 访问修饰符。
        //可以在程序中的任意位置使用标有 public 修饰符的变量、方法或类。这是最高的访问级别 – 这里没有任何限制。
        //2. private 访问修饰符。
        //对于标有 private 修饰符的变量或方法，你只能从声明该变量或方法的类中使用它们。对于所有其他类，标记的方法或变量将不可见，就像不存在一样。这是最高的封闭级别 – 只能在它自己的类中访问。

        // static（类）变量在程序运行的整个过程中都存在。变量的可见性也可以由访问修饰符定义
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