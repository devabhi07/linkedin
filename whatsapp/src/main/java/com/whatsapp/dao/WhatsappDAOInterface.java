package com.whatsapp.dao;

import com.whatsapp.entity.WhatsappUser;

public interface WhatsappDAOInterface {
	public int createProfileDAO(WhatsappUser w);
	public WhatsappUser[] viewAllProfileDAO();

}
