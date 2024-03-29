import Calculator.MyCalculator;
import HashMapPackage.MovieActorsClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Student {

    private String name;
    private int Roll_no;

    public void SetName(String _name) {
        name = _name;
    }

    public void setRoll_no(int roll_no) {
        Roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public int getRoll_no() {
        return Roll_no;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Student obj = new Student();

        obj.SetName("Vivek");
        obj.setRoll_no(939);

        MovieActorsClass movie = new MovieActorsClass();
        MyCalculator calculate = new MyCalculator();

        System.out.println("Name is: " + obj.getName() + "\nRoll number is: " + obj.getRoll_no());

//        get all the methods
        Method[] method = obj.getClass().getMethods();
        for (Method methods : method) {
            System.out.println("methods = " + methods);
        }

//        get packages
        Package package_ = obj.getClass().getPackage();
        System.out.println("package_ = " + package_);

//        get class name
        Class myNewObj = obj.getClass();
        System.out.println(myNewObj.getSimpleName());

        Constructor constructor = obj.getClass().getConstructor();
        System.out.println(constructor.getName());
    }
}