package com.instagram.dao;

import com.instagram.entity.InstagramUser;

public class InstagramDAO implements InstagramDAOInterface {
	
	private static InstagramUser uu[]=new InstagramUser[10];

	public int createProfileDAO(InstagramUser su) {
		int i=0;
//		for(InstagramUser s1:uu) {
		for(int j=0;j<uu.length;j++) {
			if(uu[j]==null) {
				uu[j]=su;
				i=1;
				break;
			}
		}
		// TODO Auto-generated method stub
		return i;
	}

	public InstagramUser[] viewAllProfileDAO() {
		// TODO Auto-generated method stub
//		int i=0;
//		for(InstagramUser s1:uu) {
//			if(s1!=null) {
//				i++;
//			}
	//}
		return uu;
	}

}
