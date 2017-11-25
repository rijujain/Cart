package service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import dao.CustomerDAO;
import dao.CustomerDAOImpl;

@Path("customer")
public class CustomerServiceImpl {
	CustomerDAO customerDAO = new CustomerDAOImpl();

	@GET
	@Path("verifyEmail/{email_Id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response verifyEmailId(@PathParam("email_id") String emailId) {
		Boolean value = null;
		try {
			value = customerDAO.verifyEmailId(emailId);
			System.out.println(value);

		} catch (Exception e) {
			return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
		}
		return Response.status(Status.OK).entity(value).build();
	}

}
