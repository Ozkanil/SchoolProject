package HospitalProject;

public class Student implements ITDepartment, LanguageDepartment{

    private String name;
    private String lastName;
    private int id;
    private String departmentName;
    private Instructor instructor;
    private String labName;

    @Override
    public String departmentName() {

        return this.departmentName;
    }
    @Override
    public Instructor instructor() {

        return this.instructor;
    }
    @Override
    public Student student() {

        return this;
    }
    @Override
    public String labName() {

        return this.labName;
    }
    @Override
    public boolean isLabAvailable() {

        return false;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", lastName=" + lastName + ", id=" + id + ", department=" + departmentName
                + ", instructor=" + instructor + ", labName=" + labName + "]";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setDepartment(String department) {
        this.departmentName = department;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

}
