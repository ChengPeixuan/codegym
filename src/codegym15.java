// 循环
/* 示例1
代码：
int i = 3;
while (i >= 0){
    System.out.println(i);
    i--;    //减 1
}
说明：
3
2
1
0
 */

/* 示例2
代码：int i = 0;
while (i < 3){
    System.out.println(i);
    i++;   //加 1
}
说明：
0
1
2
 */


/* 示例3
代码：
boolean isExit = false;
while (!isExit){
    String s = buffer.readLine();
    isExit = s.equals("退出");
}
说明：
程序将输出从键盘读取的字符串，直至输入字符串‘退出’为止。
 */


/* 示例4
代码：
while (true)
    System.out.println("C");
说明：
程序将在屏幕上重复显示字母 C。
 */

/* 示例5
代码：
while (true){
    String s = buffer.readLine();
    if (s.equals("退出"))
        break;
}
说明：
程序将从键盘读取字符串，直至输入字符串‘退出’为止。
 */

// for循环
/*1
while:
int i = 3;
while (i >= 0){
    System.out.println(i);
    i--;
}

for:
for (int i = 3; i >= 0; i--){
    System.out.println(i);
}
 */

/*2
while:
int i = 0;
while (i < 3){
    System.out.println(i);
    i++;
}

for:
for (int i = 0; i < 3; i++){
    System.out.println(i);
}
 */

/*3
while:
boolean isExit = false;
while (!isExit){
    String s = buffer.readLine();
    isExit = s.equals("退出");
}

for:
for (boolean isExit = false; !isExit; ){
    String s = buffer.readLine();
    isExit = s.equals("退出");
}
 */

/*4
while:
while (true)
    System.out.println(

for:
for (; true; )
    System.out.println("C")
 */

/*5
while:
while (true){
    String s = buffer.readLine();
    if (s.equals("退出"))
        break;
}

for:
for (; true; ){
    String s = buffer.readLine();
    if (s.equals("退出"))
        break;
}
 */

// 这些循环是等效的。while 循环在括号中包含一个条件，而 for 循环语句有三个要素。
// 但是编译器会将 for 循环变成等效的 while 循环。
