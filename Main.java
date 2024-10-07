/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package franstindahan;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean main = true;
        while (main== true){
     System.out.println("welcome to Francis store");
     Scanner input = new Scanner (System.in);
     System.out.println("wanna buy in my shop?");
     String condition = input.next();
     main = false ;
     boolean CHECK = false;
     double total = 0;
     double subtotal = 0;

     while (condition.equalsIgnoreCase("yes")) {


                System.out.println("welcome to store \n candy: PHP3 ....1 \n water: php10 ....2 \n ice: php2 ....3 "
                        + "\n bulad php200....4 \n ginamos php100....5");
                int code = input.nextInt();
                double price = 0;
                String productname = "";

                switch (code) {
                    case 1:
                        price = 3;
                        productname = "candy";
                        CHECK = true;
                        break;
                    case 2:
                        price = 10;
                        productname = "water";
                        CHECK = true;
                        break;
                    case 3:
                        price = 2;
                        productname = "ice";
                        CHECK = true;
                        break;
                    case 4:
                        price = 200;
                        productname = "bulad";
                        CHECK = true;
                        break;
                    case 5:
                        price = 100;
                        productname = "ginamos";
                        CHECK = true;
                        break;

                }
                if (CHECK == true) {
                    System.out.println("you choose"  +  productname  +  "for php"  +  price  +  "\n ENTER QNTYTY");
                    double QNTYTY = input.nextDouble();
                    subtotal = price * QNTYTY;
                    total += subtotal;
                    System.out.println("subtotal:" +   total);
                    System.out.println("do you want to other other item?  yes or n");
                    condition = input.next();

                }
                double discount = 0.10;
                double totalDis = 0;
                double TOTAL = 0;

                if (total > 1000) {
                    totalDis = total * discount;
                    TOTAL = total - totalDis;
                    System.out.println("discount is applied amounting to 10%");
                } else {
                    TOTAL = total;
                }

                if (condition.equalsIgnoreCase("n")) {
                    System.out.println(" subtotal "  +  subtotal);
                    System.out.println(" TOTAL: PHP " +  TOTAL);


                    double payment = 0;

                    do {
                        System.out.println(" enter money amount: ");
                        payment = input.nextInt();
                        double kulang = TOTAL - payment;
                        if (payment < TOTAL) {
                            System.out.println(" kulang kwarta nimo pauli oy, kulang kag php: " + kulang);

                        } else {
                            double change = payment - TOTAL;
                            System.out.println(" ok na dol sakto na imong kambyo kay  php: "  +  change  + "thanks");

                        }

                    } while (payment < TOTAL);
                    main = true;
                    System.out.println("...............................");
                }

            }
        }
    }
}
