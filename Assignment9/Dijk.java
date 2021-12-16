/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 *
 * @Dorrell Fleets
 */
public class Dijk {
    
     public Dijk()
   {}
  
   public int ShortestPath(DNode source)
   {
       int count = 0;
       source.setDistance(0);
       PriorityQueue<DNode> pq = new PriorityQueue<>();
       pq.add(source);
       source.setVisited(true);

       while (!pq.isEmpty())
       {
           count++;
          
           DNode currNode = pq.poll();

           for (DEdge currEdge : currNode.getNeighbors())
           {
               count++;
               DNode temp = currEdge.getLastVertex();
               if (!temp.isVisited())
               {
                   int currDist = currNode.getDistance() + currEdge.getWeight();

                   if (currDist < temp.getDistance())
                   {
                       pq.remove(temp);
                       temp.setDistance(currDist);
                       temp.setPredecessor(currNode);
                       pq.add(temp);
                   }
               }
           }
           currNode.setVisited(true);
       }
      
       return count;
   }

   public LinkedList<DNode> dSearch(DNode target)
   {
       LinkedList<DNode> nodes = new LinkedList<>();

       for (DNode currNode = target; currNode != null; currNode = currNode.getPredecessor())
       {
           nodes.add(currNode);
       }

       Collections.reverse(nodes);      
      
       return nodes;
   }

}
