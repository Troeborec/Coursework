import java.util.Scanner;

public class Main {
    static Employee[] employees = new Employee[10];
    int count = 0;
    int minDepSalary = 1_000_000;
    int maxDepSalary = 0;
    private Employee employeeWithMinSalary;
    static int size = 0;  // это для заполнения массива с 0 ячейки

    public static void addEmployee(String name, int department, int salary) {
        Employee employee = new Employee(name, department, salary); //создание нового жкземпляра класса Employee
        employees[size++] = employee; //чтобы индекс на 1 увеличивался
    }

    public static void printLine() {
        System.out.println("/////////////////////");
    }

    public static void minSalary() {
        int minSalary = employees[0].getSalary();
        String name = null;
        for (int i = 0; i < employees.length; i++) {
            if (minSalary >= employees[i].getSalary()) {
                minSalary = employees[i].getSalary();
                name = employees[i].getName();
            }
        }
        System.out.println("Минимальная Зарплата = " + minSalary + " Имя: " + name);
    }

    public static void maxSalary() {
        int maxSalary = employees[0].getSalary();
        String name1 = null;
        for (int i = 0; i < employees.length; i++) {
            if (maxSalary < employees[i].getSalary()) {
                maxSalary = employees[i].getSalary();
                name1 = employees[i].getName();
            }
        }
        System.out.println("Максимальная зарплата = " + maxSalary + " имя: " + name1);
    }

    /////////Вывести всех сотрудников
    public static void printAllEmployee() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }

    //    Cумма затррат на зарплаты
    public static void printCashMonth() {
        int summ = 0;
        for (int i = 0; i < employees.length; i++) {
            summ += employees[i].getSalary();
        }
        System.out.println("ЗАТРАТЫ " + summ);
    }

    public static void printAverageValue() {
        int averageSalary = 0;
        for (int i = 0; i < employees.length; i++) {
            averageSalary += employees[i].getSalary();
            averageSalary = averageSalary / size;
        }
        System.out.println("Среднее значение " + averageSalary);
    }

    public static void printAllName() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
        }
    }

    ///Минимальная зп
    public static void printMinSalaryInDep(int department) {
        int minDepSalary = 1_000_000;
        int arr = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee.getDepartment() == department) {
                if (minDepSalary > employee.getSalary()) {
                    minDepSalary = employee.getSalary();
                    //    arr = employee.getName();
                }
            }
        }
    }
    public static void main(String[] args) {
        addEmployee("Иван Иванов Иванович", 1, 10_000);
        addEmployee("Борис Борисов Борисович", 1, 20_000);
        addEmployee("Василий Ваасилей Васильевич", 2, 30_000);
        addEmployee("Генадий Генайдов Генадьевич", 2, 40_000);
        addEmployee("Денис Денисов Денисович", 3, 50_000);
        addEmployee("Елена Еленова Еленовна", 3, 60_000);
        addEmployee("Ёжик Ёжиков Ёжикович", 4, 70_000);
        addEmployee("Жора Жоров Жорович", 4, 80_000);
        addEmployee("Зеня Зенов Зенович", 5, 90_000);
        addEmployee("Ибрагим Ибрагимов Ибрагимович", 5, 100_000);

        //Базовая часть
        printLine();
        System.out.println("Базовая часть");
        printAllEmployee();
        minSalary();
        maxSalary();
        printCashMonth();
        printAverageValue();
        printAllName();
        printLine();
        //Повышенная сложность
        System.out.println("ПОВЫШЕННАЯ СЛОЖНОСТЬ");
        //employees.find
    }
}