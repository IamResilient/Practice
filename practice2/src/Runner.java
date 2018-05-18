import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import practice2.Purchase;
import practice2.WeekDay;

public class Runner {
	public static void main(String[] args) {
        Purchase[] purchase;
        Scanner scanner = null;
        WeekDay day = null;

        try {
            scanner = new Scanner(new FileReader("src/scanner.txt"));
            scanner.useLocale(Locale.ENGLISH);
            final int PURCHASES_NUMBER = scanner.nextInt();
            purchase = new Purchase[PURCHASES_NUMBER];

            for(int i = 0; i < purchase.length; i++){
                purchase[i] = new Purchase (scanner.nextInt(), scanner.nextDouble(), scanner.nextInt());
            }
            printPurchase(purchase);

            int totalCost = 0;
            int totalCostMonday = 0;
            int maxCost = 0;
            double meanCost = 0.0;
            WeekDay maxCostDay = null;
            for (Purchase purchases : purchase){
                int cost = purchases.getCost();
                totalCost += cost;
                if (purchases.getWeekday()==WeekDay.MONDAY){
                    totalCostMonday += cost;
                }
                if (cost>maxCost){
                    maxCost = cost;
                    maxCostDay = purchases.getWeekday();
                }
            }

            if (purchase.length>0){
                meanCost = ((double) totalCost) / purchase.length;
            }

            System.out.println("Средняя стоимость = " + meanCost);
            System.out.println("Общая стоимость в понедельник = " + Purchase.convertMoney(totalCostMonday));
            System.out.println("День с максимальной покупкой стоимости " + maxCostDay);

            Arrays.sort(purchase);
            printPurchase(purchase);

            Purchase key = new Purchase(5,0.0,null);
            int indexSearch = Arrays.binarySearch(purchase, key);
            if (indexSearch>=0)
                printPurchase(purchase, indexSearch);
            else System.out.println("Необходимая покупка не найдена");

        } catch (FileNotFoundException e) {
            System.err.println("Входной файл не найден");
        } finally {
            if(scanner != null) {
                scanner.close();
            }
        }
    }

    private static void printPurchase(Purchase[] purchase){
        for (Purchase purchases : purchase){
            System.out.println(purchases.PURCHASE_NAME + ";" + purchases.PURCHASE_PRICE + ";" + purchases.toString());
        }
    }
    private static void printPurchase(Purchase[] purchase, int index){
        System.out.println("Требуемая покупка: " + purchase[index].PURCHASE_NAME + ";" + purchase[index].PURCHASE_PRICE + ";" + purchase[index].toString());
    }
}

