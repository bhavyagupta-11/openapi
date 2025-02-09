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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * TirePressureProperties
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-20T05:00:37.574508435Z[GMT]")

public class TirePressureProperties {
  @SerializedName("frontLeft")
  private Double frontLeft = null;

  @SerializedName("frontRight")
  private Double frontRight = null;

  @SerializedName("rearLeft")
  private Double rearLeft = null;

  @SerializedName("rearRight")
  private Double rearRight = null;

  public TirePressureProperties frontLeft(Double frontLeft) {
    this.frontLeft = frontLeft;
    return this;
  }

   /**
   * Get frontLeft
   * @return frontLeft
  **/
  @Schema(description = "")
  public Double getFrontLeft() {
    return frontLeft;
  }

  public void setFrontLeft(Double frontLeft) {
    this.frontLeft = frontLeft;
  }

  public TirePressureProperties frontRight(Double frontRight) {
    this.frontRight = frontRight;
    return this;
  }

   /**
   * Get frontRight
   * @return frontRight
  **/
  @Schema(description = "")
  public Double getFrontRight() {
    return frontRight;
  }

  public void setFrontRight(Double frontRight) {
    this.frontRight = frontRight;
  }

  public TirePressureProperties rearLeft(Double rearLeft) {
    this.rearLeft = rearLeft;
    return this;
  }

   /**
   * Get rearLeft
   * @return rearLeft
  **/
  @Schema(description = "")
  public Double getRearLeft() {
    return rearLeft;
  }

  public void setRearLeft(Double rearLeft) {
    this.rearLeft = rearLeft;
  }

  public TirePressureProperties rearRight(Double rearRight) {
    this.rearRight = rearRight;
    return this;
  }

   /**
   * Get rearRight
   * @return rearRight
  **/
  @Schema(description = "")
  public Double getRearRight() {
    return rearRight;
  }

  public void setRearRight(Double rearRight) {
    this.rearRight = rearRight;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TirePressureProperties tirePressureProperties = (TirePressureProperties) o;
    return Objects.equals(this.frontLeft, tirePressureProperties.frontLeft) &&
        Objects.equals(this.frontRight, tirePressureProperties.frontRight) &&
        Objects.equals(this.rearLeft, tirePressureProperties.rearLeft) &&
        Objects.equals(this.rearRight, tirePressureProperties.rearRight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frontLeft, frontRight, rearLeft, rearRight);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TirePressureProperties {\n");
    
    sb.append("    frontLeft: ").append(toIndentedString(frontLeft)).append("\n");
    sb.append("    frontRight: ").append(toIndentedString(frontRight)).append("\n");
    sb.append("    rearLeft: ").append(toIndentedString(rearLeft)).append("\n");
    sb.append("    rearRight: ").append(toIndentedString(rearRight)).append("\n");
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
