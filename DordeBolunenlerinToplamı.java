package Donguler;

import java.util.Scanner;

public class DordeBolunenlerinToplam─▒ {
    public static void main(String[] args) {
        int x;
        Scanner inp = new Scanner(System.in);
        int total = 0;
        do {
            System.out.print("Say─▒ giriniz: ");
            x = inp.nextInt();
            if (x % 4 == 0) {
                total += x;
            }
        } while (x % 2 == 0);
        System.out.println("Toplam : " + total);
    }
}
