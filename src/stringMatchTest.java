
public class stringMatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean ret = new Solution().isMatch("HI*H","HIIIIIIIIH");
		System.out.println(ret);

	}
	

}

	class Solution {
	    public boolean isMatch(String s, String p) {
	        if(s.length()!=p.length())return false;
	        for(int i=0;i<p.length();i++){
	            
	            if(i>0){
	            if(s.charAt(i)=="*".charAt(0)) {
	            	int c=i;
	            	while(i<s.length()-1&&s.charAt(c)==s.charAt(i))
	            		System.out.println("Number of Is"+i);
	            		++i;
	            	
	            }
	            if(p.charAt(i)=="*".charAt(0))p=p.substring(0,i)+p.charAt(i-1)+p.substring(i);
	            }
	            if(s.charAt(i)==".".charAt(0)|p.charAt(i)==".".charAt(0)) continue;
	            
	            if(s.charAt(i)==p.charAt(i))continue;
	            return false;
	        }
	        return true;
	    }
	}