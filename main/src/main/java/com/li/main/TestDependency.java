package com.li.main;

import com.li.entity.DemoEntity;
import org.junit.Test;

/**
 * @author fuxin_li
 * @version 1.0
 * @date 2021/2/1 19:24
 */

public class TestDependency {

    /**
     * 这是一个测试方法
     *
     */
    @Test
    public void test1(){

        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setAge(10);
        demoEntity.setName("test");

        String text = "test";

        System.out.println("结果是:"+demoEntity.toString());
    }
}
