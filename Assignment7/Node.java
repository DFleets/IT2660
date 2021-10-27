/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trees;

/**
 *
 * @Dorrell Fleets
 */
public class Node {
    
    Node leftChild, rightChild;
    String name;
    int key;
    double gpa;

    public Node(int Key, String Name, double GPA)    {
        key = Key;
        name = Name;
        gpa = GPA;
    }
}
    

