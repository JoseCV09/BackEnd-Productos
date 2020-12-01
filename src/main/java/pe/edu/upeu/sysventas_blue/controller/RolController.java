package pe.edu.upeu.sysventas_blue.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.sysventas_blue.entity.Rol;
import pe.edu.upeu.sysventas_blue.service.RolService;

@RestController
@RequestMapping("/roles")

public class RolController {

	@Autowired
	private RolService rolService;

	@GetMapping("/lista")
	public List<Map<String, Object>> lista() {
		return rolService.readAll();
	}

	@GetMapping("/lista/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return rolService.read(id);	 
	}

	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return rolService.delete(id);

	}

	@PutMapping("/update/{id}")
	public int update(@RequestBody Rol rol, @PathVariable int id) {
		rol.setIdrol(id);
		return rolService.update(rol);
	}

	@PostMapping("/create")
	public int create(@RequestBody Rol rol) {
		return rolService.create(rol);
	}
	
}
