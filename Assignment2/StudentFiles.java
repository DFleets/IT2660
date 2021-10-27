/*IT2660
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicarray;

/**
 *
 * @Dorrell Fleets
 */
public class StudentFiles {
    
  
   private String name;
   private int idnum;
   private double gpa;
  
   public StudentFiles(String name, int idnum, double gpa) {
       this.name = name;
       this.idnum = idnum;
       this.gpa = gpa;
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public int getIdnum() {
       return idnum;
   }

   public void setIdnum(int idnum) {
       this.idnum = idnum;
   }

   public double getGpa() {
       return gpa;
   }

   public void setGpa(double gpa) {
       this.gpa = gpa;
   }
                
   @Override
   public String toString() {
       return "Name=" + name + ", ID=" + idnum + ", G.P.A=" + gpa;
   }
  
}
    

