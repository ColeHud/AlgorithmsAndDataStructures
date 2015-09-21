
public class StackTester 
{
	public static void main(String[] args)
	{
		/*
		BadStackOfStrings stack = new BadStackOfStrings(10);
		
		stack.push("Hello");
		stack.push("World");
		stack.push("Java");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		*/
		
		//resizable
		ResizableStack stack = new ResizableStack(3);
		stack.push("thing1");
		stack.push("thing2");
		stack.push("thing3");
		stack.push("thing4");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
	}
}
