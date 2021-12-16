/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Random;


/**
 *
 * @Dorrell Fleets
 */
public class Search {

   
    public static void main(String[] args) {
        
        
         final int nodeNumber = 1000;
         
       Scanner input  = new Scanner(System.in);
       
       Random r = new Random();

       LinkedList<BFSNode> bfsNodes = new LinkedList<>();
       
       LinkedList<DFSNode> dfsNodes = new LinkedList<>();
       
       LinkedList<DNode> dNodes = new LinkedList<>();

       for (int i = 0; i < nodeNumber; i++)
       {
           int n = 1 + r.nextInt(100000);
           System.out.println(n);
           bfsNodes.add(new BFSNode(n));
           dfsNodes.add(new DFSNode(n));
           dNodes.add(new DNode(n));
       }
       
       System.out.println();
       
       for (int i = 0; i < nodeNumber; i++)
       {
           int connections = 1 + r.nextInt(5);

           for (int j = 0; j < connections; j++)
           {
               int n = r.nextInt(nodeNumber);

               bfsNodes.get(i).addNeighbor(bfsNodes.get(n));
               
               dfsNodes.get(i).addNeighbor(dfsNodes.get(n));
               
               int distance = 1 + r.nextInt(100000);
               
               dNodes.get(i).addNeighbor(new DEdge(dNodes.get(i), dNodes.get(n), distance));
           }
       }

       System.out.print("Pick a node to search for: ");
       
       int number = input.nextInt();
       input.close();

       BFSNode bfsNumNode = findBFSNode(bfsNodes, number);
       
       DFSNode dfsNumNode = findDFSNode(dfsNodes, number);
       
       DNode dNumNode = findDNode(dNodes, number);
       
       String result = "failed";
       
       int bfsLength = 0;
       int bfsCount = 0;
       int dfsLength = 0;
       int dfsCount = 0;
       int dLength = 0;
       int dCount = 0;
      
       if (bfsNumNode != null && dfsNumNode != null && dNumNode != null)
       {
           result = "Success";
          
           LinkedList<BFSNode> bfsList = new LinkedList<>();
           
           LinkedList<DFSNode> dfsList = new LinkedList<>();
           
           LinkedList<DNode> dList = new LinkedList<>();
          
           BFS bfsObj = new BFS();
           bfsCount = bfsObj.bfs(bfsNumNode, bfsList);
           bfsLength = bfsList.size();
          
           DFS dfsObj = new DFS();          
           dfsCount = dfsObj.dfs(dfsNumNode, dfsList);
           dfsLength = dfsList.size();  
          
           Dijk dObj = new Dijk();
           dCount = dObj.ShortestPath(dNodes.get(0));
           dList = dObj.dSearch(dNumNode);  
           dLength = dList.size();
       }
      
       System.out.println("Breadth First: " + result);
       System.out.println("Shortest path = " + bfsLength);
       System.out.println("Total nodes examined: " + bfsCount);          
       System.out.println("Depth First: " + result);
       System.out.println("Shortest path = " + dfsLength);
       System.out.println("Total nodes examined: " + dfsCount);          
       System.out.println("Dijkstra's Algorithm: " + result);
       System.out.println("Shortest path = " + dLength);
       System.out.println("Total nodes examined: " + dCount);
   }

   private static BFSNode findBFSNode(LinkedList<BFSNode> bfsNodes, int number)
   {
       for (int i = 0; i < bfsNodes.size(); i++)
       {
           if (bfsNodes.get(i).getData() == number)
               return bfsNodes.get(i);
       }

       return null;
   }

   private static DFSNode findDFSNode(LinkedList<DFSNode> dfsNodes, int number)
   {
       for (int i = 0; i < dfsNodes.size(); i++)
       {
           if (dfsNodes.get(i).getData() == number)
               return dfsNodes.get(i);
       }

       return null;
   }

   private static DNode findDNode(LinkedList<DNode> dNodes, int number)
   {
       for (int i = 0; i < dNodes.size(); i++)
       {
           if (dNodes.get(i).getData() == number)
               return dNodes.get(i);
       }

       return null;
   }
    
    
}
