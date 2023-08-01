public class OOP {
    public static void main(String[] args) {

        student S1 = new student();
        S1.name="Akhtar";
        S1.id=1224;
        S1.section ="C10";
        S1.email="ek_2000@gmail.com";
        S1.course1=90;
        S1.course2=80;
        S1.BasicInfo();
        S1.grads();
        S1.Email_G();
        //new student
        student S2 = new student();
        S2.name="Ali";
        S2.id=1227;
        S2.section ="C20";
        S2.email="ali_790@gmail.com";
        S2.course1=80;
        S2.course2=70;
        S2.BasicInfo();
        S2.grads();
        S2.Email_G();
}
}


class student{
    student(){

        System.out.println("\n"+"New Student information: ");

    }
    String name;
    String section ;
    int id;
    int course1;
    int course2;
    String email;



    void BasicInfo(){
        System.out.println("Name : "+name+",  ID : "+id);
    }

    void grads(){
        int gr=(course1+course2)/2;
        System.out.println("Grads = " + gr);
    }
    void Email_G(){
        System.out.println("Name : " + name+" Email: "+email  );}

}