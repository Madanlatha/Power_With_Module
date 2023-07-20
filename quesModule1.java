package powerwithModule;

import java.util.Scanner;

public class quesModule1 {
	public static int powermodules(int a,int b,int c) {
		int result=1;
		for(int i=1;i<=b;i++) {
			a=a%c;{
				result=((result*a)%c);
			}
		}
		return result;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int value=powermodules(a,b,c);
		System.out.println(value);
	}

}
