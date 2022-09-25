// 构造方法：一种创建和初始化对象的简略方法。
/*1
没有构造方法：
MyFile file = new MyFile();
file.initialize("c:\data\a.txt");
String text = file.readText();

有构造方法：
MyFile file = new MyFile("c:\data\a.txt");
String text = file.readText();
 */

/*2
没有构造方法：
MyFile file = new MyFile();
file.initialize("c:\data\", "a.txt");
String text = file.readText();

有构造方法：
MyFile file = new MyFile("c:\data\", "a.txt");
String text = file.readText();
 */

/*3
没有构造方法：
MyFile file = new MyFile();
file.initialize("c:\data\a.txt");

MyFile file2 = new MyFile();
file2.initialize( MyFile file, "a.txt");
String text = file2.readText();

有构造方法：
MyFile file = new MyFile("c:\data\a.txt");

MyFile file2 = new MyFile(file, "a.txt");
String text = file2.readText();
 */

// 知道如何在类中编写 initialize 方法，但是如何编写构造方法呢？
// 没有构造方法：
class MyFile4 {
    private String filename = null;

    public void initialize(String name) {
        this.filename = name;
    }

    public void initialize(String folder, String name) {
        this.filename = folder + name;
    }

    public void initialize(MyFile file, String name) {
        this.filename = file.getFolder() + name;
    }

    private String getFolder() {
        return null;
    }
}
// 有构造方法：
class MyFile5 {
    private String filename = null;

    public void MyFile5(String name) {
        this.filename = name;
    }

    public MyFile5(String folder, String name) {
        this.filename = folder + name;
    }

    public MyFile5(MyFile file, String name) {
        this.filename = file.getFolder() + name;
    }

    private String getFolder() {
        return null;
    }
}

// 在类中声明构造方法很容易。构造方法类似于 initialize 方法，只是有两点不同：
// 1.构造方法的名称与类名相同（而不是 initialize）
// 2.构造方法没有类型（不指定类型）。