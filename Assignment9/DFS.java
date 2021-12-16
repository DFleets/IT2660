/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;
import java.util.Stack;
import java.util.LinkedList;
/**
 *
 * @Dorrell Fleets
 */
public class DFS {
    
     public DFS()
   {}

   public int dfs(DFSNode node, LinkedList<DFSNode> list)
   {
       int count = 0;
       Stack<DFSNode> stack = new Stack<>();
       stack.add(node);

       while (!stack.isEmpty())
       {
           count++;
           DFSNode currNode = stack.pop();
           if (!currNode.isVisited())
           {
               list.add(currNode);
               currNode.setVisited(true);
           }

           LinkedList<DFSNode> neighbors = currNode.getNeighbors();
           for (int i = 0; i < neighbors.size(); i++)
           {
               count++;
               DFSNode temp = neighbors.get(i);
               if (temp != null && !temp.isVisited())
               {
                   stack.add(temp);
               }
           }
       }

       return count;
   }
}
    
    

