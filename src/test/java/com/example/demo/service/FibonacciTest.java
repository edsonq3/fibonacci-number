package com.example.demo.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

    @Test
    public void Fibonacci() {
        System.out.println("This is the testcase in this class");
        Long fibo = Fibonacci.fibo(1);
        assertEquals((Long) 1L, fibo);
    }
}
