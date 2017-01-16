
public class BubleSort1 {

	public static void main(String[] args) {
		int[] a1 = new int[]{5,9,7,2,4,1,8,3};
		
		int[] a2 = a1.clone();
		for(int i= 0; i < a2.length;i++){
			for(int j=0;j < a2.length-1;j++){
				if(a2[j] > a2[j+1]){
					int temp = a2[j];
					a2[j] = a2[j+1];
					a2[j+1] = temp;
				}
			}
		}
		
		//Original list
		for(int a : a1)
			System.out.print(a);
		
		System.out.println("");
		
		//Ordered list
		for(int b : a2)
			System.out.print(b);
	}

}
