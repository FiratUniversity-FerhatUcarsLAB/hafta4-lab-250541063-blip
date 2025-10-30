/*
 * Ad Soyad: [ADINIZ SOYADINIZ]
 * Ogrenci No: [NUMARANIZ]
 * Tarih: [TARIH]
 * Aciklama: Gorev 2: Daire yaricapini alip, daire ve kure hesaplamalari yapar.
 */

import java.util.Scanner;

public class GeometrikHesap {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Sabit Tanımlama: PI değeri final olarak tanımlanır [cite: 119, 126]
        final double PI = 3.14159; // [cite: 119]
        
        System.out.println("=== GEOMETRIK HESAPLAYICI ==="); // [cite: 110]
        
        // Yarıçapı alma [cite: 94]
        System.out.print("Dairenin yaricapini girin (cm): "); // [cite: 110]
        double yaricap = input.nextDouble();
        
        // Hesaplamalar için yarıçap değişkeni 'r' olarak kullanıldı
        double r = yaricap;
        
        // 1. Daire Alanı: PI * r^2 [cite: 96]
        double daireAlani = PI * r * r; 
        
        // 2. Daire Çevresi: 2 * PI * r [cite: 99]
        double daireCevresi = 2 * PI * r;
        
        // 3. Daire Çapı: 2 * r [cite: 101]
        double daireCapi = 2 * r; 
        
        // 4. Küre Hacmi: (4/3) * PI * r^3 [cite: 103]
        // Not: Tamsayı bölme hatasını önlemek için 4.0/3.0 kullanılır 
        double kureHacmi = (4.0 / 3.0) * PI * Math.pow(r, 3); // Math.pow(r, 3) veya r*r*r kullanılabilir [cite: 121, 122]
        
        // 5. Küre Yüzey Alanı: 4 * PI * r^2 [cite: 104]
        double kureYuzeyAlani = 4 * PI * r * r;
        
        input.close();
        
        // Sonuçları formatlı ve düzenli gösterme (Tüm sonuçlar 2 ondalık basamakla) [cite: 125]
        System.out.println("\nSONUCLAR:"); // [cite: 111]
        
        // printf ile çıktı düzenleme [cite: 34, 127]
        System.out.printf("%-20s: %.2f cm^2\n", "Daire Alani", daireAlani); // Örnek çıktıya göre hizalama yapıldı
        System.out.printf("%-20s: %.2f cm\n", "Daire Cevresi", daireCevresi);
        System.out.printf("%-20s: %.2f cm\n", "Daire Capi", daireCapi);
        System.out.printf("%-20s: %.2f cm^3\n", "Kure Hacmi", kureHacmi);
        System.out.printf("%-20s: %.2f cm^2\n", "Kure Yuzey Alani", kureYuzeyAlani);
    }
}
