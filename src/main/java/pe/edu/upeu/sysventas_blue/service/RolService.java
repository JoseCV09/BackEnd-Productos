package pe.edu.upeu.sysventas_blue.service;

import java.util.List;
import java.util.Map;

import pe.edu.upeu.sysventas_blue.entity.Rol;

public interface RolService {
	
	int create(Rol r);
	public int update(Rol r);
	int delete(int id);
	Map<String, Object> read(int id);	
	List<Map<String, Object>>readAll();
	
}
