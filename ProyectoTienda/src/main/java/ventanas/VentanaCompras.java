package ventanas;

import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JScrollPane;

public class VentanaCompras extends JFrame {
	public VentanaCompras() {
		setSize(new Dimension(1000, 700));
		setTitle("Compras");
		getContentPane().setLayout(null);
		
		JScrollPane scrollPaneCategorias = new JScrollPane();
		scrollPaneCategorias.setBounds(0, 0, 243, 661);
		getContentPane().add(scrollPaneCategorias);
		
		JScrollPane scrollPaneMuestraProductos = new JScrollPane();
		scrollPaneMuestraProductos.setBounds(242, 0, 742, 661);
		getContentPane().add(scrollPaneMuestraProductos);
	}
}
