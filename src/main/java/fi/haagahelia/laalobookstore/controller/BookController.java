package fi.haagahelia.laalobookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller  // ✅ This is needed
public class BookController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String viewLista() {
        return "booklist"; // Assuming you have booklist.html in templates
    }
}
