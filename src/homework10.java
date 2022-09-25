import jdk.internal.access.JavaSecurityAccess;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 任务 1 － 关于整数类型转换
正确安排强制转换运算符以获得所需的结果：d > 0
int a = 0;
int b = (byte) a + 46;
byte c = (byte) (a*b);
double f = (char) 1234.15;
long d = (short) (a + f / c + b);
要求：
•	程序应在屏幕上显示文本。
•	不要更改屏幕输出命令。
•	main() 方法必须包含一个 int 变量 a。
•	main() 方法必须包含一个 int 变量 b。
•	main() 方法必须包含一个 byte 变量 c。
•	main() 方法必须包含一个 double 变量 f。
•	main() 方法必须包含一个 long 变量 d。
•	初始化期间不要更改变量的初始值。你只能编辑（添加/删除/更改）强制转换运算符。
•	该程序应显示一个大于 0 的数字。
 */

/*
任务 1 － 关于整数类型转换
*/

class Solution1001 {
    public static void main(String[] args) {
        int a = 0;
        int b = (byte) a + 46;
        byte c = (byte) (a * b);
        double f = (char) 1234.15;
        long d = (short) (a + f / c + b);
        System.out.println(d);
    }
}

/* 任务 2 － 关于整数类型转换
正确安排强制转换运算符以获得所需的结果：d > 0
int a = 0;
int b = (byte) a + 46;
byte c = (byte) (a*b);
double f = (char) 1234.15;
long d = (short) (a + f / c + b);
要求：
•	程序应在屏幕上显示文本。
•	不要更改屏幕输出命令。
•	main() 方法必须包含一个 int 变量 a。
•	main() 方法必须包含一个 int 变量 b。
•	main() 方法必须包含一个 byte 变量 c。
•	main() 方法必须包含一个 double 变量 f。
•	main() 方法必须包含一个 long 变量 d。
•	初始化期间不要更改变量的初始值。你只能编辑（添加/删除/更改）强制转换运算符。
•	该程序应显示一个大于 0 的数字。
 */

/*
任务 2 － 关于整数类型转换
*/

class Solution1002 {
    public static void main(String[] args) {
        int a = 15;
        int b = 4;
        float c = a / (float) b;
        double d = a * 1e-3 + c;

        System.out.println(d);
    }
}

/*
任务 3 － 关于整数类型转换
添加一个类型转换以获得如下答案：b = 0
float f = (float)128.50;
int i = (int)f;
int b = (int)(i + f);
要求：
•	程序应在屏幕上显示文本。
•	不要更改屏幕输出命令。
•	main() 方法必须包含一个 float 变量 f。
•	main() 方法必须包含一个 int 变量 i。
•	main() 方法必须包含一个 int 变量 b。
•	初始化期间不要更改变量的初始值。你只能添加强制转换运算符。
•	程序应显示数字 0。
 */

/*
任务 3 － 关于整数类型转换
*/

class Solution1003 {
    public static void main(String[] args) {
        float f = (float) 128.50;
        int i = (int) f;
        int b = (int) ((byte) i + f);
        System.out.println(b);
    }
}

/*
任务 4 － 关于整数类型转换
添加一个类型转换以获得如下答案：nine = 9
short number = 9;
char zero = '0';
int nine = (zero + number);
要求：
•	程序应在屏幕上显示文本。
•	不要更改屏幕输出命令。你只能添加强制转换运算符。
•	main() 方法必须包含一个 short 变量 number。
•	main() 方法必须包含一个 char 变量 zero。
•	main() 方法必须包含一个 int 变量 nine。
•	初始化期间不要更改变量的初始值。你只能添加强制转换运算符。
•	该程序应显示数字 9。
 */

/*
任务 4 － 关于整数类型转换
*/

class Solution1004 {
    public static void main(String[] args) {
        short number = 9;
        char zero = '0';
        int nine = (zero + number);
        System.out.println((char) nine);
    }
}

