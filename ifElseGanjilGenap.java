import java.util.Scanner;

public class ifElseGanjilGenap {
    public static void main(String[] args) {
        int angka;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka: ");
        angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }

        sc.close();
    }
}