package service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import model.Customer;
import model.OrderDetails;

@Path("orderDetails")
public class OrderDetailsServiceImpl {
	@POST
	@Path("fetchOrders")
	@Produces(MediaType.APPLICATION_JSON)
	public Response fetchOrders(int customerId){
		List<OrderDetails> orderDetailsList=null;
		try{
			Customer customer=new Customer();
			
			
		}
		catch(Exception e){
			return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
		}
		return Response.status(Status.OK).entity(orderDetailsList).build();
	}
}

}
