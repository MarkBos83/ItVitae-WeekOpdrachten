package Phoneshop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] Huawei = new String[] {"1", "Huawei", "P30", "697", "6.47' FHD+ (2340x1080) OLED, Kirin 980 Octa-Core (2x Cortex-A76 2.6GHz+ 2x Cortex-A76 1.92GHz + 4x Cortex-A55 1.8GHz), 8GB RAM, 128GB ROM,40+20+8+TOF/32MP, Dual SIM, 4200mAh, Android 9.0 + EMUI 9.1"};
        String[] Samsung = new String[] {"2", "Samsung", "GalaxyA52", "399", "64 megapixel camera, 4k videokwaliteit 6.5 inch AMOLED scherm 128 GBopslaggeheugen (Uitbreidbaar met Micro-sd) Water- en stofbestendig(IP67)"};
        String[] Apple = new String[] {"3", "Apple", "IPhone11", "619", "Met de dubbele camera schiet je in elke situatie een perfecte foto of videoDe krachtige A13-chipset zorgt voor razendsnelle prestaties Met Face IDhoef je enkel en alleen naar je toestel te kijken om te ontgrendelen Hettoestel heeft een lange accuduur dankzij een energiezuinige processor"};
        String[] Google = new String[] {"4", "Google", "Pixel4a", "411", "12.2 megapixel camera, 4k videokwaliteit 5.81 inch OLED scherm 128 GBopslaggeheugen 3140 mAh accucapaciteit"};
        String[] Xiaomi = new String[] {"5", "Xiaomi", "RedmiNote10 Pro", "298", "108 megapixel camera, 4k videokwaliteit 6.67 inch AMOLED scherm 128GB opslaggeheugen (Uitbreidbaar met Micro-sd) Water- en stofbestendig(IP53)"};
            do {
                System.out.println("\n\n\n\n");
                System.out.println("\tMerk: \tType: \t\t\tPrijs:");
                System.out.println(Huawei[0] + "\t" + Huawei[1] + "\t" + Huawei[2] + "\t\t\t\t" + Huawei[3]);
                System.out.println(Samsung[0] + "\t" + Samsung[1] + "\t" + Samsung[2] + "\t\t" + Samsung[3]);
                System.out.println(Apple[0] + "\t" + Apple[1] + "\t" + Apple[2] + "\t\t" + Apple[3]);
                System.out.println(Google[0] + "\t" + Google[1] + "\t" + Google[2] + "\t\t\t" + Google[3]);
                System.out.println(Xiaomi[0] + "\t" + Xiaomi[1] + "\t" + Xiaomi[2] + "\t" + Xiaomi[3]);
                System.out.println("6\tExit");
                System.out.print("Press a number of the phone you want to see the description of: " );
                int input = 0;

                try {
                    input = scanner.nextInt();
                } catch(InputMismatchException e) {
                    scanner.next();
                }
                System.out.println("\n\n\n\n\n\n");
                if(input >0 && input < 6) {
                    System.out.println("\tMerk: \tType: \t\t\tPrijs:");
                }
                if (input == 1) {
                    System.out.println(Huawei[0] + "\t" + Huawei[1] + "\t" + Huawei[2] + "\t\t\t\t" + Huawei[3] + "\n\n" + Huawei[4] + "\n");
                } else if (input == 2) {
                    System.out.println(Samsung[0] + "\t" + Samsung[1] + "\t" + Samsung[2] + "\t\t" + Samsung[3] + "\n\n" + Huawei[4] + "\n");
                } else if (input == 3) {
                    System.out.println(Apple[0] + "\t" + Apple[1] + "\t" + Apple[2] + "\t\t" + Apple[3] + "\n\n" + Huawei[4] + "\n");
                } else if (input == 4) {
                    System.out.println(Google[0] + "\t" + Google[1] + "\t" + Google[2] + "\t\t\t" + Google[3] + "\n\n" + Huawei[4] + "\n");
                } else if (input == 5) {
                    System.out.println(Xiaomi[0] + "\t" + Xiaomi[1] + "\t" + Xiaomi[2] + "\t" + Xiaomi[3] + "\n\n" + Huawei[4] + "\n");
                } else if (input == 6) {
                    break;
                }
                if (input >5 || input <1){
                    System.out.println("Invalid input.\n");
                }

                System.out.println("Press any key to return to main menu");
                scanner.next();
                System.out.println("\n\n\n");

            }while (true);
    }
}