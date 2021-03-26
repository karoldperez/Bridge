/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.qdn.util;

import java.util.Base64;

/**
 *
 * @author Juan Muñoz
 * 
 * Objetivo: Proveer un simple puente de encriptacion y decriptacion
 */
public class LVEncriptadoDecriptado {
    
    
    /**
     * Recibe el String original y retorna el elemento encriptado.
     * 
     * @param base
     * @return 
     */
    public String encodeString(String base){
        return Base64.getEncoder().encodeToString(base.getBytes());
    }
    
    /**
     * Recibe el elemento codificado y retorna el elemento decriptado
     * 
     * @param base
     * @return 
     */
    public String decodeString(String base){
        byte[] decodedBytes = Base64.getDecoder().decode(base);
        String decodificado = new String(decodedBytes);
        return decodificado;
    }
    
}
