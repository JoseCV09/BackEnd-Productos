package pe.edu.upeu.sysventas_blue.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.sysventas_blue.entity.Producto;
import pe.edu.upeu.sysventas_blue.service.ProductoService;
@CrossOrigin(origins = {"*"})
@RestController
@RequestMapping("/producto")
public class ProductoController {
	@Autowired
	private ProductoService productoService;
	
	
	@GetMapping("/lista")
	public List<Map<String, Object>> lista() {
		return productoService.readAll();
	}

	@GetMapping("/lista/{id}")
	public Map<String, Object> read(@PathVariable int id) {
		return productoService.read(id);	 
	}

	@DeleteMapping("/delete/{id}")
	public int delete(@PathVariable int id) {
		return productoService.delete(id);

	}

	@PutMapping("/update/{id}")
	public int update(@RequestBody Producto producto, @PathVariable int id) {
		producto.setId_producto(id);
		return productoService.update(producto);
	}

	@PostMapping("/create")
	public int create(@RequestBody Producto producto) {
		return productoService.create(producto);
	}
}
