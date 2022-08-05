import javax.swing.text.DefaultStyledDocument.ElementSpec;

public class PriorityQueues{
    private int maxSize;
    private long pQArray[];
    private int numOfItem;

    public void PriorityQueues(int size){
        this.maxSize = size;
        pQArray = new long[maxSize];
        numOfItem = 0;
    }

    public void insert(long item){
        if(numOfItem == 0){   //if no item 
            pQArray[numOfItem++] = item;  //insert at 0;
        }
        else{
            int j;
            for(j = numOfItem-1; j >= 0; j--){  //start at end
                if(item > pQArray[j]){   //if item is greater than array element
                    pQArray[j+1] = pQArray[j];  //shift array element upwards to make room for the item
                }
                else{
                    break;
                }
            }pQArray[j+1] = item;
            numOfItem++;
        }
    }

    public long remove(){
        if(numOfItem != 0){
            return pQArray[--numOfItem];
        }
        return -1;
    }

    public long peek(){
        if(numOfItem != 0){
            return pQArray[numOfItem-1];
        }
        return -1;
    }

    public boolean isEmpty(){
        return (numOfItem == 0);
    }

    public boolean isFull(){
        return (numOfItem == maxSize);
    }
}

class runPriorityQ{
    public static void main(String[] args){
        PriorityQueues user = new PriorityQueues();
        user.PriorityQueues(5);
        user.insert(30);
        user.insert(50);
        user.insert(10);
        user.insert(40);
        user.insert(20);

        while(!user.isEmpty()){
            long item = user.remove();
            System.out.print(item+" ");
        }
        }
}
