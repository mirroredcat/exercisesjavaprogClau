public class Test {

    public static void main(String[] args) {
        Instructor i1 = new Instructor("Mr. McHill", "Java");
        Instructor i2 = new Instructor("Mrs. May", "UML");

        Student s1 = new Student("Jimmy", "Java");
        Student s2 = new Student("Essie", "UML, Java");
        Student s3 = new Student("Sarah", "Java");


        i1.drinkCoffee(i1.askCoffee(s2, "strong", "a little", "2"));

    }
}
