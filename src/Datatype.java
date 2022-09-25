// 当左右两边都是数值型时，则做加法运算
// 当左右两边有一方为字符串，则做拼接运算
public class Datatype {
    public static void main(String[] args){
        System.out.println(100 + 98);
        System.out.println("100" + 98);
        System.out.println(100 + 3 + "hello");
        System.out.println("hello" + 100 + 3);
    }
}

// 数据类型
// 一、基本数据类型
// 1.基本数据类型[括号里表示字节]
//   1.1 数值型
//     -整数类型，存放整数（byte[1],short[2],int[4],long[8]）
//        byte 字节
//        short 短整型
//        int 整数
//        long 长整型
//     -浮点（小数）类型 （float[4],double[8]）
//        float 单精度
//        double 双精度
//   1.2 字符型（char[2]，存放单个字符'a'）
//   1.3 布尔型（boolean[2]，存放ture,false）
// 2.引用数据类型
//   2.1 类（class）
//   2.2 接口（interface）
//   2.3 数组（[]）

class example {
    public static void main(String[] args){
        byte n1 = 10;
        short n2 = 10;
        int n3 = 10;//4个字节
        long n4 = 10;//8个字节
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
    }
}

class Detail {
    public static void main(String[] args){
        int a =1;//定义了一个变量，类型int整型，名称a，值1
        int b =3;//定义了一个变量，类型int整型，名称b，值3
        b = 89;//把89值赋给b变量，最后输出来b=89
        System.out.println(a);
        System.out.println(b);
        int n1 = 1;
        long n2 =1L;
        // int n3 = 1l; 这样的写法是错误的.因为long比int大，小不可以转大
        float num1 = 1.1F;
        double num2 = 1.1;
        double num3 = 1.1f;
        // 这样的写法是正确的，因为double比float要大，大可以转小
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
    }
}

// 基本数据类型转换
// 自动类型转换：当java程序在进行赋值或者运算时，精度小的类型自动转换为精度大的数据类型
// 由小到大排序：
// char → int → long → float →double
// byte → short → int → long → float → double

class autoconvert{
    public static void main(String[] args){
        int num = 'a'; // char → int
        System.out.println(num); // 97
        double d1 = 80; // int → double
        System.out.println(d1); // 80.0
        int d2 = 80;
        System.out.println(d2); // 80
    }
}


// Java程序中变量常声明为int型，除非不足以表示大数，才使用long
// Java的整型变量（具体值）默认为int值，声明long型变量须后加"l"或"L"
// Java的浮点型变量（具体值）默认为double值，声明float型变量须后加"f"或"F"，不然尾部部分可能丢失，造成精度损失（小数都是近似值）

// 浮点型常量有两种表达形式
// 1.十进制数形式：如5.12 512.0f .512
// 2.科学计数法形式：如5.12e2[5.12*10的2次方 512] 5.12E-2 [5.12/10的2次方 0.0512]

// 通常情况下，应该使用double型，因为它比float型更精确
// 举例：double num9 = 2.1234567851
// float num10 = 2.1234567851F

// 浮点数使用陷阱
class compare {
    public static void main(String[] args) {
        double num11 = 2.7;
        double num12 = 8.1 / 3; // 2.6999999999999997
        System.out.println(num11);
        System.out.println(num12);//接近2.7的一个小数，而不是2.7
        // 得到一个重要的使用点：当我们对运算结果是小数的进行相等判断时，要小心
        // 应该是以两个数的差值的绝对值，在某个精度范围内判断
        if (num11 == num12) {
            System.out.println("相等");
        }
        if(Math.abs(num11 - num12) < 0.000001){
            System.out.println("差值非常小，到我的规定精度，认为相等...");
        }
        // if(Math.abs(num11 -num12)){

        // }
        // 可以通过Java API来看
        System.out.println(Math.abs(num11 - num12)); // 输出结果是：4.440892098500626E-16
    }
}

// char表示单个字符，字符类型是char，两个字节（可以存放汉字）
// 多个字符用字符串String
// 区别1：java中的单引号表示字符，java中的双引号是字符串。
// 区别2：单引号引的数据一般是char类型的；双引号引的数据 是String类型的。
// 区别3：java中单引号里面只能放一个字母或数字或符号；java中的双引号里面是0到多个字符构成。所以字符可以直接转换成字符串。字符串需要使用charAt（n) 来获取第几个字符。
// char定义时用单引号，只能有一个字母，数字。char c='c'；而String用双引号，可以是一个，也可能是多个字母，汉字等。就是所谓的字符串。String s="adsaf";
// char只是一个基本类型，而String 可以是一个类，可以直接引用。比如char c='c';不能直接对c调用方法。String s="abc";这时可以调用s.charAt(0);等方法,因为String是类，这是就是对象的调用了。
class char01 {
    public static void main(String[] args){
        char c1 = 97; // 字符类型可以直接存放一个数字
        System.out.println(c1); //输出的是a
        System.out.println((int)c1);
        // 输出结果是a，因为在Java中，char本质上是一个整数。在输出时，是unicode码对应的字符
        char c100 = '1'; // char单引号里不能放10 100 1000
        System.out.println(c100);
        System.out.println((int)c100);
        char c2 = 'a'; //ab是错误的
        System.out.println(c2); //输出结果是：a
        System.out.println((int)c2);//输出结果是：97
        char c3 = '韩';  // 韩某是错误的
        System.out.println(c3);
        System.out.println((int)c3);
        char c4 = '成';  // 韩某是错误的
        System.out.println(c4);
        System.out.println((int)c4);
        char c5 = 25104; // 可以直接给char赋一个整数，输出时会按照对应的unicode字符输出
        System.out.println(c5); // 输出结果是成！
        System.out.println((int)c5);
        char c6 = '\t';
        char c7 = '\n';
        System.out.println(c6);
        System.out.println(c7);
        System.out.println(c1+10); // 107
        System.out.println('a'+10); // 107
        char c8 = 'b' + 1;
        System.out.println((int)c8); // 数字 // 99
        System.out.println(c8); // 不是b1 // c //99->对应的字符->编码表ASCII（规定好的）->c
        // char类型是可以进行运算的，相当于一个整数，因为有对应的unicode码
    }
}

// 布尔boolean类型，只允许取值true和false，无null
// 占1个字节
// boolean类型适于逻辑运算，一般用于流程控制：if条件控制语句；while循环控制语句；do-while循环控制语句；for循环控制语句
class boolean01 {
    public static void main(String[] args){
        // 演示判断成绩是否通过的案例
        // 定义一个布尔变量
        boolean isPass = true;
        if(isPass == true) {
            System.out.println("考试通过，恭喜");
        } else {
            System.out.println("考试没有通过，下次努力");
        }
    }
}







