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
 * CarEquipment
 */
@JsonPropertyOrder({
  CarEquipment.JSON_PROPERTY_OBJECT_ID,
  CarEquipment.JSON_PROPERTY_DESCRIPTION,
  CarEquipment.JSON_PROPERTY_EQUIPMENT_NUMBER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-15T18:33:33.250539+02:00[Europe/Berlin]")
public class CarEquipment {
  public static final String JSON_PROPERTY_OBJECT_ID = "objectId";
  private String objectId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EQUIPMENT_NUMBER = "equipmentNumber";
  private String equipmentNumber;

  public CarEquipment() { 
  }

  public CarEquipment objectId(String objectId) {
    
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


  public CarEquipment description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public CarEquipment equipmentNumber(String equipmentNumber) {
    
    this.equipmentNumber = equipmentNumber;
    return this;
  }

   /**
   * Get equipmentNumber
   * @return equipmentNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EQUIPMENT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEquipmentNumber() {
    return equipmentNumber;
  }


  @JsonProperty(JSON_PROPERTY_EQUIPMENT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEquipmentNumber(String equipmentNumber) {
    this.equipmentNumber = equipmentNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarEquipment carEquipment = (CarEquipment) o;
    return Objects.equals(this.objectId, carEquipment.objectId) &&
        Objects.equals(this.description, carEquipment.description) &&
        Objects.equals(this.equipmentNumber, carEquipment.equipmentNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, description, equipmentNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarEquipment {\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    equipmentNumber: ").append(toIndentedString(equipmentNumber)).append("\n");
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

