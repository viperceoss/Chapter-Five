package exercise.trd.teacher;

public class Teacher extends exercise.person.Person {
    private String car;
    private char marriage;
    private char haschild;

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public char getMarriage() {
        return marriage;
    }

    public void setMarriage(char marriage) {
        this.marriage = marriage;
    }

    public char getHaschild() {
        return haschild;
    }

    public void setHaschild(char haschild) {
        this.haschild = haschild;
    }
public void drive(){
        if (this.car==null){
            System.out.println("老师没有车");}
        else{
            System.out.println("老师个"+this.car+"品牌的车");
        }

}

}
