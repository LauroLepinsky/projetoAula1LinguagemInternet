package br.uniso;

//é a nossa classe de controle
//ela pega a requisicao http vinda do browser
//e processa para desenvolver uma resposta

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/uniso")
public class UnisoController {

    @GetMapping("/hello")
    public String helloWorld(@RequestParam("nome") String xxxx, @RequestParam("idade") String yyyy){


        return "Hello " + xxxx + " idade de " + yyyy;
    }

}
