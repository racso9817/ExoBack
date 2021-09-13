/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package box.exo.consola;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

/**
 *
 * @author oscaravila9817
 */
public class ConsoleApp {
    
    public static void main(String[] args) throws UnirestException{
        Scanner sc = new Scanner(System.in);          
        while(true) {
            System.out.println("Box Exo Application> ");
            String cmd = sc.nextLine();
            switch(cmd) {                
                case "exo -ventas":
                    System.out.println("Ingrese número de expediente: ");
                    int exp = sc.nextInt();
                    System.out.println("Ingrese año: ");
                    int year = sc.nextInt();
                    HttpResponse<JsonNode> http = Unirest.get("http://localhost:8080/bal"+year+"/"+exp)
                        .asJson();
                    Gson gson = new GsonBuilder().setPrettyPrinting().create();
                    JsonParser jp = new JsonParser();
                    JsonElement je = jp.parse(http.getBody().toString());
                    String prettyJsonString = gson.toJson(je);
                    System.out.println(prettyJsonString);
                    break;                
            }
        }
    }
}  
