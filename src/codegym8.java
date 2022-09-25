import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
// 这三个包是"类的短名称"

public class codegym8 {
    /*
    《类的全名》
    类存储在包中。因此，类的全名由所有包的名称（由句点分隔）和类名组成。
    类名	包名	全名
String	java.lang	java.lang.String
FileInputStream	java.io	java.io.FileInputStream
ArrayList	java.util	java.util.ArrayList
IOException	java.io	java.io.IOException;
     */
}

// 类的全名
class FileCopy2
{
    public static void main(String[] args) throws java.io.IOException
    {
        java.io.FileInputStream fileInputStream =
                new java.io.FileInputStream("c:\\data.txt");
        java.io.FileOutputStream fileOutputStream =
                new java.io.FileOutputStream("c:\\result.txt");

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}

// 类的短名称

// 放最开头的三个包
class FileCopy
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream fileInputStream =
                new FileInputStream("c:\\data.txt");
        FileOutputStream fileOutputStream =
                new FileOutputStream("c:\\result.txt");

        while (fileInputStream.available() > 0)
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

        fileInputStream.close();
        fileOutputStream.close();
    }
}
