package edu.gandhi.prajit.ejb;

import java.time.LocalDateTime;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Session Bean implementation class StickySessionCountBean
 */
@Path("/StickySessionCountBean")
@Singleton
@WebService
@LocalBean
public class StickySessionCountBean {
	@Inject
	private RandomUtil randomUtil;

	@GET
	public String getWelcomeMessage() {
		return "Welcome User:" + randomUtil.randomIdentifier() + " Session Random Value:" + LocalDateTime.now();
	}
}
