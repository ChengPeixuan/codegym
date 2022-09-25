// real类型
// float f = 3 / 5; 这个计算会得出 f 等于 0
// 这里没有错误。除法涉及两个整数，因此余数会被忽略。为阻止计算忽略余数，至少除法算式中的一个数字必须为小数。”
// 如果一个数字为小数，则第二个数字必须首先转换为小数类型，然后才执行除法。

/*
可以这样解决问题：
小数表示法：

float f = 3.0f / 5.0f;
float f = 3.0f / 5;
float f = 3 / 5.0f;

如果除法涉及变量怎么办？
将 integer 变量转换为小数值：

int a = 3, b = 5;
float f = (a * 1.0f) / b;
int a = 3, b = 5;
float f = a / (b * 1.0f);
int a = 3, b = 5;
float f = (a * 1.0f) / (b * 1.0f);
int a = 3, b = 5;
float f = (float) a / b;
 */

// 字面量
// 字面量是直接写入 Java 代码编写的数据。代码包含方法、类、变量等，但字面量是直接写在代码中的特定值。
