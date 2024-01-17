import java.util.*;

public class Y_30_Questions {

    //Question 1
    // we have to add an element at the bottom of the stack, which we 
    //can not do directly so first delete all the elemnts than add the 
    //elements
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
int top= s.pop();
pushAtBottom(data, s);
s.push(top);
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top= s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }
    public static void main(String[] args) {
        
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        


        //
        reverse(s);
        // pushAtBottom(4,s);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

    //Question 2
    //we are reversing the elements
    // here we do not reverse all the elements but we reverse the n-1 element

}
