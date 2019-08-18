package com.liusk.uc.api.dto;

import java.io.Serializable;

/**
 * 用户dto
 * @author : liusk
 * @date : 2019/8/18 14:20
 */
public class UserDTO implements Serializable {

    private static final long serialVersionUID = -4410622987238444970L;

    private String name;

    private String phone;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }
}
