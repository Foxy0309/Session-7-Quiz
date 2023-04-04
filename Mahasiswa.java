package session72;

public class Mahasiswa extends Person {
	
    String student_id;
    int point;

    public Mahasiswa(String name, String born_date, String student_id) {
    	
        super(name, born_date);
        this.student_id = student_id;
        this.point = 0;
        
    }

    public void helpingDosen() {
    	
        System.out.println(name + " is helping the lecturer, gaining 10 points.");
        point += 10;
        
    }
}

