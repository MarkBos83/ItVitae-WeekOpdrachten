package Phoneshop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneShop {
    public static void main(String[] args) {
        PhoneService phoneService = new PhoneService();
        Scanner scanner = new Scanner(System.in);
        boolean serviceNeeded = true;
        phoneService.phonemaking();

        do {
            System.out.println("\n\n\n\n");
            System.out.println("Id:\tMerk: \tType: \t\t\tPrijs:");
            StringBuilder tabs = new StringBuilder("\t");
            for (int i = 0; i < phoneService.getPhonesSize(); i++) {
                if (phoneService.getPhone(i).type.length() < 12) {
                    tabs.append("\t");
                    if (phoneService.getPhone(i).type.length() < 8) {
                        tabs.append("\t");
                        if (phoneService.getPhone(i).type.length() < 4) {
                            tabs.append("\t");
                        }
                    }
                }
                System.out.println((i + 1) + "\t" + phoneService.getPhone(i).brand + "\t" + phoneService.getPhone(i).type + tabs + phoneService.getPhone(i).price + " (Excl BTW: "+ phoneService.getPhone(i).getPriceWithoutBTW()+")");
                tabs = new StringBuilder("\t");
            }
            System.out.println("6\tExit");
            System.out.print("Press a number of the phone you want to see the description of: ");
            int input = 0;

            try {
                input = scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.next();
            }
            System.out.println("\n\n\n\n\n\n");
            if (input > 0 && input < 6) {
                System.out.println("Merk: \tType: \t\t\tPrijs:");
                if (phoneService.getPhone(input-1).type.length() < 12) {
                    tabs.append("\t");
                    if (phoneService.getPhone(input-1).type.length() < 8) {
                        tabs.append("\t");
                        if (phoneService.getPhone(input-1).type.length() < 4) {
                            tabs.append("\t");
                        }
                    }
                }
                System.out.println(phoneService.getPhone(input-1).brand + "\t" + phoneService.getPhone(input-1).type + tabs + phoneService.getPhone(input-1).price + " (Excl BTW: "+ phoneService.getPhone(input-1).getPriceWithoutBTW()+")"+ "\n\n" + phoneService.getPhone(input-1).description);
            } else if(input == phoneService.getPhonesSize()+1){
                serviceNeeded = false;
            } else {
                System.out.println("Invalid input.\n");
            }
            if (serviceNeeded) {
                System.out.print("\nPress enter to return to main menu");
                scanner.nextLine();
                scanner.nextLine();
                System.out.println("\n\n\n");
            }
        } while (serviceNeeded);
    }
}
