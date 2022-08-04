package com.example.hellospringdocker.marks;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "mark")
public class ExampleController {

    @GetMapping("getmarks")
    public Mark getMarksForUser() {
        Mark mark = new Mark("Krishan", 80);
        return  mark;
//        return "hello";
    }
}
