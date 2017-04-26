package nl.willemhustinx.rest;

import nl.willemhustinx.persistence.ThemesPersistenceBean;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by willemhustinx on 22-4-2017.
 */
@Path("/themes")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ThemesRestService {

    @Inject
    private ThemesPersistenceBean themesPersistenceBean;

    @GET
    public Response getAll() {
        return Response.ok(themesPersistenceBean.getAll()).build();
    }
}
