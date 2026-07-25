package com.demo1;

public class ExceptionTest {
    public double div(double a, double b) {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println("Exception thrown");
        } finally {
            System.out.println("Release resources.");
        }
        return 0.0;
    }


    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        double result1 = et.div(1, 2);
        System.out.println(result1);

        System.out.println("====================");

        double result2 = et.div(3.4, 0);
        System.out.println(result2);

        //1. **浮点型除 0**：Java 中 **double/float 小数除以 0** 不会报错，返回正无穷 `Infinity`
        //2. **整型除 0**：`System.out.println(100/0);` 会直接抛出 **算术异常 ArithmeticException**
    }
}
