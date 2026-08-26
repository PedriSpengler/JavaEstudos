package Map;

import java.util.TreeMap;

public class TreeMapJava {
    public static void main(String []args) {
            TreeMap<String, String> capitalCities = new TreeMap<>();
            capitalCities.put("England", "London");
            capitalCities.put("India", "New Dehli");
            capitalCities.put("Austria", "Wien");
            capitalCities.put("Norway", "Oslo");
            capitalCities.put("Norway", "Oslo"); // Duplicate
            capitalCities.put("USA", "Washington DC");

            System.out.println(capitalCities);
    }
}
/*
 UM TreeMapÉ uma coleção que armazena pares chave/valor em ordem classificada pela chave .

Faz parte do java.utilempacota e implementa o Mapinterface.

Saída: As chaves são classificadas em ordem alfabética (ex.: {Áustria=Viena, Inglaterra=Londres, Índia=Nova Déli, Noruega=Oslo, EUA=Washington DC}).

Observação: Termos duplicados como "Noruega" aparecerão apenas uma vez.

Feature 	HashMap 	            TreeMap
Order 	    No guaranteed order 	Sorted by keys
Null Keys 	Allows one null key 	Does not allow null keys
Performance  Faster (no sorting) 	Slower (maintains sorted order)
 */