package session72;

public class Dosen extends Person {
	
    String code_dosen;
    int point;

    public Dosen(String name, String born_date, String code_dosen) {
    	
        super(name, born_date);
        this.code_dosen = code_dosen;
        this.point = 0;
        
    }

    public void selfDev() {
    	
        System.out.println(name + " is doing self-development.");
        
    }

    public void teach() {
    	
        System.out.println(name + " is teaching.");
        
    }

    public void p2m() {
    	
        System.out.println(name + " is going to do community service.");
        
    }

    public void research() {
    	
        System.out.println(name + " is conducting research.");
        
    }

    public void otherWorks() {
    	
        System.out.println(name + " is doing other works.");
        
    }
}
