// boolean类型 此类型变量只能取两个值：true和false
// 逻辑运算符

/*
1.boolean m;
2.boolean m = false;
说明：这两个表达式是等效的。boolean 变量的默认值为 false。
 */

/*
3.
if (a > b)
    System.out.println(a);
4.
boolean m = (a > b);
if (m)
    System.out.println(a);
说明：比较的结果（true 或 false）将赋给变量 m。如果表达式的计算结果为 true，则满足条件
 */

/*
5.
boolean m = (a > b);
if (m == true)
    System.out.println(a);
6.
boolean m = (a > b);
if (m)
    System.out.println(a);
说明：无需将逻辑 (boolean) 变量和 true 或 false 进行比较。比较的结果将是与另一个变量匹配的 boolean 值。
例如，true == true 的计算结果为 true； true == false 的计算结果为 false。
 */

// 此方法验证数字 a 小于数字 b。这是四个等效比较。最后一个比较最紧凑、最正确。
public class codegym14 {
    public boolean isALessThenB (int a, int b) {
        if (a < b)
            return true;
        else
            return false;
    }
}

class li2 {
    public boolean isALessThenB (int a, int b) {
        boolean m = (a < b);
        if (m)
            return true;
        else
            return false;
    }
}

class li3 {
    public boolean isALessThenB (int a, int b) {
        boolean m = (a < b);
        return m;
    }
}

class li4 {
    public boolean isALessThenB (int a, int b) {
        return a < b;
    }
}

// 0<a<b : (0<a) AND (a<b)。

/*
逻辑运算符	Java 表示法	    表达式	    结果
AND	            &&	     true && true	true
                         true && false	false
                         false && true	false
                         false && false	false
OR	            ||	     true || true	true
                         true || false	true
                        false || true	true
                        false || false	false
NOT	             !	         !true	    false
                             !false	    true

常用组合和表达式	m && !m     	false
                m || !m	        true
                ! (a && b)	    !a || !b
                ! (a || b)	    !a && !b
 */

/*
举例：
    Java 表示法            	    逻辑表示法
(a<3) && (a>0)	            (a < 3) AND (a>0)
(a>10) || (a<100)	        (a>10) OR (a<100)
(a<b) && (!(c<=d))	        (a<b) AND (NOT (c<=d))
 */