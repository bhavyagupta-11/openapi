/*package org.acme.openapi.swaggerui;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.api.CarResourceApi;
import io.swagger.client.model.Car;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;

@Path("/cars")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MainApp {

    @Inject
    CarResourceApi carResourceApi;  

    @GET
    public List<Car> listCars() {
        try {
            return carResourceApi.carsGet();
        } catch (ApiException e) {
            throw new WebApplicationException("Error fetching get cars", e, Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @GET
    @Path("/{id}")
    public Response getCar(@PathParam("id") String id) {
        try {
            Car car = carResourceApi.carsIdGet(id);
            return Response.ok(car).build();
        } catch (ApiException e) {
            if (e.getCode() == 404) {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            throw new WebApplicationException("Error fetching car", e, Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @POST
    @Transactional
    public Response createCar(Car car) {
        try {
            Car createdCar = carResourceApi.carsPost(car);
            return Response.status(Response.Status.CREATED).entity(createdCar).build();
        } catch (ApiException e) {
            throw new WebApplicationException("Error creating car", e, Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @PUT
    @Path("/{id}")
    @Transactional
    public Response updateCar(@PathParam("id") String id, Car car) {
        try {
            carResourceApi.carsIdPut(id, car);
            return Response.ok(car).build();
        } catch (ApiException e) {
            if (e.getCode() == 404) {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            throw new WebApplicationException("Error updating car", e, Response.Status.INTERNAL_SERVER_ERROR);
        }
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public Response deleteCar(@PathParam("id") String id) {
        try {
            carResourceApi.carsIdDelete(id);
            return Response.noContent().build();
        } catch (ApiException e) {
            if (e.getCode() == 404) {
                return Response.status(Response.Status.NOT_FOUND).build();
            }
            throw new WebApplicationException("Error deleting car", e, Response.Status.INTERNAL_SERVER_ERROR);
        }
    }
}*/
