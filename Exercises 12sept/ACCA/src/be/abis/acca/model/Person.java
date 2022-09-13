package be.abis.acca.model;

public class Person {

    private int counter = 0;
    private int personNr;
    private String firstName;
    private String lastName;
    private int age;
    private Company company;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.counter +=1;
        this.personNr = counter;
    }

    public Person(String firstName, String lastName, int age, Company company){
        this(firstName, lastName, age);
        this.counter +=1;
        this.personNr = counter;
        this.company = company;
    }

    public String toString(){
        return ("Person " + personNr + ": " + firstName + " " + lastName + " (" + age + " years old)" +
                (company!=null? (" works for " + company.getName() + " in " + company.getAddress().getTown() + "."):" is not employed for the moment."));
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
