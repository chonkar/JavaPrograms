
public class firstCharacterOfEachWord {

	public static void main(String[] args) {
		String sen= "I am in the box ";
		String word=" ";
		//sen+=" ";
		for(int i=0; i<=sen.length()-1;i++) {
			char cha= sen.charAt(i);
			if(cha!= ' ') {
				word= word+cha;
				//System.out.println(word);
			}
			
			else {
				System.out.println(word.charAt(0));
				word= "";
			}
		}

	}

}
