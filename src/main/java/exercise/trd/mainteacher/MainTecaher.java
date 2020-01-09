package exercise.trd.mainteacher;

import exercise.trd.teacher.Teacher;

public class MainTecaher extends Teacher {
    private int gradenum;

    public int getGradenum() {
        return gradenum;
    }

    public void setGradenum(int gradenum) {
        this.gradenum = gradenum;
    }

    public void teach(){
        System.out.println("班主任的车子型号为"+super.getCar());
        System.out.println("班主任交的年级为"+gradenum);
    }
}
