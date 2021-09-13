/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box.exo.ExoBack.controller;

import box.exo.ExoBack.models.balance2020;
import box.exo.ExoBack.models.balance2020Interface;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author oscaravila9817
 */
@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/bal2020")
@AllArgsConstructor
@Slf4j
public class bal2020Controlador {
    
    private final balance2020Interface bal2020Repo;
    
    @GetMapping("/{exp}")
    public balance2020 findByCodigo(@PathVariable int exp){
        return bal2020Repo.findByExp2020(exp);
    }
    
}
