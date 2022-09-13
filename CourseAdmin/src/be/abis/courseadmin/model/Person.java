package be.abis.courseadmin.model;

import be.abis.courseadmin.enums.Gender;
import be.abis.courseadmin.util.StringUtils;

public class Person implements Instructor, CourseParticipant{
    private String firstName;
    private String lastName;
    private Company company;
    public static int counter = 0;
    private int personNumber;
    private Gender gender;

    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        counter += 1;
        this.personNumber = counter;
        this.gender = gender;

    }

    public Person(String firstName, String lastName,Gender gender, Company company) {

        this(firstName, lastName, gender);
        this.company = company;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getPersonNumber() {
        return personNumber;
    }

    /*public void printInfo(){

        System.out.println(firstName + " " + lastName + (company!=null ? (" works for " + company.getName()): (" is not linked to a company for the moment.")));
        System.out.println("This is person number: " + personNumber);
    } */

    public String toString() {
        return("This is "+ firstName + " " + lastName + ". " +
                (company!=null ? (StringUtils.capitalize(gender.getPersonalPronoun()) + " work(s) for " + company) : (StringUtils.capitalize(gender.getPersonalPronoun())+" is(are) not linked to a company for the moment.")) +
                "\n" + StringUtils.capitalize(gender.getPossessivePronoun()) + " number in the list is: " + personNumber);
    }

    public void teachCourse(Course c){
        System.out.println(firstName + " is teaching the " + c.getTitle() + " course.");
    }

    public void attendCourse(Course c) {
        System.out.println(firstName + " is attending a " + c.getTitle() + " course.");
    }
}
