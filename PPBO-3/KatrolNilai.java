import java.util.Scanner;

public class Conditional1 {
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

          // Lengkapi di sini
        int x , y, z;
        double rata_rata, nilaiAkhir;
        
        x = scan.nextInt();
        y = scan.nextInt();
        z = scan.nextInt();

        rata_rata = (x + y + z) / 3;

        if (rata_rata < 40 && rata_rata >= 0){
            nilaiAkhir = rata_rata + (rata_rata*80/100);
            System.out.println("Nilai akhir: " + nilaiAkhir);
        }
        else if (rata_rata >= 40 && rata_rata <= 59){
            nilaiAkhir = (rata_rata + (rata_rata*30/100)) + 15;
            System.out.println("Nilai akhir: " + nilaiAkhir);
        }
        else if (rata_rata >= 60 && rata_rata <= 69){
            nilaiAkhir = rata_rata + (rata_rata*20/100) + 5;
            System.out.println("Nilai akhir: " + nilaiAkhir);
        }
        else if (rata_rata >= 70 && rata_rata <= 84){
            nilaiAkhir = rata_rata + (rata_rata*10/100);
            System.out.println("Nilai akhir: " + nilaiAkhir);
        }
        else if (rata_rata >= 85 && rata_rata <= 89){
            nilaiAkhir = rata_rata;
                System.out.println("Selamat!");
            System.out.println("Tingkatkan terus!");
            System.out.println("Nilai akhir: " + nilaiAkhir);
            
        }
        else if (rata_rata >= 90 && rata_rata <= 94){
            nilaiAkhir = rata_rata;
            System.out.println("Selamat!");
            System.out.println("Jangan pernah menyerah!");
            System.out.println("Nilai akhir: " + nilaiAkhir);
        }
        else if (rata_rata >= 95 && rata_rata <=100){
            nilaiAkhir = rata_rata;
            System.out.println("Selamat!");
            System.out.println("Kamu sangat hebat!");
            System.out.println("Nilai akhir: " + nilaiAkhir);
        }

        scan.close();
    }
}
