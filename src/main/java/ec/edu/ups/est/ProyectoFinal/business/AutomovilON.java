package ec.edu.ups.est.ProyectoFinal.business;

import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.est.ProyectoFinal.dao.AutomovilDAO;
import ec.edu.ups.est.ProyectoFinal.model.Automovil;

@Stateless
public class AutomovilON implements AutomovilONLocal {
	@Inject
	private AutomovilDAO automovilDAO;
	
	public void crear(String placa, String marca, String modelo, String color) {
		Automovil automovil = new Automovil();
		automovil.setPlaca(placa);
		automovil.setMarca(marca);
		automovil.setModelo(modelo);
		automovil.setColor(color);
		automovilDAO.insert(automovil);
	}
	
	public List<Automovil> listar() {
		return automovilDAO.getList();
	}
}
