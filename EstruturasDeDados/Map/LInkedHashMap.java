package Map;

import java.util.LinkedHashMap;

public class LInkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, String> capitalCities = new LinkedHashMap<>();

        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");
    }
}

/*
UM LinkedHashMapArmazena chaves e valores, mantendo-os na mesma ordem em que foram inseridos.

Faz parte do java.utilempacota e implementa o Mapinterface.

Saída: Os itens aparecerão na ordem em que foram adicionados (ex.: {Inglaterra=Londres, Índia=Nova Déli, Áustria=Viena, Noruega=Oslo, EUA=Washington DC}).

Nota: Duplicados como "Noruega" serão ignorados.

Feature 	HashMap 	                LinkedHashMap
Order 	    No guaranteed order 	    Insertion order preserved
Performance Faster for random access 	Slightly slower due to ordering
Duplicates 	Keys must be unique 	    Keys must be unique
*/
