package nl.willemhustinx.crawler;

import nl.willemhustinx.model.Theme;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by willemhustinx on 21-4-2017.
 */
public class LegoShopCrawler implements CrawlerInterface {

    //@Inject
    //private ThemesPersistenceBean themesPersistenceBean;

    @Override
    public void crawlSets() {

    }

    @Override
    public List<Theme> crawlThemes() {

        Document doc = null;
        try {
            doc = Jsoup.connect("https://shop.lego.com/nl-NL/Themas").get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Elements themes = doc.getElementsByClass("cat-list__item");

        List<Theme> themesList = new ArrayList<Theme>();

        for (Element e : themes) {

            Elements titles = e.getElementsByClass("cat-list__title");
            Element description = e.getElementsByClass("cat-list__description").first();

            if (description.text().trim().compareTo("") == 0) {
                description = description.nextElementSibling();
            }

            Theme t = new Theme();
            t.setName(titles.text());
            t.setDescription(description.text());

            themesList.add(t);
        }

        return themesList;
    }
}
