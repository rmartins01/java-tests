
public class Fibonacci1 {

	public static void main(String[] args) {
		long index = 0;
		while(true){
			System.out.println(fibonacci(index));
			index++;
		}
	}

	public static long fibonacci(long index){
		
		if(index == 0) return 0;
		if(index <= 2) return 1;
		
		long temp = fibonacci(index-1) + fibonacci(index-2);
		return temp;
	}
}
