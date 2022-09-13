package be.abis.courseadmin.test;

import be.abis.courseadmin.enums.Gender;
import be.abis.courseadmin.model.*;
import be.abis.courseadmin.repository.MemoryArrayCompanyRepository;

public class Test {
    public static void main(String[] args){
        Course c1 = new Course("Java", 45, 10.99);
        MemoryArrayCompanyRepository comps = new MemoryArrayCompanyRepository();

        Person p1 = new Person("Mary", "Jones", Gender.FEMALE, comps.findCompany(1) );
        Person p2 = new Person("John", "Doe", Gender.MALE);
        Person p3 = new Person("Jim", "Johnson", Gender.OTHER, comps.findCompany(3));
        Person p4 = new Person("Laura", "Simmons", Gender.FEMALE);
        Person[] people = {p1,p2,p3,p4 };

        //c1.printInfo();
        System.out.println("Total price: " + c1.calculateTotalPrice());
        System.out.println("Total price: " + c1.calculateTotalPrice(25));
        //company1.printInfo();

        System.out.println("Total number of people: " + Person.counter);
        for (Person p: people) {
            if(p!=null){System.out.println(p);}
        }

        people[2].attendCourse(c1);
        people[2].teachCourse(c1);

        System.out.println("-------Sessions--------");


        PublicSession session1 = new PublicSession(c1, people[0], "24/10/2022", comps.findCompany(3));
        CompanySession session2 = new CompanySession(c1, people[2], "05/01/2023", comps.findCompany(4), comps.findCompany(5));
        Consultancy service1 = new Consultancy();
        Service[] sessions = {session1, session2, service1};

        for (Service s: sessions) {
            if(s!=null){
                if (s instanceof Session){
                    ((Session) s).printInfo();}
                System.out.println("The price for the " + s.getClass().getSimpleName() + " is "+ s.calculatePrice());
            }
        }

        System.out.println("-------------");
        System.out.println(c1);

    }

}
