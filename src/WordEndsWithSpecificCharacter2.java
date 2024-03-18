
public class WordEndsWithSpecificCharacter2 {

	public static void main(String[] args) {
		
		String s= "A RED SEED";
		String w="";
		s+=' ';
		for(int i=0;i<=s.length()-1;i++) {
			char c=s.charAt(i);
			if(c!=' ') {
				w=w+c;
			}
			else {
				
				if(w.endsWith("ED")) {
					System.out.println(w);
				}
				w="";
			}
			
		}

	}

}
