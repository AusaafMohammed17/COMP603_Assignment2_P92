/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.typinggame;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ausaafmohammed
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class AdminLoginTest {

    private AdminLogin adminLogin;

    @BeforeEach
    public void setUp() {
        // Create an instance of AdminLogin for testing
        adminLogin = new AdminLogin();
    }

    @AfterEach
    public void tearDown() {
        // Clean up or reset any resources if needed
        adminLogin = null;
    }

    // 1st test
    @Test
    public void testAdminLoginSuccess() {
        // Create an instance of AdminLogin (or adapt to your class creation)
        AdminLogin admin = new AdminLogin();

        // Simulate entering valid admin credentials
        String expectedUsername = "Ausaaf";
        String expectedPassword = "PDCGUI";

        // Simulate the login action (modify as needed based on your code)
        boolean loginResult = admin.login(expectedUsername, expectedPassword);

        // Verify that the login was successful
        assertTrue(loginResult);
    }
    
    @Test
    public void testAdminLoginFailure() {
        // Create an instance of AdminLogin (or adapt to your class creation)
        AdminLogin admin = new AdminLogin();

        // Simulate entering invalid admin credentials
        String expectedUsername = "InvalidUser";
        String expectedPassword = "InvalidPassword";

        // Simulate the login action (modify as needed based on your code)
        boolean loginResult = admin.login(expectedUsername, expectedPassword);

        // Verify that the login failed
        assertFalse(loginResult);
    }

}

