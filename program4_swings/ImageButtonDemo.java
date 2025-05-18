/*4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
pressed by implementing the event handling mechanism with addActionListener( ).*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ImageButtonDemo {
    public static void main(String[] args) {
        // Create JFrame
        JFrame frame = new JFrame("Image Button Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create label to display messages
        JLabel messageLabel = new JLabel("");
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 20));

        // Load images (place your image files in the same directory)
        ImageIcon clockIcon = new ImageIcon("clock.png");
        ImageIcon hourglassIcon = new ImageIcon("hourglass.png");

        // Create buttons with images
        JButton digitalClockButton = new JButton(clockIcon);
        JButton hourGlassButton = new JButton(hourglassIcon);

        // Add ActionListener for Digital Clock button
        digitalClockButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Digital Clock is pressed");
            }
        });

        // Add ActionListener for Hour Glass button
        hourGlassButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                messageLabel.setText("Hour Glass is pressed");
            }
        });

        // Add buttons and label to frame
        frame.add(digitalClockButton);
        frame.add(hourGlassButton);
        frame.add(messageLabel);

        // Make frame visible
        frame.setVisible(true);
    }
}
