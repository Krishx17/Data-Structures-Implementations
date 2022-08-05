import java.util.*;
import java.io.*;

class Solution{
    public static void main(String[] args){
        LinkedList newList = new LinkedList();
        Scanner in = new Scanner(System.in);
        int numOfInputs = in.nextInt();
        for(int i = 0; i < numOfInputs; i++){
            newList.insert(in.nextInt());
        }
        newList.displayList();        
        in.close();
    }
}

class Node{
    private int iData;
    private double dData;
    public Node next;
    
    public Node(int intNum){
        this.iData = intNum;
        next = null;
    }
    
    public void displayNode(){
        System.out.println(iData);
    }
}

public class LinkedList{
    public Node first;
    
    public void LinkedList(){
        first = null; 
    }
    
    public void insert(int iData){
        Node newNode = new Node(iData);
        newNode.next = first;
        first = newNode;
    }
    
    public boolean isEmpty(){
        return (first == null);
    }
    
    public void displayList(){
        Node current = first;
        while(current!=null){
            current.displayNode();
            current = current.next;
        }
    }
}