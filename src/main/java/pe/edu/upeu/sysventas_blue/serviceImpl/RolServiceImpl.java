package pe.edu.upeu.sysventas_blue.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sysventas_blue.dao.RolDao;
import pe.edu.upeu.sysventas_blue.entity.Rol;
import pe.edu.upeu.sysventas_blue.service.RolService;

@Repository
public class RolServiceImpl implements RolService {

	@Autowired
	private RolDao roldao;
	
	@Override
	public int create(Rol r) {
		// TODO Auto-generated method stub
		return roldao.create(r);
	}

	@Override
	public int update(Rol r) {
		// TODO Auto-generated method stub
		return roldao.update(r);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return roldao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return roldao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return roldao.readAll();
	}

}


