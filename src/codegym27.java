// 介绍Date类型
// 这种类型存储日期和时间，也可以测量时间间隔。
// 每个 Date 对象以一种非常有趣的形式存储时间：自格林威治标准时间 1970 年 1 月 1 日以来的毫秒数。
// 这个数字太大，以至于 int 中没有足够的空间容纳它，因此必须将其存储在 long 中。但是，计算任意两个日期之间的差值非常方便。只需执行减法即可得到精确到毫秒的差值。它还解决了日期变更线和夏令时的问题。
// 最有趣的部分是，每个对象在创建时都以当前时间进行初始化。要知道当前时间，只需创建一个 Date 对象。

import java.util.Date;

class huoqudangqianriqi{
    public static void main(String[] args) throws Exception {
        Date today = new Date();
        System.out.println("当前日期：" + today);
    }
}

class jisuanlianggeriqizhijiandechazhi{
    public static void main(String[] args) throws Exception {
        Date currentTime = new Date();           // 获取当前日期和时间
        Thread.sleep(3000);                      // 等待 3 秒（3000 毫秒）
        Date newTime = new Date();               // 获取新的当前时间

        long msDelay = newTime.getTime() - currentTime.getTime(); // 计算差值
        System.out.println("时间差值为：" + msDelay + "，以毫秒表示");
    }
}

class jianchashifoujingguoletediandeshijain{
    public static void main(String[] args) throws Exception
    {
        Date startTime = new Date();

        long endTime = startTime.getTime() + 5000;  //    +5 秒
        Date endDate = new Date(endTime);

        Thread.sleep(3000);              // 等待 3 秒

        Date currentTime = new Date();
        if(currentTime.after(endDate))// 检查 currentTime 是否在 endDate 之后
        {
            System.out.println("结束时间！");
        }
    }
}

class quedingzidangtiankaishijingguoleduoshaoshijian{
    public static void main(String[] args) throws Exception {
        Date currentTime = new Date();
        int hours = currentTime.getHours();
        int mins = currentTime.getMinutes();
        int secs = currentTime.getSeconds();

        System.out.println("自午夜以来的时间 " + hours + "：" + mins + "：" + secs);
    }
}

class quedingzinianchukaishijingguoleduoshaotian{
    public static void main(String[] args) throws Exception {
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1);      // 当月第一天
        yearStartTime.setMonth(0);     // 一月（从 0 到 11 对月份编制索引）

        Date currentTime = new Date();
        long msTimeDifference = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;  // 24 小时内的毫秒数

        int dayCount = (int) (msTimeDifference/msDay); // 完整天数
        System.out.println("自年初以来的天数：" + dayCount);
    }
}

// getTime() 方法返回 Date 对象中存储的毫秒数。
// after() 方法检查调用该方法的日期是否在传递给该方法的日期之后
// getHours()、getMinutes()、getSeconds() 方法分别为调用它们的对象返回小时数、分钟数和秒数
// 此外，在最后一个示例中，会发现可以更改存储在 Date 对象中的日期/时间。”我们获取当前的时间和日期，然后将小时、分钟和秒重置为 0。我们还将一月设置为月份，将 1 设置为月份的日期。因此，yearStartTime 对象存储当年 1 月 1 日的日期和时间 00:00:00。
// 之后，我们再次获取当前日期 (currentTime)，计算两个日期之间的差值（以毫秒表示），并将其存储在 msTimeDifference 中。
// 然后将 msTimeDifference 除以 24 小时内的毫秒数，得出自今年年初到今天的完整天数。
