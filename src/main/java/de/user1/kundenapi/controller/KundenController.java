package de.user1.kundenapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.user1.kundenapi.entity.Kunde;
import de.user1.kundenapi.repository.KundenRepository;

@RestController
@RequestMapping("/kunden")
public class KundenController {
	
	private KundenRepository kundenrepository;
	
	public KundenController(KundenRepository kundenrepository) {
		this.kundenrepository = kundenrepository;
	}
	
	
	@GetMapping("")
	public List<Kunde> index(){
		return kundenrepository.findAll();
	}

}
