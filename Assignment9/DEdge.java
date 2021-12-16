/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

/**
 *
 * @Dorrell Fleets
 */
public class DEdge {
    
   private DNode firstVertex;
   private DNode lastVertex;
   private int weight;

   public DEdge(DNode newFirstVertex, DNode newLastVertex, int newWeight)
   {      
       firstVertex = newFirstVertex;
       lastVertex = newLastVertex;
       weight = newWeight;
   }

   public DNode getFirstVertex()
   {
       return firstVertex;
   }

   public void setFirstVertex(DNode newFirstVertex)
   {
       firstVertex = newFirstVertex;
   }

   public DNode getLastVertex()
   {
       return lastVertex;
   }

   public void setLastVertex(DNode newLastVertex)
   {
       lastVertex = newLastVertex;
   }
  
   public int getWeight()
   {
       return weight;
   }

   public void setWeight(int newWeight)
   {
       weight = newWeight;
   }
    
}
