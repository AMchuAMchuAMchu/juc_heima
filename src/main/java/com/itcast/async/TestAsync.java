package com.itcast.async;

import lombok.extern.slf4j.Slf4j;

/**
 * Description ==> TODO
 * BelongsProject ==> juc_heima
 * BelongsPackage ==> com.itcast.async
 * Version ==> 1.0
 * CreateTime ==> 2023-02-27 21:26:18
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Slf4j(topic = "c.Async")
public class TestAsync {
    public static void main(String[] args) {
        new Thread(TestAsync::printYukino).start();
        log.debug("main线程退出...");
    }

    public static void printYukino(){
      log.info("雪之下雪乃-冰雪女王,要说她是何等美貌,是让人无法触及更无法得到的,只能让人为之惊叹奇美丽的存在..");
      log.info("雪之下雪乃-冰雪女王,要说她是何等美貌,是让人无法触及更无法得到的,只能让人为之惊叹奇美丽的存在..");
      log.info("雪之下雪乃-冰雪女王,要说她是何等美貌,是让人无法触及更无法得到的,只能让人为之惊叹奇美丽的存在..");
    }

}
