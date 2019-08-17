/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.auth.server.controller;

/**
 *
 * @author senthilkumar
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AuthController {
	@RequestMapping("/authhome")
	public String sayHello()
	{
		return "Hello World from Auth Server!!!";
	}

}
