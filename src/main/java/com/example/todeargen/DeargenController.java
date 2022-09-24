package com.example.todeargen;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class DeargenController {
    @GetMapping("/result")
    public void lotto_numbers() {
        Random random = new Random();
        int[] lotto = new int[6];
        System.out.print("로또 번호는 " );
        for(int i = 0; i < lotto.length; i++) {
            lotto[i] = random.nextInt(64) + 1;
            System.out.print(lotto[i] + "  ");
        }
        System.out.println("입니다.");
    }
}
