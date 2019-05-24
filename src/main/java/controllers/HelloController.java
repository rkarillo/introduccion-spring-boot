package controllers;

import org.springframework.web.bind.annotation.RestController;

import services.BusinessService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloController {

	@Value("${introduccion.spring.nombre}")
	private String nombre;
	
	@Autowired
	private BusinessService businessService;
	
    @RequestMapping(value="/saludar/{nombre}", method = RequestMethod.GET)
    public String index(@PathVariable String nombre) {
    	/*
    	String respuesta = "Nombre del proyecto: "+ this.nombre;
    	respuesta += "\n"+businessService.getSaludo();
    	
        return respuesta;
        return "Hola "+nombre;
    	*/
    	 
    	if(nombre.equals("Pilar")) {
    		return "Hola señorita "+nombre;   	
    	
    	}else {
    		return "Hola señor "+nombre;
    	}
    }
}
