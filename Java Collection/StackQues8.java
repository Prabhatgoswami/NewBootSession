import java.util.Stack;

public class StackQues8 extends Stack<Integer> {
    Stack<Integer> stack=new Stack<Integer>();

    public void push(int element)
    {
        if(isEmpty()==true)
        {
            super.push(element);
            stack.push(element);

        }
        else
        {
            super.push(element);
            int y=stack.pop();
            stack.push(y);
            if(element<y)
            {
                stack.push(element);
            }
            else
            {
                stack.push(y);
            }
        }


    }

    public Integer pop()
    {
        int x=super.pop();
        stack.pop();
        return x;
    }

    public Integer getMin()
    {
        int x=stack.peek();
        return x;
    }

    public static void main(String[] args) {

        StackQues8 specialstack= new StackQues8();
        specialstack.push(80);
        specialstack.push(30);
        specialstack.push(40);
        specialstack.push(10);
        specialstack.push(100);

        System.out.println("Elements in the Stack "+specialstack);

        System.out.println("Minimum Element : "+specialstack.getMin());
        System.out.println("Element popped "+specialstack.pop());
        //specialstack.pop();
        System.out.println("Element popped "+specialstack.pop());
        //specialstack.pop();
        System.out.println("Stack After Pop"+specialstack);
        System.out.println("Minimum Element after pop : "+specialstack.getMin());
    }
}
