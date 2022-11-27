package com.jsfprimefacesproject.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;


import com.jsfprimefacesproject.model.Aposta;

@Named
@ViewScoped
public class ApostaBean implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject
	private Aposta aposta;

	private List<Aposta> apostas;
	private Aposta novaAposta;
	
	public ApostaBean() {
		this.apostas = new ArrayList<>();
		this.novaAposta = new Aposta();
	}
	
	public List<Aposta> getApostas() {
		return apostas;
	}
	
	public void salvar() {
		if (apostas.isEmpty()) {
			apostas.add(novaAposta);
			novaAposta = new Aposta();
		}
	}
	
	public void editar() {
		apostas.clear();
	}

	public Aposta getNovaAposta() {
		return novaAposta;
	}

	public void setNovaAposta(Aposta novaAposta) {
		this.novaAposta = novaAposta;
	}
	

}
