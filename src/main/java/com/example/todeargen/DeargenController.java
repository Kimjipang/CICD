package com.example.todeargen;


import org.python.util.PythonInterpreter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeargenController {

    private static PythonInterpreter interpreter;

    @GetMapping("/result")
    public void lotto_numbers() {
        interpreter = new PythonInterpreter();
        interpreter.execfile("src/main/python/lotto.py");
    }
}
