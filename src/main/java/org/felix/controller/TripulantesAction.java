package org.felix.controller;

import java.util.List;

import org.felix.entity.Tripulantes;
import org.felix.service.TripulantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

@Component
public class TripulantesAction extends ActionSupport{

	private static final long serialVersionUID = 1L;

	private List<Tripulantes> tripulantes;
	
	  @Autowired
	    private TripulantesService ts;
	     
	    @SuppressWarnings("unchecked")
	    public String execute() throws Exception {
	    	tripulantes = (List<Tripulantes>) ts.findAll();
	        return SUCCESS;
	    }
	 
	    public List<Tripulantes> getTripulantes(){
	        return tripulantes;
	    }
	
	    
	    
}
