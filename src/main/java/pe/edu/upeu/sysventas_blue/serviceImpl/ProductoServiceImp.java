package pe.edu.upeu.sysventas_blue.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sysventas_blue.dao.ProductoDao;
import pe.edu.upeu.sysventas_blue.entity.Producto;
import pe.edu.upeu.sysventas_blue.service.ProductoService;
@Repository
public class ProductoServiceImp implements ProductoService{
	
	@Autowired
	private ProductoDao productoDao;
	
	@Override
	public int create(Producto producto) {
		// TODO Auto-generated method stub
		return productoDao.create(producto);
	}

	@Override
	public int update(Producto producto) {
		// TODO Auto-generated method stub
		return productoDao.update(producto);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return productoDao.delete(id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		return productoDao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return productoDao.readAll();	
	}

}