/*
任务 5 － 关于整数类型转换
 正确安排强制转换运算符以获得如下答案：c = 256
int a = (byte)44;
int b = (byte)300;
short c = (byte)(b - a);
要求：
•	程序应在屏幕上显示文本。
•	不要更改屏幕输出命令。
•	main() 方法必须包含一个 int 变量 a。
•	main() 方法必须包含一个 int 变量 b。
•	main() 方法必须包含一个 short 变量 c。
•	初始化期间不要更改变量的初始值。你只能更改强制转换运算符。
•	该程序应显示数字 256。
*/

/*
任务 5 － 关于整数类型转换
*/

class Solution1005 {
    public static void main(String[] args) {
        int a = 44;
        int b = 300;
        short c = (short) (b - a);
        System.out.println(c);
    }
}

/*
任务 6 － 关于整数类型转换
删除不必要的运算符以获得正确的答案：结果：1000.0
double d = (short) 2.50256e2d;
char c = (short) 'd';
short s = (short) 2.22;
int i = (short) 150000;
float f = (short) 0.50f;
double result = f + (i / c) - (d * s) - 500e-3;
要求：
•	程序应在屏幕上显示文本。
•	不要更改屏幕输出命令。
•	main() 方法必须包含一个 char 变量 c。
•	main() 方法必须包含一个 short 变量 s。
•	main() 方法必须包含一个 int 变量 i。
•	main() 方法必须包含一个 float 变量 f。
•	main() 方法必须包含一个 double 变量 d。
•	main() 方法必须包含一个 double 变量 result。
•	初始化期间不要更改变量的初始值。你只能更改强制转换运算符。
•	该程序应显示 "结果：1000.0"。
 */

/*
任务 6 － 关于整数类型转换
*/

class Solution1006 {

    public static void main(String[] args) {
        double d = (short) 2.50256e2d;
        char c = (short) 'd';
        short s = (short) 2.22;
        int i = 150000;
        float f = 0.50f;
        double result = f + (i / c) - (d * s) - 500e-3;
        System.out.println("结果: " + result);
    }
}

/*
任务 7 － 关于整数类型转换
删除不必要的运算符，以获得正确的答案：1234567
long l = (byte)1234_564_890L;
int x = (byte)0b1000_1100_1010;
double m = (byte)110_987_654_6299.123_34;
float f = (byte)l++ + 10 + ++x - (float)m;
l = (long) f / 1000;
要求：
•	程序应在屏幕上显示文本。
•	不要更改屏幕输出命令。
•	main() 方法必须包含一个 long 变量 l。
•	main() 方法必须包含一个 int 变量 x。
•	main() 方法必须包含一个 double 变量 m。
•	main() 方法必须包含一个 float 变量 f。
•	初始化期间不要更改变量的初始值。你只能更改强制转换运算符。
•	该程序应显示 1234567。
 */

/*
任务 7 － 关于整数类型转换
*/

class Solution1007 {
    public static void main(String[] args) {
        long l = 1234_564_890L;
        int x = 0b1000_1100_1010;
        double m = (byte) 110_987_654_6299.123_34;
        float f = l++ + 10 + ++x - (float) m;
        l = (long) f / 1000;
        System.out.println(l);
    }
}

/*
任务 8 — 正确答案：d = 2.941

添加一个类型转换以获得如下答案：d = 2.941

示例输出：
2.9411764705882355
要求：
•	程序应在屏幕上显示文本。
•	不要更改屏幕输出命令。
•	main() 方法必须包含一个 int 变量 a。
•	main() 方法必须包含一个 int 变量 b。
•	main() 方法必须包含一个 double 变量 d。
•	初始化期间不要更改变量的初始值。你只能添加强制转换运算符。
•	程序应显示数字 2.9411764705882355。
 */

/*
任务 8 — 正确答案：d = 2.941
*/

class Solution1008 {
    public static void main(String[] args) {
        int a = 50;
        int b = 17;
        double d = (double) a / b;
        System.out.println(d);
    }
}

