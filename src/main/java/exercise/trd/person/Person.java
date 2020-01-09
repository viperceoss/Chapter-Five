package exercise.person;

public class Person {
    private int age;
    private String name ;
    private char gender;
    private String address;
    private String email;
//get set 方法。
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
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

    //person类方法
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void drink(){
        System.out.println("人可以喝水");

    }
    public void sleep(){
        System.out.println("人可以睡觉");
    }
}
