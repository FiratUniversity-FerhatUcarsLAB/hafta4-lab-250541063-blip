/*
 * Ad Soyad: [FATMA TÜRKMEN]
 * Ogrenci No: [250541063]
 * Tarih: [30.10.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

/*
 * Ad Soyad: [ADINIZ SOYADINIZ]
 * Ogrenci No: [NUMARANIZ]
 * Tarih: [TARIH]
 * Aciklama: Gorev 1: Kullanicidan alinan ogrenci bilgilerini ekrana duzenli yazdirir.
 */

import java.util.Scanner; // Scanner sınıfını kullanmak için zorunlu [cite: 75]

public class OgrenciBilgi {

    public static void main(String[] args) {
        
        // Scanner nesnesini oluşturma [cite: 76]
        Scanner input = new Scanner(System.in); 
        
        // Program başlığı [cite: 59]
        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        
        // 1. Bilgileri Kullanıcıdan Alma
        
        // Ad (String) [cite: 48]
        System.out.print("Adinizi girin: "); 
        // next() tek kelime okur, görevde tek kelime istendiği varsayılır [cite: 77]
        String ad = input.next(); 
        
        // Soyad (String) [cite: 49]
        System.out.print("Soyadinizi girin: ");
        String soyad = input.next();
        
        // Öğrenci Numarası (int) [cite: 50, 78]
        System.out.print("Ogrenci numaraniz: ");
        int ogrenciNo = input.nextInt();
        
        // Yaş (int) [cite: 51, 78]
        System.out.print("Yasiniz: ");
        int yas = input.nextInt();
        
        // GPA (double, 0.00-4.00) [cite: 52, 79]
        System.out.print("GPA (0.00-4.00): ");
        double gpa = input.nextDouble();
        
        // Scanner nesnesini kapatma
        input.close();

        // 2. Çıktıyı Düzenli Formatlama
        
        // Tekrar başlık [cite: 63]
        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        
        // Ad Soyad çıktısı [cite: 64]
        System.out.println("Ad Soyad: " + ad + " " + soyad); 
        
        // Öğrenci No çıktısı [cite: 65]
        System.out.println("Ogrenci No: " + ogrenciNo); 
        
        // Yaş çıktısı [cite: 66]
        System.out.println("Yas: " + yas);
        
        // GPA çıktısı (2 ondalık basamakla gösterilmesi gerekiyor) 
        // printf() ile formatlanmış çıktı zorunlu [cite: 34]
        System.out.printf("GPA: %.2f\n", gpa); // \n bir alt satıra geçmek için

        // Ek Bilgi: Örnekte "Durum" bilgisi de var. Basit bir mantıkla eklenebilir. [cite: 68]
        String durum = (gpa >= 2.00) ? "Basarili Ogrenci" : "Gelistirilmeli";
        System.out.println("Durum: " + durum);
    }
}
