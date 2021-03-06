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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Engine
 */
@JsonPropertyOrder({
  Engine.JSON_PROPERTY_ENGINE_ID,
  Engine.JSON_PROPERTY_FUEL_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-15T18:33:33.250539+02:00[Europe/Berlin]")
public class Engine {
  public static final String JSON_PROPERTY_ENGINE_ID = "engineId";
  private String engineId;

  public static final String JSON_PROPERTY_FUEL_TYPE = "fuelType";
  private String fuelType;

  public Engine() { 
  }

  public Engine engineId(String engineId) {
    
    this.engineId = engineId;
    return this;
  }

   /**
   * Get engineId
   * @return engineId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENGINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEngineId() {
    return engineId;
  }


  @JsonProperty(JSON_PROPERTY_ENGINE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEngineId(String engineId) {
    this.engineId = engineId;
  }


  public Engine fuelType(String fuelType) {
    
    this.fuelType = fuelType;
    return this;
  }

   /**
   * Get fuelType
   * @return fuelType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FUEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFuelType() {
    return fuelType;
  }


  @JsonProperty(JSON_PROPERTY_FUEL_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFuelType(String fuelType) {
    this.fuelType = fuelType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Engine engine = (Engine) o;
    return Objects.equals(this.engineId, engine.engineId) &&
        Objects.equals(this.fuelType, engine.fuelType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engineId, fuelType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Engine {\n");
    sb.append("    engineId: ").append(toIndentedString(engineId)).append("\n");
    sb.append("    fuelType: ").append(toIndentedString(fuelType)).append("\n");
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

