package ventanas;

import javax.swing.JFrame;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;

import controladores.ClienteControl;
import entidades.Clientes;

import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {
	private JTextField textNameInicio;
	private JTextField textEmailInicio;
	private JPasswordField passwordFieldInicio;
	private JLabel lblErrorPwd;
	private JButton btnIngresar;
	public VentanaPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\jose\\2dam\\EclipseIIIproyectoFinal\\ProyectoTienda\\src\\main\\java\\images\\logo1.ico"));
		setSize(new Dimension(800, 600));
		getContentPane().setLayout(null);
		
		JButton btnCreateAccount = new JButton("");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentaRegistro vr= new VentaRegistro(); 
				vr.setLocationRelativeTo(null);
				vr.setVisible(true);
			}
		});
		btnCreateAccount.setIcon(new ImageIcon("D:\\jose\\2dam\\EclipseIIIproyectoFinal\\ProyectoTienda\\src\\main\\java\\images\\Create Account (1).png"));
		btnCreateAccount.setBounds(303, 460, 174, 37);
		getContentPane().add(btnCreateAccount);
		
		textNameInicio = new JTextField();
		textNameInicio.setBorder(null);
		textNameInicio.setBackground(new Color(255, 79, 99));
		textNameInicio.setBounds(283, 198, 245, 32);
		getContentPane().add(textNameInicio);
		textNameInicio.setColumns(10);
		
		textEmailInicio = new JTextField();
		textEmailInicio.setBorder(null);
		textEmailInicio.setBackground(new Color(255, 79, 99));
		textEmailInicio.setColumns(10);
		textEmailInicio.setBounds(283, 267, 245, 32);
		getContentPane().add(textEmailInicio);
		
		passwordFieldInicio = new JPasswordField();
		passwordFieldInicio.setBorder(null);
		passwordFieldInicio.setBackground(new Color(255, 79, 99));
		passwordFieldInicio.setBounds(283, 344, 236, 32);
		getContentPane().add(passwordFieldInicio);
		
		JLabel lblErrorNombre = new JLabel("New label");
		lblErrorNombre.setForeground(Color.RED);
		lblErrorNombre.setBounds(556, 201, 130, 27);
		getContentPane().add(lblErrorNombre);
		
		JLabel lblErrorEmail = new JLabel("New label");
		lblErrorEmail.setForeground(Color.RED);
		lblErrorEmail.setBounds(556, 272, 130, 27);
		getContentPane().add(lblErrorEmail);
		
		lblErrorPwd = new JLabel("New label");
		lblErrorPwd.setForeground(new Color(255, 0, 0));
		lblErrorPwd.setBounds(556, 347, 130, 27);
		getContentPane().add(lblErrorPwd);
		
		btnIngresar = new JButton("");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pwd= new String (passwordFieldInicio.getPassword());
				
				
			}
		});
		btnIngresar.setIcon(new ImageIcon("D:\\jose\\2dam\\EclipseIIIproyectoFinal\\ProyectoTienda\\src\\main\\java\\images\\Botton.png"));
		btnIngresar.setBounds(303, 412, 174, 37);
		getContentPane().add(btnIngresar);
		
		JLabel lblFotoFondo = new JLabel("New label");
		lblFotoFondo.setIcon(new ImageIcon("D:\\jose\\2dam\\EclipseIIIproyectoFinal\\ProyectoTienda\\src\\main\\java\\images\\VentanaInicio.png"));
		lblFotoFondo.setBounds(0, 0, 784, 579);
		getContentPane().add(lblFotoFondo);
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		VentanaPrincipal vp = new VentanaPrincipal ();
		vp.setLocationRelativeTo(null);
		vp.setVisible(true);

	}
}
