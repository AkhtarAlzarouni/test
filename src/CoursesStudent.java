import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoursesStudent {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        Course c1 = new Course();
        c1.name = "C++";
        c1.code = 1100;
        c1.doctor = "D.Ali";
        c1.hour = 3;

        Course c2 = new Course();
        c2.name = "java";
        c2.code = 2200;
        c2.doctor = "Dr.Mohmmad";
        c2.hour = 4;

        Course c3 = new Course();
        c3.name = "python";
        c3.code = 3300;
        c3.doctor = "Ms.fatma";
        c3.hour = 5;


        Student s1 = new Student();
        s1.id = 115;
        s1.name = "Akhtar";

        Student s2 = new Student();
        s2.id = 117;
        s2.name = "Maryam";

        Student s3 = new Student();
        s3.id = 118;
        s3.name = "Akhtar";

        List<Student> stuList = new ArrayList<>();
        stuList.add(s1);
        stuList.add(s2);
        stuList.add(s3);


        System.out.println("Welcome to the student registration system");
        while (true) {
            System.out.println("Enter your ID: ");
            int idStu = s.nextInt();
            System.out.println("Enter your Name");
            String nameStu = s.next();


            if (idStu == s1.id || idStu == s2.id || idStu == s3.id) {

                if (nameStu.contains(s1.name) || nameStu.contains(s2.name) || nameStu.contains(s3.name)) {
                    System.out.println("Welcome," + nameStu + " Choose the article number  ");
                    System.out.println("1:C++ , 2:java , 3:python ");
                    int input = s.nextInt();
                    switch (input) {
                        case 1:
                            System.out.println("You have been successfully added to the course C++");
                            System.out.println("the inf about Course :  " + "\n Doctor" + c1.doctor + "\n code= " + c1.code + "\n in = " + c1.hour + "'clock");
                            break;
                        case 2:
                            System.out.println("You have been successfully added to the course java");
                            System.out.println("the inf about Course :  " + "\n Doctor" + c2.doctor + "\n code= " + c2.code + "\n in = " + c2.hour + "'clock");
                            break;
                        case 3:
                            System.out.println("You have been successfully added to the course python");
                            System.out.println("the inf about Course :  " + "\n Doctor" + c3.doctor + "\n code= " + c3.code + "\n in = " + c3.hour + "'clock");
                            break;
                        default:
                            System.out.println("this Course unavailable");
                    }
                    break;

                } else {
                    System.out.println("you are not in our System, try agan");
                }


            } else {
                System.out.println("you are not in our System, try agan");
            }
        }


    }


    }

class Course {

    String name;
    String doctor;
    int code;
    int hour;

}
class  Student extends Course {
    String stuName;
    int id;


}



