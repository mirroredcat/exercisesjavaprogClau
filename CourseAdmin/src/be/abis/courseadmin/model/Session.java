package be.abis.courseadmin.model;

public abstract class Session extends Service{

    private Course course;
    private Person instructor;
    private String startDate;
    private Company location;

    public Session(Course course, Person instructor, String startDate, Company location) {
        this.course = course;
        this.instructor = instructor;
        this.startDate = startDate;
        this.location = location;
    }

    public void printInfo(){
        System.out.println("The " + course.getTitle() + " course will start on " + startDate + ". It will take place at " + location.getName() + ". Your instructor is "+instructor.getFirstName() + " " + instructor.getLastName() + " of "+ instructor.getCompany().getName());
    }

    public double calculatePrice(){
        return 233;
    };

    public abstract String getOrganizer();

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Person getInstructor() {
        return instructor;
    }

    public void setInstructor(Person instructor) {
        this.instructor = instructor;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Company getLocation() {
        return location;
    }

    public void setLocation(Company location) {
        this.location = location;
    }
}
