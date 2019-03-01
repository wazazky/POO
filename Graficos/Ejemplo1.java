import javax.swing.JFrame;
import javax.swing.JPanel;
public class Ejemplo1 {
public Ejemplo1() {
JFrame frame = new JFrame("Ejemplo");
JPanel contentPane = (JPanel) frame.getContentPane();
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(400,100);
frame.setVisible(true);
}
public static void main(String args[]) {
javax.swing.SwingUtilities.invokeLater(new Runnable(){

public void run() {
Ejemplo1 gui = new Ejemplo1();
}
});

}
}