/*
任务 9 — 正确答案：d = 5.5

添加一个类型转换以获得如下答案：d = 5.5
要求：
•	程序应在屏幕上显示文本。
•	不要更改屏幕输出命令。
•	main() 方法必须包含一个 int 变量 a。
•	main() 方法必须包含一个 int 变量 b。
•	main() 方法必须包含一个 int 变量 c。
•	main() 方法必须包含一个 int 变量 e。
•	main() 方法必须包含一个 double 变量 d。
•	初始化期间不要更改变量的初始值。你只能添加强制转换运算符。
•	程序应显示数字 5.5。
 */

/*
任务 9 — 正确答案：d = 5.5
*/

class Solution1009 {
    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = a + b / c / (double) e;
        System.out.println(d);
    }
}

/*
任务 10 — 正确答案：d = 1.0

添加一个类型转换以获得如下答案：d = 1.0
要求：
•	程序应在屏幕上显示文本。
•	不要更改屏幕输出命令。
•	main() 方法必须包含一个 int 变量 a。
•	main() 方法必须包含一个 int 变量 b。
•	main() 方法必须包含一个 int 变量 c。
•	main() 方法必须包含一个 int 变量 e。
•	main() 方法必须包含一个 double 变量 d。
•	初始化期间不要更改变量的初始值。你只能添加强制转换运算符。
•	程序应显示数字 1.0。
 */

/*
任务 10 — 正确答案：d = 1.0
*/

class Solution1010 {
    public static void main(String[] args) {
        int a = 257;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = (byte) a + b / c / e;

        System.out.println(d);
    }
}

/*
任务 11 — 高薪

按如下模式显示“我不想学习 Java。我要高薪”15 次。

模式：
我不想学习 Java。我要高薪
不想学习 Java。我要高薪
想学习 Java。我要高薪
学习 Java。我要高薪
习 Java。我要高薪
 Java。我要高薪
…
薪
要求：
•	程序应在屏幕上显示文本。
•	程序应显示 15 行。
•	程序必须使用 for 循环或 while 循环。
•	输出应与条件中的示例匹配。
 */

/*
任务 11 — 高薪
*/

class Solution1011 {
    public static void main(String[] args) {
        String s = "我不想学习 Java。我要高薪";
        for (int i = 0; i < 15; i++) {
            System.out.println(s);
            s = s.substring(1);
        }
    }
}

/*
任务 12 — 字母数

从键盘输入 10 个字符串，并计算其中的不同字母数（针对 26 个小写英文字母）。在屏幕上按字母顺序显示结果。

示例输出：
a 5
b 8
c 3
d 7
e 0
…
z 9
要求：
•	程序必须从键盘读取数据 10 次。
•	程序应在屏幕上显示文本。
•	所显示的文本应包含 26 行。
•	输出的每一行应包含英文字母、空格以及在输入的行中找到该字母的次数。
 */

/*
任务 12 — 字母数
*/

class Solution1012 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        // Read in strings
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        // Counting the number of letters
        int[] count = new int[alphabet.size()];
        for (String s : list) {
            for (char c : s.toCharArray()) {
                int index = alphabet.indexOf(c);
                if (index < 0) {
                    continue;
                }

                count[index]++;
            }
        }

        // Output of the result
        for (int i = 0; i < alphabet.size(); i++) {
            char c = alphabet.get(i);
            System.out.println(c + " " + count[i]);
        }
    }
}

/*
任务 13 — Human 类构造函数

写出包含 6 个字段的 Human 类。
想一想，实施 10 个不同的构造函数。
每个构造函数都应该有意义。
要求：
•	程序不得从键盘读取数据。
•	Human 类应该有 6 个字段。
•	Human 类的所有字段都必须是 private。
•	Human 类应该有 10 个构造函数。
•	Human 类的所有构造函数都必须是 public。
 */

/*
任务 13 — Human 类构造函数
*/

