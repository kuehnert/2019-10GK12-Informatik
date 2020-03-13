import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

class MeinButtonListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
        JOptionPane.showMessageDialog(null, "Hallo Welt!");
    }
}

public class FensterSimpel {
    public static void start() {
        JFrame fenster = new JFrame("Mein wirklich cooles Programm");
        fenster.setSize(800, 600);
        
        JButton button = new JButton("Klick mich für Corona!");
        button.addActionListener(new MeinButtonListener());
        fenster.add(button);
        
        fenster.setVisible(true);
    }
}
