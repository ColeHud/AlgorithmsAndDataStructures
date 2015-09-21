
public class ResizableStack 
{
	public String[] s;
	public int N = 0;
	
	ResizableStack(int capacity)
	{
		s = new String[capacity];
	}
	
	//check if empty
	public boolean isEmpty()
	{
		return (N == 0);
	}
	
	//push
	public void push(String l)
	{
		//resize the array if there isn't enough room
		if(N==s.length)
		{
			resize(2 * s.length);
		}
		
		s[N++] = l;
	}
	
	//pop
	public String pop()
	{
		String item = s[--N];
		s[N] = null;
		return item;
	}
	
	//resize
	private void resize(int capacity)
	{
		String[] copy = new String[capacity];
		
		//copy elements from s to copy
		for(int i = 0; i < s.length; i++)
		{
			copy[i] = s[i];
		}
		s = copy;
	}
}
