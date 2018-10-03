
import java.util.Enumeration;
import java.util.Hashtable;

public class TestHashMap {

	
	public static void main(String[] args) {
		Hashtable<Integer,Cliente> clientes = new Hashtable<Integer, Cliente>();
		
		Cliente cliente1= new Cliente("Ramon", 1111, false);
		//Cliente cliente2= new Cliente("julia", 2222, true);
		Cliente cliente3= new Cliente("susana", 3333, true);
		
		clientes.put(1111,cliente1);
		clientes.put(cliente3.getDni(),cliente3);
		clientes.put(4444,new Cliente("julia", 2222, true));
		
		System.out.println(" Mostrar el nombre del cliente a traves de su clave ");
		
		//EXISTE UN ELEMENTO MEDIANTE SU CLAVE
		if(clientes.containsKey(1111)) {
			System.out.println("El cliente es: " + clientes.get(1111).getNombre());
		}
		
		System.out.println("  ");
		
		System.out.println("Existe un elemento en la coleccion?");
		
		//EXISTE UN ELEMENTO EN LA COLECCION
				if(clientes.contains(cliente3)) {
					System.out.println("si, el cliente 3 existe");
				}
		
				System.out.println(" ");
				System.out.println(" Mostrando coleccion utilizando las claves");
				
		//UTILIZANDO LAS CLAVES Y OBTENIENDO OBJETOS A TRAVES DE LA MISMA
				Enumeration <Integer> claves = clientes.keys();
				while(claves.hasMoreElements()) {
					Integer clave = claves.nextElement();
					System.out.println(clientes.get(clave).toString());
				}
				
				System.out.println(" ");
				System.out.println(" Mostrando coleccion a traves de sus elementos");
				
		//UTILIZANDO LOS ELEMENTOS DIRECTAMENTE
				Enumeration <Cliente> elementos = clientes.elements();
				while(elementos.hasMoreElements()) {
					System.out.println(elementos.nextElement().toString());
				}		
				
		//BORRAR UN ELEMENTO MEDIANTE SU CLAVE
					clientes.remove(1111);
					
					System.out.println(" ");
					System.out.println(" Mostrando coleccion con elemento borrado");
					
		//MOSTRAR COLECCION CON ELEMENTO BORRADO			
					Enumeration <Cliente> elementos1 = clientes.elements();
					while(elementos1.hasMoreElements()) {
						System.out.println(elementos1.nextElement().toString());
					}
					
		// BORRAR TODO			
					clientes.clear();
	}
}
