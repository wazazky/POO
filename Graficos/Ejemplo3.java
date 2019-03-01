import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
public class Ejemplo3 {
public Ejemplo3() {
JFrame frame = new JFrame("Ejemplo");
JPanel contentPane = (JPanel) frame.getContentPane();
JPanel panel = new JPanel();
JLabel label = new JLabel("Etiqueta");
JButton button = new JButton("Botón");
panel.add(label);
panel.add(button);
contentPane.add(panel);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(400,100);
frame.setVisible(true);
}
public static void main(String args[]) {
javax.swing.SwingUtilities.invokeLater(new Runnable(){

public void run() {
Ejemplo3 gui = new Ejemplo3();
}
});

}
}