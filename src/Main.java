import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

        public static Employee[] employee = new Employee[10];

        private static double salary() {
                double sum = 0;
                for (int i = 0; i < employee.length; i++) {
                        sum = sum + employee[i].getSalaryEmployee();
                }
                return sum;
        }

        private static Employee minimalSalary() {
                Employee minSalary = employee[9];
                for (int a = 0; a < employee.length; a++) {
                        if (employee[a].getSalaryEmployee() < minSalary.getSalaryEmployee())
                                minSalary = employee[a];
                }
                return minSalary;
        }


        private static Employee maximalSalary() {
                Employee maxSalary = employee[9];
                for (int a = 0; a < employee.length; a++) {
                        if (employee[a].getSalaryEmployee() > maxSalary.getSalaryEmployee())
                                maxSalary = employee[a];
                }
                return maxSalary;
        }


        public static double averageSalary() {
                double average = 0;
                if (employee.length > 0) ;
                double sumSecond = salary();
                average = sumSecond / employee.length;
                return average;
        }

        private static void list() {
                for (int i = 0; i < employee.length; i++) {
                        System.out.println(employee[i].getFirstNameEmployee() + employee[i].getMiddleNameEmployee() + employee[i].getLastNameEmployee() + employee[i].getSalaryEmployee() + employee[i].getNumberDepartment());
                }
        }

        public static void main(String[] args) {
                employee[0] = new Employee("Ivan ", "Ivanovich ", "Ivanov ", 1, 35000);
                employee[1] = new Employee("Petr ", "Petrovich ", "Petrov ", 2, 43000);
                employee[2] = new Employee("Andrey ", "Ivanovich ", "Petrov ", 3, 65000);
                employee[3] = new Employee("Denis ", "Andreevich ", "Sidorov ", 4, 15000);
                employee[4] = new Employee("Anton ", "Denisovich ", "Denisov ", 5, 105000);
                employee[5] = new Employee("Mihail ", "Antonovich ", "Antonov ", 1, 55000);
                employee[6] = new Employee("Ilya ", "Ivanovich ", "Marev ", 2, 75000);
                employee[7] = new Employee("Maxim ", "Anatolevich ", "Kozlov ", 3, 44000);
                employee[8] = new Employee("Dmitryi ", "Dmytryivich ", "Ivanov ", 4, 95000);
                employee[9] = new Employee("Oleg ", "Ivanovich ", "Triphanov ", 5, 65000);
                System.out.println("Сумма всех зарплат " + salary());
                System.out.println("Минимальная зарплата сотрудника " + minimalSalary());
                System.out.println("Максимальная зарплата сотрудника " + maximalSalary());
                System.out.println("Средняя зарплата в отделе " + averageSalary());
                System.out.println(Arrays.toString(employee));
                list();
        }
}







            









