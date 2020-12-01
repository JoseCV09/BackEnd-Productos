package pe.edu.upeu.sysventas_blue.dao;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sysventas_blue.entity.Producto;

public interface ProductoDao {
	int create(Producto producto);
	int update(Producto producto);
	int delete(int id);
	Map<String, Object> read(int id);
	List<Map<String, Object>> readAll();
}
