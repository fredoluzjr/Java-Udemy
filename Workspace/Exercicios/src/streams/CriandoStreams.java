package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println; // outro print para os inteiros
		
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n"); // Stream.of para criar uma stream -> passando os valores literais
		langs.forEach(print);
		
		String[] maisLangs = {"Python ", "Lisp ", "Perl ", "Go\n"};
		
		Stream.of(maisLangs).forEach(print); // Stream.of(array) -> passando um array
		Arrays.stream(maisLangs).forEach(print); // Arrays.Stream ->  passar o array inteiro para ele criar um stream
		
		Arrays.stream(maisLangs, 1, 3).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print); // Stream paralelo -> os dados não são processados na ordem
		
		// Stream.generate(() -> "a").forEach(print); // generate -> stream infinita que não tem ordenação
		Stream.iterate(0, n -> n + 1).forEach(println); // iterate -> stream infinta com certa ordenação
	}
}
