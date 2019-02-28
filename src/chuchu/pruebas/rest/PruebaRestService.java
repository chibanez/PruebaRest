package chuchu.pruebas.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
* Root resource (exposed at "myresource" path)
*/
@Path("pruebaRest")
public class PruebaRestService {

   /**
    * Method handling HTTP GET requests. The returned object will be sent
    * to the client as "text/plain" media type.
    *
    * @return String that will be returned as a text/plain response.
    */
   @GET
   @Produces(MediaType.TEXT_PLAIN)
   public String verMensajeTexto() {
       return "HOLA MUNDO LOCO!";
   }
   
   // This method is called if XML is request
   @GET
   @Produces(MediaType.TEXT_XML)
   public String verMensajeXml() {
     return "<?xml version=\"1.0\"?>" + "<hello> HOLA MUNDO LOCO" + "</hello>";
   }

   // This method is called if HTML is request
   @GET
   @Produces(MediaType.TEXT_HTML)
   public String verMensajeHtml() {
     return "<html> " + "<title>" + "HOLA MUNDO LOCO" + "</title>"
         + "<body><h1>" + "HOLA MUNDO LOCO" + "</body></h1>" + "</html> ";
   }
   
   
}