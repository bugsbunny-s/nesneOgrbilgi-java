public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes,Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExam(int note1, int note2, int note3){
        if((note1 >= 0 && note1 <= 100) && (note2 >= 0 && note2 <= 100) && (note3 >= 0  && note3 <= 100)){
            this.c1.note = note1;
            this.c2.note = note2;
            this.c3.note = note3;
        }else{
            System.out.println("Ders değerleri yanlış girilmiştir. ");
        }
    } 

    void isPass(){
        this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        System.out.println("==================");
        if(this.avarage < 60){
            System.out.println("Sınıfta Kaldınız... ");
            this.isPass = false;
        }else{
            System.out.println("Sınıfı Geçtiniz !!! ");
            this.isPass=true;
        }
        printNote();
    }
    
    void printNote(){
        System.out.println(this.c1.name + " Notu : " + this.c1.note);
        System.out.println(this.c2.name + " Notu : " + this.c2.note);
        System.out.println(this.c3.name + " Notu : " + this.c3.note);
        System.out.println("ORTALAMANIZ : " + this.avarage);
}
}