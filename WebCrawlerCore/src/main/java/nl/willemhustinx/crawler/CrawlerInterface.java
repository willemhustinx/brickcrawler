package nl.willemhustinx.crawler;

import nl.willemhustinx.model.Theme;

import java.util.List;

/**
 * Created by willemhustinx on 21-4-2017.
 */
public interface CrawlerInterface {

    public void crawlSets();

    public List<Theme> crawlThemes();

}
