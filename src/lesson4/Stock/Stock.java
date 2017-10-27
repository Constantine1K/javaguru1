package lesson4.Stock;

public class Stock {
    private String company;
    private double currentValue;
    private double max;
    private double min;

    public Stock(String company, double currentValue) {
        this.company = company;
        this.currentValue = currentValue;
        this.max = currentValue;
        this.min = currentValue;
    }
    public void updatePrice(double price){
        currentValue = price;
        if (currentValue > max){
            max = currentValue;
        } else if(currentValue < min){
            min = currentValue;
        }


   }

    public void getCurrentValue(){
        System.out.println("Current value = " + currentValue);
        System.out.println("Max value = " + max);
        System.out.println("Min value = " + min);
    }


    public String toString() {
        return "Company = " + company
                + "Max Value = " + max
                + "Min Value = " + min;
    }

    }

