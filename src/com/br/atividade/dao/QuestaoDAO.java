package com.br.atividade.dao;

import java.util.ArrayList;
import java.util.List;

import com.br.atividade.beans.Questao;

public class QuestaoDAO {
	private static List <Questao> questoes=new ArrayList<Questao> ();
	
	public List <Questao> encheQuestoes (){
		Questao q=new Questao();
		q.setPergunta("Quem ganhou a copa de 2002?");
		String[] alternativas=new String [4];
		alternativas[0]="A Russia";
		alternativas[1]="B Brasil";
		alternativas[2]="C Panama";
		alternativas[3]="D Italia";
		
		q.setAlternativas(alternativas);
		q.setResposta("B Brasil");
		questoes.add(q);
		return questoes;
		} 
	}



