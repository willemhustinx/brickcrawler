package nl.willemhustinx.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/main")
public class MainRestService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String main() {
        return "gelukt";
    }

}
