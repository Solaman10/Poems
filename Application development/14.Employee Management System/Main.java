import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList equals(ArrayList<Employee> employees,String string){
        ArrayList<Employee> temp=new ArrayList<>();
        for(Employee emp:employees){
            if(emp.name.equals(string)){
                temp.add(emp);
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        ArrayList<Employee> employees=new ArrayList<>();
        Employee emp1=new Employee(1,"sriram",45,"department","ceo","");
        employees.add(emp1);
        Employee emp2=new Employee(2,"mukund",42,"hr","hrmanager","sriram");
        employees.add(emp2);
        Employee emp3=new Employee(3,"sebastian",38,"financemanager","financemanager","sriram");
        employees.add(emp3);
        Employee emp4=new Employee(4,"aashritha",32,"productmanager","devmanager","sriram");
        employees.add(emp4);
        Employee emp5=new Employee(5,"mohammadraf",35,"hr","hrlead","mukund");
        employees.add(emp5);
        Employee emp6=new Employee(6,"anjalikumar",29,"hr","hrassociate","mohammadrafi");
        employees.add(emp6);
        Employee emp7=new Employee(7,"joshep",40,"finance","financeassociate","sebastian");
        employees.add(emp7);
        Employee emp8=new Employee(8,"ramachandran",27,"productdevelopment","techlead","aashritha");
        employees.add(emp8);
        Employee emp9=new Employee(9,"abhinayashankar",23,"productdevelopment","systemdeveloper","ramachandran");
        employees.add(emp9);
        Employee emp10=new Employee(10,"imrankhan",28,"producttesting","qalead","ramachandran");
        employees.add(emp10);
        int input=0;
        Scanner scanner=new Scanner(System.in);
        while(input!=6){
            System.out.println("1.Show all records");
            System.out.println("2.Search records");
            System.out.println("3.Manager report");
            System.out.println("4.Reporting-to tree");
            System.out.println("5.Summary reports");
            System.out.println("6.exit");
            input=scanner.nextInt();
            switch (input)
            {
                case 1://show all records
                    for(Employee emp:employees){
                        emp.display();
                    }
                    break;
                case 2:
                    //searchrecords
                    int op=0;
                    ArrayList<Employee> result=new ArrayList<>();
                    int criCount=0;
                    while(op!=6) {
                        int count=1;
                        System.out.println("1.Name");
                        System.out.println("2.Age");
                        System.out.println("3.Department");
                        System.out.println("4.Designation");
                        System.out.println("5.Reporting to");
                        System.out.println("6.exit");
                        op = scanner.nextInt();
                        switch (op) {
                            case 1:
                            case 3:
                            case 4:
                            case 5:
                                System.out.println("Enter the string");
                                String string=scanner.next();
                                int choose=0;
                                while (choose != 8) {
                                    System.out.println("1.Equals");
                                    System.out.println("2.Not Equals");
                                    System.out.println("3.Starts with");
                                    System.out.println("4.Ends with");
                                    System.out.println("5.Contains");
                                    System.out.println("6.Not Contains");
                                    System.out.println("7.Add another Criteria");
                                    System.out.println("8.Show Result");
                                    choose = scanner.nextInt();
                                    switch (choose){
                                        case 1://equals
                                            //if(criCount==0)
                                            //  result=equals(employees,string);
                                            //else
                                            result=equals(employees,string);
                                            //criCount++;

                                            break;
                                        case 2://Not Equals
                                            break;
                                        case 3://Starts with
                                            break;
                                        case 4://Ends with
                                            break;
                                        case 5://Contains
                                            break;
                                        case 6://Not conatains

                                            break;
                                        case 7://add another criteria
                                            break;
                                        case 8:
                                            for(Employee emp:result){
                                                emp.display();
                                            }
                                            break;
                                        default:
                                            System.out.println("Pls enter valid option");
                                    }
                                }
                                break;
                            case 2:
                                int choice=0;
                                while(choice!=6){
                                    System.out.println("1) <");
                                    System.out.println("2) >");
                                    System.out.println("3) =");
                                    System.out.println("4) !=");
                                    System.out.println("5) Between");
                                    System.out.println("6) exit");
                                    choice=scanner.nextInt();
                                    switch(choice){
                                        case 1://lessthan
                                            break;
                                        case 2://greaterthan
                                            break;
                                        case 3://=
                                            break;
                                        case 4://!=
                                            break;
                                        case 5://between
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Pls enter valid option");
                                    }
                                }
                                break;
                            case 6:
                                break;
                            default:
                                System.out.println("Pls enter Valid option");
                        }
                    }
                    break;
                case 3://manager report
                    System.out.println("Enter Manager name");
                    String mName=scanner.next();
                    for(Employee emp:employees){
                        if(emp.repTo.equals(mName))
                            System.out.println(emp.name);
                    }
                    break;
                case 4:
                    //reporting to  tree
                    System.out.println("Enter employee Name");
                    String empName=scanner.next();
                    System.out.print(empName+"->");
                    boolean isFound=true;
                    while(isFound){
                        isFound=false;
                        for(Employee emp:employees) {
                            if (emp.name.equals(empName)) {
                                isFound=true;
                                empName = emp.repTo;
                                System.out.print(emp.repTo + "->");
                                break;
                            }
                        }
                    }
                    System.out.println("\b\b");
                    break;
                case 5:
                    //summary reports
                    int option=0;
                    while(option!=4) {
                        System.out.println("1.Show all departments summary");
                        System.out.println("2.Show all designation summary");
                        System.out.println("3.Show all managers summary");
                        System.out.println("4.exit");
                        option = scanner.nextInt();
                        switch (option) {
                            case 1:
                                String[] departments = {"management", "finance", "hr", "productmanager", "productdevelopment", "producttesting"};
                                System.out.println("Summary of all departments");
                                for (int i = 0; i < departments.length; i++)
                                {
                                    int c = 0;
                                    for (Employee emp : employees)
                                    {
                                        if (emp.dep.equals(departments[i]))
                                            c++;
                                    }
                                    System.out.println("Department Name : " + departments[i]);
                                    System.out.println("No.of Employees : " + c);
                                }
                                break;
                            case 2:
                                String[] designations = {"ceo", "hrmanager", "financemanager", "devmanager", "hrlead", "hrassociate",
                                        "financeassociate", "techlead", "systemdeveloper", "qalead"};
                                for (int i = 0; i < designations.length; i++) {
                                    int c = 0;
                                    for (Employee emp : employees)
                                    {
                                        if (emp.des.equals(designations[i]))
                                            c++;
                                    }
                                    System.out.println("Designation Name : " + designations[i]);
                                    System.out.println("No.of Employees : " + c);
                                }
                                break;
                            case 3:
                                String[] managers = {"sriram", "mukund", "mohammadrafi", "sebastian", "aashritha", "ramachandran"};
                                for (int i = 0; i < managers.length; i++) {
                                    int c = 0;
                                    for (Employee emp : employees) {
                                        if (emp.repTo.equals(managers[i]))
                                            c++;
                                    }
                                    System.out.println("Manager Name : " + managers[i]);
                                    System.out.println("No.of Employees : " + c);
                                }
                                break;
                            case 4:
                                break;
                            default:
                                System.out.println("Pls Enter valid input");
                        }
                    }
                case 6:
                    break;
                default:
                    System.out.println("Pls enter valid input");
            }
        }
    }
}
