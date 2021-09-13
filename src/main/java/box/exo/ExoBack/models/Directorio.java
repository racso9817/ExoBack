/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box.exo.ExoBack.models;

import java.util.Date;
import lombok.Data;
//import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 *
 * @author oscaravila9817
 */

@Data
@Document
public class Directorio {
    
    private String id;
    private String FILA;
    private String EXPEDIENTE;
    private String RUC;
    private String NOMBRE;
    private String SITUACION_LEGAL;
    private Date FECHA_CONSTITUCION;
    private String TIPO;
    private String PAIS;
    private String REGION;
    private String PROVINCIA;
    private String CANTON;
    private String CIUDAD;
    private String BARRIO;
    private String CALLE;
    private String NUMERO;
    private String INTERSECCION;
    private String TELEFONO;
    private String REPRESENTANTE;
    private String CARGO;
    private Double CAPITAL_SUSCRITO;
    private String CIIU_NIVEL_1;
    private String CIIU_NIVEL_6;
    private Number ULTIMO_BALANCE;
    
}
