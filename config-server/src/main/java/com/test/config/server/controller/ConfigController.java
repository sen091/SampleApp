/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.config.server.controller;

import com.test.commonapp.PrintCommonName;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
	@RequestMapping("/confighome")
	public String sayHello()
	{
		return "Hello World from Config Server!!!";
	}
         @RequestMapping("/name")
	public String printName()
	{
            PrintCommonName commonNameObj = new PrintCommonName();
            return commonNameObj.getCommonName();
	}

}

