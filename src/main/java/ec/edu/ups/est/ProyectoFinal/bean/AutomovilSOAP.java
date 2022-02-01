package ec.edu.ups.est.ProyectoFinal.bean;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ec.edu.ups.est.ProyectoFinal.business.AutomovilONLocal;
import ec.edu.ups.est.ProyectoFinal.model.Automovil;

@WebService
public class AutomovilSOAP {
	
	@Inject
	private AutomovilONLocal automovilON;
	
	@WebMethod
	public String crearAutomovil(String placa, String marca, String modelo, String color) {
		try {
			automovilON.crear(placa, marca, modelo, color);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Automovil insertado";
	}
	
	@WebMethod
	public List<Automovil> getAutomoviles() {
		return automovilON.listar();
	}
}
