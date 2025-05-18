/*5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display the capital of the countries on console whenever the countries are selected on the list.*/
import javax.swing.*;
import java.awt.event.*;
import java.util.HashMap;

public class CountryCapitalDisplay {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Country Capital List");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] countries = { "USA", "India", "Vietnam", "Canada", "Denmark", 
                               "France", "Great Britain", "Japan", "Africa", 
                               "Greenland", "Singapore" };

        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington, D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "No single capital (Continent)");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        JList<String> countryList = new JList<>(countries);
        JScrollPane scrollPane = new JScrollPane(countryList);
        frame.add(scrollPane);

        countryList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                java.util.List<String> selected = countryList.getSelectedValuesList();
                for (String country : selected) {
                    System.out.println("Capital of " + country + ": " + capitals.get(country));
                }
            }
        });

        frame.setVisible(true);
    }
}
