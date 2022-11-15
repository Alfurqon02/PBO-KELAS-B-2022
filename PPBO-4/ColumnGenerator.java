import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner myScanner = new Scanner(System.in);
        
        int n = myScanner.nextInt();
        int m = myScanner.nextInt();

            for (int i = 1;  i <= 100; i++){
                int x = i*n;
                if (x > 100){
                    break;
            }  
                System.out.print(x + " ");
            if (i%m == 0){
                System.out.print("\n");
            }      
            
        }

        myScanner.close();
    }
}
