/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box.exo.ExoBack.controller;

import box.exo.ExoBack.models.balance2018;
import box.exo.ExoBack.models.balance2018Interface;
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
@RequestMapping("/bal2018")
@AllArgsConstructor
@Slf4j
public class bal2018Controlador {
    
    private final balance2018Interface bal2018Repo;
    
    @GetMapping("/{exp}")
    public balance2018 findByCodigo(@PathVariable int exp){
        return bal2018Repo.findByExp2018(exp);
    }
    
}
