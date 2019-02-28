package chuchu.pruebas.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import chuchu.pruebas.rest.jwt.JWTDemo;
import io.jsonwebtoken.Claims;


@Path("validarToken")
public class ValidarToken {


   @POST
   @Produces({MediaType.APPLICATION_JSON})
   public Claims validarToken(@QueryParam("token") String token) {
	   
	   return JWTDemo.decodeJWT(token);
   }
      
}
