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
            System.out.println("-------------------------");
        }
        else{
            System.out.println(person.getClass());
            System.out.println("Başlangıç bakiyesi : " + this.bakiye);
            if(isDigital()){
                System.out.println("Dijital kart");
            }
            else {
                System.out.println("Fiziksel kart");
            }
            this.bakiye-=dusecek_miktar;
            System.out.println("Ödenen ücret : " +dusecek_miktar);
            System.out.println("Kalan Bakiye : "+ this.bakiye);
            System.out.println("-------------------------");
        }


    }

}
