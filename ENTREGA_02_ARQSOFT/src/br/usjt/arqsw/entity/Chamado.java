package br.usjt.arqsw.entity;

import java.io.Serializable;
import java.util.Date;
/**
 * 
 * @author Raphael Silva RA:816110743
 *
 */
public class Chamado implements Serializable{

	/**
	 * Daniele Souza Santos RA:816121026 SIMCA1
	 */
		
	private static final long serialVersionUID = 1L;
	
	public static final String ABERTO = "aberto";
	public static final String FECHADO = "fechado";
	
	private Fila fila;
	private int numero;
	private String nome, status;
	private Date aberto;
	private Date fechado;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getAberto() {
		return aberto;
	}
	public void setAberto(Date aberto) {
		this.aberto = aberto;
	}
	public Date getFechado() {
		return fechado;
	}
	public void setFechado(Date fechado) {
		this.fechado = fechado;
	}
	public Fila getFila() {
		return fila;
	}
	public void setFila(Fila fila) {
		this.fila = fila;
	}
	@Override
	public String toString() {
		return "Chamado [fila=" + fila + ", numero=" + numero + ", nome=" + nome + ", status=" + status + ", aberto="
				+ aberto + ", fechado=" + fechado + "]";
	}
	

}
