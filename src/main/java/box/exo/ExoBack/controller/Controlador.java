/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box.exo.ExoBack.controller;

import box.exo.ExoBack.models.Directorio;
import box.exo.ExoBack.services.ExoServicesImpl;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
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
@RequestMapping("/empresas")
@AllArgsConstructor
@Slf4j
public class Controlador {
    
    private final ExoServicesImpl exoService;
    
    @GetMapping()
    public List<Directorio> fetchDirectorio() {
    
        return exoService.getAll();
    
    }
    
    @GetMapping("/{id}")
    public Directorio getCompaniaById(@PathVariable String id){
        return exoService.findById(id).stream().collect(Collectors.toList()).get(0);
    }
    
}
