package com.br.atividade.beans;

public class Questao { 
	private String pergunta;
	private String resposta;
	private String[] alternativas=new String[4];
	
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	
	}
	public String[] getAlternativas() {
		return alternativas;
	}
	public void setAlternativas(String[] alternativas) {
		this.alternativas = alternativas;
	}
	
}
