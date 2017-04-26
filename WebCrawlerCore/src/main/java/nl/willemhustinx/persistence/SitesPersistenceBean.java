package nl.willemhustinx.persistence;

import nl.willemhustinx.model.Site;

import javax.ejb.Stateless;

/**
 * Created by willemhustinx on 21-4-2017.
 */
@Stateless
public class SitesPersistenceBean extends AbstractPersistence<Site> {
    public SitesPersistenceBean() {
        super(Site.class);
    }
}