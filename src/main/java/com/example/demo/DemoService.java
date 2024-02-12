package com.example.demo;

import org.apache.catalina.User;

import java.util.List;

public interface DemoService {
    List<UserDTO> getUsers();
}
