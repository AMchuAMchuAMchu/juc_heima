package com.itcast.basic;

/**
 * Description ==> TODO
 * BelongsProject ==> juc_heima
 * BelongsPackage ==> com.itcast.basic
 * Version ==> 1.0
 * CreateTime ==> 2023-03-03 21:02:32
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class TestFrames {

    public static void main(String[] args) {
        method01(10);
    }

    private static void method01(int x){
        int y = x + 1;
        Object o = method02();
        System.out.println(o);
    }

    private static Object method02() {
        Object o = new Object();
        return o;
    }


}
