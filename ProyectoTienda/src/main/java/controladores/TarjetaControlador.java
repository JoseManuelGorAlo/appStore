package controladores;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entidades.Tarjetasbancarias;

public class TarjetaControlador {
	
	public static SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	public static Session  session= sessionFactory.openSession();
	
	
	public static void AltaTarjeta (Tarjetasbancarias tarjetabancaria) {
		
		Tarjetasbancarias t = tarjetabancaria;
		
		//crea transacion
				Transaction tx= session.beginTransaction();
				//save del producto
				session.save(t);
				//confirma r el cambio
			    tx.commit();
			    session.close();
		
		
		System.out.println("he creado la tarjeta");
	}
	

}
