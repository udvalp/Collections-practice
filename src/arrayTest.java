import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] test1 = {3,4,5};
		int abc = test1.hashCode();
		String new1 = test1.toString();
		ArrayList<int[]> AL = (ArrayList<int[]>) Arrays.asList(test1);
		for(int test2: test1) {
			
			System.out.println(test2);
			System.out.println(abc);
			System.out.println("nuetral");



		}
	}

}
