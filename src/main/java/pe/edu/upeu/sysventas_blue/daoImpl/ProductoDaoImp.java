package pe.edu.upeu.sysventas_blue.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.sysventas_blue.dao.ProductoDao;
import pe.edu.upeu.sysventas_blue.entity.Producto;
@Repository
public class ProductoDaoImp implements ProductoDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Producto producto) {
		// TODO Auto-generated method stub
		String SQL = "insert into producto(nombre_producto,precio_producto)values(?,?)";
		return jdbcTemplate.update(SQL,producto.getNombre_producto(), producto.getPrecio_producto()); 
	}

	@Override
	public int update(Producto producto) {
		// TODO Auto-generated method stub
		String SQL = "update producto set nombre_producto=?, precio_producto=? where id_producto=?";
		return jdbcTemplate.update(SQL, producto.getNombre_producto(),producto.getPrecio_producto(), producto.getId_producto());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "delete from producto where id_producto=?";
		
		return jdbcTemplate.update(SQL,id);
	}

	@Override
	public Map<String, Object> read(int id) {
		// TODO Auto-generated method stub
		String SQL = "select * from producto where id_producto=?";
		return jdbcTemplate.queryForMap(SQL, id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select * from producto";	
		return jdbcTemplate.queryForList(SQL);
	}
	
	
}
