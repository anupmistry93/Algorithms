package level1;

public class GuessNumberHigherLower374 {

	/*///////////////////////////Solution 1//////////////////////////////
	 
	 	 Note: if the pattern forms like 0000000001111111111 and we have to find first '1' in the sequence 
	 then use FirstBadVersion algorithm
	 Note: if the pattern forms like 00000000012222222222 and we have to find  '1' in the sequence 
	 then use GuessNumberHigherLower algorithm.s
	 
	 
	     public int guessNumber(int n) {
        
        int i=1;
        for( i =1; i<=n;i++){
            
            if(guess(i)==0) break;
            
        }
        return i;
        
    }
    
  ////////////////////////////Solution 2///////////////////////////////////
   
   
   
	     public int guessNumber(int n) {
        
        int low =1;
        int high =n;
        int mid =1;
        
        while(low<=high){
            
            mid= low + (high-low)/2;
            
            if(guess(mid)==-1) high =mid;
            
            else if(guess(mid)==1) low =mid+1;
            
            else break;       
        }
        
       return mid; 
        
        
    }
	 
	 */
	
	
	
	
	
	
	
	
	
	
}
