package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        if (first>second){
            System.out.println(first);
        }
        if (first<second){
            System.out.println(second);
        }else {
            System.out.println(first+ "\n"+ second);
        }
    }

    public static void main(String[] args) {
        GreatestNumberPrinter obj = new GreatestNumberPrinter();
        obj.printGreatest(2,8);
    }
}
