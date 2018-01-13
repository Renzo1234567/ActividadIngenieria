
package ucab.ing;

import java.util.List;


public interface ClienteDAO {
   
        //declaración de métodos para acceder a la base de datos
        
	public Cliente obtenerCliente(int id);
        public void registrarCliente(Cliente cliente);
        public Cliente leerArchivo(String ruta);
       
}

