package com.example.demo;

import com.sun.deploy.security.SelectableSecurityManager;
import com.sun.org.apache.xpath.internal.objects.XString;

import java.awt.event.WindowFocusListener;

public class Students {
    private String name;
    private int age;
    private char gender;
    private String phone;
    private String address;
    private String email;
    private String[] student = {"大连", "326049128@qq.com", "张迪"};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    Students() {

    }

    public Students(String name) {
        this.name = name;
    }

    public Students(int age) {
        this.age = age;
    }

    public Students(char gender) {
        this.gender = gender;
    }



    public Students(String phone, String address, String email, int age, char gender) {
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public void eat() {
        System.out.println("学生吃");
    }

    public void drink() {
        System.out.println("学生喝");
    }

    public void play() {
        System.out.println("学生玩");
    }

    public void sleep() {
        System.out.println("学生睡觉");
    }

    public void search(String address, String email, String name) {

        Students a = new Students();
        if (a.student[0].equals(address) && a.student[1] .equals(email) && a.student[2].equals(name) ){
            System.out.println("查找到的姓名为" + a.student[2] + "查找到的email为" + a.student[1] + "查找到的地址为" + a.student[0]);
        }
        else{
            System.out.println("没有查询到");
        }

    }

    public static void main(String[] args) {
        Students a = new Students();
        a.email = "1111@qq.com";
        a.address = "沈阳";
        System.out.println(a.address + a.email);
        a.drink();
        Students b = new Students("apple", "大连市", "326049128@qq.com", 10, '男');
        System.out.println(b.address + b.email);
        b.search("大连","326049128@qq.com","张迪");

    }

}


