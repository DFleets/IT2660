/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;
import java.util.Queue;
import java.util.LinkedList;

/**
 *
 * @DorrellFleets
 */
public class BFS {
    
    public BFS()
   {}

   public int bfs(BFSNode node, LinkedList<BFSNode> list)
   {
       int count = 0;
       Queue<BFSNode> queue = new LinkedList<>();

       queue.add(node);
       node.setVisited(true);

       while (!queue.isEmpty())
       {
           BFSNode currNode = queue.remove();
           list.add(currNode);
           LinkedList<BFSNode> neighbors = currNode.getNeighbors();
           for (int i = 0; i < neighbors.size(); i++)
           {
               count++;
               BFSNode temp = neighbors.get(i);
               if (temp != null && !temp.isVisited())
               {
                   queue.add(temp);
                   temp.setVisited(true);                  
               }
           }
       }

       return count;
   }
}
    

