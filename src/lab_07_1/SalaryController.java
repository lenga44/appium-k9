package lab_07_1;

import java.util.Arrays;
import java.util.List;

public class SalaryController  {
    public static void main(String[] args) {

        Employee employee_1 = new FulltimeEmployee();
        Employee employee_2 = new FulltimeEmployee();
        Employee employee_3 = new FulltimeEmployee();
        Employee employee_4 = new ContractEmployee();
        Employee employee_5 = new ContractEmployee();

        SalaryController salaryController = new SalaryController();
        salaryController.getToTalSalary( Arrays.asList(employee_1, employee_2, employee_3, employee_4, employee_5));
    }
   public static void getToTalSalary(List<Employee> employeeList){
       int totalSalary = 0;

       for (Employee employee : employeeList) {
           totalSalary = totalSalary + employee.getSalary();
       }
       System.out.println("Total salary: " + totalSalary);

   }
}
