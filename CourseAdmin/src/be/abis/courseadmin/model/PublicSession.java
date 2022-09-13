package be.abis.courseadmin.model;

public class PublicSession extends Session{

    private static Company ABIS = new Company("Abis", 1);

    public PublicSession(Course course, Person instructor, String startDate, Company location) {
        super(course, instructor, startDate, location);
    }

    public static Company getABIS() {return ABIS;}

    public double calculatePrice(){
        return 600;
    }

    public String getOrganizer(){
        return (ABIS.getName());
    }

}
