package com.knoldus.kup.advanceJava.ques12;

//We created a class named Printer and a static method named print that we are using for print.
import com.knoldus.kup.advanceJava.Printer;
import java.io.*;
import java.util.Scanner;

public class Employee {
    int empID,empAge;
    String empName;
    Employee(int empID, String empName,int empAge){
        this.empID = empID;
        this.empName = empName;
        this.empAge = empAge;
    }
    @Override
    public String toString() {
        return " Employee Id = " + empID +
                ", Name = " + empName +
                ",\tAge = " + empAge ;
    }

//    Using static block as per the question requirement
    static {
//        creting two ref of BufferedReader class
        BufferedReader br,br2;
        FileReader file,file1;
        String line;
//        the lineNumber will hold the number of lines in the file
        int lineNumber = 0;
        String data[] ;
        Employee[] employee = null ;
        Scanner sc =new Scanner(System.in);
        try {
            file1 =new FileReader("src/com/knoldus/kup/advanceJava/ques12/Employee.txt");

//         this will count the lines in the text file
            br2=new BufferedReader(file1);
            while (br2.readLine()!= null){
                lineNumber++;
            }
            br2.close();
            file1.close();

//            Here we will start read the file
            employee = new Employee[lineNumber];
            file = new FileReader("src/com/knoldus/kup/advanceJava/ques12/Employee.txt");
            br=new BufferedReader(file);

//            here we are getting the data line by line and storing the employee object
//            in the employee[] array after initialization of employee class objects.
            int i =0;
            while ((line = br.readLine()) != null){
                data = line.split(",");
                employee[i] = new Employee(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]));
                i++;
            }

        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }
            int in;
            do {
//                It will print the list of employees
                for (Employee emp: employee) {
                    Printer.print(emp);
                }
                Printer.print("=========== Enter your choice ===========\n" +
                        "Edit: Press 1 to Edit\n" +
                        "Exit: Press 2 to Exit");
                in = sc.nextInt();
                if(in == 1){
                    Employee employees[] = editEmployee(employee);
//                    Calling updateFile method()
                    updateFile(employees);
                }
            }while (in !=2 );
    }
//    editEmployee will return an array of Employee type after updation
    static Employee[] editEmployee(Employee[] employees){
        Scanner sc =new Scanner(System.in);
        Printer.print("Enter employee id");
        int empid = sc.nextInt();
        for (int i = 0; i<employees.length; i++) {
            if(employees[i].empID == empid){
                Printer.print("Enter Name");
                String editName = sc.next();
                Printer.print("Enter Age");
                int editAge = sc.nextInt();
                employees[i].empName = editName;
                employees[i].empAge = editAge;
            }
        }
        return employees;
    }
//    updateFile method will take a Employee[] type argument and update the data in Employee.txt file
    static void updateFile(Employee[] employees){
        FileWriter writer = null;
        File fileToBeModified = new File("src/com/knoldus/kup/advanceJava/ques12/Employee.txt");
        String newContent ="";
        try {
            for (Employee emp:employees) {
                newContent = newContent + emp.empID+","+emp.empName+","+emp.empAge+System.lineSeparator();
            }
            Printer.print(newContent);
            writer = new FileWriter(fileToBeModified);
            writer.write(newContent);
            Printer.print("File updated successfully");
        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            try {
                writer.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
    }
}