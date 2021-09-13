/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box.exo.ExoBack.services;

import box.exo.ExoBack.models.Ciius;
import box.exo.ExoBack.models.Directorio;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author oscaravila9817
 */
public interface ExoServices {
    //ENCONTRAR COMPAÑIA POR ID
    Optional<Directorio> findById(String id);
    
    //OBTENER TODAS LAS COMPAÑIAS
    public List<Directorio> getAll();
    
    //OBTENER TODOS LOS CIIUS
    public List<Ciius> getAllCiius();
        
    
}
