package exercise.trd.student;

public class Student extends exercise.person.Person {
    private int classnumber;
    private double height;
    private double weight;
//学生类自己成员变量的get set方法。

    public int getClassnumber() {
        return classnumber;
    }

    public void setClassnumber(int classnumber) {
        this.classnumber = classnumber;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("学生爱吃棒棒糖");

    }


    public void drink(String brand) {
        System.out.println("学生爱喝"+brand+"品牌的饮料");

    }
}