class Solution1013 {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int childCount;
        private int age;
        private int length;
        private Human mother;
        private Human father;

        public Human() {
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int childCount) {
            this.name = name;
            this.childCount = childCount;
        }

        public Human(String name, int childCount, int age) {
            this.name = name;
            this.childCount = childCount;
            this.age = age;
        }

        public Human(String name, int childCount, int age, int length, Human mother) {
            this.name = name;
            this.childCount = childCount;
            this.age = age;
            this.length = length;
            this.mother = mother;
        }

        public Human(String name, int childCount, int age, int length, Human mother, Human father) {
            this.name = name;
            this.childCount = childCount;
            this.age = age;
            this.length = length;
            this.mother = mother;
            this.father = father;
        }

        public Human(int childCount, int age) {
            this.childCount = childCount;
            this.age = age;
        }

        public Human(int childCount, int age, int length) {
            this.childCount = childCount;
            this.age = age;
            this.length = length;
        }

        public Human(int childCount, int age, int length, Human mother) {
            this.childCount = childCount;
            this.age = age;
            this.length = length;
            this.mother = mother;
        }

        public Human(Human mother, Human father) {
            this.mother = mother;
            this.father = father;
        }
    }
}

/*
任务 14 — 尽量不用 static 修饰符

使用尽可能少的 static 修饰符以使示例进行编译。
要求：
•	该类必须包含变量 A。
•	该类必须包含变量 B。
•	该类必须包含变量 C。
•	该类必须包含变量 D。
•	不要更改 main 方法。
•	不要更改 getA 方法。
 */

/*
任务 14 — 尽量不用 static 修饰符
*/

class Solution {
    public int A = 5;
    public static int B = 5;
    public static int C = 5;
    public static int D = 5;
    public JavaSecurityAccess.ProtectionDomainCache map;

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.A = 5;
        solution.B = 5 * B;
        solution.C = 5 * C * D;
        Solution.D = 5 * D * C;

        Solution.D = 5;
    }

    public int getA() {
        return A;
    }
}

/*
任务 15 — 字符串列表数组

创建一个元素是字符串列表的数组。
在数组中填入任意数据并在屏幕上显示。
要求：
•	createList 方法必须声明并初始化含 ArrayList<String> 元素的数组。
•	createList 方法必须返回创建的数组。
•	createList 方法必须在数组中添加元素（字符串列表）。这些列表不能为空。
•	程序应在屏幕上显示数据。
•	main 方法必须调用 createList 方法。
•	main 方法必须调用 printList 方法。
 */

/*
任务 15 — 字符串列表数组
*/

class Solution15 {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] result = (ArrayList<String>[]) new ArrayList[3];

        result[0] = new ArrayList<String>();
        result[1] = new ArrayList<String>();
        result[2] = new ArrayList<String>();

        result[0].add("Mama");
        result[1].add("Mila");
        result[2].add("Ramu");

        return result;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}

/*
任务 16 — 列表中的相同词

从键盘读取 20 个单词的列表。
你要计算每个单词出现在列表中的次数。
结果应表示为 Map<String, Integer>，其中键是唯一单词，而且值是该单词出现在列表中的次数。

显示映射的内容。
大小写（大写/小写）会影响结果。
要求：
•	countWords 方法必须声明并初始化 HashMap<String, Integer>。
•	countWords 方法必须返回创建的映射。
•	countWords 方法应添加对应于唯一单词的键，以及对应于这些单词出现多少次的值。
•	程序应显示结果映射。
•	main 方法必须调用 countWords 方法。
 */

/*
任务 16 — 列表中的相同词
*/

class Solution1016 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        for (String s : list) {
            int count = result.containsKey(s) ? result.get(s) : 0;
            result.put(s, count + 1);
        }

        return result;
    }
}

