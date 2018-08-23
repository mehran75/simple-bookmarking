package springboot.simplebookmarking;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.simplebookmarking.model.Bookmark;
import springboot.simplebookmarking.service.BookmarkService;

@RestController
@RequestMapping("bookmarks")
public class BookmarkController {

    @Autowired
    BookmarkService bookmarkService;


    @PostMapping
    public ResponseEntity<Void> addBookmark(@RequestBody Bookmark bookmark){
        bookmarkService.addBookmark(bookmark);
        return new ResponseEntity<Void>(HttpStatus.CREATED);

    }

}
