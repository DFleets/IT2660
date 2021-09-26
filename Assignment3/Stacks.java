/*IT@660
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacks;

/**
 *
 * @Dorrell Fleets
 */
public class Stacks {
    
    private int top;
    private int size;
    private int[] array;
    
    
     public Stacks(int cap) {
        size = cap;
        array = new int[size];
        top = -1;
    }

     
      public void push(int data) {
        if (isFull()){
            expandArray();      
        }
        array[++top] = data;   
    }
      
      public void expandArray() {
        int curr_size = top + 1;
        int[] new_array = new int[curr_size * 2];
        System.arraycopy(array, 0, new_array, 0, curr_size);
        array = new_array;              
        size = new_array.length;
    }
      
      public boolean isFull() {
        if (size == top+1)
            return true;
        else
            return false;
    }
      
      public int pop() {
        if (isEmpty()) {
            System.out.println("Empty");
            return -1;
        } else {
            reduceSize();                
            return array[top--];
        }
    }

    public void reduceSize() {
        int curr_length = top+1;
        if (curr_length < size / 2) {
            int[] new_array = new int[size / 2];
            System.arraycopy(array, 0, new_array, 0, new_array.length);
            array = new_array;
            size = new_array.length;
        }
    }

    public boolean isEmpty() {
        if (top == -1)
            return true;
        else
            return false;
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(array[i] + "=>");
        }
        System.out.println();
        System.out.println("Stack Size:" + array.length);
    }



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Stacks plates = new Stacks(2);
        System.out.println("Pushed");
        plates.push(2);
        plates.push(3);
        plates.push(3);
        plates.display();       
        plates.push(6);
        plates.push(7);
        plates.push(9);
        plates.push(10);
        plates.display();
        System.out.println("Popped");
        plates.pop();
        plates.pop();
        plates.pop();
        plates.display();
        System.out.println("Popped");
        plates.pop();
        plates.pop();
        plates.pop();
        plates.pop();
        plates.pop();
        plates.display();

    }
}
