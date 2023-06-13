package controladores;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entidades.Clientes;
import entidades.Productos;

public class ProductoControlador {
	public static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	public static Session  session= sessionFactory.openSession();
	
public static void AltaCliente (Productos producto) {
		
		
	Productos p=producto;
		session= sessionFactory.openSession();
		//crea transacion
		Transaction tx= session.beginTransaction();
		//save del producto
		session.save(p);
		//confirma r el cambio
	    tx.commit();
	    session.close();
		
	    System.out.println("he creado el producto");
	}
	
	
	
}
