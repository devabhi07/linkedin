package com.whatsapp.service;

import com.whatsapp.entity.WhatsappUser;

public interface WhatsappServiceInterface {
	public int createProfileService(WhatsappUser w);
	public WhatsappUser[] viewAllProfileService();

}