/*
任务 17 — 从列表安全检索

创建一个整数列表。
从键盘输入 20 个整数。
创建一种方法来安全地从列表中检索数字：
int safeGetElement(ArrayList<Integer> list, int index, int defaultValue)
该方法必须返回基于其索引的列表项目。
如果检索元素时发生异常，则必须捕获该异常，且该方法应返回 defaultValue。
要求：
•	程序应从键盘读取 20 个数字。
•	程序应在屏幕上显示数据。
•	safeGetElement 方法必须基于其索引返回列表项，除非该方法中发生异常。
•	如果方法中发生异常，则 safeGetElement 方法必须返回 defaultValue。捕获异常。
•	safeGetElement 方法不得抛出异常。
 */

/*
任务 17 — 从列表安全检索
*/

class Solution1017 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            int x = Integer.parseInt(reader.readLine());
            list.add(x);
        }

        System.out.println(safeGetElement(list, 5, 1));
        System.out.println(safeGetElement(list, 20, 7));
        System.out.println(safeGetElement(list, -5, 9));
    }

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) {
        try {
            return list.get(index);
        } catch (Exception e) {
            return defaultValue;
        }
    }
}

/*
任务 18 — 需要更正（？）

任务：该程序演示了 HashMap 的工作原理：从键盘读取一组对（数字和字符串），将其放在一个 HashMap 中，然后显示 HashMap 的内容。
要求：
•	程序必须从键盘读取数据。
•	程序应在屏幕上显示文本。
•	Solution 类必须具有三个变量。
•	程序应用从键盘读取的 10 对填充 HashMap。
•	程序应显示 HashMap 的内容。每行显示一个值。
 */

/*
任务 18 — 需要更正
*/

class Solution1018 {
    HashMap<Integer, String> map;
    static Integer index;
    static String name;

    public void Solution() {
        this.map = new HashMap<Integer, String>();
    }

    public static void main(String[] args) throws IOException {
        Solution solution = new Solution();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int index = Integer.parseInt(reader.readLine());
            String name = reader.readLine();
        }
    }
}

/*
任务 19 — 功能还不够！

任务：程序从键盘读取一对（一个数字和字符串）并在屏幕上显示。
新任务：程序从键盘读取对（一个数字和字符串），并将其存储在 HashMap。
任何空的输入字符都表示数据输入结束。
这些数字可以重复。
字符串始终是唯一的。
输入的数据不得丢失！
然后该程序在屏幕上显示 HashMap 的内容。
每个新行显示一对。

示例输入：
1
张三
2
我
1
是

示例输出：
1 张三
2 我
1 是
要求：
•	程序必须从键盘读取数据。
•	程序应在屏幕上显示文本。
•	在 main 方法中，声明 HashMap 变量并立即初始化该变量。
•	程序应将从键盘读取的对填充到 HashMap 中。
•	程序应根据条件显示 HashMap 的内容。键和值之间用空格分隔。每行显示一个值。
 */

/*
任务 19 — 功能还不够！
*/

class Solution1019 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        while (true) {
            String number = reader.readLine();
            if (number.isEmpty()) {
                break;
            }

            int id = Integer.parseInt(number);
            String name = reader.readLine();
            map.put(name, id);
        }

        for (Map.Entry<String, Integer> s : map.entrySet()) {
            System.out.println(s.getValue() + " " + s.getKey());
        }
    }
}

/*
任务 20 — 有关算法的任务

任务：从键盘读取 30 个数字。显示第 10 和第 11 个最小数字。
解释：
最小的数字是第一个最小数字。
接着是第二个最小数字

例如：
1 6 5 7 1 15 63 88
第一个最小的数字是 1
第二个最小的数字是 1
第三最小的数字是 5
第四小的是 6
要求：
•	程序必须从键盘读取数据。
•	程序应在屏幕上显示文本。
•	Solution 类必须包含两个方法。
•	sort() 方法必须对元素数组进行排序。
•	main() 方法应调用 sort() 方法。
•	程序应显示第 10 和 11 个最小数字。每行显示一个值。
 */

/*
任务 20 — 有关算法的任务
*/

class Solution1020 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}








