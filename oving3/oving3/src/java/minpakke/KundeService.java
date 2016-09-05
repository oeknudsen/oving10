package minpakke;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/kunder/") 
public class KundeService { 
    private Map<String,Kunde> kunder = new HashMap<String,Kunde>() {{
        put("1", new Kunde("1", "Nils"));
    }}; 
    
    @GET 
    @Path("/{kundeId}") 
    @Produces(MediaType.APPLICATION_JSON) 
    public Kunde getKunde(@PathParam("kundeId") String kundeId) { 
        return kunder.get(kundeId); 
    } 
    
    @GET 
    @Produces(MediaType.APPLICATION_JSON) 
    public Collection<Kunde> getKunder() { 
        return kunder.values(); 
    } 
    
    @POST 
    @Consumes(MediaType.APPLICATION_JSON) 
    public void addKunde(Kunde kunde) { 
        kunder.put(kunde.getId(), kunde); 
    } 
}