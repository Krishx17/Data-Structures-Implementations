import java.util.Scanner;

public class stackX{
    private static int maxSize;
    private static long stackArray[];
    private static int top;

    public void stackX(int size){
        maxSize = size;
        top = -1;
    }

    public static void push(long j){
        if(top < maxSize){
            stackArray[++top] = j;
        }
    }

    public static long pop(){
        if(top == -1){
            return -1;
        }
        return stackArray[top--];
    }

    public long print(){
        if(top == -1){
            return 0;
        }
        return stackArray[top];
    }

    public static long maxElement(){
        long max = stackArray[0];
        for(int i = 1; i < maxSize; i++){
            if(stackArray[i] > max){
                max = stackArray[i];
            }
        }
        return max;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        push(232);
        push(843);
        push(434);
        push(12);
        push(0);
        push(238);
        long maxElement = maxElement();
        in.close();
    }
}