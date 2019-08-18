/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.config.server.controller;

import com.test.bootstarter.controller.BootStarterController;
import com.test.bootstarter.exception.BusinessObjectException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
       
        @Autowired
        BootStarterController bootController;
        
	@RequestMapping("/confighome")
	public String sayHello()
	{
		return "Hello World from Config Server!!!";
	}
        
        @RequestMapping("/name/{actualName}")
	public String printName(@PathVariable("actualName") String name) throws BusinessObjectException
	{
            
            //PrintCommonName commonNameObj = new PrintCommonName();
            //return commonNameObj.getCommonName();
            
            if(!name.equals("Senthil"))
            {
                throw new BusinessObjectException("Throwing BusinessObject Exception", new Throwable("asdf"));
            }
            
            return "successfully returned the name"+name;
	}

}

