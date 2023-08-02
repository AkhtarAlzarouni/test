public class inh {
    public static void main(String[] args) {

        Student s=new Student();
        s.id=3412;
        s.stuName="Aktar";
        s.grade=3.9;
        s.name="Math";
        s.section="c20";
        s.gStudent();


    }
}

class Course {

    String name;
    String section;



    void gStudent(){
        System.out.println("Section name: "+ section + "Course name ="+ name);
    }


}


class  Student extends Course{
    String stuName;
    int id;
    double grade;

    @Override
    void gStudent() {
        System.out.println( "ID = "+id+"\nstudent name= "+ stuName + "\nthe Grade ="+ grade+"\nSection name: "+ section + "\nCourse name = "+name);
    }
}