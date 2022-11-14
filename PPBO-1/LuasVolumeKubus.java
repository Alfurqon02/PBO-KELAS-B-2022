import java.util.Scanner;

public class LuasVolumeKubus {
    int sisiKubus;

    // Dokumentasi constructor Java w3schools.com/java/java_constructors.asp
    public LuasVolumeKubus(int sisiKubus) {
        this.sisiKubus = sisiKubus;
    }

    public int hitungVolume() {
        return sisiKubus * sisiKubus * sisiKubus;
        // Silakan lengkapi method ini untuk menghitung volume
    }

    public int hitungLuasPermukaan() {
        return (sisiKubus * sisiKubus) * 6;
        // Silakan lengkapi method ini untuk menghitung luas permukaan
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int input = myScanner.nextInt();/* Silakan lengkapi potongan ini */;
        /* Silakan lengkapi potongan ini */ 
        
        if (input < 1) {
            System.out.println("INVALID");
        }
        else {
        LuasVolumeKubus lvkubus = new LuasVolumeKubus(input);
        System.out.println("Volume " + lvkubus.hitungVolume());
        System.out.println("Luas Permukaan " + lvkubus.hitungLuasPermukaan());
        }
        // Silakan lengkapi bagian ini untuk mencetak hasil

        myScanner.close();
    }
}
