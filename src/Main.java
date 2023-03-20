public class Main {
    public static void main(String[] args) throws Exception {
        Teacher t1 = new Teacher("Adolf Hitler", "******","RSM");
        Teacher t2 = new Teacher("Totti", "111111", "FLS");
        Teacher t3 = new Teacher("Selo","000000", "MAT");

        Course resim = new Course("Resim", "101", "RSM", t1);
        resim.addTeacher(t1);
        Course felsefe = new Course("Felsefe", "102", "FLS", t2);
        felsefe.addTeacher(t2);
        Course matematik = new Course("Matematik", "103", "MAT", t3);
        matematik.addTeacher(t3);

        Student s1 = new Student("Bug", "09", "2", resim, felsefe, matematik);
        s1.addBulkExam(100,02, 20);
        s1.isPass();
        Student s2 = new Student("Dds", "01", "2", resim, felsefe, matematik);
        s2.addBulkExam(10, 72, 100);
        s2.isPass();
    }
}