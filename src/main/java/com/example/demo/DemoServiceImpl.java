package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class DemoServiceImpl implements DemoService{
    @Override
    public List<UserDTO> getUsers() {
        var user = new UserDTO(UUID.randomUUID(), "Tom");
        var user2 = new UserDTO(UUID.randomUUID(), "Micky");

        return List.of(user, user2);
    }
}
