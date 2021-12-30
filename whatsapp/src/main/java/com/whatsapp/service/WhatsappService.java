package com.whatsapp.service;


import com.whatsapp.dao.WhatsappDAO;
import com.whatsapp.dao.WhatsappDAOInterface;
import com.whatsapp.entity.WhatsappUser;

public class WhatsappService implements WhatsappServiceInterface {
	
	
	
	public int createProfileService(WhatsappUser w) {
		WhatsappDAOInterface d=new WhatsappDAO();
		return d.createProfileDAO(w);
	}
	
	public WhatsappUser[] viewAllProfileService() {
		WhatsappDAOInterface d=new WhatsappDAO();
		return d.viewAllProfileDAO();
	}

}
