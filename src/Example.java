import java.awt.*;
import javax.swing.*;

class Example extends JFrame {
    JLabel l1, l2, l3, l4, l5;

    public Example() {
        // Create a FlowLayout
        FlowLayout layout = new FlowLayout();
        this.setLayout(layout);

        // Initialize JLabel components
        l1 = new JLabel("Label 1");
        l2 = new JLabel("Label 2");
        l3 = new JLabel("Label 3");
        l4 = new JLabel("Label 4");
        l5 = new JLabel("Label 5");

        // Add JLabels to the JFrame
        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(l4);
        this.add(l5);
    }

    public static void main(String[] args) {
        Example frame = new Example();
        frame.setTitle("Example of FlowLayout");
        frame.setBounds(200, 100, 600, 400); // Set frame dimensions
        frame.setVisible(true);
        // Creating a StringBuilder object without assigning it to a variable
        System.out.println(new StringBuilder("Hello, World!"));

    }
}
