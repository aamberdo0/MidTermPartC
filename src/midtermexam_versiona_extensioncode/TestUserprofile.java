/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package midtermexam_versiona_extensioncode;

/**
 *
 * This class - insert class description
 * @author Amber Do
 */
import java.util.Scanner; 
public class TestUserprofile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
        System.out.println("Enter your name: "); 
       
        String name = input.next(); 
        
        System.out.println("Choose your genre: "); 
        String genre = input.nextLine(); 
        
        UserProfile hand = new UserProfile(name, genre); 
       
        System.out.print("Your name is : "+ hand.getUserID() + " and you chose: " + hand.getGenre()); 
        
        
        
    }

}
