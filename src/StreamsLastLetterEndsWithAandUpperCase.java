import java.util.stream.Stream;

public class StreamsLastLetterEndsWithAandUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.of("Anoop","Pooja","Asha","Ankita","Bob").filter(s->s.endsWith("a")).limit(2)
		.map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	}

}
