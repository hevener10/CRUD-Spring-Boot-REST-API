package br.com.springboot.cursojdevtrainamento.controllers.cursojdevtrainamento;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
public class GreetingsController {

   @RequestMapping(value="/{name}",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String greetingText(@PathVariable String name){
       return "Hello " + name + "!";

   }
        
}
