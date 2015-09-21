
public class BadStackOfStrings 
{
	public String[] s;
	public int N = 0;
	
	BadStackOfStrings(int capacity)
	{
		s = new String[capacity];
	}
	
	public boolean isEmpty()
	{
		return (N == 0);
	}
	
	public void push(String l)
	{
		s[N++] = l;
	}
	
	
	public String pop()
	{
		return s[--N];
	}

}
