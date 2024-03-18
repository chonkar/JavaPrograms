import java.util.ArrayList;

public class FirstCharacterisA {

	public static void main(String[] args) {
		ArrayList<String> name= new ArrayList<>();
		name.add("Anoop");
		name.add("Pooja");
		name.add("Asha");
		name.add("Ankita");
		name.add("Bob");
		
		Long namecount=name.stream().filter(s->s.startsWith("A")).count();
		System.out.println(namecount);
		

	}

}
