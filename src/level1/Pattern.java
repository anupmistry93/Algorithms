package level1;

public class Pattern {

	private void pattern1(int n) {
		
		for(int i=1; i<=n; i++) {
			
			int j =i;
			while(j!=0)
			{
			System.out.print(i);
			j--;
			}
			
			System.out.println("");		
		}		
	}	

	private void pattern2(int n) {
		System.out.println("");
	
	for(int i=n; i>0; i--) {
		
		int j =i;
		while(j!=0)
		{
		System.out.print(i);
		j--;
		}
		System.out.println("");		
	}			
}
		
	private void pattern3(int n) {
	
		for(int i =1; i<=n; i++) {
			 int j=i;
			 
			while(j<n) {System.out.print(" "); j++;}
			
			int k= 2*i-1;
			int p=1;
			while(p<=k)
			{	
				System.out.print(i);
				p++;	
			}
			
			System.out.println("");				
		}	
	}
		
	private void pattern4(int n) {
		System.out.println("");
		
		int p= n;
		while(p>0) {
			
		int k=2*p-1;
		while(k>0)
		{
			System.out.print(p);
			k--;	
		 }
				
		System.out.println("");		
		p--;
		
		for(int i=p; i<n; i++) {
			System.out.print(" ");
		}	
	  }		
	}

	
	private void pattern5(int n) {
		System.out.println("");
		
		int t=n;		
		for(int i=1; i<=n; i++) {			
			int p=i;
				
			while(p<=n) {
				System.out.print(t);
				p++;			
			}
			
			System.out.println("");
			
			t--;
			int s=t;
			while(s!=n) {System.out.print(" "); s++;}
			
		}
		
	}
	
	
	private void pattern6(int n) {
		System.out.println("");
		
		for(int i=1; i<=n; i++) {
			
			for(int j=i ; j<n ;j++) {
				System.out.print(" ");
			}
			
			int k=n-i;
			while(k<n) {
			System.out.print(i);
			 k++;
			}
			System.out.println("");
			
			
			
			
		}
		
	}
	
	
public static void main(String[] args) {
	
	
	Pattern obj = new Pattern();
	int n =9;
	
	obj.pattern1(n);
	
	obj.pattern2(n);
	
	obj.pattern3(n);
	
	obj.pattern4(n);
	
	obj.pattern5(n);
	
	obj.pattern6(n);

	
		
		}

}
