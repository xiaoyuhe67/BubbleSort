import java.util.Scanner;

public class BubbleSort {
	
	private static Scanner sc;

	public static void main(String[] args)
	{
		int arr[]=new int[100];
		int index=0;
		int temp=0;
		sc = new Scanner(System.in);
		System.out.println("Please input numbers: (enter -1 to stop)");
		while(1>0)
		{				
				arr[index]=sc.nextInt();
			    index=index+1;
					
			    if(arr[index-1]==-1)
			    {
			    	arr[index-1]=0;
			    	break;
			    }
			
		}
		
		
		for(int i=0;i<=index-1;i++)
		{
			for(int j=1; j<=index-2;j++)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int k=0;k<=index-2;k++)
		{
			System.out.println(arr[k]);
		}
		
		
	}

}
