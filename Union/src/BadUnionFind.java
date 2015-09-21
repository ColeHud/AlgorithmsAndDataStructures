
public class BadUnionFind 
{
	public int[] data;
	
	public static void main(String[] args)
	{
		BadUnionFind union = new BadUnionFind(10);
		union.union(1, 2);
		union.printData();
		
		union.union(9, 2);
		union.printData();
		
		union.union(0, 4);
		union.printData();
		
		union.union(4, 9);
		union.printData();
		
		System.out.println(union.isConnected(0, 9));
		System.out.println(union.isConnected(5, 9));
		System.out.println("This has been a semi-successful union-sort");
	}
	
	BadUnionFind(int n)
	{
		initData(n);
	}
	
	public void initData(int n)
	{
		data = new int[n];
		for(int i = 0; i < n; i++)
		{
			data[i] = i;
		}
	}
	
	public void union(int i, int j)
	{
		int iVal = data[i];
		int jVal = data[j];
		for(int p = 0; p < data.length; p++)
		{
			if(data[p] == iVal)
			{
				data[p] = jVal;
			}
		}
	}
	
	public void printData()
	{
		for(int i = 0; i < data.length; i++)
		{
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
	
	public boolean isConnected(int i, int j)
	{
		int iVal = data[i];
		int jVal = data[j];
		
		if(iVal == jVal)
		{
			return true;
		}
		return false;
	}
}
