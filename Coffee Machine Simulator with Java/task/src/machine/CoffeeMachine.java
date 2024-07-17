package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private int water;
    private int milk;
    private int coffeeBeans;
    private int cups;
    private int money;

    public CoffeeMachine() {
        this.water = 400;
        this.milk = 540;
        this.coffeeBeans = 120;
        this.cups = 9;
        this.money = 550;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        for(;;) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String input = scanner.nextLine();
            if ("exit".equals(input)) {
                break;
            }
            coffeeMachine.processInput(input);
        }
    }

    public void processInput(String input) {
        Scanner scanner = new Scanner(System.in);
        if ("exit".equals(input)) {
        } else if ("buy".equals(input)) {
            System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
            String coffeeinput = scanner.next();
            int requiredWater = 0;
            int requiredMilk = 0;
            int requiredBeans = 0;
            int cost = 0;

            if (coffeeinput.equals("1")) {
                requiredWater = 250;
                requiredBeans = 16;
                cost = 4;
            } else if (coffeeinput.equals("2")) {
                requiredWater = 350;
                requiredMilk = 75;
                requiredBeans = 20;
                cost = 7;
            } else if (coffeeinput.equals("3")) {
                requiredWater = 200;
                requiredMilk = 100;
                requiredBeans = 12;
                cost = 6;
            } else if (coffeeinput.equals("back")){
                return;
            }
            if (water < requiredWater) {
                System.out.println("Sorry, not enough water!");
            } else if (milk < requiredMilk) {
                System.out.println("Sorry, not enough milk!");
            } else if (coffeeBeans < requiredBeans) {
                System.out.println("Sorry, not enough coffee beans!");
            } else if (cups < 1) {
                System.out.println("Sorry, not enough disposable cups!");
            } else {
                water -= requiredWater;
                milk -= requiredMilk;
                coffeeBeans -= requiredBeans;
                cups -= 1;
                money += cost;
                System.out.println("I have enough resources, making you a coffee!");
            }
        } else if (input.equals("fill")) {
            System.out.println("Write how many ml of water you want to add:");
            int waterToAdd = scanner.nextInt();
            water += waterToAdd;
            System.out.println("Write how many ml of milk you want to add:");
            int milkToAdd = scanner.nextInt();
            milk += milkToAdd;
            System.out.println("Write how many grams of coffee beans you want to add:");
            int coffeeBeansToAdd = scanner.nextInt();
            coffeeBeans += coffeeBeansToAdd;
            System.out.println("Write how many disposable cups you want to add:");
            int cupsToAdd = scanner.nextInt();
            cups += cupsToAdd;
        } else if (input.equals("take")) {
            System.out.println("I gave you $" + money);
            money = 0;
        } else if (input.equals("remaining")) {
            System.out.println("The coffee machine has:\n" +
                    water + " ml of water\n" +
                    milk + " ml of milk\n" +
                    coffeeBeans + " g of coffee beans\n" +
                    cups + " disposable cups\n" +
                    "$" + money + " of money");
        }
    }
}