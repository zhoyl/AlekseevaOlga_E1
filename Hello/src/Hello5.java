import java.util.Scanner;

public class Hello5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Введите значение n: ");
		int num = in.nextInt();
		int x=1;
		
		for(int i =1; i<=num;i++)
		{
			x=2*x;
		}
		in.close();
		System.out.println("Полученное значение 2^n: ");
		System.out.println(x);
	   
		
	}

}
