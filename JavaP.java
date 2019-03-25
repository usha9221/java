public class Amstrongs {

	public static void main(String[] args) 
	{
		int num = 123;
		int temp = num;
		int sum = 0;
		int res = 0;
		int count = 0;
		while (num > 0)
		{

			res = num % 10;
			count = res * res * res;
			sum = sum + count;
			num = num / 10;

		}
		if (sum == temp)

			System.out.println("is  an amstrong");
		else
			System.out.println("not an amstrong");
	}
