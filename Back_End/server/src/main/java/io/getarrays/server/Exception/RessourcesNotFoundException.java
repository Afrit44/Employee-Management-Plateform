/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.getarrays.server.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RessourcesNotFoundException extends RuntimeException{
    private static final long serialVersionUID =1L;
    public RessourcesNotFoundException(String message){
        super(message);
    }
}



