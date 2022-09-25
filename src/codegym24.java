// 泛型
// 泛型是带有参数的类型。在 Java 中，容器类允许你指出其内部对象的类型。
// 声明泛型变量时，我们指出两个（而不是一个）类型：变量类型和它所存储的数据的类型。
// 创建新的 ArrayList 对象时，可以方便地指出将在此列表内存储的值的类型。

/*1
代码：
ArrayList<String> list = new ArrayList<String>();
说明：
创建名为 list 的 ArrayList 变量。
将 ArrayList 对象分配给该变量。
此列表只能存储 String 对象。
 */

/*2
代码：
ArrayList list = new ArrayList();
说明：
创建名为 list 的 ArrayList 变量。
将 ArrayList 对象分配给该变量。此列表可以存储任意值。
 */

/*3
代码：
ArrayList<Integer> list = new ArrayList<Integer>();
说明：
创建名为 list 的 ArrayList 变量。
将 ArrayList 对象分配给该变量。
此列表只能存储 Integer 和 int 值。
 */

// 实际上，如果我们在一种方法中将字符串放入 ArrayList，然后在另一种方法中希望它包含数字，那么程序将会崩溃（以错误终止）。
// 现在，我们不会创建我们自己的带类型参数的类。我们只使用现有的类。
// 除原始类型外的任何类型。所有类型参数都必须从 Object 类继承。
// 不能编写 ArrayList<int>，但是 Java 开发人员为每种原始类型编写了包装类。这些类继承 Object。
// 可以轻松地把原始类和与其相似的类（包装类）分配给彼此：
/*1
int a = 5;
Integer b = a;
int c = b;
 */
/*2
Character c = 'c';  //文字 c 是 char 类型
char d = c;
 */
/*3
Byte b = (byte) 77;  // 文字 77 是 int 类型
 */
/*4
Boolean isOk = true;  // 文字 true 是 boolean 类型
 */
/*5
Double d = 1.0d;  // 文字 1.0d 是 double 类型
 */



