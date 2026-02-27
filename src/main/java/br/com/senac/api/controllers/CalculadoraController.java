package br.com.senac.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calcular")

public class CalculadoraController {

    @GetMapping("/somar")
    public ResponseEntity<Integer> somar(@RequestParam int numero1, @RequestParam int numero2){

        int soma = numero1 + numero2;
        return ResponseEntity.ok(soma);

    }

    @GetMapping("/subtrair")
    public ResponseEntity<Integer> subtrair(@RequestParam int numero1, @RequestParam int numero2){

        int soma = numero1 - numero2;
        return ResponseEntity.ok(soma);

    }

    @GetMapping("/dividir")
    public ResponseEntity<Integer> dividir(@RequestParam int numero1, @RequestParam int numero2){

        int soma = numero1 / numero2;
        return ResponseEntity.ok(soma);

    }

    @GetMapping("/multiplicar")
    public ResponseEntity<Integer> multiplicar(@RequestParam int numero1, @RequestParam int numero2){

        int soma = numero1 * numero2;
        return ResponseEntity.ok(soma);

    }

}
