package arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] a= {38,52,9,18,6,62,13};
		int temp=0;
		int min;
		
		for(int i=0;i<a.length;i++) {
			min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		
		for(int i:a) {
			System.out.print(i+" ");
		}
		
		
		
		//for String
		
		
		String[] name= {"deepak","ABC","xyz","Pradnya"};
		
		int minS;
		String temp1="";
		
		for(int i=0;i<name.length;i++) {
			minS=i;
			for(int j=i+1;i<name.length;j++) {
				
				if(name[j].compareTo(name[minS])<0) {
					minS=j;
				}
			}
			temp1=name[i];
			name[i]=name[minS];
			name[minS]=temp1;
		}
		
		for(String k :name) {
			System.out.print(k+" ");
		}

	}

}
