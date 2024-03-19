import java.util.ArrayList;

public class StreamPrintNameGreaterThan4 {

	public static void main(String[] args) {
		ArrayList<String> name= new ArrayList<>();
		name.add("Anoop");
		name.add("Pooja");
		name.add("Asha");
		name.add("Ankita");
		name.add("Bob");
		
		name.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		//limit the number of name to 2 names
		
		name.stream().filter(s->s.length()>4).limit(2).forEach(s->System.out.println("Limit the number of name to 2"+s));

	}

}
