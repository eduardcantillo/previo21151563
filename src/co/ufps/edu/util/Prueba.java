package co.ufps.edu.util;

import co.ufps.edu.dao.ClienteDao;
import co.ufps.edu.dao.ServicioDao;
import co.ufps.edu.dao.TiendaDao;
import co.ufps.edu.model.Cliente;
import co.ufps.edu.model.Servicio;
import co.ufps.edu.model.Tienda;

public class Prueba {
	

	
	public static void main(String[] args) {
		
		 ClienteDao clienteDao = new ClienteDao();
		 TiendaDao tiendaDao = new TiendaDao();
		 ServicioDao servicioDao = new ServicioDao();
		 
		 
		Cliente cliente = new Cliente();
		cliente.setNombre("Eduard Cantillo");
		cliente.setEmail("eduard@gmail.com");
		cliente.setClave("eduard");
		clienteDao.insert(cliente);
		
		
		Tienda tienda = new Tienda();
		tienda.setFacebook("www.facebook.com/zapatos");
		tienda.setNombre("Calzado");
		tienda.setLema("El mejor Calzado");
		tienda.setDescripcion("Lo mejor en calzado");
		tienda.setEmail("calzado@gmail.com");
		tienda.setClave("calzado1234");
		tienda.setPropietario("eduard");
		tienda.setWeb("www.clzado.com");
		tienda.setImagen("calzado");
		tiendaDao.insert(tienda);
		
		Servicio servicio = new Servicio();
		servicio.setNombre("calzado a la mano");
		servicio.setDescripcion("calzado a la puerta de tu casa");
		servicio.setTiendaBean(tienda);
		servicioDao.insert(servicio);
		

	}

}