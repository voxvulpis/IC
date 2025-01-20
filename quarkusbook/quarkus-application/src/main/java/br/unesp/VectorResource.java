package br.unesp;


import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/vector")
public class VectorResource {

    @Inject
    VectorService vector;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String vector(){
        return "Vector Resource";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/equals/{a}/{b}")
    public String equals(int a[], int b[]){
        if( vector.equal(a, b)){
            return "true";
        }

        return "false";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/size/{a}/{b}")
    public String size(int a[], int b[]){
        if( vector.size(a.length, b.length)){
            return "true";
        }

        return "false";
    }

}
