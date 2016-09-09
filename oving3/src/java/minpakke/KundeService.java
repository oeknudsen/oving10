package minpakke;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/kunder/") 
public class KundeService { 
    private static Map<String,Kunde> kunder = new HashMap<String,Kunde>() {{
        put("1", new Kunde("1", "Nils"));
    }}; 
    
    @GET 
    @Path("/{kundeId}") 
    @Produces(MediaType.APPLICATION_JSON) 
    public Kunde getKunde(@PathParam("kundeId")String kundeId) {
        if(!kunder.containsKey(kundeId)) {
          throw new NotFoundException();
        }
        return kunder.get(kundeId); 
    } 
    
    @GET 
    @Produces(MediaType.APPLICATION_JSON) 
    public Collection<Kunde> getKunder() { 
        return kunder.values();
    } 
    
    @POST 
    @Consumes(MediaType.APPLICATION_JSON) 
    public static void addKunde(Kunde kunde) { 
        kunder.put(kunde.getId(), kunde);
    }
    
   @DELETE
   @Path("/{kundeId}")
   public static void deleteKunde(@PathParam("kundeId")String kundeId) {
      kunder.remove(kundeId);
    }
   
   @PUT
   public static void updateKunde(Kunde kunde) {
        if(!kunder.containsKey(kunde.getId())) {
          throw new NotFoundException();
        }
        kunder.replace(kunde.getId(), kunde);
   }
}