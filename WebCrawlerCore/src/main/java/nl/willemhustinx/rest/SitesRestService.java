package nl.willemhustinx.rest;

import nl.willemhustinx.crawler.CrawlerInterface;
import nl.willemhustinx.crawler.LegoShopCrawler;
import nl.willemhustinx.persistence.SitesPersistenceBean;
import nl.willemhustinx.persistence.ThemesPersistenceBean;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by willemhustinx on 17-4-2017.
 */

@Path("/sites")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SitesRestService {

    @Inject
    private SitesPersistenceBean sitesPersistenceBean;

    @Inject
    private ThemesPersistenceBean themesPersistenceBean;

    @GET
    public Response getAll() {
        return Response.ok(sitesPersistenceBean.getAll()).build();
    }

    @PUT
    @Path("/crawl")
    public Response crawl() {

        CrawlerInterface crawler = new LegoShopCrawler();

        themesPersistenceBean.persist(crawler.crawlThemes());

        return Response.status(Response.Status.OK).build();
    }
}
