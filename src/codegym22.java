// 数组：数组是一种数据类型，可以存储多个值，而不仅仅是一个值。
// 数组变量就像一个公寓楼变量。可以在其中存储很多（而不仅仅是一个）值。此类变量有多个公寓（元素），可以使用公寓号（索引）来引用它们。要执行此操作，请在数组变量名称后的方括号中指出要访问的数组元素的索引。非常简单。
// 公寓楼变量（数组变量）可以包含任何类型的元素。你只需写入‘TypeName[] variable_name’而不是‘TypeName variable_name’。

/*1
代码：
String[] list = new String[5];
说明：
创建包含 5 个元素的 String 数组
 */

/*2
代码：
System.out.println(list[0]);
System.out.println(list[1]);
System.out.println(list[2]);
System.out.println(list[3]);
System.out.println(list[4]);

说明：
将显示五个‘null’值。
要访问特定数组元素的值，请使用方括号和元素索引。
 */

/*3
代码：
int listCount = list.length;
说明：
将值 5 赋给 listCount，这是 list 数组中元素的数量。
list.length 存储数组长度（元素数量）。
 */

/*4
代码：
list[1] = "妈妈";
String s = list[1];
说明：
将对象分配给数组元素时，需要在方括号中指出元素索引。
 */

/*5
代码：
for (int i = 0; i < list.length; i++)
{
     System.out.println(list[i]);
}
说明：
在屏幕上显示所有数组元素的值。
 */

// 数组变量需要额外的初始化。对于常规变量，只需声明变量并赋予不同值。而对于数组，则稍微有点复杂。必须先创建一个容纳 N 个元素的容器，然后才能开始将值放入容器中。

/*1
代码：
String[] list = null;
说明：
list 数组变量为 null。它只能存储对包含元素的容器的引用。你必须单独创建容器。
 */

/*2
代码：
String[] list = new String[5];
说明：
创建包含 5 个元素的容器，并分配对 list 变量的引用。此容器包含编号为 0、1、2、3 和 4 的 5 个公寓（元素）。
 */

/*3
代码：
String[] list = new String[1];
说明：
创建包含 1 个元素的容器，并分配对 list 变量的引用。要向此容器内放入内容，我们要编写类似 list[0] = "哟！"; 的代码。
 */

/*4
代码：
String[] list = new String[0];
说明：
创建包含 0 个元素的容器，并分配对 list 变量的引用。不能在此容器中存储任何内容。
 */

/*
下面是一些有关数组的基本情况：
1) 数组由很多元素构成。
2) 要访问某个元素，请指出其编号（索引）。
3) 所有元素都属于同一类型。
4) 所有元素的初始值都为 null；对于原始类型的数组，初始值为 0、0.0（对于小数）或 false（对于 boolean 值）。它与不在数组中的未初始化变量完全相同。
5) String[] list 仅声明一个变量。你需要先创建一个数组（容器），放入一些内容，然后才能使用它（请参见下面的示例）。
6) 创建数组（容器）对象时，需要指出其长度或元素数量。使用 new TypeName[n]; 执行此操作。
 */

/*1
代码：
String s;
String[] list;
说明：
s 等于 null
list 等于 null
 */

/*2
代码：
list = new String[10];
int n = list.length;
说明：
list 变量存储对象的引用 – 一个 10 元素字符串数组
n 等于 10
 */

/*3
代码：
list = new String[0];
说明：
现在，list 包含一个 0 元素数组。数组存在，但不能存储字符串。
 */

/*4
代码：
list = null;
System.out.println(list[1]);
说明：
这将抛出异常（运行时错误），并且程序将异常终止：list 包含 null 引用。
 */

/*5
代码：
list = new String[10];
System.out.println(list[11]);
说明：
这将抛出异常（运行时错误）：数组索引超出范围。
如果 list 包含 10 个元素，则有效索引为：0、1、2、3、4、5、6、7、8 和 9（总共 10 个索引）。
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 针对数组的基本操作
// 示例1：用从 1 到 10 的数字填充 10 元素数组：
class liz11 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
    }
}
// 用从 10 到 1 的数字填充 10 元素数组：
class liz12 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 10 - i;
        }
    }
}
// 用从 0 到 9 的数字填充 10 元素数组：
class liz13 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
    }
}

// 用从 9 到 0 的数字填充 10 元素数组：
class liz14 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 9 - i;
        }
    }
}

// 示例2
// 从键盘读取 10 个字符串：
class liz21 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];

        for (int i = 0; i < list.length; i++) {
            list[i] = reader.readLine();
        }
    }
}
// 从键盘读取 10 个数字：
class liz22 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[10];

        for (int i = 0; i < list.length; i++) {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }
    }
}

// 示例3
// 在屏幕上显示数组：
class liz3 {
    public static void main(String[] args) throws IOException {
        int[] list = new int[10];

        // 填充数组
        for (int i = 0; i < list.length; i++)
            list[i] = i;

        // 显示数组内容
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i]);
    }
}

// 示例4
// 快速 (static) 初始化。将数组元素相加：
class liz4 {
    public static void main(String[] args) throws IOException {
        // static 初始化
        int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        // 计算总和
        int sum = 0;
        for (int i = 0; i < list.length; i++)
            sum += list[i];

        System.out.println("总和为 " + sum);
    }
}

// 示例5
// 找出数组中的最小元素：
class liz5 {
    public static void main(String[] args) throws IOException {
        int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        int min = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < min)
                min = list[i];
        }

        System.out.println ("最小值为 " + min);
    }
}
