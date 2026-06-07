package Day06.StackAssignment;

import java.util.Stack;

public class Collections_Practice {
    public static void main(String[] args) {
//-----------------------------------------------------------------------------------------------------------------
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);


        printStack(stack);
        stackPop(stack);
        printStack(stack);
        stackPeek(stack);
        printStack(stack);

    }

//-----------------------------------------------------------------------------------------------------------------
    public static void stackPop(Stack<Integer> stack ){
          System.out.println("Stack pop: " + stack.pop());
    }

//-----------------------------------------------------------------------------------------------------------------

    public static void printStack(Stack<Integer> stack){
            System.out.println("Current stack: ");
            for(int el : stack){
                System.out.print(el + " ");
            }
        System.out.println();
    }

//-----------------------------------------------------------------------------------------------------------------

    public static void stackPeek(Stack<Integer> stack){
        System.out.println("First stack item is: " + stack.peek());
    }

//-----------------------------------------------------------------------------------------------------------------
}
