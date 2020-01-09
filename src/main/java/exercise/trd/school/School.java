package exercise.trd.school;

public class School {
    private int phonenum ;
    private String address;
    private String location;
//get set 方法
    public int getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(int phonenum) {
        this.phonenum = phonenum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void show(String address){
        setAddress(address);
        System.out.println(this.address);
    }

}
