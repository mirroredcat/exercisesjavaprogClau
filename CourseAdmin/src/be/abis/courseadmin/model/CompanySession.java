package be.abis.courseadmin.model;

public class CompanySession extends Session{

    private int numberOfParticipants = 0;
    private Company organizer;

    public CompanySession(Course course, Person instructor, String startDate, Company location, Company organizer) {
        super(course, instructor, startDate, location);
        this.organizer = organizer;
    }

    public CompanySession(Course course, Person instructor, String startDate, Company location, int numberOfParticipants, Company organizer) {
        super(course, instructor, startDate, location);
        this.organizer = organizer;
        this.numberOfParticipants = numberOfParticipants;
    }

    public void setNumberOfParticipants(int numberOfParticipants) {
        this.numberOfParticipants = numberOfParticipants;
    }

    public String getOrganizer(){
        return organizer.getName();
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("This session is offered to you by " + this.organizer.getName() + "." + (numberOfParticipants!=0? ("There will be " + numberOfParticipants + " participants."): "" ));
    }

    public int getNumberOfParticipants() {
        return numberOfParticipants;
    }
}
