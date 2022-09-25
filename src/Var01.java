public class Var01 {
    public static void main(String[] args){
        int a;
        a = 100;
        System.out.println(a);
        int b = 800;
        System.out.println(b);

        int age = 20;
        double score = 88.6;
        char gender = '男';
        String name = "jack";
        // String是字符串，是一大堆字符，但是char只能是一个字符
        System.out.println("人的信息如下：");
        System.out.println(name);
        System.out.println(age);
        System.out.println(score);
        System.out.println(gender);
    }
}

// 变量使用的基本步骤：
// 1.声明变量 int a；
// 2.赋值 a = 60;
// 3.使用System.out.println(a);
// 注：也可以一步到位 int a = 60;
class test {
    public static void main(String[] args){
        int a = 1;
        int b = 3;
        b = 89;
        System.out.println(a);
        System.out.println(b);
    }
}

