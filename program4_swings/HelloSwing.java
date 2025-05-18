/*4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing
Programming in Blue color plain font with font size of 32 using Jframe and Jlabel*/
import javax.swing.*;
import java.awt.*;

public class HelloSwing {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Swing Hello Program");
        frame.setSize(600, 200); // Set size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout()); // Simple layout

        // Create JLabel with message
        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming");

        // Set font to Plain, size 32, and color blue
        label.setFont(new Font("Arial", Font.PLAIN, 32));
        label.setForeground(Color.BLUE);

        // Add label to frame
        frame.add(label);

        // Make frame visible
        frame.setVisible(true);
    }
}
