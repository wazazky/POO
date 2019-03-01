import javax.swing.JFrame;
public class Ejemplo {
public Ejemplo() {
JFrame frame = new JFrame("Ejemplo");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(192,108);
frame.setVisible(true);
}
public static void main(String args[]) {
javax.swing.SwingUtilities.invokeLater(new Runnable(){

public void run() {
Ejemplo gui = new Ejemplo();
}
});

}
}