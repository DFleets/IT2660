/*IT2660
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @Dorrell Fleets
 */
public class LinkedList{
    
    private Node head;
    private int listCount;
   
    
    public LinkedList(){
        
        head = new Node(null);
        
        listCount = 0;
    
    }
    
    public void add(Object data){
        
        Node Temp = new Node(data);
        Node Current = head;
        
        while (Current.getNext() != null){
        Current = Current.getNext();
        
        }
        
        Current.setNext(Temp);
        listCount++;
        
    }
    
    public void add(Object data, int index){
        
        Node Temp = new Node(data);
        Node Current = head;
        
        for (int i = 1; i < index && Current.getNext() != null; i++){
            
        Current = Current.getNext();
        
        }
        
        Temp.setNext(Current.getNext());
        Current.setNext(Temp);
        listCount++;
    }
    
    @SuppressWarnings("SuspiciousIndentAfterControlStatement")
    public Object get(int index){
        
        if (index <= 0)
        return null;
        
        Node Current = head.getNext();
        for (int i = 1; i < index; i++){
        
        if (Current.getNext() == null)
        return null;

        Current = Current.getNext();
        
        }
        
        
        return Current.getData();
    }    
    
    @SuppressWarnings("SuspiciousIndentAfterControlStatement")
    public boolean delete(int index){
    
        if (index < 1 || index > size())
            
        return false;
        
        Node Current = head;
        for (int i = 1; i < index; i++){
            
        if (Current.getNext() == null)
        return false;
        
        Current = Current.getNext(); 
        
        }
        
        Current.setNext(Current.getNext().getNext());
        listCount--; 
        
         System.out.println("-Object deleted-");
        return true;
                
    }   
    
    public int size(){
        
        return listCount;
    
    }
    
    @Override
        public String toString(){
        
        Node Current = head.getNext();
        String output = "";
        
        while (Current!= null){
        
        output+="["+ Current.getData().toString() +"]";
        Current = Current.getNext();
            
        }
        return output;
               
    }
        
        private class Node{
        
        Node next;
        Object data;
        
        public Node(Object dataValue) {
        
        next = null;
        data = dataValue;
        
        }
        
        
         public Node(Object dataValue, Node nextValue){
        
        next = nextValue;
        data = dataValue;
                          
        }
         public Object getData(){
        
        return data;
            
        }
         
         public void setData(Object dataValue){
         
         data = dataValue;
         
        }
         
         public Node getNext(){
         
         return next;
         
         }
         
         public void setNext(Node nextValue){
         
         next = nextValue;
             
        }           
                  
     }
        
         @SuppressWarnings("NonPublicExported")
        public void insertAt(Node preNode,Object New_data){
        
        if (preNode == null){
            
            System.out.println("Previous node cant be null");
            
            return;
        }
                
        Node NewNode = new Node (New_data);
        
        NewNode.next = preNode;
        
        this.head = NewNode;
            
        }
        
         public void append(Object New_data){
           
           Node NewNode = new Node (New_data);
           
           if(head == null){
               
               head = new Node(New_data);
               
               return;
               
           }
           
           NewNode.next = null;
           
           Node last = head;
           
           while (last.next != null)
               
               last = last.next;
           
           last.next = NewNode;
          
          
           
        }   
    
        
 
       
             
    public static void main(String [] args) {
        // TODO code application logic here
        LinkedList Links = new LinkedList();       
        Links.add("A");       
        Links.add("E");                    
        Links.add("I");
        Links.add("O");
        Links.add("U");
        Links.append("Sometimes");        
        Links.add("Y");          
       System.out.println("Linked List: " + Links);
       System.out.println("Linked list size: " + Links.size());
       System.out.println("Get 4th object: " + Links.get(4));
       System.out.println("deleted 6th object? " + Links.delete(6));
       System.out.println("Get 7th object: " + Links.get(6));
       System.out.println("Linked List: " + Links);
       System.out.println("Linked list size: " + Links.size());   
    }    
          
}
