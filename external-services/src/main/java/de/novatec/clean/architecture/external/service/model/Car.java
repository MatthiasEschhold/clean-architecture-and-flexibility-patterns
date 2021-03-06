/*
 * Car and Car Rating Service
 * Query car masterdata and rate car
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: matthias.eschhold@novatec-gmbh.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.novatec.clean.architecture.external.service.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Car
 */
@JsonPropertyOrder({
  Car.JSON_PROPERTY_OBJECT_ID,
  Car.JSON_PROPERTY_REGISTRATION_NUMBER,
  Car.JSON_PROPERTY_MILEAGE,
  Car.JSON_PROPERTY_MASTERDATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-15T18:33:33.250539+02:00[Europe/Berlin]")
public class Car {
  public static final String JSON_PROPERTY_OBJECT_ID = "objectId";
  private String objectId;

  public static final String JSON_PROPERTY_REGISTRATION_NUMBER = "registrationNumber";
  private String registrationNumber;

  public static final String JSON_PROPERTY_MILEAGE = "mileage";
  private BigDecimal mileage;

  public static final String JSON_PROPERTY_MASTERDATA = "masterdata";
  private CarMasterdata masterdata;

  public Car() { 
  }

  public Car objectId(String objectId) {
    
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OBJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getObjectId() {
    return objectId;
  }


  @JsonProperty(JSON_PROPERTY_OBJECT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }


  public Car registrationNumber(String registrationNumber) {
    
    this.registrationNumber = registrationNumber;
    return this;
  }

   /**
   * Get registrationNumber
   * @return registrationNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGISTRATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegistrationNumber() {
    return registrationNumber;
  }


  @JsonProperty(JSON_PROPERTY_REGISTRATION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegistrationNumber(String registrationNumber) {
    this.registrationNumber = registrationNumber;
  }


  public Car mileage(BigDecimal mileage) {
    
    this.mileage = mileage;
    return this;
  }

   /**
   * Get mileage
   * @return mileage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MILEAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getMileage() {
    return mileage;
  }


  @JsonProperty(JSON_PROPERTY_MILEAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMileage(BigDecimal mileage) {
    this.mileage = mileage;
  }


  public Car masterdata(CarMasterdata masterdata) {
    
    this.masterdata = masterdata;
    return this;
  }

   /**
   * Get masterdata
   * @return masterdata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MASTERDATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CarMasterdata getMasterdata() {
    return masterdata;
  }


  @JsonProperty(JSON_PROPERTY_MASTERDATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMasterdata(CarMasterdata masterdata) {
    this.masterdata = masterdata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Car car = (Car) o;
    return Objects.equals(this.objectId, car.objectId) &&
        Objects.equals(this.registrationNumber, car.registrationNumber) &&
        Objects.equals(this.mileage, car.mileage) &&
        Objects.equals(this.masterdata, car.masterdata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, registrationNumber, mileage, masterdata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Car {\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    registrationNumber: ").append(toIndentedString(registrationNumber)).append("\n");
    sb.append("    mileage: ").append(toIndentedString(mileage)).append("\n");
    sb.append("    masterdata: ").append(toIndentedString(masterdata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

