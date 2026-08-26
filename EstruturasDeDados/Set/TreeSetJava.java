package Set;

import java.util.TreeSet;

public class TreeSetJava {
    public static void main(String [] args) {
        TreeSet<String> cars = new TreeSet<>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");  // Duplicate
        cars.add("Mazda");

        System.out.println(cars);
    }
}
/*

TreeSet
Order 	Sorted (natural order)
Duplicates   Not allowed
Performance   Slower (due to sorting)

UM TreeSetÉ uma coleção que armazena elementos únicos em ordem classificada .

Faz parte do java.utilempacota e implementa o Setinterface.

Ao contrário HashSet, que não tem ordem, TreeSetMantém seus elementos classificados automaticamente.

Saída: Os elementos serão classificados automaticamente (ex.: [BMW, Ford, Mazda, Volvo]).

Observação: termos duplicados como "BMW" aparecerão apenas uma vez.

 Use HashSetquando você se importa com a velocidade, e TreeSetQuando você precisa de elementos ordenados.
*/

