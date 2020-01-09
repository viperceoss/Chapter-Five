package exercise.trd.test;

import exercise.trd.mainteacher.MainTecaher;
import exercise.trd.teacher.Teacher;

public class Test {
    public static void main(String[] args) {
        Teacher a = new MainTecaher();

        //向上转型无法调用子类独有的方法 但是可以调用子类重写父类的方法子类会将父类的方法覆盖掉
        //下面代码会提示父类没有如下的方法
       /* a.setGradenum(10);
        a.teach();
        */



    }
}
