import animals.Tiger;
import model.Student;
import printer.BlackPrinter;
import printer.ColorPrinter;

public class Main {
    public static void main(String[] args){
        Student student = new Student();
        student.setName("JarryLi");
        student.setAge(22);
        student.setSex("男");
        student.setNumber("201516080209");


        System.out.println(
                "姓名"+student.getName()+"\n"+
                "年龄"+student.getAge()+"\n"+
                "性别"+student.getSex()+"\n"+
                "学号"+student.getName());


        /**************************************************************************************************************/
        Tiger tiger = new Tiger();
        tiger.cry();


        /**************************************************************************************************************/
        ColorPrinter colorPrinter = new ColorPrinter();
        print(colorPrinter);

        BlackPrinter blackPrinter = new BlackPrinter();
        print(blackPrinter);
    }

    public static void print(ColorPrinter colorPrinter){
        colorPrinter.print();
        System.out.println();
    }
    public static void print(BlackPrinter blackPrinter){
        blackPrinter.print();
    }
}
