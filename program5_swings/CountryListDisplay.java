/*5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display them on console whenever the countries are selected on the list.*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryListDisplay {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Country List");
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] countries = { "USA", "India", "Vietnam", "Canada", "Denmark", 
                               "France", "Great Britain", "Japan", "Africa", 
                               "Greenland", "Singapore" };

        JList<String> countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JScrollPane scrollPane = new JScrollPane(countryList);
        frame.add(scrollPane);

        countryList.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                java.util.List<String> selected = countryList.getSelectedValuesList();
                System.out.println("Selected Countries: " + selected);
            }
        });

        frame.setVisible(true);
    }
}
