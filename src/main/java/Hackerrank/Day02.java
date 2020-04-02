package Hackerrank;

public class Day02 {
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double totalCost = meal_cost + (meal_cost * tip_percent)/100
                + (meal_cost*tax_percent)/100;

        System.out.println(totalCost);
        System.out.println("round: " + Math.round(totalCost));
    }
    public static void main(String[] args) {
        double meal_cost = 15.50;
        int tip_percent = 15;
        int tax_percent = 10;

        solve(meal_cost, tip_percent, tax_percent);
    }
}
