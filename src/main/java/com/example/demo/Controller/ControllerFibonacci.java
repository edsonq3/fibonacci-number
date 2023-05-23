package com.example.demo.Controller;

import com.example.demo.entity.FibonacciEntity;
import com.example.demo.repository.FibonacciRepository;
import com.example.demo.service.Fibonacci;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("fibonacci")
public class ControllerFibonacci {

//    @Autowired
//    FibonacciRepository repository;

//    @GetMapping
//    public List<FibonacciEntity> buscar() {
//        return repository.findAll();
//    }

    @GetMapping("{id}")
    @ResponseBody
    public Long buscarPorId(@PathVariable int id) {

//        Optional<FibonacciEntity> fibonacci;
//        fibonacci = repository.findById(id);
//        return fibonacci.get().getFibonacci();

        return Fibonacci.fibo(id);
    }

//    @PostMapping("salvar")
//    public ResponseEntity<List<FibonacciEntity>> salvar() {
//        List<FibonacciEntity> listarFibonacci = Fibonacci.listar();
//        repository.saveAll(listarFibonacci);
//        return ResponseEntity.ok(listarFibonacci);
//    }

}
