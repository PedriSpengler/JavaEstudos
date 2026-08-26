package List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListJava{
    public static void main(String [] args) {
        ArrayList<String> carro = new ArrayList<>(); // instanciando uma variavel do tipo ArrayList
        // List<String> cars = new ArrayList<>(); -> podemos fazer dessa forma, para depois alterar o tipo de ArrayList, para outro List type.

        // adicionando um novo objeto no ArrayList, na instancia carro
        carro.add("Chevrolet");
        carro.add("Ford");
        carro.add("Hyundai");
        carro.add(0, "BMW");

        System.out.println(carro);

        // substituindo o objeto da posiçao "2" pelo objeto que vem como segundo argumento no metodo set.
        carro.set(2, "Ferrari");

        // coletar algum objeto de alguma posiçao da variavel instanciada
        carro.get(1);

        // tentando lançar uma excecao para get

        try {
            carro.get(4);
        } catch (IndexOutOfBoundsException e) {
            throw new Error("O parâmetro colocado, não é válido!");
        }

        // remover um objeto de alguma posicao da variavel instanciada
        carro.remove("Ferrari");

        // descobrir o tamanho atual de alguma variavel instanciada
        System.out.println(carro.size());

        System.out.println(carro);
        System.out.println(carro.get(1));

        boolean contem = carro.contains("Chevrolet");
        System.out.println(contem);

        System.out.println(carro);

        // metodo hashcode
        System.out.println(carro.hashCode());

        // percorrendo um ArrayList
        for (int i = 0; i < carro.size(); i++) {
            System.out.println(carro.get(i));
        }

        // ordenando a instancia carro
        Collections.sort(carro);

        // usando for-each para percorrer a instancia carro
        for (String i : carro) {
            System.out.println(i);
        }

    }

}

/*
Method 	Description 	Return Type
add() 	Add an item to the list 	boolean|void
addAll() 	Add a collection of items to the list 	boolean
clear() 	Remove all items from the list 	void
clone() 	Create a copy of the ArrayList 	Object
contains() 	Checks whether an item exist in the list 	boolean
ensureCapacity() 	Increase the capacity of the list to be able to fit a specified number of items 	void
forEach() 	Perform an action on every item in the list 	void
get() 	Return the item at a specific position in the list 	T
indexOf() 	Return the position of the first occurrence of an item in the list 	int
isEmpty() 	Checks whether the list is empty 	boolean
iterator() 	Return an Iterator object for the ArrayList 	Iterator
lastIndexOf() 	Return the position of the last occurrence of an item in the list 	int
listIterator() 	Return a ListIterator object for the ArrayList 	ListIterator
remove() 	Remove an item from the list 	boolean|T
removeAll() 	Remove a collection of items from the list 	boolean
removeIf() 	Remove all items from the list which meet a specified condition 	boolean
replaceAll() 	Replace each item in the list with the result of an operation on that item 	void
retainAll() 	Remove all elements from the list which do not belong to a specified collection 	boolean
set() 	Replace an item at a specified position in the list 	T
size() 	Return the number of items in the list 	int
sort() 	Sort the list 	void
spliterator() 	Return a Spliterator object for the ArrayList 	Spliterator
subList() 	Return a sublist which provides access to a range of this list's items 	List
toArray() 	Return an array containing the list's items 	Object[]
trimToSize() 	Reduce the capacity of the list to match the number of items if necessary 	Object[]
 */