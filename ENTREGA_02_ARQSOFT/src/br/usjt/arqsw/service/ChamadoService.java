package br.usjt.arqsw.service;

import java.io.IOException;
import java.util.Date;

import br.usjt.arqsw.dao.ChamadoDAO;
import br.usjt.arqsw.entity.Chamado;

public class ChamadoService {
private ChamadoDAO dao;
	

	public ChamadoService() {
		dao = new ChamadoDAO();
	}
		
	public int criarChamado(Chamado chamado) throws IOException {
		chamado.setStatus (chamado.ABERTO);
		chamado.setAberto(new Date());
		return dao.criarChamado(chamado);
	}

	
}

