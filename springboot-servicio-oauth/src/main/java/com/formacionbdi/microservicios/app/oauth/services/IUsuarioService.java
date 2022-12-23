package com.formacionbdi.microservicios.app.oauth.services;

import com.formacionbdi.microservicios.app.commons.usuarios.models.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);
	
	public Usuario update(Usuario usuario, Long id);

}
