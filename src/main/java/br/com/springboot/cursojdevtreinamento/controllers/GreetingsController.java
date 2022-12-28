package br.com.springboot.cursojdevtreinamento.controllers;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
public class GreetingsController {

   @RequestMapping(value="/mostrarnome/{name}",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greetingText(@PathVariable String name){
       return "Hello " + name + "!";

   }

   @RequestMapping(value="/olamundo/{nome}",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greetingText2(@PathVariable String nome){
       return "Ola mundo de " + nome + "!";

   }
        
}
