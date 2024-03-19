import java.util.Arrays;
import java.util.List;

public class FirstLetterAsUpperCaseandSort {
	
	public static void main(String[] args) {
		List<String> name=Arrays.asList("Anoop","Pooja","Asha","Ankita","Bob");
		name.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
	}

}
