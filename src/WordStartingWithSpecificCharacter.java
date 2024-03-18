
public class WordStartingWithSpecificCharacter {

	public static void main(String[] args) {
		
		String s= "A Red Seed";
		String w="";
		s+=' ';
		for(int i=0;i<=s.length()-1;i++) {
			char c=s.charAt(i);
			if(c!=' ') {
				w=w+c;
			}
			else {
				
				if(w.startsWith("R")) {
					System.out.println(w);
				}
				w="";
			}
			
		}

	}

}
