
public class firstTwoCharacterOfEachWord {

	public static void main(String[] args) {
		
		String s= "In the Box";
		String w="";
		s+=' ';
		for(int i=0;i<=s.length()-1;i++) {
			char c=s.charAt(i);
			if(c!=' ') {
				w=w+c;
			}
			else {
				
				System.out.println(w.substring(0,2));
				w="";
			}
			
		}

	}

}
