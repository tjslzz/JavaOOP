import model.Student;

public class Outer {
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
    }
}
