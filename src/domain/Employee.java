package domain;

public class Employee extends Person {
    private final String ein;
    private String department;
    private String position;
    private String salary;
    private String status;
    private String rfc;

    // Constructor
    public Employee(String name, String address, String phone, String email, String ein, String department, String position, String salary, String status, String birthDate, String curp, String rfc) {
        super(name, address, phone, email, birthDate, curp);
        this.ein = ein;
        this.department = department;
        this.position = position;
        this.salary = salary;
        this.status = status;
        this.rfc = rfc;
    }

    // Getters and setters
    public String getEin() {
        return ein;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    // toString()
    @Override
    public String toString() {
        return "Employee{" + "ein=" + ein + ", department=" + department + ", position=" + position + ", salary=" + salary + ", status=" + status + '}';
    }
}
