import java.io.*;
import java.util.Scanner;

public class codegym10 {
    /*
    System.out:在屏幕上显示数据
    System.in:接收输入内容。缺点：只允许从键盘读取字符代码
为了解决这个问题，能够一次性读取大块数据，我们将使用更复杂的结构。
     */

    /*
InputStream ： 是所有字节输入流的超类，一般使用它的子类：FileInputStream等，它能输出字节流；
InputStreamReader ： 是字节流与字符流之间的桥梁，能将字节流输出为字符流，并且能为字节流指定字符集，可输出一个个的字符；
BufferedReader ： 提供通用的缓冲方式文本读取，readLine读取一个文本行，从字符输入流中读取文本，缓冲各个字符，从而提供字符、数组和行的高效读取。
关于字节流和字符流的区别:字符流用于处理字符串，字节流常用于处理二进制
readLine:读取一个文本行，从字符输入流中读取文本，缓冲各个字符，从而提供字符、数组和行的高效读取
     */

    // 示例1:从键盘输入字符串和数字
    // 要从键盘读取字符串，最方便的方法是使用 BufferedReader 对象。
    // 但是要做到这一点，你必须传入要从中读取数据的对象。在本例中，即为 System.in。
    // 但是 System.in 与 BufferedReader 不兼容，因此我们使用另一个适配器 – 另一个 InputStreamReader 对象。
    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    String name = bufferedReader.readLine(); //从键盘读取字符串
    String sAge = bufferedReader.readLine(); //从键盘读取字符串
    int nAge = Integer.parseInt(sAge); //将字符串转换为数字

    public codegym10() throws IOException {
    }
}

// 示例2:上一个示例的精简版本
class shili2 {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = reader.readLine();
    String sAge = reader.readLine();
    int nAge = Integer.parseInt(sAge);

    shili2() throws IOException {
    }
}

// 示例3:更为精简
// Scanner 可能很方便，但不是很有用。事实上，当你继续学习和工作时，你会经常使用 BufferedReader 和 InputStreamReader，而极少用到 Scanner。
// 它在我们的示例中很方便，但将来不会经常有用。因此，我们不会经常使用它。
class shili3{
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    int age = scanner.nextInt();
}
