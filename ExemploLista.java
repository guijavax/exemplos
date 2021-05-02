import java.util.*;
import java.util.stream.Collectors;

    class TestesLIsta {

    public static void main(String[] args) throws InterruptedException {

        //Lista Mutavel
        List<String> nomes = Arrays.asList("Maria", "Jose", "Karla", "Joel", "Mariana", "Guilherme", "Leticia").stream().collect(Collectors.toCollection(ArrayList::new));
        Set<String> nomes2 = Set.of("Maria", "Jose", "Karla", "Joel", "Mariana", "Guilherme", "Leticia").stream().collect(Collectors.toSet());

        nomes.forEach(nome -> {
           System.out.println(nome);
        });

        nomes.removeIf(nome -> nome.startsWith("M"));

        nomes2.removeIf(nome -> nome.startsWith("M"));

        nomes.forEach(System.out::println);
        nomes2.forEach(System.out::println);
    }
}

