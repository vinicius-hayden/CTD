import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int salary = 875;
        int workHours;
        int totalWeekSalary;
        int excWorkHours;

        Scanner gets = new Scanner(System.in);

        System.out.print("Type how many hours you have worked this week: ");
        workHours = gets.nextInt();

        if (workHours > 40) {
            excWorkHours = workHours - 40;
            totalWeekSalary = excWorkHours * (salary/2);
            totalWeekSalary = totalWeekSalary + 40 * salary;
            System.out.println("Your week salary: " + totalWeekSalary);
        }
        else {
            totalWeekSalary = workHours * salary;
            System.out.println("Your week salary: " + totalWeekSalary);
        }

    }

}
