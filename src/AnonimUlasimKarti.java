public class AnonimUlasimKarti {
    private long KartNo;
    private double bakiye = 0;

    public AnonimUlasimKarti(long kartNo, double bakiye) {
        KartNo = kartNo;
        this.bakiye = bakiye;
    }

    public long getKartNo() {
        return KartNo;
    }

    public void setKartNo(long kartNo) {
        KartNo = kartNo;
    }

    public void bakiyeEkle(int bakiye){
        this.bakiye+=bakiye;
    }

    public double getBakiye(){
        return this.bakiye;
    }
    public void ücretOde(int ucret){
        if(this.bakiye<ucret){
            System.out.println("Bakiyeniz yetersiz.Yükleme yapın...");
        }
        else{
            this.bakiye-=ucret;
            System.out.println("Ödenen ücret : " +ucret);
            System.out.println("Kalan Bakiye : "+ this.bakiye);
        }
    }
}
