package io.swagger.client;

import io.swagger.client.api.CarResourceApi;
import io.swagger.client.model.Car;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        ApiClient apiClient = new ApiClient();
        //apiClient.setBasePath("http://localhost:8080"); 
        
        CarResourceApi carApi = new CarResourceApi(apiClient);
        
        try {
            List<Car> cars = carApi.carsGet(); 
            System.out.println(cars);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarResourceApi#carsGet");
            e.printStackTrace();
        }
    }
}

