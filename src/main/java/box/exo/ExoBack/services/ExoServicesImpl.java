/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box.exo.ExoBack.services;

import box.exo.ExoBack.models.CiiuInterface;
import box.exo.ExoBack.models.Ciius;
import box.exo.ExoBack.models.Directorio;
import box.exo.ExoBack.models.DirectorioInterface;
import box.exo.ExoBack.models.balance2016Interface;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author oscaravila9817
 */

@AllArgsConstructor
@Service
public class ExoServicesImpl implements ExoServices {
    
    private final DirectorioInterface directorioRepo;
    private final CiiuInterface ciiusRepo;

    @Override
    public List<Directorio> getAll() {
        return directorioRepo.findAll();
    }

    @Override
    public Optional<Directorio> findById(String id) {
        return directorioRepo.findById(id);
    }
    

    @Override
    public List<Ciius> getAllCiius() {
        return ciiusRepo.findAll();
    }
    

    
    
    
    
    
}
