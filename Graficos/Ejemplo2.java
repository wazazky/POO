import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Ejemplo2 {
public Ejemplo2() {
JFrame frame = new JFrame("Ejemplo");
JPanel contentPane = (JPanel) frame.getContentPane();
JLabel label = new JLabel("Etiqueta");
contentPane.add(label);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(400,400);
frame.setVisible(true);
}
public static void main(String args[]) {
javax.swing.SwingUtilities.invokeLater(new Runnable(){

public void run() {
Ejemplo2 gui = new Ejemplo2();
}
});

}
}
