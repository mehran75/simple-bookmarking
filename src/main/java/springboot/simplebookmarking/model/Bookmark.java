package springboot.simplebookmarking.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.beans.factory.annotation.Autowired;
import springboot.simplebookmarking.service.BookmarkService;

public class Bookmark {
    private final String url;



    @JsonCreator
    public Bookmark(@JsonProperty("url") String url) {

        this.url = url;
    }


    public String getUrl() {
        return url;
    }
}
