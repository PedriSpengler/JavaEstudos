package Set;

import java.util.HashSet;

public class HashSetJava {
    public static void main(String [] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        System.out.println(cars);
        cars.add("BMW");
        System.out.println(cars);
        cars.add("Ford");
        System.out.println(cars);
        cars.add("BMW");  // Duplicate
        cars.add("Mazda");
        System.out.println(cars);
        cars.add("Monza");
        System.out.println(cars);
        cars.add("Mitsubish");
        System.out.println(cars);

        System.out.println(cars.size());
    }
}

/*
UM HashSeté uma coleção de elementos onde cada elemento é exclusivo .

Faz parte do java.util pacote e implementa o Set interface.

Elementos em um HashSet são, na verdade, objetos. Nos exemplos acima, criamos elementos (objetos) do tipo "String". Lembre-se que um String em Java, `type` é um objeto (e não um tipo primitivo). Para usar outros tipos, como `type`, ... int, você deve especificar uma classe wrapper equivalente : Integer para outros tipos primitivos, usar: Boolean para booleano, Character para char, Double para o dobro, etc.
*/