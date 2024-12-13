package loops;
//WAP to print prime numbers between 1 to 50. 
public class Prime1_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		for(int i=1;i<=50;i++) {
			count=0;
			for(int j=1;j<=i;j++) {
				if(i%j ==0) {
					count+=1;
				}
				
			}
			if(count==2) {
				System.out.println(i);
			}
			
		}
		
		
	}

}
