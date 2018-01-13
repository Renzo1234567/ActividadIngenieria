
package ucab.ing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.simple.JSONObject;



public class ClienteDATOimplement implements ClienteDAO{
    
    List<Cliente> clientes;
    List<Cliente> Clientes;
    int i=0;
    Cliente cliente;
    String result = "";
    String nombre="";
    String apellido="";
   int id;
    String fecha="";
    String cedula="";
    int contadordelineas=1;
    public ClienteDATOimplement() {
      clientes = new ArrayList<>();
    }
    

    @Override
    public Cliente obtenerCliente(int id) {
        
        Cliente aux=clientes.get(i);
        for (int i=0;i<=clientes.size()-1;i++){
            if (id==clientes.get(i).getId()){
                aux=clientes.get(i);
                return aux;
            }
        }
        
      return null;
    }

    public boolean Existe(String cedula){
        Boolean aux=true;
        for (int i=0;i<=clientes.size()-1;i++){
            if (cedula.equals(clientes.get(i).getCedula())){
                aux=true;         
            }else aux=false;
        }
        
        
        return aux;
    }
   

    @Override
    public void registrarCliente(Cliente cliente) {
       Boolean aux=false;
       Boolean aux2=false;
        for (int i=0;i<=clientes.size()-1;i++){
           
            if (cliente.getCedula().equals(clientes.get(i).getCedula())){
                aux=true;
                System.out.println("se comparo "+cliente.getCedula()+"con "+clientes.get(i).getCedula());
                i=99;
            }else aux=false;
        }
            for (int i=0;i<=clientes.size()-1;i++){
           
            if (cliente.getId()==clientes.get(i).getId()){
                aux=true;
                System.out.println("se comparo "+cliente.getId()+"con "+clientes.get(i).getId());
               i=99;
            }else aux=false;
        }
        if (aux==false && aux2==false){
            clientes.add(cliente);
           
            System.out.println("cliente registrado");
        }else
                System.out.println("Usuario duplicado");
        
        
       
       return ;
    }

    @Override
    public Cliente leerArchivo(String ruta) {
    try {
        File archivo=new File(ruta);
       FileReader fr=new FileReader(archivo);
       BufferedReader br=new BufferedReader(fr);
        String line = br.readLine();
      String Cadena;
        while ((Cadena=br.readLine()) != null){
                if (contadordelineas==1){
                    int ID =Integer.parseInt(Cadena);
                    id=ID;
                    System.out.println("se asigno id a "+id);
                }
                if (contadordelineas==2){
                    nombre=Cadena;
                    System.out.println("se asigno nombre a "+nombre);
                }
                if (contadordelineas==3){
                    apellido=Cadena;
                    System.out.println("se asigno apellido a "+apellido);
                }
                if (contadordelineas==4){
                    fecha=Cadena;
                    System.out.println("se asigno fecha a "+fecha);
                }
                if (contadordelineas==5){
                    cedula=Cadena;
                    System.out.println("se asigno cedula a "+cedula);
                  }
                 contadordelineas=contadordelineas+1;
                 if (contadordelineas==6){
                     Cliente cliente=new Cliente(id,nombre,apellido,fecha,cedula);
                     clientes.add(cliente);
                     contadordelineas=1;
                 }
                
        }
        br.close();
        fr.close();
        
    } catch(Exception e) {
        e.printStackTrace();
    }
    return cliente;
  }

    
    public void AñadirclientesTXT(String ruta) {
     File f;
     FileWriter w;
     BufferedWriter bw;
     PrintWriter wr;
     
     try{
         f=new File(ruta);
         w=new FileWriter(f);
         bw=new BufferedWriter(w);
         wr=new PrintWriter(bw);
        
         wr.write("       USUARIOS");
         
         for(int i=0;i<=clientes.size()-1;i++){
             bw.newLine();
             String cadena="";
             cadena=String.valueOf(clientes.get(i).getId());
        wr.write(cadena);
        bw.newLine();
        wr.write(clientes.get(i).getNombre());
        bw.newLine();
        wr.write(clientes.get(i).getApellido());
        bw.newLine();
        wr.write(clientes.get(i).getFechaultimacompra());
        bw.newLine();
        wr.write(clientes.get(i).getCedula());
        
         }
         wr.close();
        bw.close();
         
         
     }catch(Exception e){
        System.out.println("Error"+e);
    }
     
    }

}
   
    
    

