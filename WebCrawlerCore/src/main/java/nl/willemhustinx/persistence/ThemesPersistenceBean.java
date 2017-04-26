package nl.willemhustinx.persistence;

import nl.willemhustinx.model.Theme;

import javax.ejb.Stateless;

/**
 * Created by willemhustinx on 22-4-2017.
 */
@Stateless
public class ThemesPersistenceBean extends AbstractPersistence<Theme> {
    public ThemesPersistenceBean() {
        super(Theme.class);
    }
}
