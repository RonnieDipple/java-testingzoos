package com.rdipple.javazoosassignment.services;

import com.rdipple.javazoosassignment.JavazoosApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = JavazoosApplication.class)
public class AnimalServiceImplUnitTest {

    @Autowired
    private AnimalService animalService;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findAll() {
        assertNotEquals(3, animalService.findAll());
    }

    @Test
    public void findAnimalById() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void save() {
    }

    @Test
    public void update() {
    }

    @Test
    public void getCountAnimalZoos() {
    }
}