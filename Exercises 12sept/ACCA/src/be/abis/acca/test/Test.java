package be.abis.acca.test;

import be.abis.acca.model.Address;
import be.abis.acca.model.Company;
import be.abis.acca.model.Course;
import be.abis.acca.model.Person;

public class Test {
    public static void main(String[] args) {

        Address a1 = new Address("Colegelaan", "34", "2140", "Leuven", "Belgium", "032");
        Address a2 = new Address("Diestsevest", "32", "3000", "Leuven", "Belgium", "032");

        Company c1 = new Company("ERT", a1);
        Company c2 = new Company("ABIS", a2);

        Course co1 = new Course("Java", 21, 50.55, true);
        Course co2 = new Course("CSS", 2, 30.5, false);

        Person p1 = new Person("John", "Smith", 31);
        Person p2 = new Person("Helen", "Fenrizdottir", 35, c2);

        Person[] people = {p1, p2};


        for (Person p : people){
            System.out.println(p);
        }

        System.out.println(co1);
        System.out.println(co2);

    }
}
