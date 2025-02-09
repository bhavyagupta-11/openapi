/*
 * openapi-swaggerui-quickstart API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.Location;
import io.swagger.client.model.TirePressure;
import io.swagger.client.model.Vehicle;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Features
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-20T05:00:37.574508435Z[GMT]")

public class Features {
  @SerializedName("location")
  private Location location = null;

  @SerializedName("vehicle")
  private Vehicle vehicle = null;

  @SerializedName("tirePressure")
  private TirePressure tirePressure = null;

  public Features location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @Schema(description = "")
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public Features vehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
    return this;
  }

   /**
   * Get vehicle
   * @return vehicle
  **/
  @Schema(description = "")
  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public Features tirePressure(TirePressure tirePressure) {
    this.tirePressure = tirePressure;
    return this;
  }

   /**
   * Get tirePressure
   * @return tirePressure
  **/
  @Schema(description = "")
  public TirePressure getTirePressure() {
    return tirePressure;
  }

  public void setTirePressure(TirePressure tirePressure) {
    this.tirePressure = tirePressure;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Features features = (Features) o;
    return Objects.equals(this.location, features.location) &&
        Objects.equals(this.vehicle, features.vehicle) &&
        Objects.equals(this.tirePressure, features.tirePressure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(location, vehicle, tirePressure);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Features {\n");
    
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    vehicle: ").append(toIndentedString(vehicle)).append("\n");
    sb.append("    tirePressure: ").append(toIndentedString(tirePressure)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
