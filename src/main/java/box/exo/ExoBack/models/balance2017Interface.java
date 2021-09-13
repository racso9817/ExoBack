/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box.exo.ExoBack.models;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author oscaravila9817
 */
public interface balance2017Interface extends MongoRepository<balance2017, String> {
    
    @Query(value = "{ 'EXPEDIENTE': ?0 }", fields = "{'EXPEDIENTE': 1, 'INGRESO_PPA_LOCALES_PFI_5': 1, 'NOMBRE': 1}") //, fields = "{'EXPEDIENTE': 1, 'INGRESO_PPA_LOCALES_PFI_5': 1}"
    balance2017 findByExp2020(int exp);
    
}
