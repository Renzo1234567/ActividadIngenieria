
package ucab.ing;

import java.util.Date;


public class Cliente {
        private int id;
	private String Nombre;
	private String Apellido;
        private String cedula;
        private String fechaultimacompra;

    public Cliente(int id, String Nombre, String Apellido, String fechaultimacompra, String cedula) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.cedula = cedula;
        this.fechaultimacompra = fechaultimacompra;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getFechaultimacompra() {
        return fechaultimacompra;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setCédula(String cédula) {
        this.cedula = cédula;
    }

    public void setFechaultimacompra(String fechaultimacompra) {
        this.fechaultimacompra = fechaultimacompra;
    }

   
   
    
}
