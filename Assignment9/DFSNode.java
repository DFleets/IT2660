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
public class DFSNode
{
   private int data;
   private boolean visited;
   private LinkedList<DFSNode> neighbors;

   DFSNode(int newData)
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
  
   public void addNeighbor(DFSNode newNeighbor)
   {
       neighbors.add(newNeighbor);
   }

   public LinkedList<DFSNode> getNeighbors()
   {
       return neighbors;
   }

   public void setNeighbors(LinkedList<DFSNode> newNeighbors)
   {
       neighbors = newNeighbors;
   }

   @Override
   public String toString()
   {
       return "" + data;
   }
} 
