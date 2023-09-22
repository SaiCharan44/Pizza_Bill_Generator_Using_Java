import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String pizzatype;
        String pizzas;
        Boolean v;
        Scanner s= new Scanner(System.in);
        System.out.println("Select Pizza Type : Base Or Delux" );
        pizzatype=s.nextLine();
        System.out.println("Veg pizza enter Veg else NonVeg");
        pizzas=s.nextLine();
        if(pizzas.equals("Veg")){
            v=true;
        }
        else{
            v=false;
        }

        if(pizzatype.equals("Base")) {
            int takaway,cheese,toppings;
            Pizza P= new Pizza(v);
            System.out.println("Needed Extra Cheese enter 1 else 0 ");
            cheese=s.nextInt();
            if(cheese==1) {
                P.addExtraCheese();
            }
            System.out.println("Needed Extra Toppings enter 1 else 0 ");
            toppings=s.nextInt();
            if (toppings==1) {
                P.addExtraToppings();
            }
            System.out.println("Take Away enter 1 else 0 ");
            takaway=s.nextInt();
            if (takaway==1) {
                P.takeAway();
            }
            P.getBill();
        }
        else {
            int takaway;
            DeluxPizza dp = new DeluxPizza(v);
            System.out.println("Take Away enter 1 else 0 ");
            takaway=s.nextInt();
            if (takaway==1) {
                dp.takeAway();
            }
            dp.getBill();
        }
    }
}