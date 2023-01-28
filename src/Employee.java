public class Employee {
    Employee[] employee = new Employee[10];
    private final  String name;
    private int department;
    private int id;
    private int salary;
    public static int count = 0;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        count += 1;
        this.id = count;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }


    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Имя " + this.name + "\n" + "Отдел " + this.department + "\n" + "Зарплата " + this.salary + "\n" + "id " + this.getId() + "\n" + "============" ;
    }
}
