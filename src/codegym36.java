// 引用类型转换
// 从 Object 变量开始。你可以将任何引用类型赋给此类变量（拓宽转换）。但是，要在另一个方向上进行赋值（窄化转换），则必须显式指示强制转换操作

/* 1
代码：
String s = "妈妈";
Object o = s; // o 存储一个 String
说明：
典型的拓宽引用转换
 */

/* 2
代码：
Object o = "妈妈"; // o 存储一个 String
String s2 = (String) o;
说明：
典型的窄化引用转换
 */

/* 3
代码：
Integer i = 123; // o 存储一个 Integer
    Object o = i;
说明：
拓宽转换。
 */

/* 4
代码：
Object o = 123; // o 存储一个 Integer
String s2 = (String) o;
说明：
运行时错误！
你不得将 Integer 引用转换为 String 引用。
 */

/* 5
代码：
Object o = 123; // o 存储一个 Integer
Float s2 = (Float) o;
说明：
运行时错误！
你不得将 Integer 引用转换为 Float 引用。
 */

/* 6
代码：
Object o = 123f; // o 存储一个 Float
Float s2 = (Float) o;
说明：
转换为相同类型。窄化引用转换。
 */

// 拓宽或窄化引用转换一丝丝都不会改变对象。窄化（或拓宽）部分具体是指赋值操作包括（不包括）变量及其新值的类型检查。
// 为了避开这些示例中的错误，我们必须找出 Object 变量引用何种类型：

/*
int i = 5;
float f = 444.23f;
String s = "17";
Objecto = f;                       // o 存储一个 Float

if (o instanceof  Integer){
    Integer i2 = (Integer) o;
}
else if (o instanceof Float){
    Float f2 = (Float) o;            // 这个 if 块将被执行
}
else if (o instanceof String){
    String s2 = (String) o;
}
 */

// 除非你百分百确定对象的类型，否则应在每次拓宽转换之前执行此检查。



