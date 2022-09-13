package be.abis.acca.model;

public class Course {
    private String title;
    private int nrOfDays;
    private double pricePerDay;
    private boolean prerequisites;

    public Course(String title, int nrOfDays, double pricePerDay, boolean prerequisites) {
        this.title = title;
        this.nrOfDays = nrOfDays;
        this.pricePerDay = pricePerDay;
        this.prerequisites = prerequisites;
    }


    public double calculateTotalPrice(){
        double tax = 0.21;
        double totalPrice = nrOfDays * pricePerDay;
        if (nrOfDays < 3 && prerequisites==false){
            return (totalPrice + (tax * totalPrice));
        } else {
            return totalPrice;
        }
    }

    public String labelPrice(){
        double totalPrice = calculateTotalPrice();
        if (totalPrice < 500){
            return "CHEAP";
        } else if (totalPrice < 1500) {
            return "OK";
        } else {
            return "EXPENSIVE";
        }
    }

    public String toString(){
        return ("The " + title + " course takes " + nrOfDays + " days. Prior knowledge is" +
                (prerequisites? "": " not") + " required." +
                " The total price is " + calculateTotalPrice() + ". This is " + labelPrice().toLowerCase() + ".");
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNrOfDays() {
        return nrOfDays;
    }

    public void setNrOfDays(int nrOfDays) {
        this.nrOfDays = nrOfDays;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public boolean isPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(boolean prerequisites) {
        this.prerequisites = prerequisites;
    }
}
