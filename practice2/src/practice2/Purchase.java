package practice2;

public class Purchase implements Comparable<Purchase> {
	private WeekDay weekday;
    private int number;
    private double discount;
    public final static int PURCHASE_PRICE = 1232;
    public final static String PURCHASE_NAME = "Chair";

    public Purchase(int number, double discount, WeekDay weekday){
        this.number = number;
        this.discount = discount;
        this.weekday = weekday;
    }
    public Purchase(int number, double discount, int weekday) {
        this(number, discount, WeekDay.values()[weekday]);
    }
    public int getCost(){
        return (int) (PURCHASE_PRICE * number * ((100 - discount) / 100.00));
    }

    @Override
    public String toString() {
        return number + ";" + discount + "%;" + weekday + ";" + convertMoney(getCost())+" BYN";
    }

    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }
    public WeekDay getWeekday() {
        return weekday;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(Purchase purchase) {
        return number - purchase.number;
    }

    public static String convertMoney(int amount){
        return  Math.round((double)amount/100)+".00";
    }
}

