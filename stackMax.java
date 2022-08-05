
import java.io.*;
import java.util.*;

public class stackMax {
    private static void getMaxElementFromStack()
    {
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> onlyMaxs = new Stack<Integer>();
        
        Scanner sc = new Scanner(System.in);
        
        int N = Integer.parseInt(sc.nextLine());
        int temp = 0;
        
        
        
        while(sc.hasNext())
        {
            String type[] = sc.nextLine().split(" ");
            switch(type[0])
            {
                case "1":
                temp = Integer.parseInt(type[1]);
                stack.push(temp);
                 if(onlyMaxs.isEmpty() || onlyMaxs.peek() <= temp)
                     onlyMaxs.push(temp);
                break;
                case "2":
                temp = stack.pop();
                if(temp == onlyMaxs.peek())
                    onlyMaxs.pop();
                break;
                case "3":
                System.out.println(onlyMaxs.peek());
            }
            N--;
        }
        
        while(N-- > 0)
            System.out.println(onlyMaxs.peek());
        
    }
    public static void main(String[] args) {
        getMaxElementFromStack();
    }
}

