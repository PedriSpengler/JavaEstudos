package Map;

import java.util.HashMap;

public class HashMapJava {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);

        capitalCities.get("England");
        capitalCities.remove("England");
        capitalCities.size();

        // Use o keySet() metodo se você quiser apenas as chaves, e usar o values() Metodo se você quiser apenas os valores:
        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }

    }

}
