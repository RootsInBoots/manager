package com.li.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author fuxin_li
 * @version 1.0
 * @date 2021/2/1 19:19
 */
@Data
public class DemoEntity {

    /**
     *   姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 薪资
     */
    private BigDecimal salary;


}
