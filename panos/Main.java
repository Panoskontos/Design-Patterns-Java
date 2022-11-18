package panos;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        DiamondPlan d = new DiamondPlan();
        GoldPlan g = new GoldPlan();

        d.getRate();
        d.calculateBill(23);

        g.getRate();
        g.calculateBill(23);


    }
}