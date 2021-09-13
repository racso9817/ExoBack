/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box.exo.ExoBack.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author oscaravila9817
 */

@Data
@Document
public class Ciius {
    
    private String id;
    private String CODIGO;
    private String DESCRIPCION;
    private String NIVEL;
    
}
