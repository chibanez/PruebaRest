package chuchu.pruebas.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import chuchu.pruebas.beans.Direccion;
import chuchu.pruebas.beans.Persona;


/**
* Root resource (exposed at "myresource" path)
*/
@Path("pruebaRestJson")
public class PruebaRestJson {


   @GET
   @Produces({MediaType.APPLICATION_JSON})
   public Persona verMensajeJson() {
		Persona persona = new Persona();
			
		persona.setNombre("Carlitos");
		persona.setApellido("Ibañez");
		persona.setEdad(38);
		
		persona.getDirecciones().add(new Direccion("Zuviria",702,6,"B","Argentina"));
		persona.getDirecciones().add(new Direccion("Salas",411,0,"","Argentina"));
		
		return persona;
   }
   
   @GET
   @Produces({MediaType.TEXT_XML})
   public Persona verMensajeXml() {
		Persona persona = new Persona();
			
		persona.setNombre("Carlos");
		persona.setApellido("Ibañez");
		persona.setEdad(38);
		
		persona.getDirecciones().add(new Direccion("Zuviria",702,6,"B","Argentina"));
		persona.getDirecciones().add(new Direccion("Salas",411,0,"","Argentina"));
			
		return persona;
   }
   
}
