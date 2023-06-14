public class KişiselUlasimKarti {
    private IPerson person;
    private Long kartNo;
    private double bakiye = 0;
    private boolean isDigital;
    public KişiselUlasimKarti(IPerson person, Long kartNo,boolean isDigital) {
        this.person = person;
        this.kartNo = kartNo;
        this.isDigital=isDigital;
    }

    public IPerson getPerson() {
        return person;
    }

    public void setPerson(IPerson person) {
        this.person = person;
    }

    public Long getKartNo() {
        return kartNo;
    }

    public void setKartNo(Long kartNo) {
        this.kartNo = kartNo;
    }

    public boolean isDigital() {
        return isDigital;
    }

    public void setDigital(boolean digital) {
        isDigital = digital;
    }

    public void bakiyeEkle(int bakiye){
        this.bakiye+=bakiye;
    }
    public double getBakiye(){
        return this.bakiye;
    }

    public void ücretOde(int ucret){
        /*Person.people type=person.getPersontype();
        if(type== Person.people.OGRENCI){
            bakiye-=(fiyat*0.25);
        }
        else if(type== Person.people.MEMUR){
            bakiye-=(fiyat*0.75);
        }
        else if(type== Person.people.MEMUR){
            bakiye-=(fiyat*0.75);
        } */
        //Yeni bir insan nesnesi eklendiginde sıkıntı cıkar.OOP prensiplerine uygun degil.
        IPerson person=getPerson();
        double dusecek_miktar=person.ucretHesapla(ucret);
        if(this.bakiye<dusecek_miktar){
            System.out.println("Bakiyeniz yetersiz.Yükleme yapın...");
        }
        else{
            this.bakiye-=dusecek_miktar;
            System.out.println("Ödenen ücret : " +dusecek_miktar);
            System.out.println("Kalan Bakiye : "+ this.bakiye);
        }


    }

}
