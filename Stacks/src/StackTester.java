
public class StackTester 
{
	public static void main(String[] args)
	{
		BadStackOfStrings stack = new BadStackOfStrings(10);
		
		stack.push("Hello");
		stack.push("World");
		stack.push("Java");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
