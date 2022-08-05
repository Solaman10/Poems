public class Employee {
    int id,age;
    String name,dep,des,repTo;

    Employee(int id,String name,int age,String dep,String des,String repTo){
        this.id=id;
        this.name=name;
        this.age=age;
        this.dep=dep;
        this.des=des;
        this.repTo=repTo;
    }
    void display()
    {
        System.out.println(id+" "+name+" "+age+" "+dep+" "+des+" "+repTo);
    }
}
