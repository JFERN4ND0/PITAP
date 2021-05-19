import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BarraBotones extends JFrame implements ActionListener {
	private JButton[] botones;
	private String[] texto = {"Nuevo", "Editar", "Borrar", "Guardar", "Ver"};
	private ImageIcon[] icono;

	public BarraBotones() {
		setLayout(new GridLayout(5, 4)); //agregar el Layout
		setTitle("Barra de Botones");

		botones = new JButton[5];
		icono = new ImageIcon[5];
		for (int i = 0;i < botones.length;i ++) {
			icono[i] = new ImageIcon("imagenes/" + texto[i] + ".png");
			icono[i].getScaledInstance(5, 5, icono[i].SCALE_SMOOTH);
			botones[i] = new JButton(texto[i], icono[i]);
			botones[i].addActionListener(this);
			add(botones[i]);
		}
	}

	public void actionPerformed(ActionEvent e) {
       if(e.getSource() == botones[0]) {
       	System.out.println("HOLA");
       }
    }

	public static void main(String[] args) {
        BarraBotones v1 = new BarraBotones();
        v1.setBounds(0, 0, 600, 600);
        v1.setVisible(true);
        //v1.setResizable(true);
        v1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}