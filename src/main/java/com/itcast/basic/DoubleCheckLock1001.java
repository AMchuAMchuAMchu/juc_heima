package com.itcast.basic;

import lombok.extern.slf4j.Slf4j;

/**
 * Description ==> TODO
 * BelongsProject ==> juc_heima
 * BelongsPackage ==> com.itcast.basic
 * Version ==> 1.0
 * CreateTime ==> 2023-03-07 07:27:41
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Slf4j(topic = "c.double_check_lock")
public class DoubleCheckLock1001 {

    public static void main(String[] args) {

        DCL dcl = new DCL();

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000000; i++) {
            Object instance = dcl.getInstance();
        }

        long end = System.currentTimeMillis();

        System.out.println("耗时:" + (end - start));//1544  1522  1513

    }

}

class DCL {

    private Object object;

    public synchronized Object getInstance() {
        if (object == null) {
            return new Object();
        }
        return object;
    }
}
