import java.util.Scanner;

public class DeltoidAlanHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Deltoid (Eşkenar Dörtgen) Alan Hesaplama ===");
        
        // Kullanıcıdan köşegen uzunluklarını alıyoruz
        System.out.print("Birinci köşegen uzunluğunu girin (d1): ");
        double d1 = input.nextDouble();

        System.out.print("İkinci köşegen uzunluğunu girin (d2): ");
        double d2 = input.nextDouble();

        // Alan formülü: (d1 * d2) / 2
        double alan = (d1 * d2) / 2;

        System.out.println("Deltoidin Alanı: " + alan);

        input.close();
    }
}

