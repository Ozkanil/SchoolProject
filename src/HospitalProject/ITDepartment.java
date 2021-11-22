package HospitalProject;

public interface ITDepartment extends School {
    public static final String NAME= "IT Depaertment";
    public abstract Instructor instructor();//will return whole instructor

    public abstract Student student();

    public String labName();

    public boolean isLabAvailable();
}
