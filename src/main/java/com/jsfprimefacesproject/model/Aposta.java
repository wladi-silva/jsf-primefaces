package com.jsfprimefacesproject.model;

import java.io.Serializable;

public class Aposta implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer apostaBrasil;
	private Integer apostaAdversario;
	
	public Integer getApostaBrasil() {
		return apostaBrasil;
	}
	
	public void setApostaBrasil(Integer apostaBrasil) {
		this.apostaBrasil = apostaBrasil;
	}
	
	public Integer getApostaAdversario() {
		return apostaAdversario;
	}
	
	public void setApostaAdversario(Integer apostaAdversario) {
		this.apostaAdversario = apostaAdversario;
	}

}
