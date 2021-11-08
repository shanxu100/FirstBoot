package org.helloseries.springexercise.firstboot.controller;

import org.helloseries.springexercise.firstboot.config.OtherConfig;
import org.helloseries.springexercise.firstboot.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    private OtherConfig otherConfig;

    @GetMapping("/rest/{index}")
    @ResponseBody
    public ResponseEntity<String> restIndex(@PathVariable("index") int index) {
        if (index == 0) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        } else {
            String result = "Hello First Spring Boot Application. configSize is " + otherConfig.getConfigSize()
                    + " configLength is " + otherConfig.getConfigLength() + " index is " + index;
            return new ResponseEntity<String>(result, HttpStatus.OK);
        }
    }

    @PostMapping(path = "/rest/book", consumes = "application/json")
    public ResponseEntity<Book> restBook(@RequestBody Book book){

        String info = "book info: name="+book.getName()+" pages="+book.getPages();
        book.setInfo(info);
        return new ResponseEntity<Book>(book,HttpStatus.OK);
    }

    @PostMapping(path = "/rest/bookjson", consumes = "application/json")
    public Book restBookJson(@RequestBody Book book){

        String info = "book json info: name="+book.getName()+" pages="+book.getPages();
        book.setInfo(info);
        return book;
    }

}
