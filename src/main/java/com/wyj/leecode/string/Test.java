package com.wyj.leecode.string;

/**
 * @author wangyujue
 */
public class Test {

    public static void main(String[] args) {
        test();
        System.out.println("----------");
        test1();
        System.out.println("----------");
        test2();
    }

    public static void test() {
        String a = "ab";
        String b = "a" + "b";
        String b1 = new String("ab");
        System.out.println(a == b);
        System.out.println(a == b1);
    }

    private static final String MESSAGE="taobao";
    public static void test1() {
        String a="tao"+"bao";
        String b="tao";
        String c="bao";
        System.out.println(a==MESSAGE);
        System.out.println((b+c)==MESSAGE);
    }

    public static void test2() {
        final String a = "tao";
        final String b = "bao";
        System.out.println( (a + b) == MESSAGE);

    }
}
