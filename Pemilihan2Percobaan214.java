import java.util.Scanner;

public class Pemilihan2Percobaan214 {

    public static void main(String[] args) {

        float sudut1, sudut2, sudut3;

        Scanner input14 = new Scanner(System.in);

        System.out.print("Masukkan sudut 1 : ");
        sudut1 = input14.nextFloat();
        System.out.print("Masukkan sudut 2 : ");
        sudut2 = input14.nextFloat();
        System.out.print("Masukkan sudut 3 : ");
        sudut3 = input14.nextFloat();

        float totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku!");
            } else {
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku!");
            }
        } else {
            System.out.println("Bukan segitiga!");
        }

        input14.close();
    }
}
