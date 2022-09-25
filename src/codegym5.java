import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// FileCopy 复制 /Users/xuanxuan/Documents/培训计划 - 2022.pdf
public class codegym5 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/Users/xuanxuan/Documents/培训计划 - 2022.pdf");
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/xuanxuan/Documents/培训计划 - 2022.pdf");

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}

/*
“所有复合类型都由较简单的类型组成。而较简单的类型又由更简单的类型组成。
直到最后，我们得到无法进一步简化的原始类型。因此称之为 – 原始类型。
例如，int 是原始类型，但 String 是将数据以字符表方式存储的复合类型（其中每个字符是原始类型 char）。”
复合类型的变量不存储对象本身，而只存储对象引用（即对象的四字节地址）的原因。
以这种方式存储数据的一个重要特性就是你可以拥有对一个对象的多个引用。
变量分为两种类型：原始类型和引用类型。原始类型直接存储值，而引用类型存储对象的引用。原始类型包括 int、char、boolean 和许多其他类型。
引用类型包括其他所有类型。我们使用类来创建它们。
 */

/*
声明一个新的复合类型Person，其数据存储在String(复合类型)name和(原始类型)int变量age中
 */
class Person{
    String name;
    int age;
}
//声明一个新的复合类型-Rectangle，它由四个int(原始类型)变量组成
class Rectangle{
    int x,y,width,height;
}

/* 声明一个新的复合类型Cat，它具有以下变量：
- owner，复合类型Person
- territory，复合类型Rectangle
- age，原始类型int
- name，复合类型String
 */
class Cat{
    Person owner;
    Rectangle territory;
    int age;
    String name;
}

/*
class fuheleixing{
    String s;
    // 和 String s =null; 是等效语句

    Person person;
    //创建值为null的person变量
    Person = new Person();
    //将新创建的Person对象的地址赋给该变量
    person = null;
    //将null赋给该变量

    Cat cat = new Cat();
    //创建 Cat 对象，并将其地址存储在变量 cat 中；cat.owner 等于 null。
    cat.owner = new Person();
    //将 cat.owner 设置为等于新创建的 Person 对象的地址
    //cat.owner.name 仍然等于 null
    cat.owner.name = "上帝"；
    //cat.owner.name 仍然等于 null
 */


