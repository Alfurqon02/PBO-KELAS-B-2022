import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 2, 3, 4, 5 },     
                { 6, 7, 8, 9, 0 },     
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 },
                { 26, 27, 28, 29, 30 } 
        };

        Scanner scan = new Scanner(System.in);
        int c1 = scan.nextInt();
        int c2 = scan.nextInt();

        int arr1[] = arr[c1];
        int arr2[] = arr[c2];

        int n = 0;
        int m = arr2.length - 1;
        
          //Lengkapi code  mulai dari sini. Wajib menggunakan for 
        while(n < arr1.length && m >= 0){
            System.out.print("--" + arr1[n++] + "|" + arr2[m--]);
        }
            System.out.println("--"); 
        scan.close();
    }
}
