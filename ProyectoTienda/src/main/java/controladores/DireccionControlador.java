package controladores;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entidades.Clientes;
import entidades.Direcciones;

public class DireccionControlador {
	
	public static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	public static Session  session= sessionFactory.openSession();
	
	
public static void AltaDirecion (Direcciones direcciones) {
		
		
	Direcciones d=direcciones;
		session= sessionFactory.openSession();
		//crea transacion
		Transaction tx= session.beginTransaction();
		//save del producto
		session.save(d);
		//confirma r el cambio
	    tx.commit();
	    session.close();
		
	    System.out.println("he creado la dirrecion");
		
	}
	

}
