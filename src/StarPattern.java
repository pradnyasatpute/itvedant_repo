/*
 1. 
 	X
 	XX
 	XXX
 	XXXX
 	
 	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("X");
			}
			System.out.println();
		}

	}

 
 2.
 	XXXX
 	XXX
 	XX
 	X
 	
 	for(int i=1;i<=4;i++) {
			for(int j=4;j>=i;j--) {
				System.out.print("X");
			}
			System.out.println();
		}
 	
 3.
 	X
 	XX
 	XXX
 	XXXX
 	XXX
 	XX
 	X
 	
 	for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("X");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print("X");
			}
			System.out.println();
		}
		
  4. 
       X
  	  XX
  	 XXX
  	XXXX
  	
  	for(int i=1;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print("-");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("X");
			}
			System.out.println();	
		}
		
5.
	XXXX
	 XXX
	  XX
	   X
	for(int i=1;i<=4;i++) {
			for(int j=2;j<=i;j++) {
				System.out.print("-");
			}
			for(int k=4;k>=i;k--) {
				System.out.print("X");
			}
			System.out.println();
		}



6.
   X
  XXX
 XXXXX
XXXXXXX

	
	for(int i=1;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print("-");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("X");
			}
			for(int m=2;m<=i;m++) {
				System.out.print("X");
			}
			System.out.println();	
		}
		
		
		
7.
---X
--XX
-XXX
XXXX
-XXX
--XX
---X
----

for(int i=1;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print("-");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("X");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("-");
			}
			for(int k=3;k>=i;k--) {
				System.out.print("X");
			}
			System.out.println();
		}

8.
   X 
  X X 
 X X X 
X X X X 

for(int i=1;i<=4;i++) {
			for(int j=3;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("X ");
			}
			System.out.println();
		}
		
9.Reverse Pyramid
 XXXXXXX
  XXXXX
   XXX
    X

for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--) {
				System.out.print("X");
			}
			for(int m=3;m>=i;m--) {
				System.out.print("X");
			}
			System.out.println();
		}
10. Diagonal Star Pattern
X
 X
  X
   X
    X
1st way
for(int i=1;i<=5;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int k=1;k>=1;k--) {
				System.out.print("X");
			}
			System.out.println();
		}

2nd Way
for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++)
			{
				if(i>=2 && j<=i-1) 
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("X");
				}
			}
		
			System.out.println();
		}
		
11.
----X
---X
--X
-X
X
	for(int i=1;i<=5;i++) {
			for(int j=5;j>=i+1;j--) {
				System.out.print("-");
			}
			for(int k=1;k>=1;k--) {
				System.out.print("X");
			}
			System.out.println();
		}

12.
X X X X 
X X X X 
X X X X 
X X X X 

for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print("X ");
			}
			System.out.println();
		}
		
13.
*
**
***
****

		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
14.

* * * * 
*     * 
*     * 
* * * * 


public static void main(String[] args)
	{
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) { 	
				if(i==1 || i==4 || j==1 || j==4) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
15.

   1
  212
 32123
4321234

		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				if(j<=i) {
				System.out.print(j);
				}
				else {
					System.out.print(" ");
				}
			}
			for(int k=2;k<=i;k++) {
				System.out.print(k);
			}
			System.out.println();
			
		}



 */
public class StarPattern {

	public static void main(String[] args)
	{
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("-");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
