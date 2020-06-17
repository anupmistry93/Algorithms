package level1;

public class FirstBadVersion278 {

	
	/*/////////////////////SOLUTION 1 //////////////////////////////////////////
	 
	 Note: if the pattern forms like 0000000001111111111 and we have to find first '1' in the sequence 
	 then use FirstBadVersion algorithm
	 Note: if the pattern forms like 00000000012222222222 and we have to find  '1' in the sequence 
	 then use GuessNumberHigherLower algorithm
	 
	     public int firstBadVersion(int n) {
        
       int first =1;
        int last = n;
        
        while(last>first){
                 int mid = last + (last-first)/2;
                
                   
                
                 if(isBadVersion(mid)){
                        
                     last =mid;
                     
                    }
            
               else{ first = mid+1;}
        }
        return first;
    }


	////////////////////////////solution 2///////////////////////////////
	
    
     public int firstBadVersion(int n) {
        
    public int firstBadVersion(int n) {
        int i=1;
        for(i =1; i<n; i++){
            
            if( isBadVersion(i)){
                
                break;
            }
            
        }
        return i;
    }
    
     */
	
}
