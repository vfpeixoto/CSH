package br.com.csh.web.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class JsfUtil {
	
	public static void mensagemOK(String idMensagem, String conteudo) {
		messageFactory(FacesMessage.SEVERITY_INFO, idMensagem, conteudo);
	}

	public static void mensagemErro(String idMensagem, String conteudo) {
		
		messageFactory(FacesMessage.SEVERITY_ERROR, idMensagem, conteudo);
	}

	public static void mensagemFatal(String idMensagem, String conteudo) {
		messageFactory(FacesMessage.SEVERITY_FATAL, idMensagem, conteudo);
	}

	public static void mensagemPerigo(String idMensagem, String conteudo) {
		messageFactory(FacesMessage.SEVERITY_INFO, idMensagem, conteudo);
	}

	private static void messageFactory(FacesMessage.Severity msg, String idMensagem, String conteudo){
		FacesContext context = FacesContext.getCurrentInstance();

		FacesMessage message = new FacesMessage(msg,conteudo, conteudo);
		context.addMessage(idMensagem, message);
	}
	
	
}
