package HospitalProject;

public interface School {
    public static final String SCHOOL_NAME= "Techproed";


    public abstract String departmentName();

    public abstract Instructor instructor();//will return whole instructor

    public abstract Student student();
}
