public class AnonimUlasimKarti {
    private long KartNo;
    private double bakiye = 0;

    public AnonimUlasimKarti(long kartNo) {
        KartNo = kartNo;
    }

    public long getKartNo() {
        return KartNo;
    }

    public void setKartNo(long kartNo) {
        KartNo = kartNo;
    }

    public void bakiyeEkle(int bakiye){
        if(bakiye>0){
            this.bakiye+=bakiye;
        }
        else{
            System.out.println("Geçersiz bakiye değeri girildi.");
        }
    }

    public double getBakiye(){
        return this.bakiye;
    }

    public void ücretOde(double ucret){
        if(this.bakiye<ucret){
            System.out.println("Bakiyeniz yetersiz.Yükleme yapın...");
            System.out.println("-------------------------");
        }
        else{
            this.bakiye-=ucret;
            System.out.println("Anonim Kart");
            System.out.println("Fiziksel kart");
            System.out.println("Başlangıç bakiyesi : " + this.bakiye);
            System.out.println("Ödenen ücret : " +ucret);
            System.out.println("Kalan Bakiye : "+ this.bakiye);
            System.out.println("-------------------------");
        }
    }
}
