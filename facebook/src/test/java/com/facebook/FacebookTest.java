package com.facebook;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.facebook.controller.AdminController;

public class FacebookTest {
	
	AdminController ad;

	@Before
	public void setUp() throws Exception {
		ad=new AdminController();
	}

	@After
	public void tearDown() throws Exception {
		ad=null;
	}

	@Test
	public void testCreateProfile() {
		fail("Not yet implemented");
	}

	@Test
	public void testViewProfile() {
		fail("Not yet implemented");
	}

	@Test
	public void testEditProfile() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteProfile() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchProfile() {
		fail("Not yet implemented");
	}

	@Test
	public void testViewAllProfile() {
		fail("Not yet implemented");
	}

}
