/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box.exo.ExoBack.controller;

import box.exo.ExoBack.models.CiiuInterface;
import box.exo.ExoBack.models.Ciius;
import box.exo.ExoBack.models.Directorio;
import box.exo.ExoBack.services.ExoServicesImpl;
import java.util.List;
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
@RequestMapping("/ciiu")
@AllArgsConstructor
@Slf4j
public class CiiuControlador {
    
    private final ExoServicesImpl exoService;
    private final CiiuInterface ciiu;
    
    @GetMapping()
    public List<Ciius> fetchDirectorio() {
        return exoService.getAllCiius();
    }
    
    @GetMapping("/{codigo}")
    public Ciius findByCodigo(@PathVariable String codigo){
        return ciiu.findByCodigo(codigo);
    }
    
}
