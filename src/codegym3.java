// 包名称
/*
第一行是创建(声明)了一个名为com.futujava.lesson2的包
第二行是导入了一个名为 java.io.IOException的包
 */

import java.io.IOException;
/**
 * 用户名：普通
 * 日期：12/21/12
 * 时间：11:59
 */

// 类名
public class codegym3 {
    // 类变量
    /*
    为什么要在方法外面声明变量：
    方法内的变量只有方法内可见，方法外访问不到
    想在方法外也访问到这个变量就得放方法外面，以全局变量形式存在

    private static String TEXT = "别开玩笑了"
    其中private表示私有的，是面向对象封装的一种手段，为了保护变量的安全性进行封装，只留一个简单的访问入口
    在外部想要访问需要用set方法和get方法进行读取和修改，在自身类访问则不需要
    其static表示静态的，表示变量text是成员变量中的静态变量，存储在jvm的方法区内存当中，不需要用引用进行访问，主函数可以直接访问
     */
    private static String TEXT = "别开玩笑了";
    // main方法
    public static void main(String[] args) throws IOException {
        System.out.println(TEXT); //显示单个字符串
        // 变量声明
        String s = "呵呵呵";
        // 方法调用
        /*
        printTextMoreTimes()这个函数包含两个参数，也就是例子中的s和3
        s是字符串类型，后面是for循环的次数，int类型，最后printout s*3次
         */
        printTextMoreTimes(s, 3);
    }
    // 方法参数
    public static void printTextMoreTimes(String s, int count) {
        // 循环
        for (int i = 0; i < count; i++){
        // 循环体
            System.out.println(s);
        }
    }
}
