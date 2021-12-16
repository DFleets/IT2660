/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;
import java.util.LinkedList;
/**
 *
 * @Dorrell Fleets
 */
public class DNode implements Comparable<DNode>
{
   private int data;
   private boolean visited;
   private int distance = Integer.MAX_VALUE;
   private DNode predecessor;
   private LinkedList<DEdge> neighbors;      

   public DNode(int newData)
   {
       data = newData;
       neighbors = new LinkedList<>();
   }

   public int getData()
   {
       return data;
   }

   public void setData(int newData)
   {
       data = newData;
   }  
      
   public boolean isVisited()
   {
       return visited;
   }

   public void setVisited(boolean newVisited)
   {
       visited = newVisited;
   }
  
   public int getDistance()
   {
       return distance;
   }

   public void setDistance(int newDistance)
   {
       distance = newDistance;
   }
  
   public DNode getPredecessor()
   {
       return predecessor;
   }

   public void setPredecessor(DNode newPredecessor)
   {
       predecessor = newPredecessor;
   }
  
   public void addNeighbor(DEdge edge)
   {
       neighbors.add(edge);
   }

   public LinkedList<DEdge> getNeighbors()
   {
       return neighbors;
   }
  
   public void setNeighbors(LinkedList<DEdge> newNeighbors)
   {
       neighbors = newNeighbors;
   }

   @Override
   public int compareTo(DNode otherVertex)
   {
       return Integer.compare(distance, otherVertex.getDistance());
   }
  
   @Override
   public String toString()
   {
       return "" + data;
   }
}