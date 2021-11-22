package HospitalProject;

public interface LanguageDepartment extends School {

    public static final String NAME= "Lang Depaertment";
    public abstract Instructor instructor();//will return whole instructor

    public abstract Student student();

    public String labName();

    public boolean isLabAvailable();

}
