import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practice {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

	@SuppressWarnings("unchecked")
	HashMap<String, HashMap> studyNumberHM = new HashMap();
	studyNumberHM.put("17-5001", new HashMap());
	studyNumberHM.put("17-5002", new HashMap());
	int i = 1;
	for(Map.Entry<String,HashMap> studyNumbers: studyNumberHM.entrySet()) {
		studyNumberHM.get(studyNumbers.getKey()).put(++i,new HashMap<String,String>());
		studyNumberHM.get(studyNumbers.getKey()).put(++i,new HashMap<String,String>());
	}
	ArrayList<Integer> testArticle = new ArrayList();
	for(String studyNumbers: studyNumberHM.keySet()) {
		System.out.println(studyNumberHM.get(studyNumbers).keySet());
		Set<Integer> abc = studyNumberHM.get(studyNumbers).keySet();
		for(Integer abc1: abc) {
			
			testArticle.add(abc1);
		}
		
		/*
		Set<String> abc = ((HashMap<String, HashMap>) studyNumbers).keySet();
		for(String testArticleName: abc) {
			System.out.println(testArticleName);
			
		}		
		*/
		//System.out.println(studyNumbers.getValue());
	}
	System.out.println(studyNumberHM);
	for(Integer testArticleNumber: testArticle) {
		
		System.out.println(testArticleNumber);
		for(String studyNumbers: studyNumberHM.keySet()) {
			
			if(studyNumberHM.get(studyNumbers).containsKey(testArticleNumber)) {
					System.out.println(studyNumbers+testArticleNumber);
				HashMap<Integer,HashMap> hm1 = (HashMap<Integer,HashMap>) studyNumberHM.get(studyNumbers);
				HashMap<String,String> hm2 =  hm1.get(testArticleNumber);
				System.out.println(hm2);
				hm2.put("Negative Contrl","100");
				hm2.put("Positive Contrl","200");
				hm2.put("Conc","100");
			}
				//((HashMap<String, String>) studyNumberHM.get(studyNumbers).get(testArticleNumber)).put("Negative Contrl","100");
				//((HashMap<String, String>) studyNumberHM.get(studyNumbers).get(testArticleNumber)).put("Conc","100");
			
		
	}
		
	}		
		
		System.out.println(studyNumberHM);
	
	
	/*	
		
				
		System.out.println("Hello World");
		
		ArrayList <String> a=new ArrayList();
				a.add("Hello");
				a.add("Bellow");
				a.add("Challow");
				
				
				for(String abc:a) {
					System.out.println(abc);
				}
				
				
		HashMap hMap = new HashMap();
		hMap.put(10,new HashMap());
		hMap.put(30,"Random Value");
		((HashMap) hMap.get(10)).put(a.get(0),new HashMap());
		
		((HashMap) ((HashMap) hMap.get(10)).get("Hello")).put("Key","Value");
		
		int[] a1 = {1,2,3,4};
		String printbuf= new String();
		printbuf = a1.toString();
		for(int a123:a1) {
			
			System.out.println(a123);
		}
		System.out.println(printbuf+a1);
		for (int i = 0; i < a1.length/2;i++) {
			
			int other = a1.length- i - 1;
			int temp = a1[i];
			a1[i] = a1[other];
			a1[other] = temp;
		
		}
for(int a123:a1) {
			
			System.out.println(a123);
		}
		
		System.out.println(a1.toString());
		
		System.out.println(hMap.entrySet());
		
		
		
		String S = "hERG Automated Patch Clamp";
		  String A= "hERG Automated Patch Clamp";
	        String B = "";
	        for(int i = (A.length()-1); i++ ; (-1)<i){
	            B+=A.charAt(i);
	            
	        } */
		
	}

}
