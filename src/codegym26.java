// 集合
// 在 Java 中，集合/容器是指主要用途为存储其他元素的集合的类。
// 在 Java 中，集合分为三个主要群组：集 (Set)、列表 (List)、映射 (Map)。
// 想象扔在一起的一堆鞋子。这就是一个集。你可以向集中添加元素，也可以搜索或删除元素。需要注意的重要一点是，集元素没有特定的分配顺序。
// 现在想象一下，同一堆鞋子沿着墙壁整齐地排列。现在就有顺序了。每个元素都有自己的编号。你可以简单地根据编号（索引）找到第 4 双鞋。这就是一个列表。你可以将元素添加到列表的开头或中间位置，也可以删除元素 – 只需使用其索引即可。
// 想象一下同样的鞋子，但现在每双鞋都有一个名字注释：‘尼克’、‘维克’或‘安娜’。这就是一个映射（通常也称为词典）。每个元素都有自己的唯一名称，用于处理该元素。每个元素的唯一名称通常称为‘键’。因此，映射是一组键-值对。键不必是字符串：它可以是任意类型。键为 Integer 的映射实际上是列表（有点区别）。
// 集合和容器在创建之后没有存储任何内容，但你可以将元素逐一添加到其中。添加元素后，它们的大小将发生动态变化。
// 怎么知道一个集合包含多少元素？:可以使用 size() 方法。


// 所有集合的列表
// 如何显示集或映射?列表的元素有固定的顺序，因此可以只使用索引来显示它们。而集和映射则没有特定顺序。实际上，在删除项目或添加新项目时，它们的元素顺序可以改变。
// 因此发明了名为迭代器的特殊对象来处理集合元素。迭代器允许你浏览集合中的所有元素，即使它们只有名称而不是索引（映射），或者既没有名称也没有索引（集）。

import java.util.*;

// 显示集的元素
public class codegym26 {
    public static void main(String[] args)
    {
        Set<String> set = new HashSet<String>();
        set.add("西班牙");
        set.add("的");
        set.add("雨");

        // 获取集的迭代器
        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext())        // 检查是否存在另一个元素
        {
            // 获取当前元素并移至下一个
            String text = iterator.next();

            System.out.println(text);
        }
    }
}

// 显示列表的元素
class liebiaoyuansu{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();
        list.add("西班牙");
        list.add("的");
        list.add("雨");

        Iterator<String> iterator = list.iterator();// 获取列表的迭代器

        while (iterator.hasNext())      // 检查是否存在另一个元素
        {
            // 获取当前元素并移至下一个
            String text = iterator.next();

            System.out.println(text);
        }
    }
}

// 显示映射的元素
class yingsheyuansu{
    public static void main(String[] args)
    {
        // 所有元素成对存储
        Map<String, String> map = new HashMap<String, String>();
        map.put("第一个", "西班牙");
        map.put("第二个", "的");
        map.put("第三个", "雨");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext())
        {
            // 获取键-值对
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();            // 键
            String value = pair.getValue();        // 值
            System.out.println(key + ":" + value);
        }
    }
}

// 首先，我们从集合中获取一个特殊对象，即迭代器。迭代器只有两种方法。
// 1.next() 方法返回集合中的下一个元素。
// 2.hasNext() 方法检查是否仍存在 next() 未返回的元素。
// 首先，我们需要对集合调用 iterator() 方法来获取这个神奇的迭代器对象。
// 然后，我们将逐一获取元素，直至没有剩余元素。我们通过调用 next() 获取集合中的下一个元素，并通过对迭代器调用 hasNext() 来检查集合中是否仍有元素。
// Java 有用于处理迭代器的简写符号。按照 while 和 for 的模式，又添加了一个特殊声明：for each。也可以使用关键字 for 来表示。
// for-each 语句只用于处理集合和容器。它隐式地使用迭代器，但我们只看到返回的元素。

// 展示处理迭代器的普通写法和简写形式：
// 普通写法：
class putong{
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("西班牙");
        set.add("的");
        set.add("雨");

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String text = iterator.next();
            System.out.println(text);
        }
    }
}

class jianxie{
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("西班牙");
        set.add("的");
        set.add("雨");

        for (String text : set) {
            System.out.println(text);
        }
    }
}
// 请注意，在右侧没有出现用红色或绿色突出显示的单词。实际上，三行内容被一行取代：
/* 普通写法
Iterator<String> iterator = set.iterator();
while (iterator.hasNext()){
    String text = iterator.next();
 */
/* 简写形式
for (String text : set)
 */

// 来看一下上述示例的简写形式：
class xianshijideyuansu {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("西班牙");
        set.add("的");
        set.add("雨");

        for (String text : set) {
            System.out.println(text);
        }
    }
}

class xianshiliebiaodeyuansu {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("西班牙");
        list.add("的");
        list.add("雨");

        for (String text : list) {
            System.out.println(text);
        }
    }
}

class xianshiyingshedeyuansu {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("第一个", "西班牙");
        map.put("第二个", "的");
        map.put("第三个", "雨");

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();                      // 键
            String value = pair.getValue();                  // 值
            System.out.println(key + ":" + value);
        }
    }
}






