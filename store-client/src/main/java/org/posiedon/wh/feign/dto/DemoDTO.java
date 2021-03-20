package org.posiedon.wh.feign.dto;

/**
 * @Author: Posiedon.wh
 * @Date: 2021/3/21 3:27
 */

public class DemoDTO {
    private String name;

    private Integer age;

    private Long money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }
}
