// 包
// 计算机上的文件被分组到文件夹中。Java 中的类（每个类都存储在单独的文件中）被分组到包中，包对应于硬盘驱动器上的文件夹。

// 首先，类的唯一全名由其包名加上类名组成。下面是一些示例:
/*
唯一的全名	                包名	                类名
java.io.FileInputStream	    java.io	            FileInputStream
java.lang.String	        java.lang	        String
java.util.ArrayList	        java.util	        ArrayList
org.apache.tomcat.Servlet	org.apache.tomcat	Servlet
Cat	                        未指定	            Cat
 */

// 类的全名始终是唯一的。
// 每次都写长名称（即 java.util.ArrayList）非常麻烦。
// 因此，Java 允许导入类。可以在代码中使用其他类的短名称，但在类的开头部分必须明确指出要使用的类。
// 假设有这样一行代码：import java.util.ArrayList
// 在类的开头紧接着包声明的位置，可以指出在代码中使用 ArrayList 时要引用的类。
// 最好始终将类放入包内，而不要放在 src 根文件夹中。

// 创建对象：写入关键字 new，然后写入要创建其对象的类的名称。
/*
示例
Cat cat = new Cat();
Reader reader = new BufferedReader(new InputStreamReader(System.in));
InputStream is = new FileInputStream(path);
 */

// 创建对象时，可以传递放在括号内的各种参数。

class Cat {
    public static int catCount;
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
/*
name 为实例变量。它有一个 public 访问修饰符，使其在项目中随处可见。
getName 方法为 getter。它将返回实例变量 name 的值。该方法的名称源自单词“get”加上首字母大写的变量名称。
setName 方法为 setter。它用于为实例变量 name 赋予新值。该方法的名称源自单词“set”加上首字母大写的变量名称。
在此方法中，参数与实例变量具有相同的名称，因此我们在实例变量的名称之前加上 this。
 */

// getter 和 setter
/*
在 Java 中，普遍做法是对其他类隐藏变量。通常，在类的内部声明的变量具有 private 修饰符
要允许其他类更改这些变量的值，可为每个变量创建一对方法：get 和 set。get 方法返回变量的当前值。set 方法为变量设置新值
这样做的意义：如果不希望任何人更改实例变量的值，可以不为它创建 set 方法，或者将该变量声明为 private。此外，还可以向该方法添加附加数据检查。如果传递的新值无效，则不会进行任何更改
由于一个类可以包含很多变量，因此 get 和 set 方法的名称通常包含它们所处理的变量的名称
如果一个变量名为‘name’，则方法名为 setName 和 getName，等等。
 */
/*
步骤	    代码	                        说明
1	    new Cat();                  创建 Cat 对象
2	    Cat catOscar = new Cat();   在变量 catOscar 中存储 Cat 对象
3	    catOscar.name = "奥斯卡";    使用以下数据填充对象：name、age、weight
        catOscar.age = 6;
        catOscar.weight = 4;
4	    catOscar.sleep();           在对象上调用方法
5	    catOscar.fight(catSmudge);  使对象交互
 */