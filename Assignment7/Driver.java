/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;
import java.util.Scanner;
/**
 *
 * @Dorrell
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        int choice = 0;

        BinarySearch bs = new BinarySearch();
        Node newStudent;
        while (choice != 6) {
           
            Scanner i = new Scanner(System.in);
            Scanner s = new Scanner(System.in);
            Options();
            choice = s.nextInt();
            if (choice == 1) {
                System.out.println("Student name");
                String studentName = i.nextLine();
                System.out.println("Student ID");
                int studentId = i.nextInt();
                System.out.println("G.P.A");
                double studentGpa = i.nextDouble();
                newStudent = new Node(studentId,studentName,studentGpa);
                bs.addNode(newStudent);
            }
            if (choice == 2) {
                System.out.println("Student ID number");
               int studentFind = i.nextInt();
               Node student = bs.fetchStudent(studentFind);
                System.out.println("Student Name: " + student.name + "\nStudent ID: " 
                        + student.key + "\n" + "Student G.P.A.: " + student.gpa + "\n");

            }
            if (choice == 3) {
                System.out.println("Enter student ID");
                int deleteStudent = i.nextInt();
                bs.deleteNode(deleteStudent);

            }
            if (choice == 4) {
                System.out.println("Enter student ID");
                int updateStudentId = i.nextInt();
                System.out.println("Enter student name");
                String updateStudentName = i.next();
                System.out.println("Enter student ID");
                int newStudentId = i.nextInt();
                System.out.println("Enter student GPA");
                double newStudentGpa = i.nextDouble();
                newStudent = new Node(newStudentId,updateStudentName,newStudentGpa);
                bs.updateNode(updateStudentId, newStudent);

            }
            if (choice == 5) {
               
                bs.showAllRecords(bs.root);
            }
        }
    }

    public static void Options()    {
        System.out.println("Select:"+
                "\t\t1 insert new student\n" +
                " \t\t2 fetch student record\n" +
                "\t\t3 delete student record\n" +
                "\t\t4 update student record\n" +
                "\t\t5 output all student records\n" +
                "\t\t6 exit the program");
    }    
    
}
