/* Create a class 'Student2' with three data members which are name, age and address.
The constructor of the class assigns default values name as "unknown", age as '0' and address as "not available".
It has two member methods with the same name “setInfo”.
First method has two parameters for name and age and assigns the same whereas the second method takes three parameters
which are assigned to name, age and address respectively.
Print the name, age and address of 5 students.*/


public class Student2 {
    String name;
    int age;
    String address;

    public Student2(){
        this.name="Unknown";
        this.address="Not available";
        this.age=0;
    }
    void setInfo(String name, int age){
        this.name=name;
        this.age=age;
    }
    void setInfo(String name, int age, String address){
        this.address=address;
    }

    public static void main(String[] args) {
        Student2 obj1=new Student2();
        Student2 obj2=new Student2();
        Student2 obj3=new Student2();
        Student2 obj4=new Student2();
        Student2 obj5=new Student2();

        obj1.setInfo("kshitij",19);
        obj1.setInfo("kshitij",19,"Aligarh");

        obj2.setInfo("mohan",9);
        obj2.setInfo("mohan",9,"Agra");

        obj3.setInfo("ram",29);
        obj3.setInfo("ram",29,"Narora");

        obj4.setInfo("shyam",18);
        obj4.setInfo("shyam",18,"Bihar");

        obj5.setInfo("sita",10);
        obj5.setInfo("sita",10,"Moradabad");

        System.out.println(obj1.name+"  "+obj1.age+"  "+obj1.address);
        System.out.println(obj2.name+"  "+obj2.age+"  "+obj2.address);
        System.out.println(obj3.name+"  "+obj3.age+"  "+obj3.address);
        System.out.println(obj4.name+"  "+obj4.age+"  "+obj4.address);
        System.out.println(obj5.name+"  "+obj5.age+"  "+obj5.address);
    }
}
