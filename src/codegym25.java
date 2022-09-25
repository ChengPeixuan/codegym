import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

// 示例1：从键盘读取一列数字
public class codegym25 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
        ArrayList<Integer> list = new ArrayList<Integer>() ;

        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(Integer.parseInt(s));
        }
    }
}

// 示例2：与上面相同，但偶数被添加到列表末尾，奇数被添加到列表开头
class lizz {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        while (true)
        {
            String s = reader.readLine();
            if (s.isEmpty()) break;

            int x = Integer.parseInt(s);
            if (x % 2 == 0)
                list.add(x);         // 添加到末尾
            else
                list.add(0, x);      // 添加到开头
        }
    }
}

// 示例3：删除所有大于 5 的数字
class lizzz {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(7);
        list.add(11);
        list.add(3);
        list.add(15);

        for (int i = 0; i < list.size(); ) // 我们将增加 i 的语句移到了循环内部
        {
            if (list.get(i) > 5)
                list.remove(i);  // 如果我们删除了当前元素，则不增加 i
            else
                i++;
        }
    }
}

// 示例4：将数组分为两部分 - 偶数和奇数
class lizzzz {
    public static void main(String[] args) throws IOException
    {
        // 数组的 static 初始化
        int[] data = {1, 5, 6, 11, 3, 15, 7, 8};

        // 创建一个所有元素均为整数的列表
        ArrayList<Integer> list = new ArrayList<Integer> ();

        // 使用数组填充列表
        for (int i = 0; i < data.length; i++) list.add(data[i]);

        ArrayList<Integer> even = new ArrayList<Integer>();  // 偶数
        ArrayList<Integer> odd = new ArrayList<Integer>();    // 奇数

        for (int i = 0; i < list.size(); i++)
        {
            Integer x = list.get(i);
            if (x % 2 == 0)    // 如果 x 是偶数
                even.add(x);   // 将 x 添加到偶数集合
            else
                odd.add(x);    // 将 x 添加到奇数集合
        }
    }
}

// 示例5：合并列表
class lizzzzz {
    public static void main(String[] args) throws IOException
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>();   // 创建列表
        Collections.addAll(list1, 1, 5, 6, 11, 3, 15, 7, 8);   // 填充列表

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        Collections.addAll(list2, 1, 8, 6, 21, 53, 5, 67, 18);

        ArrayList<Integer> result = new ArrayList<Integer>();

        result.addAll(list1);   // 将每个列表中的所有值添加到新列表中
        result.addAll(list2);

        for (Integer x : result)   // 快速循环遍历所有元素的方法，仅适用于集合
        {
            System.out.println(x);
        }
    }
}