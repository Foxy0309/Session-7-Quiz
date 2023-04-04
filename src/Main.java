package session72;

import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1 for Person class, 2 for Mahasiswa class, or 3 for Dosen class: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
        	
            Person person = new Person("Paul", "3 April 2002");

            System.out.println("Name: " + person.name);
            System.out.println("Born Date: " + person.born_date);
            person.sleep();
            
            
        } 
        
        else if (choice == 2) {
        	
            Mahasiswa mahasiswa = new Mahasiswa("Dev", "20 July 2003", "250876540");

            System.out.println("Name: " + mahasiswa.name);
            System.out.println("Born Date: " + mahasiswa.born_date);
            System.out.println("Student ID: " + mahasiswa.student_id);
            mahasiswa.helpingDosen();
            System.out.println("Point: " + mahasiswa.point);
            
            
        } 
        
        else if (choice == 3) {
        	
            Dosen dosen = new Dosen("Seung", "3 March 1983", "D8765");

            System.out.println("Name: " + dosen.name);
            System.out.println("Born Date: " + dosen.born_date);
            System.out.println("Code Dosen: " + dosen.code_dosen);
            dosen.selfDev();
            dosen.teach();
            dosen.p2m();
            dosen.research();
            dosen.otherWorks();
            System.out.println("Point: " + dosen.point);
            
        } 
        
        else {
        	
            System.out.println("Invalid choice.");
            
        }
        
    }
    
}
