package com.instagram.service;

import com.instagram.dao.InstagramDAO;
import com.instagram.dao.InstagramDAOInterface;
import com.instagram.entity.InstagramUser;

public class InstagramService implements InstagramServiceInterface {

	public int createProfileService(InstagramUser su) {
		// TODO Auto-generated method stub
		InstagramDAOInterface sd=new InstagramDAO();
		return sd.createProfileDAO(su);
	}

	public InstagramUser[] viewAllProfileServie() {
		// TODO Auto-generated method stub
		InstagramDAOInterface sd=new InstagramDAO();
		return sd.viewAllProfileDAO();
	}

}
