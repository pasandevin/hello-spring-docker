package com.example.hellospringdocker.marks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "mark")
public class ExampleController {

    MarkRepository markRepository;

    @Autowired
    public ExampleController(MarkRepository markRepository) {
        this.markRepository = markRepository;
    }

    @GetMapping("putmarks")
    public void getMarksForUser() {
        Mark mark = new Mark("Krishan", 80);
        markRepository.save(mark);
    }
}
