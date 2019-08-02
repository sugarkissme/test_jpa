package com.example.demo.util;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Author: +Energy
 * @Date: 2019/7/22 17:47
 */
public class OpenUtil {

//    加：add（BigDecima）、减：subtract（BigDecimal）、乘：multiply（BigDecimal）、 除：divide（BigDecimal）
//    乘方：pow（int）、 取绝对值：abs（）、取反：negate（）、 对比：compareTo（BigDecimal）、设置小数点精确度：setScale（int）


    public static void main(String[] args)  {
        BigDecimal totalPrice = BigDecimal.valueOf(10);
        BigDecimal count = BigDecimal.valueOf(3);
        System.out.println(totalPrice.divideAndRemainder(count)[0]);//均值
        System.out.println(totalPrice.divideAndRemainder(count)[1]);//取余
        System.out.println("divide ROUND_DOWN:"+totalPrice.divide(count,2, BigDecimal.ROUND_DOWN));

        System.out.println("divide ROUND_UP:"+totalPrice.divide(count,2, BigDecimal.ROUND_UP));
//          ROUND_HALF_DOWN : 向“最接近的”数字舍入，如果与两个相邻数字的距离相等如.5->1，则为向上舍入的舍入模式
        System.out.println("divide ROUND_HALF_UP:"+totalPrice.divide(count,0, BigDecimal.ROUND_HALF_UP));

//           ROUND_HALF_DOWN : 向“最接近的”数字舍入，如果与两个相邻数字的距离相等如.5->0，则为向下舍入的舍入模式,如果.51，舍入后就是->1
        System.out.println("divide ROUND_HALF_DOWN:"+totalPrice.divide(count,0, BigDecimal.ROUND_HALF_DOWN));



    }



}
