public class Ogrenci extends Person implements IPerson{
    public Ogrenci(String ad, String soyad, Long tcNo) {
        super(ad, soyad, tcNo);
    }

    public double ucretHesapla(double ucret){
        return (ucret*0.25);
    }
}
