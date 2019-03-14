package com.oldnoop.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring-*.xml"})
@WebAppConfiguration
public class MemberServiceImplTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void register() {
    }

    @Test
    public void login() {
    }

    @Test
    public void edit() {
    }

    @Test
    public void editPwd() {
    }
}