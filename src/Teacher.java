public class Teacher {
    String name;
    String no;
    String branch;

    Teacher(String name, String no, String branch){
        this.name = name;
        this.no = no;
        this.branch = branch;
    }

    void print(){
        System.out.println("Adı : " + this.name);
        System.out.println("Telefon numarası : "+ this.no);
        System.out.println("Bölümü : " + this.branch);
    }
}
