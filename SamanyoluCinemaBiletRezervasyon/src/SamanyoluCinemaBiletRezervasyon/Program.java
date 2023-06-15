package SamanyoluCinemaBiletRezervasyon;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
public class Program {
	public static String FilmAdiK;
	public static int biletAdeti;
	public static int FilmNumarası;
	public static String KoltukNo;
	public static String KFilmTarihi;
    public static int BiletFiyatK;
    public static int BiletAdetiK;
    public static void main(String[] agrs)
    {
    	 Scanner scanner = new Scanner(System.in);
    	 LocalDateTime Simdi = LocalDateTime.now();  
    	 DateTimeFormatter Simdiki = DateTimeFormatter.ofPattern("dd-MM-yyyy ");
    	 String SimdikiZ = Simdi.format(Simdiki); 
         DateTimeFormatter SimdikiZaman = DateTimeFormatter.ofPattern("dd-MM-yyyy EE HH:mm:ss");  
         String SimdikiZamanı = Simdi.format(SimdikiZaman);  
    	 String ProgramaGirisTarihi = ("Tarih :" + SimdikiZamanı );
         System.out.println("                               * Samanyolu Cinemasına HOŞGELDİNİZ *           " + ProgramaGirisTarihi);
         System.out.println("        Aşağıdaki filmlerden birini Seçiniz.");
         System.out.print("");
         var FilmSuresiK = 0;
         var FilmSaatiK = "";
         var SalonAdiK = "";
         
         Film Film1 = new Film();
         Film1.setFilmAdi ( "   JOHN WICK 4             ");
         Film1.setFilmTuru ( "           Türü:Aksiyon   ");
         Film1.setFilmSuresi (169);
         Film1.setFilmYonetmeni ("Yönetmen: Chad Stahelski ");
         
         Film Film2 = new Film();
         Film2.setFilmAdi ("   SÜPER MARİO KARDEŞLER        ");
         Film2.setFilmTuru ("      Türü:Animasyon   ");
         Film2.setFilmSuresi  (92);
         Film2.setFilmYonetmeni ("Yönetmen: Michael Jelenic ");

         Film Film3 = new Film();
         Film3.setFilmAdi ( "   HAVA MUHALEFETİ      ");
         Film3.setFilmTuru ("              Türü:Komedi  ");
         Film3.setFilmSuresi (105);
         Film3.setFilmYonetmeni ( "Yönetmen: Murat Kepez ");
         
         Salon Salon1 = new Salon();
         Salon1.setSalonAdi ( "Salon Adı: Merkür       ");
         Salon1.setSalonKapasitesi (50);

         Salon Salon2 = new Salon();
         Salon2.setSalonAdi ("Salon Adı: Venüs      ");
         Salon2.setSalonKapasitesi (50);

         Salon Salon3 = new Salon();
         Salon3.setSalonAdi ("Salon Adı: Dünya      ");
         Salon3.setSalonKapasitesi (50);
         
         Seans Seans1 = new Seans();
         Seans1.setTarih  (SimdikiZ) ;
         Seans1.setSeansZamani ( "  11:00");
         Seans1.setFilm (Film1);
         Seans1.setSalon (Salon1);

         Seans Seans2 = new Seans();
         Seans2.setSeansZamani ( "  14:30");
         Seans2.setFilm  (Film1);
         Seans2.setSalon  (Salon1);

         Seans Seans3 = new Seans();
         Seans3.setSeansZamani ("  18:00");
         Seans3.setFilm (Film1);
         Seans3.setSalon  (Salon1);

         Seans Seans4 = new Seans();
         Seans4.setSeansZamani ( " 21:30  ");
         Seans4.setFilm  (Film1);
         Seans4.setSalon  (Salon1);

         Seans Seans5 = new Seans();
         Seans5.setSeansZamani  ("  11:00");
         Seans5.setFilm  (Film2);
         Seans5.setSalon  (Salon2);

         Seans Seans6 = new Seans();
         Seans6.setSeansZamani ( "  14:30");
         Seans6.setFilm  (Film2);
         Seans6.setSalon  (Salon2);

         Seans Seans7 = new Seans();
         Seans7.setSeansZamani  ("  18:00");
         Seans7.setFilm  (Film2);
         Seans7.setSalon  (Salon2);

         Seans Seans8 = new Seans();
         Seans8.setSeansZamani ( " 21:30  ");
         Seans8.setFilm  (Film2);
         Seans8.setSalon (Salon2);

         Seans Seans9 = new Seans();
         Seans9.setSeansZamani ( "  11:00");
         Seans9.setFilm  (Film3);
         Seans9.setSalon  (Salon3);

         Seans Seans10 = new Seans();
         Seans10.setSeansZamani  ("  14:30");
         Seans10.setFilm  (Film3);
         Seans10.setSalon  (Salon3);

         Seans Seans11 = new Seans();
         Seans11.setSeansZamani ( "  18:00");
         Seans11.setFilm  (Film3);
         Seans11.setSalon (Salon3);

         Seans Seans12 = new Seans();
         Seans12.setSeansZamani (" 21:30  ");
         Seans12.setFilm (Film3);
         Seans12.setSalon (Salon3);
         
         Rezervasyon Rezervasyon1 = new Rezervasyon();
         Rezervasyon1.setSeans (Seans1);
         Rezervasyon1.setKoltukNo  (KoltukNo);
         Rezervasyon1.setBiletAdeti (biletAdeti);
        

         Rezervasyon Rezervasyon2 = new Rezervasyon();
         Rezervasyon2.setSeans  (Seans2);
         

         Rezervasyon Rezervasyon3 = new Rezervasyon();
         Rezervasyon3.setSeans  (Seans3);

         Rezervasyon Rezervasyon4 = new Rezervasyon();
         Rezervasyon4.setSeans  (Seans4);

         Rezervasyon Rezervasyon5 = new Rezervasyon();
         Rezervasyon5.setSeans  (Seans5);

         Rezervasyon Rezervasyon6 = new Rezervasyon();
         Rezervasyon6.setSeans  (Seans6);

         Rezervasyon Rezervasyon7 = new Rezervasyon();
         Rezervasyon7.setSeans  (Seans7);

         Rezervasyon Rezervasyon8 = new Rezervasyon();
         Rezervasyon8.setSeans  (Seans8);

         Rezervasyon Rezervasyon9 = new Rezervasyon();
         Rezervasyon9.setSeans  (Seans9);


         Rezervasyon Rezervasyon10 = new Rezervasyon();
         Rezervasyon10.setSeans  (Seans10);

         Rezervasyon Rezervasyon11 = new Rezervasyon();
         Rezervasyon11.setSeans  (Seans11);


         Rezervasyon Rezervasyon12 = new Rezervasyon();
         Rezervasyon12.setSeans  (Seans12);
         
         Bilgi Bilgi1 = new Bilgi();
         Bilgi1.setBiletFiyati (50);
         Bilgi1.setRezervasyon  (Rezervasyon1);

         Bilgi Bilgi2 = new Bilgi();
         Bilgi2.setBiletFiyati  (50);
         Bilgi2.setRezervasyon  (Rezervasyon2);

         Bilgi Bilgi3 = new Bilgi();
         Bilgi3.setBiletFiyati (50);
         Bilgi3.setRezervasyon  (Rezervasyon3);

         Bilgi Bilgi4 = new Bilgi();
         Bilgi4.setBiletFiyati (50);
         Bilgi4.setRezervasyon  (Rezervasyon4);

         Bilgi Bilgi5 = new Bilgi();
         Bilgi5.setBiletFiyati  (50);
         Bilgi5.setRezervasyon  (Rezervasyon5);



         Bilgi Bilgi6 = new Bilgi();
         Bilgi6.setBiletFiyati  (50);
         Bilgi6.setRezervasyon  (Rezervasyon6);

         Bilgi Bilgi7 = new Bilgi();
         Bilgi7.setBiletFiyati (50);
         Bilgi7.setRezervasyon  (Rezervasyon7);

         Bilgi Bilgi8 = new Bilgi();
         Bilgi8.setBiletFiyati  (50);
         Bilgi8.setRezervasyon  (Rezervasyon8);

         Bilgi Bilgi9 = new Bilgi();
         Bilgi9.setBiletFiyati  (50);
         Bilgi9.setRezervasyon  (Rezervasyon9);


         Bilgi Bilgi10 = new Bilgi();
         Bilgi10.setBiletFiyati  (50);
         Bilgi10.setRezervasyon  (Rezervasyon10);

         Bilgi Bilgi11 = new Bilgi();
         Bilgi11.setBiletFiyati  (50);
         Bilgi11.setRezervasyon  (Rezervasyon11);

         Bilgi Bilgi12 = new Bilgi();
         Bilgi12.setBiletFiyati  (50);
         Bilgi12.setRezervasyon  (Rezervasyon12);
         
        // Burdaki kodda filmlerin bilgileri veriliyor
         System.out.println("1) " + Film1.getFilmAdi() + Film1.getFilmTuru() + "   " + Film1.getFilmSuresi() + " dk" + "   " + Film1.getFilmYonetmeni());
         System.out.println("2) " + Film2.getFilmAdi() + Film2.getFilmTuru() + " " + Film2.getFilmSuresi() + "  dk" + "   " + Film2.getFilmYonetmeni());
         System.out.println("3) " + Film3.getFilmAdi() + Film3.getFilmTuru() + "     " + Film3.getFilmSuresi() + " dk" + "   " + Film3.getFilmYonetmeni());
       //Film numarası isteniyor burdaki kodda ve o numara da film varsa o film ile ilgili bilgiler yazıyor.Yoksa o numarada film tekrar numara girmesi isteniyor.
         while (true)
         {

        	 System.out.println("Film numarasını yazınız");
        	 FilmNumarası = scanner.nextInt();

        	 System.out.println("");
             if (FilmNumarası == 1)
             {
            	 System.out.println("Seçilen  film:" + Film1.getFilmAdi() + Film1.getFilmTuru() + Film1.getFilmSuresi() + "dk   " + Film1.getFilmYonetmeni());
            	 System.out.println(Salon1.getSalonAdi() + "Salon Kapasitesi:" + Salon1.getSalonKapasitesi());
                 FilmAdiK = Film1.getFilmAdi();
                 FilmSuresiK =Film1.getFilmSuresi();
                 SalonAdiK = Salon1.getSalonAdi();
                 break;
             }

             else if (FilmNumarası == 2)
             {
            	 System.out.println("Seçilen  film:" + Film2.getFilmAdi() + Film2.getFilmTuru() + Film2.getFilmSuresi() + "dk   " + Film2.getFilmYonetmeni());
            	 System.out.println(Salon2.getSalonAdi() + "Salon Kapasitesi:" + Salon2.getSalonKapasitesi());
                 FilmAdiK = Film2.getFilmAdi();
                 FilmSuresiK =Film2.getFilmSuresi();
                 SalonAdiK = Salon2.getSalonAdi();
                 break;
             }

             else if (FilmNumarası == 3)
             {
            	 System.out.println("Seçilen  film:" + Film3.getFilmAdi() + Film3.getFilmTuru() + Film3.getFilmSuresi() + "dk   " + Film3.getFilmYonetmeni());
            	 System.out.println(Salon3.getSalonAdi() + "Salon Kapasitesi:" + Salon3.getSalonKapasitesi());
                 FilmAdiK = Film3.getFilmAdi();
                 FilmSuresiK=Film3.getFilmSuresi();
                 SalonAdiK = Salon3.getSalonAdi();
                 break;
             }


             else
             {
            	 System.out.println("Böyle bir film yok, tekrar deneyin");
                 continue;
             }
         }
         
       //Bilet tarihi seçimi yapılması isteniyor bu kodda.Başka bir günü  seçerse o günü yazması isteniyor.
         System.out.println("            ");
         System.out.println("Bilet tarihi Seçiniz");
         System.out.print("1)" );
         System.out.println(SimdikiZ );
         System.out.println("2)Başka bir gün için tarih seçiniz ");
         System.out.println("            ");
         
         System.out.println("            ");
         int SeansSecin = scanner.nextInt();
         System.out.println("            ");
         
         if (SeansSecin == 1)
         {
        	 System.out.print("Seçtiğiniz tarih:");
        	 System.out.println(SimdikiZ); 
        	 KFilmTarihi = SimdikiZ;
         } 
         else if (SeansSecin == 2)
         {
        	 while (true) {
        		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        	        Scanner scan = new Scanner(System.in);

                 System.out.print("İstediğiniz tarihi örnekte gördüğünüz gibi giriniz: ");
                 System.out.println("Örnek: 10.05.2023");

                 String secilenTarih = scan.nextLine();
                 System.out.println("Seçtiğiniz tarih: " + secilenTarih);

                 LocalDate simdikiTarih = LocalDate.now();
                 LocalDate secilenLocalTarih = LocalDate.parse(secilenTarih, formatter);
                 KFilmTarihi =secilenTarih;
                 long fark = ChronoUnit.DAYS.between(simdikiTarih, secilenLocalTarih);
                 
                 // Geçmiş bir tarih girilince bu kod çalışır ve tekrar tarih girilmesi istenir.
                 if (secilenLocalTarih.isBefore(simdikiTarih)) {
                     System.out.println("Geçmiş bir tarih girdiniz");
                     continue;
                 } 
                 else {
                     break;
                 }
             }

         }
         else if (SeansSecin < 1)
         {
             System.out.println("Hatalı giriş yaptınız.Lütfen tekrar programa giriş yapınız.");
             System.out.println();
         }
         else
         {
             System.out.println("Hatalı giriş yaptınız.Lütfen tekrar programa giriş yapınız");
             System.out.println();
         }
         //Seçilen film ve güne göre seans zamanı bilgisi verilir. 
         System.out.println("            ");
         if (FilmNumarası == 1) {
        	    System.out.println(Seans1.getFilm().getFilmAdi() + "1) " + Seans1.getSeansZamani() + "  2) " + Seans2.getSeansZamani() + "  3) " + Seans3.getSeansZamani() + "  4) " + Seans4.getSeansZamani());
        	}
         else if (FilmNumarası == 2) {
        	    System.out.println(Seans5.getFilm().getFilmAdi() + "1) " + Seans5.getSeansZamani() + "  2) " + Seans6.getSeansZamani() + "  3) " + Seans7.getSeansZamani() + "  4) " + Seans8.getSeansZamani());
        	} 
         else if (FilmNumarası == 3) {
        	    System.out.println(Seans9.getFilm().getFilmAdi() + "1) " + Seans9.getSeansZamani() + "  2) " + Seans10.getSeansZamani() + "  3) " + Seans11.getSeansZamani() + "  4) " + Seans12.getSeansZamani());
        	}
       //Bu kodda film seans zamanı seçilir.
         System.out.println("Film Seans saati seçiniz");
         System.out.println("            ");
         double filmSaati = scanner.nextDouble();

         String filmSaatK = "";
         
         if (filmSaati == 1) {
             System.out.println("Seçilen saat: " + Seans1.getSeansZamani());
             filmSaatK = Seans1.getSeansZamani();
             
         } else if (filmSaati == 2) {
             System.out.println("Seçilen saat: " + Seans2.getSeansZamani());
             filmSaatK = Seans2.getSeansZamani();
         } else if (filmSaati == 3) {
             System.out.println("Seçilen saat: " + Seans3.getSeansZamani());
             filmSaatK = Seans3.getSeansZamani();
         } else if (filmSaati == 4) {
             System.out.println("Seçilen saat: " + Seans4.getSeansZamani());
             filmSaatK = Seans4.getSeansZamani();
         } else {
             System.out.println("Hatalı giriş");
         }
      // Müsteri adı soyadı ve telefon numarası alınır bu kodda.
         System.out.print("\nMusteri Adi Soyadi: ");
         String musteriAdiSoyadi = scanner.next();
         System.out.println("Musteri Adi Soyadi: " + musteriAdiSoyadi);
         
         System.out.print("\"Müşteri Telefon No giriniz.Örnek :(###)-###-##-## \" ");
         String Ceptelefon = scanner.next();
         
         String  koltukA = "";

         //Bu kodda bugün  seçimine göre işlemler devam ediyor.Boş koltuk sayısı da yazdırılır.
         if (SeansSecin == 1)
         {
             System.out.println(" 40 Tane boş koltuk  ");
             int bos = 40;

             System.out.println("");
             System.out.println("");
             System.out.println("                Perde                          ");
             System.out.println("1   " + "2  " + " 3  " + " 4  " + " 5  " + " 6  " + " 7  " + " 8  " + " 9  " + " 10  ");
             System.out.println("11  " + "12  " + "13  " + "14  " + "15  " + "16  " + "17  " + "18  " + "19  " + "20  ");
             System.out.println("21  " + "22  " + "23  " + "24  " + "25  " + "26  " + "27  " + "28  " + "29  " + "30  ");
             System.out.println("31  " + "32  " + "33  " + "34  " + "35  " + "36  " + "37  " + "38  " + "39  " + "40  ");
             System.out.println("41  " + "42  " + "43  " + "44  " + "45  " + "46  " + "47  " + "48  " + "49  " + "50  ");
             System.out.println("");

             // Bu kodda random dolu koltuklar olusturluyor
             Random r = new Random();
             String[] K = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50" };

             List<String> doluKoltuklar = new ArrayList<>();
             HashSet<String> secilenKoltuklar = new HashSet<>();

             while (doluKoltuklar.size() < 10) {
                 int index = r.nextInt(K.length);
                 String koltukNo = K[index];

                 if (!secilenKoltuklar.contains(koltukNo)) {
                     doluKoltuklar.add(koltukNo);
                     secilenKoltuklar.add(koltukNo);
                 }
             }

             for (String koltuk : doluKoltuklar) {
                 System.out.println("doluKoltuk: " + koltuk);
             }

              /*Burdaki kodlarda Bilet adeti girilmesi istenir  ve o kadar bilet var mı diye kontrol edilir.
              Yeterli koltuk yoksa tekrar bilet adeti istenir.Aynı zamanda bilet sayısına göre fiyat hesaplanır.
              Bilet adeti kadar boş koltuk no girilmesi istenir.*/
             
             while (true) {
                 System.out.print("Bilet adeti giriniz: ");
                 int biletAdeti = scanner.nextInt();
                 biletAdeti = biletAdeti;
                 BiletAdetiK= biletAdeti;
                 System.out.println("Bilet adeti: " + biletAdeti);

                 int kalan = bos - biletAdeti;

                 int fiyat = biletAdeti * Bilgi1.getBiletFiyati();
                 System.out.println("Fiyat: " + fiyat + " TL");
                 BiletFiyatK = fiyat;
                 if (kalan < 0) {
                     System.out.println("Yetersiz koltuk sayısı");
                     continue;
                 } else {
                     String[] koltukNo = new String[biletAdeti];
                     System.out.println("Lütfen bilet adeti kadar tek tek Koltuk No giriniz");
                     for (int d = 0; d < biletAdeti; d++) {
                         koltukNo[d] = scanner.next();
                         System.out.println("Seçilen Koltuk No: " + koltukNo[d]);
                         koltukA += koltukNo[d] + " ";
                     }
                     break;
                 }
             }
         

       
         }
         // Bu kodda bugün değil ileri bir tarih seçildiyse onun için işlemler yapılır.Ve boş koltuk sayısı söylenir.
         else
         {	 
	         int bosk = 50;
	         String koltukNo = "";
	
	         System.out.println("Tüm Koltuklar boş");
	         System.out.println("");
	         System.out.println("");
	         System.out.println("                Perde                          ");
	         System.out.println("1   2   3   4   5   6   7   8   9   10");
	         System.out.println("11  12  13  14  15  16  17  18  19  20");
	         System.out.println("21  22  23  24  25  26  27  28  29  30");
	         System.out.println("31  32  33  34  35  36  37  38  39  40");
	         System.out.println("41  42  43  44  45  46  47  48  49  50");
	         System.out.println("");
	         
	         //Burdaki kodlarda Bilet adeti girilmesi istenir  ve o kadar bilet var mı diye kontrol edilir.
             //Yeterli koltuk yoksa tekrar bilet adeti istenir.Aynı zamanda bilet sayısına göre fiyat hesaplanır.
             // Bilet adeti kadar boş koltuk no girilmesi istenir.
	         while (true) {
	             System.out.print("Bilet adeti giriniz: ");
	             int biletAdeti = scanner.nextInt();
	             System.out.println("Bilet adeti: " + biletAdeti);
	
	             int kalan;
	             kalan = bosk - biletAdeti;
	
	             int fiyat = biletAdeti * Bilgi1.getBiletFiyati();
	             System.out.println("Fiyat: " + fiyat + " TL");
	             BiletFiyatK = fiyat;
	             BiletAdetiK= biletAdeti;
	             if (kalan < 0) {
	                 System.out.println("Yetersiz koltuk Sayısı");
	                 continue;
	             } else {
	                 String[] KoltukNo = new String[biletAdeti];
	                 System.out.println("Lütfen bilet adeti kadar tek tek Koltuk No giriniz");
	                 for (int d = 0; d < biletAdeti; d++) {
	                     KoltukNo[d] = scanner.next();
	                     System.out.println("Seçilen Koltuk No: " + KoltukNo[d]);
	                     koltukA += KoltukNo[d] + " ";
	                 }
	                 break;
	             }
	         }
	      } 

       //Bilet yazdırma.

         

         System.out.println("------------------------------------------------------------------------------------------------------------------");
         System.out.println("  Bilet Bilgisi                              Rezervasyon  yapılış Tarihi:    " + SimdikiZ );
         System.out.println("  Film:" + FilmAdiK + ""+""+""+FilmSuresiK +"dk");
         System.out.println(" "+" "+ SalonAdiK);
         System.out.println("  Film Tarihi: " +KFilmTarihi);
         System.out.println("  Film saati : " + filmSaatK);
         System.out.println("------------------------------------------------------------------------------------------------------------------" );
         System.out.print("  Adı Soyad :" ); 
         System.out.println(musteriAdiSoyadi);
         System.out.print("Musteri telefon No:");
         System.out.print(Ceptelefon);
         System.out.println("  Fiyatı:" + BiletFiyatK + " TL  " + "Bilet Adeti:" +BiletAdetiK  );
         System.out.println("  Koltuk No:" + koltukA);
         System.out.println("_________________________________________________________________________________________________________________");

         System.out.println("*********************************İşlem Başarılı*******************************************");

        
         
    }   
}
