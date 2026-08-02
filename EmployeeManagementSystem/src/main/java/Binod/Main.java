package Binod;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeOperation emp = new EmployeeOperation();

        while (true) {

            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Transaction");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {

                case 1:
                    emp.addEmployee();
                    break;

                case 2:
                    emp.viewEmployee();
                    break;

                case 3:
                    emp.updateEmployee();
                    break;

                case 4:
                    emp.deleteEmployee();
                    break;

                case 5:
                    emp.transactionEmployee();
                    break;

                case 6:
                    System.out.println("Thank You...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}