package com.example.demo.service;

import com.example.demo.entity.FibonacciEntity;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static long fibo(int n) {
        return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
    }

//    public static List<FibonacciEntity> listar() {
//        List<FibonacciEntity> listaFibonacci = new ArrayList();
//
//        for (int i = 1; i < 21; i++) {
//            listaFibonacci.add(new FibonacciEntity(null, Fibonacci.fibo(i)));
//        }
//        return listaFibonacci;
//    }


}
