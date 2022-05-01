public class Stack {
    int[] stck = new int[10];
    int top_of_stack;

    //Intialize the top of the stack with a constructor
    Stack()
    {
        top_of_stack = -1;
    }

    //push an item into the stack
    void push(int item)
    {
        if(top_of_stack == 9)
            System.out.println("The stack is full");
        else
            stck[++top_of_stack] = item;
    }

    //pop an item from the stack
    int pop()
    {
        if(top_of_stack<0)
        {
            System.out.println("Stack underflow");
            return  0;
        }
        else
            return stck[top_of_stack--];
    }
}

class TestStack{
    public static void main(String[] args)
    {
        Stack new_stack = new Stack();

        //push some numbers onto the stack
        for (int i =0; i<10; i++) new_stack.push(i);

        //pop these numbers off the stack
        for(int i = 0; i<10; i++)
            System.out.println(new_stack.pop());
    }
}
