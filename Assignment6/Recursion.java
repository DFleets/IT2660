/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;


import java.util.Random;
/**
 *
 * @Dorrell Fleets
 */
public class Recursion {

    
    public static void fill(int array[]){
        
        Random num =  new Random();
        for (int i= 0;i<array.length;i++)
            array[i]= num.nextInt();  
   }     
    
    public static void display(int arr[]){
        System.out.println("The number sets are:");
        for (int i =0;i<arr.length;i++)
            System.out.print(arr[i] + "\t");
        System.out.println();      
    }
    
    public static void merge(int data[],int low,int mid, int high){
        int first = mid;
        int second = mid + 1;
        int l = low;
        while ((l<=first) && (second <= high))  {
            if (data[low] < data[second])
                low++;
            else {
                int temp = data[second];
                for (int j = second - 1; j>= low; j--)
                    data[j+1] = data[j];
                data[low] = temp;
                low++;
                first++;
                second++;
            }
        }
    }
    
    public static void mergeSort(int data[],int low,int high){
        if (low >= high)
            return;
        int mid = (low+high)/2;
       
        mergeSort(data,low,mid);
        
        mergeSort(data,1+mid,high);
        
        merge(data,low,mid,high);
    }
   
   
    public static void main(String[] args) {
        // TODO code application logic here
         int [] data = new int[100];
        
        fill(data);
        
        display(data);
        
        mergeSort(data,0,99);
       
        display(data);
        
        
    }
    
}
