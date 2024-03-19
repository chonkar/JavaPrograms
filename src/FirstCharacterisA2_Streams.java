import java.util.ArrayList;
import java.util.stream.Stream;

public class FirstCharacterisA2_Streams {

	public static void main(String[] args) {
		ArrayList<String> name= new ArrayList<>();
		name.add("Anoop");
		name.add("Pooja");
		name.add("Asha");
		name.add("Ankita");
		name.add("Bob");
		int count=0;
		
		for(int i=0;i<=name.size()-1;i++) {
			String actualName=name.get(i);
			
			if(actualName.startsWith("A")) {
				count++;
			}
		}
		 
		System.out.println(count);
		
		Stream.of("Anoop","Pooja","Asha","Ankita","Bob").filter(s->s.startsWith("A")).count();

		long d=Stream.of("Anoop","Pooja","Asha","Ankita","Bob").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		
		System.out.println(d);
	}
	


}
