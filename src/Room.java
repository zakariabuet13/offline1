/**
 * Created by Zakaria on 9/17/2015.
 */
public class Room {
    private String hallname;
    private int roomno;
    private boolean status;

    public Room() {
        this.hallname = "";
        this.roomno = 0;
        this.status = false;
    }

    public Room (String hallname, int roomno) {
        this.hallname = hallname;
        this.roomno = roomno;
        this.status = false;
    }

    public String get_hall_name(){
        return this.hallname;
    }

    public void set_hall_name(String hallname){
        this.hallname = hallname;
    }

    public int get_roomno(){
        return this.roomno;
    }

    public void set_roomno(int roomno){
        this.roomno = roomno;
    }

    public boolean get_status(){
        return this.status;
    }

    public void set_status(boolean status){
        this.status = status;
    }

    public void print(){
        if(get_status()){
            System.out.println("Room No, " + get_roomno() + " of " + get_hall_name() + " Hall is currently alloted.");
        }
        else {
            System.out.println("Room No, " + get_roomno() + " of " + get_hall_name() + " Hall is currently available for allotment.");
        }
    }
}
