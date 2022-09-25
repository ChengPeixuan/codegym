// 转换为String
// 几乎每种类型都可以隐式转换为 String。添加两个变量时就很容易看出，其中一个是 String，另一个是其他类型。非 String 变量将转换为 String。

/* 1
命令名称：
int x = 5;
String text = "X=" + x;
实际发生的情况如下：
int x = 5;
String s = "X=" + Integer.toString(x);
 */

/* 1
命令名称：
int x = 5;
String text = "X=" + x;
实际发生的情况如下：
int x = 5;
String s = "X=" + Integer.toString(x);
 */

/* 2
命令名称：
Cat cat = new Cat("奥斯卡");
String text = "我的猫是" + cat;
实际发生的情况如下：
Cat cat = new Cat("奥斯卡");
String text = "我的猫是" + cat.toString();
 */

/* 3
命令名称：
Object o = null;
String text = "对象是 " + o;
实际发生的情况如下：
Object o = null;
String text = "对象是 " + "null";
 */

/* 4
命令名称：
String text = 5 + '\u0000' + "日志";
实际发生的情况如下：
int i2 = 5 + (int) '\u0000';
String text = Integer.toString(i2) + "日志";
 */

/* 5
命令名称：
String text = "对象是 " + (float) 2 / 3;
实际发生的情况如下：
float f2 = ((float) 2) / 3;
String text = "对象是 " + Float.toString(f2);
 */

// 结论：
// 如果添加 String 和“任何其他类型”，第二个类型将转换为 String。
