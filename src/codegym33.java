// 基本数据类型列表：
/*
类型	    尺寸字节	    取值范围	                默认值	        说明
byte	1	        -128 ..127	            0	            最小整数，1 个字节
short	2	        -32,768 ..32,767	    0	            短整数，2 个字节
int	    4	        -2*10`9 ..2*10`9	    0	            整数，4 个字节
long	8	        -9*10`18 ..9*10`18	    0L	            长整数，8 个字节
float	4	        -10`127 ..10`127	    0.0f	        小数，4 个字节
double	8	        -10`1023 ..10`1023	    0.0d	        小数，是浮点数的两倍大小，8 个字节
boolean	1	        true,                   false	false	布尔类型（仅 true 或 false）
char	2	        0..65,535	            '\u0000'	    字符，2 个字节，所有无符号值
Object	4	        任何引用或为空。	         null	        存储对 Object 实例或派生 Object 的类的引用

byte 类型是最小的整数类型。这种类型的变量仅占用 1 个字节的内存。一个字节可以存储 -128 到 127 之间的值。
为什么我们需要这个小类型？为什么我们不能总是用 int？:
当然可以。但是，如果要创建大型数组，其元素永远不需要存储大于 100 的值，何不用这种小类型呢？

short 长度是 byte 的两倍，它也只存储整数。它可以存储的最大正数是 32,767。它可以存储的最大负数是 -32,768。

int类型，可以存储 ±2,000,000,000 范围内的整数。

float 类型用来存储实数（分数）。它的大小为 4 个字节。

分数以相当有趣的形式存储。
例如， 987654.321 可表示为0.987654321*106。这意味着它可以在内存中表示为两个数字：0.987654321（尾数或有效数）以及 6（基数为 10 的指数）。

这种方法允许我们使用 4 个字节来存储数字，该数字远大于 int 可以存储的数字。为此，我们必须牺牲准确性。这些字节中只有一部分用于存储尾数，这意味着这些数字仅存储 6-7 个小数位。不重要的小数位将被丢弃。
这些数字也被称为浮点数字。float 类型名称也因此而来。

double 类型类似于 float，但长度是两倍（由此而得名），占 8 个字节。它可容纳更大的尾数和更重要的数字。如果你要存储实数，务必使用这种类型。

char 是一个混合类型。它的值可解释为数字（可加减）和字符。这一点很可能，因为即使字符有视觉表示，计算机也主要视其为数字。而且处理为数字更为方便。另有一点：char 类型始终为正值。它不可能包含负值。

boolean 类型是一个逻辑类型，只能存储两个值：true 或 false。

但本图表中列出的 Object 类型不是原始类型。它是 Java 中所有类的基础类。首先，所有类均从基础类派生，因此包含其方法。其次，Object 变量可存储任何类型对象的引用，包括 null（null 引用）。
 */