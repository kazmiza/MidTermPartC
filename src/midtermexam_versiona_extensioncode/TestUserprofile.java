package midtermexam_versiona_extensioncode;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zain
 */
public class TestUserprofile {
    
     public static void main(String[] args)
    {
       String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
       
       
       System.out.println("Here are some generated genres to choose from: ");
        System.out.println();
       
       for(int i=0;i<genres.length;i++)
       {
           System.out.println(genres[i]);
       }
       System.out.println();
        Scanner obj=new Scanner(System.in);
        
        System.out.print("Please enter your name: ");
        String user =obj.nextLine();
       
        
        System.out.println();
        
        Scanner obj2=new Scanner(System.in);
        System.out.print("Genres: ");
        
       
        String gen=obj.nextLine();
     
        System.out.println("Profile created!");
        
        
    }
    
}

    
    
    
    
    
   
    

