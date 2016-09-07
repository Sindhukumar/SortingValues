public class SortingValues
{
	public static void main( String[] args )
	{
		int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };
		int tmp;

		// Display the original (unsorted values)
		System.out.print("before: ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();

		// Swap the values around to put them ascending order.
		for ( int i=0; i<arr.length;i++ )
		{
			for ( int j= arr.length-1;j>i ;j-- )
			{
				if (arr[j]<arr[j-1] )
				{
					tmp = arr [j];
					arr[j]=arr[j-1];
					arr[j-1]=tmp;
					
				}
			}
		}

		// Display the values again, now (hopefully) sorted.
		System.out.print("after : ");
		for ( int i=0; i<arr.length; i++ )
			System.out.print( arr[i] + " " );
		System.out.println();
	}
}