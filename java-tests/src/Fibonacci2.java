import java.util.Scanner;

//Fibonacci sequence 0 1 1 2 3 5 8 13 21 34 55
public class Fibonacci2 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Long number = s.nextLong();
		
		int index =0;
		while(true){
			
			Long fibonacci = fibonacci(index);
			System.out.println(fibonacci);
			
			if(fibonacci.compareTo(number) == 0){
				System.out.println("It's a fibo number");
				break;
			}else if(fibonacci.compareTo(number) > 0){
				System.out.println("It's NOT a fibo number");
				break;
			}
			
			index++;
		}
	}

	static long fibonacci(int index){
		if(index==0)return 0;
		if(index <=2) return 1;
		
		return fibonacci(index-1)+ fibonacci(index-2);
	}
}
