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
import io.swagger.client.model.Attributes;
import io.swagger.client.model.Features;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Car
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-09-20T05:00:37.574508435Z[GMT]")

public class Car {
  @SerializedName("thingId")
  private String thingId = null;

  @SerializedName("policyId")
  private String policyId = null;

  @SerializedName("attributes")
  private Attributes attributes = null;

  @SerializedName("features")
  private Features features = null;

  public Car thingId(String thingId) {
    this.thingId = thingId;
    return this;
  }

   /**
   * Get thingId
   * @return thingId
  **/
  @Schema(description = "")
  public String getThingId() {
    return thingId;
  }

  public void setThingId(String thingId) {
    this.thingId = thingId;
  }

  public Car policyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

   /**
   * Get policyId
   * @return policyId
  **/
  @Schema(description = "")
  public String getPolicyId() {
    return policyId;
  }

  public void setPolicyId(String policyId) {
    this.policyId = policyId;
  }

  public Car attributes(Attributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(description = "")
  public Attributes getAttributes() {
    return attributes;
  }

  public void setAttributes(Attributes attributes) {
    this.attributes = attributes;
  }

  public Car features(Features features) {
    this.features = features;
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @Schema(description = "")
  public Features getFeatures() {
    return features;
  }

  public void setFeatures(Features features) {
    this.features = features;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Car car = (Car) o;
    return Objects.equals(this.thingId, car.thingId) &&
        Objects.equals(this.policyId, car.policyId) &&
        Objects.equals(this.attributes, car.attributes) &&
        Objects.equals(this.features, car.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(thingId, policyId, attributes, features);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Car {\n");
    
    sb.append("    thingId: ").append(toIndentedString(thingId)).append("\n");
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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