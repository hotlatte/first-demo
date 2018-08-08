package com.tim.sbootweb.entity;

/**
 * @author kyle
 * @version 1.0
 * @className
 * @descripsion 实体类人员表
 * @date 2018/8/4 20:41
 */
public class Person {
    private Integer id;
    private String name;
    private String idCard;
    private String address;
    private String phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
