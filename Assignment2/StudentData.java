/*IT2660
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicarray;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
/**
 *
 * @Dorrell Fleets
 */
public class StudentData {

    /**
     * @param args the command line arguments
     */
    
     static int getChoice(Scanner in){
       System.out.println("1. insert new student's information");
       System.out.println("2. fetch and output a student’s information");
       System.out.println("3. delete a student’s information");
       System.out.println("4. update a student’s information");
       System.out.println("5. output all student’s information");
       System.out.println("6. exit the program");
       int choice;
       while(true){
           System.out.print("Please issue command: ");
           choice = Integer.parseInt(in.nextLine());
           if(choice < 1 || choice > 6){
               System.out.println("Invalid. 1-6 please");
           }
           else{
               break;
           }
       }
       return choice;
   }
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Integer, StudentFiles> students = new HashMap<>();
        
       int choice;
       int idnum;
       double gpa;
       String name;
       
       Scanner n = new Scanner(System.in);
       
       while(true){
           choice = getChoice(n);
           switch(choice){
           case 1 -> {
               System.out.print("Enter Name: ");
               name = n.nextLine();
               
               System.out.print("Enter ID Number: ");
               idnum = Integer.parseInt(n.nextLine());
               
               System.out.print("Enter G.P.A: ");
               gpa = Double.parseDouble(n.nextLine());
               students.put(idnum, new StudentFiles(name, idnum, gpa));
                }
               
           case 2 -> {
               System.out.print("Enter ID number of the student: ");
               idnum = Integer.parseInt(n.nextLine());
               
               if(students.containsKey(idnum))
                   System.out.println(students.get(idnum));
               
               else
                   System.out.println("Student with ID number " + idnum + " not found!");
                }
               
           case 3 -> {
               System.out.print("Enter ID number of the student: ");
               idnum = Integer.parseInt(n.nextLine());
               if(students.containsKey(idnum))
                   students.remove(idnum);
               
               else
                   System.out.println("Student with ID number " + idnum + " not found!");
                }
               
           case 4 -> {
               System.out.print("Enter ID number of the student: ");
               idnum = Integer.parseInt(n.nextLine());
               
               if(students.containsKey(idnum)){
                   System.out.print("Enter Name: ");
                   name = n.nextLine();
                   System.out.print("Enter G.P.A: ");
                   gpa = Double.parseDouble(n.nextLine());
                   StudentFiles s = students.get(idnum);
                   s.setGpa(gpa);
                   s.setName(name);
                   students.put(idnum, s);
                   System.out.println("Student record has been changed to " + s);
               }
               
               else{
                   System.out.println("Student with ID number " + idnum + " not found!");
               }}
               
           case 5 -> {
               Set<Integer> keys = students.keySet();
               for(Iterator<Integer> itr = keys.iterator(); itr.hasNext(); ){
                   System.out.println(students.get(itr.next()));
               }}
               
           case 6 -> {
               return;
                }
           }
           System.out.println();
       }
   }
       
}
