// 初始化对象 initialize方法
// 对象初始化：创建对象时，你需要为其变量指定初始值，以免出现访问对象不包含正常运行所需信息的情况
// 考虑 File 对象。文件的最少必要信息是文件名。创建无名文件是很荒谬的
// 假设我们编写一个 MyFile 类来处理文件。每个对象的必要信息是与对象关联的文件的名称
// 为了执行此操作，我们向类中添加 initialize() 方法。
class MyFile {
    private String filename = null;

    public void initialize(String name)
    {
        this.filename = name;
    }

    public String getFolder() {
        return null;
    }
}
// 我们添加了 initialize 方法，以便通过调用该方法来处理对象
// 我们可以在调用 initialize 方法之后立即调用对象的方法。如果无法处理对象，则称该对象无效；否则，则称该对象有效
// initialize 方法的主要任务是接收使对象有效所需的所有数据。

// 假设使用我们的类的程序员会发现，仅传递文件的目录和短名称而不是其完整路径会更方便
// 我们可以通过创建另一个 initialize 方法（Java 允许创建多个具有相同名称的方法）来允许程序员达到此目的.
// 包含两个 initialize 方法的示例：
class MyFile2 {
    private String filename = null;
    public void initialize(String name)
    {
        this.filename = name;
    }

    public void initialize(String folder, String name)
    {
        this.filename = folder + name;
    }
}

// 我们经常需要在当前文件的旁边创建一个临时文件副本:
class MyFile3 {
    private String filename = null;
    public void initialize(String name) {
        this.filename = name;
    }

    public void initialize(String folder, String name) {
        this.filename = folder + name;
    }

    // 文件名将与文件存储在同一目录中。
    public void initialize(MyFile file, String name) {
        this.filename = file.getFolder() + name;
    }
}
// getFolder() 方法:它表示一个返回字符串的方法，该字符串包含存储文件的文件夹的名称。

// 在什么时候必须调用 initialize 方法？:创建对象后立即调用，以使对象生效。
/*1
MyFile file = new MyFile();
file.initialize("c:\data\a.txt");

String text = file.readText();
 */
/*2
MyFile file = new MyFile();
file.initialize("c:\data\", "a.txt");

String text = file.readText();
 */
/*3
MyFile file = new MyFile();
file.initialize("c:\data\a.txt");

MyFile file2 = new MyFile();
file2.initialize("a.txt");

String text = file2.readText();
 */