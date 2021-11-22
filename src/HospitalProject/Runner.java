package HospitalProject;

public class Runner {

    public static void main(String[] args) {

        Student std= new Student();
        std.setName("Omer");
        std.setLastName("San");
        std.setDepartment(ITDepartment.NAME);
        std.setId(101);

        Instructor ins=new Instructor();

        ins.setName("Suleyman");
        ins.setLastName("Alptekin");
        ins.setId(202);
        ins.setDepartmentName(ITDepartment.NAME);

        std.setInstructor(ins);

        ITDepartment it= std;


        School sch= it;

        System.out.println(sch.student().getName());
        System.out.println(it.instructor().departmentName());

    }
}
