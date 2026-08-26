package List;// Importando uma classe LinkedList
import java.util.LinkedList;

public class LinkedListJava {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        cars.offer("Ferrari");
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());
        System.out.println(cars.getClass());



        System.out.println(cars);
    }
}
/*
O LinkedList classe é uma coleção que pode conter vários objetos do mesmo tipo. assim como o ArrayList.

O LinkedList classe possui os mesmos métodos que ArrayListp orque ambos seguem o List interface. Isso significa que você pode adicionar, alterar, remover ou limpar elementos em um LinkedList exatamente como você faria com um ArrayList.

No entanto, enquanto o ArrayList aula e o LinkedList classe pode ser usada da mesma forma, Eles são construídos de maneiras muito diferentes.

add() 	Add an item to the list 	boolean|void
addAll() 	Add a collection of items to the list 	boolean
addFirst() 	Adds an item to the beginning of the list 	void
addLast() 	Adds an item to the end of the list 	void
clear() 	Remove all items from the list 	void
clone() 	Create a copy of the LinkedList 	Object
contains() 	Checks whether an item exist in the list 	boolean
descendingIterator() 	Returns an iterator to loop through the items of the list in reverse order
element() 	Retrieves the first item in the list
Similar to getFirst()
forEach() 	Perform an action on every item in the list 	void
get() 	Return the item at a specific position in the list 	T
getFirst() 	Returns the first item in the list 	T
getLast() 	Returns the last item in the list 	T
indexOf() 	Return the position of the first occurrence of an item in the list 	int
isEmpty() 	Checks whether the list is empty 	boolean
iterator() 	Return an Iterator object for the LinkedList 	Iterator
lastIndexOf() 	Return the position of the last occurrence of an item in the list 	int
listIterator() 	Return a ListIterator object for the LinkedList 	ListIterator
offer() 	Adds an item at the end of the list
offerFirst() 	Adds an item at the beginning of the list
offerLast() 	Adds an item at the end of the list
peek() 	Retrieves the first item in the list
Similar to getFirst()
peekFirst() 	Retrieves the first item in the list.
Similar to peek()
peekLast() 	Retrieves the last item in the list
poll() 	Retrieves and removes the first item in the list.
pollFirst() 	Retrieves and removes the first item in the list.
Similar to poll()
pollLast() 	Retrieves and removes the last item in the list.
pop() 	Returns the first element in the list.
Similar to removeFirst()
push() 	Adds an item to the beginning of the list.
Similar to addFirst()
remove() 	Remove an item from the list 	boolean|T
removeAll() 	Remove a collection of items from the list 	boolean
removeFirst() 	Removes the first item in the list 	T
removeFirstOccurrence() 	Removes the first occurrence of a specified item in the list
removeIf() 	Remove all items from the list which meet a specified condition 	boolean
removeLast() 	Removes the last item in the list 	T
removeLastOccurrence() 	Removes the last occurrence of a specified item in the list
replaceAll() 	Replace each item in the list with the result of an operation on that item 	void
retainAll() 	Remove all elements from the list which do not belong to a specified collection 	boolean
set() 	Replace an item at a specified position in the list 	T
size() 	Return the number of items in the list 	int
sort() 	Sort the list 	void
spliterator() 	Return a Spliterator object for the LinkedList 	Spliterator
subList() 	Return a sublist which provides access to a range of this list's items 	List
toArray() 	Return an array containing the list's items 	Object[]
*/



