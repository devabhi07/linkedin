package com.whatsapp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.whatsapp.controller.WhatsappController;
import com.whatsapp.controller.WhatsappControllerInterface;

public class WhatsappControllerTest {
	
	private WhatsappControllerInterface wc;

	@Before
	public void setUp() throws Exception {
		wc=new WhatsappController();
	}

	@After
	public void tearDown() throws Exception {
		wc=null;
	}

	@Test
	public void testCreateProfile() {
		int c=wc.createProfile();
		assert c>0:"profile creation test fail";
	}

	@Test
	public void testViewAllProfile() {
		//int i=wc.viewAllProfile();
		//assert i>0:"no profile found and test fail";
	}

}
