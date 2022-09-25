// ArrayList类
// 如果你需要向只有一个空闲插槽的数组中再添加三个元素，该怎么办？
// 解决此问题的唯一方法是创建非常大的数组，以确保为所有元素留出足够的空间。但是，这通常意味着浪费内存。如果一个数组通常包含三个元素，但是即使它有极小的可能需要容纳 100 个元素，也必须创建一个 100 元素数组。
// 所以编写了 ArrayList 类，其功能与 Array 相同，但可以更改大小。
// 每个 ArrayList 对象存储一个常规的元素数组。当你从 ArrayList 中读取元素时，它将从内部数组中读取这些元素。将元素写入 ArrayList 时，它将这些元素写入内部数组。

/*1
Array:
String[] list = new String[10];
ArrayList:
创建包含元素的容器
ArrayList<String> list = new ArrayList<String>();
 */

/*2
Array:
int n = list.length;
ArrayList:
获取元素的数量
int n = list.size();
 */

/*3
Array:
String s = list[3];
ArrayList:
从数组/集合中获取元素
String s = list.get(3);
 */

/*4
Array:
list[3] = s;
ArrayList:
将元素写入数组
list.set(3, s);
 */

// Arraylist优点：
// 首先，ArrayList 支持程序员必须始终执行的一些附加操作。普通数组不支持这些操作。例如，从数组中间插入或删除元素而不会留下孔。
// 第二，可以更改数组的大小。当你需要再添加一个元素但内部数组没有任何空闲插槽时，ArrayList 内部会发生下述情况：
// a) 创建另一个数组，该数组比当前内部数组大 50% 外加一个元素。
// b) 旧数组中的所有元素都将复制到新数组中。
// c) 新数组将被另存为 ArrayList 对象的内部数组。旧数组被声明为垃圾（我们只是停止存储对它的引用）。

/* 在数组末尾添加元素
Array:不支持此操作
ArrayList:list.add(s)
 */

/* 在数组中间添加元素
Array:不支持此操作
ArrayList:list.add(15, s);
 */

/* 在数组开头添加元素
Array:不支持此操作
ArrayList:list.add(0, s);
 */

/* 从数组中删除元素
Array:不支持此操作
ArrayList:list.remove(3);
 */

// 如何操作此ArrayList:
// 比较一下 ArrayList 和数组的操作情况
// 假设我们需要‘读取 10 个字符串并以相反顺序在屏幕上显示它们’
/*对于数组：
public static void main(String[] args)
{
Reader r = new InputStreamReader(System.in);
BufferedReader reader = new BufferedReader(r);

// 从键盘读取字符串
String[] list = new String[10];
for (int i = 0; i < list.length; i++)
{
  String s = reader.readLine();
  list[i] = s;
}

// 显示数组内容
for (int i = 0; i < list.length; i++)
{
  int j = list.length - i - 1;
  System.out.println( list[j] );
}
}
 */

/*对于ArrayList：
public static void main(String[] args)
{
Reader r = new InputStreamReader(System.in);
BufferedReader reader = new BufferedReader(r);

// 从键盘读取字符串
ArrayList<String> list = new ArrayList<String>();
for (int i = 0; i < 10; i++)
{
  String s = reader.readLine();
  list.add(s);
}

// 显示集合内容
for (int i = 0; i < list.size(); i++)
{
  int j = list.size() - i - 1;
  System.out.println( list.get(j) );
}
}
 */
// 除了在操作 ArrayList 时不使用方括号，而是使用 get、set 和 add 方法。
