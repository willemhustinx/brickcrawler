package nl.willemhustinx.data;

/**
 * Created by willemhustinx on 21-4-2017.
 */

import nl.willemhustinx.model.Site;
import nl.willemhustinx.model.Theme;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Startup
@Singleton
public class DataInit {

    @PersistenceContext
    private EntityManager em;

    @PostConstruct
    void init() {
        Site s1 = new Site();
        s1.setName("Lego Shop @ Home NL");
        s1.setUrl("https://shop.lego.com/nl-NL/");
        s1.setDescription("Officiële LEGO site voor Nederland");
        em.persist(s1);

        Site s2 = new Site();
        s2.setName("A-Tembo");
        s2.setUrl("https://www.a-tembo.nl/");
        s2.setDescription("A-tembo delft en breda");
        em.persist(s2);

        Site s3 = new Site();
        s3.setName("Het Deense Steentje");
        s3.setUrl("http://www.hetdeensesteentje.nl/");
        s3.setDescription("Het Deense Steentje: dé site voor echt goedkope LEGO®. Makkelijk bestellen en snel in huis. Kijk gerust eens rond en laat u aangenaam verrassen door de lage prijzen.");
        em.persist(s3);

        Site s4 = new Site();
        s4.setName("https://www.speelgoednl.nl/");
        s4.setUrl("https://shop.lego.com/nl-NL/");
        s4.setDescription("Officiële LEGO site voor Nederland");
        em.persist(s4);

        Theme t1 = new Theme();
        t1.setName("test");
        t1.setDescription("test");
        em.persist(t1);
    }
}
