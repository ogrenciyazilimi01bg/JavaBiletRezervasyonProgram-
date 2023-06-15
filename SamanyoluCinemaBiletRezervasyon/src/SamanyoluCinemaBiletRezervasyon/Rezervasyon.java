package SamanyoluCinemaBiletRezervasyon;

public class Rezervasyon {
    
	   
    private Seans seans;
    private String musteriAdiSoyadi;
    private int biletAdeti;
    
   
    private String koltukNo;
    private double musteriCepTelefonu;

    

   


    public Seans getSeans() {
        return seans;
    }

   
    public void setSeans(Seans seans) {
        
       
    	this.seans = seans;
    }

    
  

   
    public String getMusteriAdiSoyadi() {
        return musteriAdiSoyadi;
    }

    
   

    public void setMusteriAdiSoyadi(String musteriAdiSoyadi) {
        this.musteriAdiSoyadi = musteriAdiSoyadi;
    }

    public int getBiletAdeti() {
        return biletAdeti;
    }

    public void setBiletAdeti(int biletAdeti) {
        this.biletAdeti = biletAdeti;
    }

    


    public String getKoltukNo() {
        
       
    	return koltukNo;
    }

    
   

   
    public void setKoltukNo(String koltukNo) {
        this.koltukNo = koltukNo;
    }

    public double getMusteriCepTelefonu() {
        return musteriCepTelefonu;
    }

    public void setMusteriCepTelefonu(double musteriCepTelefonu) {
        this.musteriCepTelefonu = musteriCepTelefonu;
    }


    
}