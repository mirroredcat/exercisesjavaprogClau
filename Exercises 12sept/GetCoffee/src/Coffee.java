public class Coffee {

    private String strength;
    private String milk;
    private String sugar;

    public Coffee(String strength, String milk, String sugar) {
        this.strength = strength;
        this.milk = milk;
        this.sugar = sugar;
    }

    public void make(){
        System.out.println("Coffee has been made. It is " + getStrength() + ", with " + milk + " milk and " + (sugar.equals("no")? sugar : (sugar + " cubes of")) + " sugar.");
    }


    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }
}
