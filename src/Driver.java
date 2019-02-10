/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nick Tonjum
 * Created Spring 2017
 * This Program makes a linked list with names
 */
import java.util.Scanner;
        
public class Driver 
{
    public static void main(String[] args)
    {
        boolean x = true;
        
        Scanner scan = new Scanner(System.in);
        LinkedList linkedlist = new LinkedList();
        
        while(x==true)
        {
            System.out.println("What would you like to do?");
            System.out.println("Press 1 to add item to the back of the list");
            System.out.println("Press 2 to print the list");
            System.out.println("Press 3 to delete an item");
            System.out.println("Press 4 to clear the whole list");
            System.out.println("Press -1 to exit");
            int choice = scan.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Please enter name:");
                    linkedlist.addItem(scan.next());
                    break;
                case 2:
                    linkedlist.print();
                    break;
                case 3:
                    System.out.println("Enter name you want to delete");
                    linkedlist.delete(scan.nextInt());
                    break;
                case 4:
                    linkedlist.clearAll();
                    break;
                case -1:
                    System.out.println("Goodbye");
                    x = false;
                    break;
                default:
                    System.out.println("Not a choice, try again.");
                    break;
            }
        } 
    }
}
