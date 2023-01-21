public class Employee {
  private String name;
  private int department;
  private int id;
  private double salary;
    static int count = 0;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        count += 1;
        this.id = count;
    }

    public String getName() {
        return this.name;
    }

    public int getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Имя: " + name + "\n" + "Отдел: " + department + "\n" + "ЗП: " + salary + "\n" + "////////////////";
    }

}
