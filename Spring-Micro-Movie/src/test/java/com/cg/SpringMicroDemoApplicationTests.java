package com.cg;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.booking_service.BookingController;
import com.cg.booking_service.dto.Ticket;
import com.cg.booking_service.repo.TicketDao;
import com.cg.entry_point.dto.MovieDetails;
import com.cg.entry_point.rest.EntryController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringMicroDemoApplicationTests {

	@Autowired private EntryController details;
	
	@Test
	public void contextLoads() {
		assertNotNull(details);
	}

}
