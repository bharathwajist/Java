import java.util.Scanner;

class Perfect{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		boolean f = true;
		do{
			System.out.print("Enter a number to check : ");
			int num = sc.nextInt();
			int sum = 0;
			for(int i = 1; i < 28; i++){
				if(num%i == 0){
					// System.out.println("When the value of i become : "+i);
					sum+=i;
					// System.out.println("Sum value is incremented  : "+sum);
				}
			}
			if(num == sum){
				System.out.println("this is perfect number");
			}else{
				System.out.println("This is not perfect number");
			}
			System.out.println("Do you want to check again?");
			System.out.println("Enter 1.yes or 2.no");
			n=sc.nextInt();
			if(n == 1){
				f = true;
			}else{
				System.out.println("------Thank you------");
				f = false;
			}
		}while(f);
		sc.close();
	}
}