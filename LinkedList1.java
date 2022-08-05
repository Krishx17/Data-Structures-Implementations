class Link{
    public int iData;
    public double dData;
    public Link next;   //self referential type class definition

    //constructor
    public Link(int id, double dd){
        this.dData = dd;
        this.iData = id;
        next = null;
    }
    
    //display node method 
    public void displayLink(){
        System.out.println("{"+iData+","+dData+"}");
    }
}

public class LinkedList1{
     private Link first;   //maintains and refers to first link on the list

     //constructor
     public LinkedList1(){
         first = null;  //list is empty;
     }

     public void insert(int id, double dd){
         Link newLink = new Link(id,dd);
         newLink.next = first;   //newLink.next points to old first Link
         first = newLink; //first refers to new Link
     }

     public boolean isEmpty(){
         return(first == null);
     }

     public Link delete(){
         Link temp = first;
         first = first.next;
         return temp;
     }

     public void displayList(){
         System.out.println("List : ");
         Link current = first;
         while(current != null){
             current.displayLink();
             current = current.next;
         }
         System.out.println("");
    }
}

class LinkListApp{
    public static void main(String[] args){
        LinkedList1 theList = new LinkedList1();
        theList.insert(22, 2.99);
        theList.insert(44, 4.99);
        theList.insert(66, 6.99);
        theList.insert(88, 8.99);

        theList.displayList();

        while(!theList.isEmpty()){
            Link aLink = theList.delete();
            System.out.print("Deleted ");
            aLink.displayLink();
            System.out.println("");
        }

        theList.displayList();
    }
}
