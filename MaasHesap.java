/*
 * Ad Soyad: [ADINIZ SOYADINIZ]
 * Ogrenci No: [NUMARANIZ]
 * Tarih: [TARIH]
 * Aciklama: Gorev 3: Calisan bilgilerini alip detayli maas bordrosu olusturur.
 */

import java.util.Scanner;

public class MaasHesap {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Sabit Tanımlamalar (Oranları ondalık olarak tanımlayın) [cite: 151, 152]
        final double SGK_ORANI = 0.14; // 
        final double GELIR_VERGISI_ORANI = 0.15; // 
        final double DAMGA_VERGISI_ORANI = 0.00759; // 
        final int STANDART_AYLIK_SAAT = 160;
        final int STANDART_CALISMA_GUNU = 22;
        final int STANDART_AYLIK_CALISMA_SAATI = 176; // 22 gün * 8 saat [cite: 147]
        
        System.out.println("=== MAAS HESAPLAMA SISTEMI ===");
        
        // 1. Bilgileri Kullanıcıdan Alma [cite: 136]
        
        // nextInt() / nextDouble() sonrası nextLine() bug'ına dikkat 
        // Bu yüzden String okuma için nextLine() yerine next() kullanılabilir veya fazladan input.nextLine() eklenebilir.
        System.out.print("Calisan adi soyadi girin: "); 
        // nextLine() yerine next() kullanıldı, tam ad soyad okumak için nextLine() tercih edilmelidir.
        // Eğer nextLine() kullanılacaksa, int/double okumadan sonra bir tane daha input.nextLine() eklenmelidir.
        String adSoyad = input.next() + " " + input.next(); 

        System.out.print("Aylik brut maasi (TL): "); 
        double brutMaas = input.nextDouble(); // [cite: 138]

        System.out.print("Haftalik calisma saati: "); 
        int haftalikSaat = input.nextInt(); // [cite: 139] (Görevde istenmesine rağmen hesaplamada kullanılmıyor, brüt maaş ve mesai saati kullanılıyor)

        System.out.print("Mesai saati sayisi: "); 
        int mesaiSaat = input.nextInt(); // [cite: 140]

        // input.nextLine(); // nextDouble/nextInt sonrası nextLine() bug'ı için önlem
        input.close();

        // 2. Gelirler Hesaplaması [cite: 145]
        double mesaiUcreti = (brutMaas / STANDART_AYLIK_SAAT) * mesaiSaat * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        // 3. Kesintiler Hesaplaması [cite: 145]
        double sgkKesintisi = toplamGelir * SGK_ORANI;
        double gelirVergisiKesintisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisiKesintisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgkKesintisi + gelirVergisiKesintisi + damgaVergisiKesintisi;

        // 4. Net Maaş Hesaplaması [cite: 145]
        double netMaas = toplamGelir - toplamKesinti;
        
        // 5. İstatistikler Hesaplaması [cite: 147]
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / STANDART_AYLIK_CALISMA_SAATI;
        double gunlukNetKazanc = netMaas / STANDART_CALISMA_GUNU;
        
        // 6. Çıktı (Tüm para değerleri 2 ondalıkla, yüzde değerleri 1 ondalıkla) 
        System.out.println("\n===================================="); // [cite: 149]
        System.out.println("MAAS BORDROSU"); // [cite: 149]
        System.out.println("===================================="); // [cite: 149]
        
        System.out.println("Calisan: " + adSoyad); // [cite: 149]
        
        System.out.println("\nGELIRLER:"); // [cite: 149]
        System.out.printf("%-25s: %.2f TL\n", "Brut Maas", brutMaas); // [cite: 149]
        System.out.printf("%-25s: %.2f TL\n", "Mesai Ucreti (" + mesaiSaat + " saat)", mesaiUcreti); // [cite: 149]
        System.out.println("------------------------"); // [cite: 149]
        System.out.printf("%-25s: %.2f TL\n", "TOPLAM GELIR", toplamGelir); // [cite: 149]
        
        System.out.println("\nKESINTILER:"); // [cite: 149]
        // Yüzde değerleri 1 ondalıkla gösterilir 
        System.out.printf("%-25s: %.2f TL\n", "SGK Kesintisi (" + String.format("%.1f", SGK_ORANI * 100) + "%)", sgkKesintisi); // [cite: 149]
        System.out.printf("%-25s: %.2f TL\n", "Gelir Vergisi (" + String.format("%.1f", GELIR_VERGISI_ORANI * 100) + "%)", gelirVergisiKesintisi); // [cite: 149]
        System.out.printf("%-25s: %.2f TL\n", "Damga Vergisi (" + String.format("%.1f", DAMGA_VERGISI_ORANI * 100) + "%)", damgaVergisiKesintisi); // Damga vergisi %0.759 => %0.8 yuvarlanır [cite: 149]
        System.out.println("------------------------"); // [cite: 149]
        System.out.printf("%-25s: %.2f TL\n", "TOPLAM KESINTI", toplamKesinti); // [cite: 149]
        
        System.out.println("\n===================================="); // [cite: 149]
        System.out.printf("%-25s: %.2f TL\n", "NET MAAS", netMaas); // [cite: 149]
        System.out.println("===================================="); // [cite: 149]
        
        System.out.println("\nISTATISTIKLER:"); // İstenen istatistikler eklendi [cite: 147]
        System.out.printf("%-25s: %.1f%%\n", "Kesinti Orani", kesintiOrani); // Yüzde 1 ondalık 
        System.out.printf("%-25s: %.2f TL\n", "Saatlik Net Kazanc", saatlikNetKazanc);
        System.out.printf("%-25s: %.2f TL\n", "Gunluk Net Kazanc", gunlukNetKazanc);
    }
}
