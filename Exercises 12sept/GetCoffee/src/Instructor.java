public class Instructor {

    private String name;
    private String course;


    public Instructor(String name, String course) {
        this.name = name;
        this.course = course;
    }


    public Coffee askCoffee(Student student, String strength, String milk, String sugar){
        System.out.println(student.getStudentName() + ", would you please ring me some coffee?");
        System.out.println("I like it " + strength + " with " + milk + " milk and " + sugar + " sugar(s)");
        Coffee coffee = student.getCoffee(strength, milk, sugar);
        return coffee;
    }

    public void drinkCoffee(Coffee coffee){
        System.out.println("I am caffeinated. The lesson can start!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
