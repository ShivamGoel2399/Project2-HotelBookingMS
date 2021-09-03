package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.project2.model.Address;
import com.project2.model.Booking;
import com.project2.model.Hotel;
import com.project2.model.LoginModel;
import com.project2.model.RegistrationModel;
import com.project2.model.Room;

//@SpringBootTest
class BookingServiceApplicationTests {

	@Test
	void contextLoads() {
	}
	private static Address address;
	private static Booking booking;
	private static Hotel hotel;
	private static LoginModel loginmodel;
	private static RegistrationModel registrationmodel;
	private static Room room;
	
	@BeforeAll
	public static void setBookingServiceApplicationTest() {
		address = new Address("New Area", "Patna","Bihar",123456);
		loginmodel = new LoginModel(1L,"theamarkant","amar1234","customer");
		registrationmodel = new RegistrationModel(1,"Amarkant", "Sinha", "amarkant1234@gmail.com", "9945658525");	
	}
	
	@Test
	 public void testfindById() {
		int id = registrationmodel.getId();
		assertEquals(1, id);
	}
	
	@Test
	 public void testfindByIdFalse() {
		int id = registrationmodel.getId();
		assertFalse(id!=1);
	}
	
	@Test
	 public void testfindByIdTrue() {
		int id = registrationmodel.getId();
		assertTrue(id==1);
	}
	
	@Test
	 public void testfindByrole() {
		String role = loginmodel.getRole();
		assertEquals("customer", role);
	}
	
	@Test
	 public void testfindByroleFalse() {
		String role = loginmodel.getRole();
		assertFalse(!role.equals("customer"));
	}
	
	@Test
	 public void testfindByroleTrue() {
		String role = loginmodel.getRole();
		assertTrue(role.equals("customer"));
	}
	
	@Test
	 public void testfindByusername() {
		String username = loginmodel.getUsername();
		assertEquals("theamarkant", username);
	}
	
	@Test
	 public void testfindByusernameFalse() {
		String username = loginmodel.getUsername();
		assertFalse(!username.equals("theamarkant"));
	}
	
	@Test
	 public void testfindByusernameTrue() {
		String username = loginmodel.getUsername();
		assertTrue(username.equals("theamarkant"));
	}

}
