/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box.exo.ExoBack.models;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author oscaravila9817
 */

public interface CiiuInterface extends MongoRepository<Ciius, String> {
    
    @Query("{ 'CODIGO': ?0 }")
    Ciius findByCodigo(String codigo);
    
    
}
