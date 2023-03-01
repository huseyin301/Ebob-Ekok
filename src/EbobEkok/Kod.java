package EbobEkok;

import java.util.Scanner;

public class Kod {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, i = 1, ebob = 1, ekok = 1, z = 1, y;
        boolean value = true;

        System.out.print("Lütfen X değerini giriniz : ");
        x = sc.nextInt();

        System.out.print("Lütfen Y değerini giriniz : ");
        y = sc.nextInt();

        while (i <= x && i <= y) {

            if (x % i == 0 && y % i == 0) {

                ebob = i;

            }

            i++;

        }

        while (value) {

            if (z % x == 0 && z % y == 0) {

                ekok = z;

                value = false;

            }

            z++;

        }

        System.out.print("EBOB : " + ebob + "\nEKOK : " + ekok);


    }
}
