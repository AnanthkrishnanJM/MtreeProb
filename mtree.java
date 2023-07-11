package mangotree;

import java.util.Scanner;

public class mtree {

	public static void main(String[] args) {

		Scanner a=new Scanner(System.in);
		int x=a.nextInt();
		int y=a.nextInt();
		int n=a.nextInt();
		
		
		if(n<=x) {
			System.out.println("true");
			}
			else if((n-1)%10==0) {
				System.out.println("true");
				}
				else if(n%10==0) {
					System.out.println("true");
				}else {
					System.out.println("false");

	}

	}
}
