/**
 * Created by Zakaria on 9/17/2015.
 */
public class Student {
    private String studentName;
    private String studentNo;
    private Room room;

    public Student(){
        this.studentName = "";
        this.studentNo = "";
    }

    public Student(String studentName, String studentNo, Room room){
        this.studentName = studentName;
        this.studentNo = studentNo;
        this.room = room;
    }

    public String get_student_name(){
        return this.studentName;
    }
    public void set_student_name(String studentName){
        this.studentName = studentName;
    }

    public String get_student_no(){
        return this.studentNo;
    }
    public void set_student_no(String studentNo){
        this.studentNo = studentNo;
    }

    public Room get_room(){
        return this.room;
    }
    public void set_room(Room room){
        this.room = room;
    }

    public void print(){
        System.out.println( "Student No: " + get_student_no() + ", " + get_student_name() + ", resides on " + room.get_hall_name() + " Hall, Room no, " + room.get_roomno());
    }
}
