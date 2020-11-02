/*****************************************************
* Name: Feras
* Description: A program to remove duplicates, sort in
* ascending order,display mix and min values using values entered from
* user input and stored in ArrayList class
 ***************************************************/

//import the array list and user input 
import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args){
        //create Scanner object
       Scanner input = new Scanner(System.in);
       
       //ask for user input and store in ArrayList class
       System.out.print("Enter ten integers: ");
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) list.add(input.nextInt());
        
        //invoke the duplicate method
        removeDuplicate(list);
        
        //display unique numbers
        System.out.print("The distinct integers are: ");
        for(int i=0; i<list.size(); i++) 
            System.out.print(list.get(i) + " " );
        
        System.out.println("");
        
        //display values in ascending order for the ArrayList
        java.util.Collections.sort(list);// java.util.Collections class to sort
        System.out.println("Sorted in ascending: " + list);
        
        //display max and min values for the ArrayList
        System.out.println("Maximum element in a list: " 
                + java.util.Collections.max(list));
        System.out.println("Minimal element in a list: " 
                + java.util.Collections.min(list));
    }//end main 
    
    /*Method to remove duplicates fromt the Array list*/
    public static void removeDuplicate(ArrayList<Integer> list){
       
        //create a temp ArrayList and store all unique numbers
        ArrayList<Integer> uniqueNum = new ArrayList<>();
        
      //check if the value is already int the list, if no add it no new list
        for (int i = 0; i < list.size(); i++) {
            
            if (!uniqueNum.contains(list.get(i))) {
                uniqueNum.add(list.get(i));
            }
        }
        
        list.clear();//clear the old list
        list.addAll(uniqueNum);// add the new unique numbers to the list
        
    }//end method
}//end class


