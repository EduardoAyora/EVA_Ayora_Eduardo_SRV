package ec.edu.ups.est.ProyectoFinal.business;

import java.util.List;

import javax.ejb.Local;

import ec.edu.ups.est.ProyectoFinal.model.Automovil;

@Local
public interface AutomovilONLocal {
	public void crear(String placa, String marca, String modelo, String color);
	public List<Automovil> listar();
}
