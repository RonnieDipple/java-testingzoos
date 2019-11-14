package com.rdipple.javazoosassignment.services;

import com.rdipple.javazoosassignment.JavazoosApplication;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = JavazoosApplication.class)
public class ZooServiceImplUnitTest {

    @Autowired
    private ZooService zooService;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findAll() {

        assertNotEquals(3, zooService.findAll());
    }

    @Test
    public void findByNameContaining() {
    }

    @Test
    public void findZooById() {
        assertEquals("Gladys Porter Zoo TEST", zooService.findZooById(1).getZooname());
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
    public void deleteZooAnimal() {
    }

    @Test
    public void addZooAnimal() {
    }

    @Test
    public void getCountZooTelephones() {
    }
}