package com.example.demo.service;

import com.example.demo.Entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class RepoTest {

    @Autowired
    UserRespositoryImpl userRespositoryImpl;

    @Test
    public void test(){
        userRespositoryImpl.findthem();
    }
}
