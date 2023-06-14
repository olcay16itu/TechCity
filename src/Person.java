public class Person {
    /*enum people{
        OGRENCI,
        YASLI,
        MEMUR
    }
    private people persontype;*/
    private String ad;
    private String soyad;
    private Long tcNo;

    public Person(String ad, String soyad, Long tcNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.tcNo = tcNo;
    }

    /*
        public people getPersontype() {
            return persontype;
        }

        public void setPersontype(people persontype) {
            this.persontype = persontype;
        }
        */
    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Long getTcNo() {
        return tcNo;
    }

    public void setTcNo(Long tcNo) {
        this.tcNo = tcNo;
    }
    public double ucretHesapla(double ucret){
        return (ucret);
    }
}
