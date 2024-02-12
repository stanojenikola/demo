package com.example.demo;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/demo")
@AllArgsConstructor
public class DemoController {

    public final DemoService demoService;

    @GetMapping
    public ResponseEntity<List<UserDTO>> getUser() {
        var users = demoService.getUsers();

        return ResponseEntity.ok(users);

    }
}
