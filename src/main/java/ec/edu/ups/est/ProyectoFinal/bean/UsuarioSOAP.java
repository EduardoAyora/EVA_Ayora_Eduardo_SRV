package ec.edu.ups.est.ProyectoFinal.bean;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebService;

import ec.edu.ups.est.ProyectoFinal.business.UsuarioON;
import ec.edu.ups.est.ProyectoFinal.model.Usuario;

@WebService
public class UsuarioSOAP {
	
	@Inject
	private UsuarioON usuarioON;
	
	@WebMethod
	public String crearUsuario(Usuario usuario) {
		try {
			usuarioON.insertarUsuario(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "Usuario insertado";
	}
	
	@WebMethod
	public List<Usuario> getUsuarios() {
		return usuarioON.getUsuarios();
	}
	
	@WebMethod
	public String transferir(String cuentaOrigen, String cuentaDestino, String banco, double valor) {
		return null;
	}
	
	@WebMethod
	public double suma(double a, double b) {
		return a + b;
	}
}
