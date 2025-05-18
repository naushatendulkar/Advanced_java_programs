/*4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the
event handling mechanism with addActionListener( ).*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CountryButtonDemo {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Country Button Example");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create label to display message
        JLabel messageLabel = new JLabel("");
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 20));

        // Create India button
        JButton indiaButton = new JButton("India");

        // Create Srilanka button
        JButton srilankaButton = new JButton("Srilanka");

        // Add ActionListener to India button
        indiaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("India is pressed");
            }
        });

        // Add ActionListener to Srilanka button
        srilankaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Srilanka is pressed");
            }
        });

        // Add components to frame
        frame.add(indiaButton);
        frame.add(srilankaButton);
        frame.add(messageLabel);

        // Make frame visible
        frame.setVisible(true);
    }
}
