public class Main {
    static Employee[] employees = new Employee[10];
    static int size = 0;  // это для заполнения массива с 0 ячейки

    public static void addEmployee(String name, int department, int salary) {
        Employee employee1 = new Employee(name, department, salary); //создание нового жкземпляра класса Employee
        employees[size++] = employee1; //чтобы индекс на 1 увеличивался
    }

    public static void minSalary() {
        double minSalary = employees[0].getSalary();
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
        double maxSalary = employees[0].getSalary();
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
        double summ = 0;
        for (int i = 0; i < employees.length; i++) {
            summ += employees[i].getSalary();
        }
        System.out.println("ЗАТРАТЫ " + summ);
        }

    public static void printAverageValue() {
        double averageVakue = 0;
        for (int i = 0; i < employees.length; i++) {
            averageVakue += employees[i].getSalary();
            averageVakue = averageVakue / employees[i].getId();
        }
        System.out.println("Среднее значение " + averageVakue);
    }

    public static void printAllName() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName());
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
        printAllEmployee();
        minSalary();
        maxSalary();
        printCashMonth();
        printAverageValue();
        printAllName();


    }
}