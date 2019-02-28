package chuchu.pruebas.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import chuchu.pruebas.rest.jwt.JWTDemo;
import chuchu.pruebas.beans.*;

/**
* Root resource (exposed at "myresource" path)
*/
@Path("generarToken")
public class GenerarToken {


   @GET
   @Produces({MediaType.APPLICATION_JSON})
   public DatosLogin generarToken() {
	   DatosLogin a = new DatosLogin();
	   a.setToken(JWTDemo.createJWT("3423938", "SMSV", "Carlos Ibanez", 90000));
	   return a;
   }
      
}
