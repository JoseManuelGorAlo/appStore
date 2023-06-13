package controladores;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import entidades.Clientes;

public class ClienteControl {
	
	public static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	public static Session  session= sessionFactory.openSession();
	
	
	public static void AltaCliente (Clientes cliente) {
		
		
		Clientes c=cliente;
		session= sessionFactory.openSession();
		//crea transacion
		Transaction tx= session.beginTransaction();
		//save del producto
		session.save(c);
		//confirma r el cambio
	    tx.commit();
	    session.close();
	    System.out.println("he creado el cliente");
		
		
	}
	
	public static void InicioSesion(String nombre, String email, String pwd) {
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}

