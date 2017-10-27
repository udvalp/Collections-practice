import java.util.Arrays;

public class arrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] test1 = {3,4,5};
		int abc = test1.hashCode();
		String new1 = test1.toString();
		for(int test2: test1) {
			
			System.out.println(test2);
			System.out.println(abc);
			System.out.println(Arrays.toString(test1));
		}
	}

}
