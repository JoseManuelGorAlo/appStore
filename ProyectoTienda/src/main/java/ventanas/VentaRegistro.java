package ventanas;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class VentaRegistro extends JFrame {
	
	private JTextField textNombre;
	private JTextField textEmail;
	private JTextField textApellido;
	private JPasswordField passwordField;
	private JTextField textCumpleanos;
	private JTextField textTarjeta;
	
	public VentaRegistro() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\jose\\2dam\\EclipseIIIproyectoFinal\\ProyectoTienda\\src\\main\\java\\images\\logo1.ico"));
		
	
		setSize(new Dimension(800, 600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Principal");
		getContentPane().setLayout(null);
		
		JLabel lblfotoLogin = new JLabel("New label");
		lblfotoLogin.setBackground(new Color(240, 240, 240));
		lblfotoLogin.setIcon(new ImageIcon("D:\\jose\\2dam\\EclipseIIIproyectoFinal\\ProyectoTienda\\src\\main\\java\\images\\Welcome!! (2).png"));
		lblfotoLogin.setBounds(0, 0, 784, 561);
		getContentPane().add(lblfotoLogin);
		
		textNombre = new JTextField();
		textNombre.setBorder(null);
		textNombre.setBackground(new Color(253, 74, 111));
		textNombre.setBounds(81, 226, 232, 20);
		getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBorder(null);
		textEmail.setBackground(new Color(253, 74, 111));
		textEmail.setColumns(10);
		textEmail.setBounds(81, 289, 232, 20);
		getContentPane().add(textEmail);
		
		textApellido = new JTextField();
		textApellido.setBorder(null);
		textApellido.setBackground(new Color(253, 74, 111));
		textApellido.setColumns(10);
		textApellido.setBounds(519, 226, 232, 20);
		getContentPane().add(textApellido);
		
		passwordField = new JPasswordField();
		passwordField.setBorder(null);
		passwordField.setBackground(new Color(253, 74, 111));
		passwordField.setBounds(81, 364, 232, 20);
		getContentPane().add(passwordField);
		
		textCumpleanos = new JTextField();
		textCumpleanos.setBorder(null);
		textCumpleanos.setBackground(new Color(253, 74, 111));
		textCumpleanos.setColumns(10);
		textCumpleanos.setBounds(519, 289, 232, 20);
		getContentPane().add(textCumpleanos);
		
		textTarjeta = new JTextField();
		textTarjeta.setBorder(null);
		textTarjeta.setBackground(new Color(253, 74, 111));
		textTarjeta.setColumns(10);
		textTarjeta.setBounds(519, 364, 232, 20);
		getContentPane().add(textTarjeta);
		
		JButton btnIngresar = new JButton("New button");
		btnIngresar.setIcon(new ImageIcon("D:\\jose\\2dam\\EclipseIIIproyectoFinal\\ProyectoTienda\\src\\main\\java\\images\\Botton.png"));
		btnIngresar.setBackground(new Color(240, 240, 240));
		btnIngresar.setBorder(null);
		btnIngresar.setBounds(322, 503, 158, 33);
		getContentPane().add(btnIngresar);

}
}