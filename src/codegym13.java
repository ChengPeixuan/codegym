// 命令和代码块

/* 命令示例
String s = "名字";
System.out.println(1234);
return a + b * c;
throw new RuntimeException();
 */

/* 代码示例
1
{}
2
{
    throw new RuntimeException();
}
3
{
    return null;
}
4
{
    System.out.println(23);
    System.out.println(1);
    System.out.println(14);
}
 */

// 条件运算符 if/else语句
/*
代码：
if (a < b)
    System.out.println("A 小于 B");
else
    System.out.println("B 小于 A");
说明：
如果 a 小于 b，将执行第一条命令。否则将执行第二条命令。这些命令永远不会同时执行。
 */

/*
代码：
if (a < b){
    System.out.println("A 小于 B");
    System.out.println("B 大于 A");
}
else{
     System.out.println("B 小于 A");
     System.out.println("A 大于 B");
}
说明：
可以将一条命令替换为代码块。其余不变。
 */

/*
代码：
if (a < b){
    a = 0;
}
else{
}

if (a < b){
    a = 0;
}

if (a < b)
    a = 0;

说明：
如果 else 块为空，则可以省略它。
这三个示例是完全等效的。
如果只需执行一条命令，则可以省略花括号。如果有多条命令，则需要保留花括号。
 */

// 比较和设置条件
/*1
代码：
int a = 5;
int b = 5;
System.out.println(a == b);
说明：
比较原始类型。
将在屏幕上显示 true。
 */

/*2
代码：
Cat cat1 = new Cat("奥斯卡");
Cat cat2 = cat1;
System.out.println(cat1 == cat2);
说明：
比较引用。
将在屏幕上显示 true。
两个变量存储对同一对象的引用。
 */

/*3
代码：
String s = new String("妈妈");
String s2 = s;
System.out.println(s == s2);
说明：
比较引用。
将在屏幕上显示 true。
两个变量存储对同一对象的引用。
 */

/*4
代码：
Cat cat1 = new Cat("奥斯卡");
Cat cat2 = new Cat("奥斯卡");
System.out.println(cat1 == cat2);
说明：
比较引用。
将在屏幕上显示 false。
两个变量引用相同的 Cat 对象，都不是同一个对象。
 */

/*5
代码：
String s = new String("妈妈");
String s2 = new String("妈妈");
System.out.println(s == s2);
说明：
比较引用。
将在屏幕上显示 false。
两个变量引用相同的 Cat 对象，都不是同一个对象。
 */

/*6
代码：
Cat cat1 = new Cat("奥斯卡");
Cat cat2 = new Cat("奥斯卡");
System.out.println(cat1.equals(cat2));
说明：
比较对象。
将在屏幕上显示 true。
两个变量引用相同的 Cat 对象。
 */

/*7
代码：
String s = new String("妈妈");
String s2 = new String("妈妈");
System.out.println(s.equals(s2));
说明：
比较对象。
将在屏幕上显示 true。
两个变量引用相同的 String 对象
 */

