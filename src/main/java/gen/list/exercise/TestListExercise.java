package gen.list.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TestListExercise {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Employee> employeeList = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.print("How many employees will be registered? ");
        int n = scan.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("\nEmployee #" + i + ":");
            System.out.print("Id: ");
            Integer id = scan.nextInt();
            scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Salary: ");
            Double salary = scan.nextDouble();
            employeeList.add(new Employee(id, name, salary));
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        Integer empId = scan.nextInt();
        boolean found = false;
        for(Employee employee : employeeList){
            if(employee.getId().equals(empId)){
                System.out.print("Enter the percentage: ");
                double p = scan.nextDouble();
                employee.setSalary(employee.getSalary() * (1+(p/100)));
                found = true;
            }
        }
        if(!found) System.out.println("This id does not exist!");

        System.out.println("\nList of employees:");
        for(Employee employee : employeeList){
            System.out.print(employee);
        }

        scan.close();
    }
}
