public class Student {

    private String StudentName;
    private String course;

    public Student(String StudentName, String course) {
        this.StudentName = StudentName;
        this.course = course;
    }


    public Coffee getCoffee(String strength, String milk, String sugar){
        Coffee coffee = new Coffee(strength, milk, sugar);
        coffee.make();
        return coffee;
    }


    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        this.StudentName = studentName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
