package com.example.mylibrary;

public class MathOperations {
    // 私有构造函数防止实例化
    private MathOperations() {}

    /**
     * 加法运算
     * @param a 第一个数字
     * @param b 第二个数字
     * @return 两数之和
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * 减法运算
     * @param a 被减数
     * @param b 减数
     * @return 两数之差
     */
    public static double subtract(double a, double b) {
        return a - b;
    }

    /**
     * 乘法运算
     * @param a 第一个数字
     * @param b 第二个数字
     * @return 两数之积
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * 除法运算
     * @param a 被除数
     * @param b 除数
     * @return 两数之商
     * @throws IllegalArgumentException 当除数为0时抛出异常
     */
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("除数不能为零");
        }
        return a / b;
    }

    /**
     * 计算阶乘
     * @param n 非负整数
     * @return n的阶乘
     * @throws IllegalArgumentException 当n为负数时抛出异常
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("阶乘参数不能为负数");
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
