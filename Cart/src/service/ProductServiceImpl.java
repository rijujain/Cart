package service;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import dao.ProductDAO;
import dao.ProductDAOImpl;
import model.Product;

@Path("product")
public class ProductServiceImpl {
	ProductDAO productDAO=new ProductDAOImpl();
	@POST
	@Path("insertDetails")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response inserDetails(List<Product> data){
		String message=null;
		try{
			message=productDAO.insertDetails(data);
		}
		catch(Exception e){
			return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
		}
		return Response.status(Status.OK).entity(message).build();
	}
	@GET
	@Path("getAll")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllProducts(){
		List<Product> list=null;
		try{
			list=productDAO.getAllProducts();
		}
		catch(Exception e){
			return Response.status(Status.BAD_REQUEST).entity(e.getMessage()).build();
		}
		return Response.status(Status.BAD_REQUEST).entity(list).build();
	}
	}
