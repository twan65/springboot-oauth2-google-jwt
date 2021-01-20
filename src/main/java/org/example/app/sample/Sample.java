package org.example.app.sample;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {

    @GetMapping("/")
    public ResponseEntity<String> index() {
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }
}
