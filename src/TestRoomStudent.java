/**
 * Created by Zakaria on 9/17/2015.
 */
public class TestRoomStudent {
    public static void main(String[] args) {
        Room r1 = new Room();
        r1.set_hall_name("Najrul Islam");
        r1.set_roomno(315);
        r1.set_status(false);
        r1.print();

        Room r2 = new Room("Fazlul Haque", 220);
        System.out.println(r2.get_hall_name() + " " + r2.get_roomno() + " " + r2.get_status());
        r2.print();

        Student s1 = new Student("Asraful Alam", "1305125", r2);
        System.out.println("Student No: " + s1.get_student_no() + ", " + s1.get_student_name() + ", resides on " + s1.get_room().get_hall_name() + " Hall, Room no, " + s1.get_room().get_roomno());
        r2.set_status(true);
        r2.print();

        Student s2 = new Student();
        s2.set_student_name("Navid Akram");
        s2.set_student_no("1305123");
        s2.set_room(r1);
        r1.set_status(true);
        s2.print();
    }
}
