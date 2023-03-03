package For_loop;

public class Nested_forLoop 
{
//find duplicate by using nested for loop
	public static void main(String[] args)
	{
		int [] arr = {1,2,5,6,8,2,6,9,4,3, 7, 9, 4,5,8};
		
		          //j{1,2,5,6,8,2,6,9,4,3, 7, 9, 4};
		//			  0 1 2 3 4 5 6 7 8 9  10  11  12
		for(int i=0;i<arr.length;i++)// row
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]== arr[j])
				{
					System.out.println(arr[i]);
				}
				
			}
		}
		
	}

}
