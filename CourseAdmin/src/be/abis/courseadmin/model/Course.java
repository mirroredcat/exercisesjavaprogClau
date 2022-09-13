package be.abis.courseadmin.model;

public class Course {

        private String title;
        private int nrOfDays;
        private double pricePerDay;

        public Course(String title, int nrOfDays, double pricePerDay){
            this.setTitle(title);
            this.setNrOfDays(nrOfDays);
            this.setPricePerDay(pricePerDay);
        }

        public void setTitle(String title){
            this.title = title;
        }
        public void setNrOfDays(int nrOfDays){
            this.nrOfDays = nrOfDays;
        }
        public void setPricePerDay(double pricePerDay){
            this.pricePerDay = pricePerDay;
        }


        public String getTitle(){
            return title;
        }
        public int getNrOfDays(){
            return nrOfDays;
        }

        public double getPricePerDay() {
            return pricePerDay;
        }


        /*public void printInfo(){
            System.out.println("Course title: " + title);
            System.out.println("Number of days: " + nrOfDays);
            System.out.println("Price per day: " + pricePerDay);
        }*/

        public String toString(){
            return ("Course title: " + title + "\n Number of days: " + nrOfDays +
                    "\n Price per day: " + pricePerDay);
        }

        public double calculateTotalPrice(){
            return (pricePerDay * nrOfDays);
        }

        public double calculateTotalPrice(int reductionPercentage){
            return (calculateTotalPrice() - (reductionPercentage/100.0*calculateTotalPrice()));
        }

    }

