package session72;

public class Person {
	
    String name;
    String born_date;

    public Person(String name, String born_date) {
    	
        this.name = name;
        this.born_date = born_date;
        
    }

    public void sleep() {
    	
        System.out.println(name + " is sleeping.");
        
    }
    
}
