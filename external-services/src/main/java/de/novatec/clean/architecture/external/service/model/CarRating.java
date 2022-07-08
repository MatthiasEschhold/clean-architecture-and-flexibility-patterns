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
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * CarRating
 */
@JsonPropertyOrder({
  CarRating.JSON_PROPERTY_RATING_ID,
  CarRating.JSON_PROPERTY_CAR,
  CarRating.JSON_PROPERTY_RATING_VALUES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-15T18:33:33.250539+02:00[Europe/Berlin]")
public class CarRating {
  public static final String JSON_PROPERTY_RATING_ID = "ratingId";
  private BigDecimal ratingId;

  public static final String JSON_PROPERTY_CAR = "car";
  private Car car;

  public static final String JSON_PROPERTY_RATING_VALUES = "ratingValues";
  private List<RatingValue> ratingValues = null;

  public CarRating() { 
  }

  public CarRating ratingId(BigDecimal ratingId) {
    
    this.ratingId = ratingId;
    return this;
  }

   /**
   * Get ratingId
   * @return ratingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RATING_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BigDecimal getRatingId() {
    return ratingId;
  }


  @JsonProperty(JSON_PROPERTY_RATING_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatingId(BigDecimal ratingId) {
    this.ratingId = ratingId;
  }


  public CarRating car(Car car) {
    
    this.car = car;
    return this;
  }

   /**
   * Get car
   * @return car
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Car getCar() {
    return car;
  }


  @JsonProperty(JSON_PROPERTY_CAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCar(Car car) {
    this.car = car;
  }


  public CarRating ratingValues(List<RatingValue> ratingValues) {
    
    this.ratingValues = ratingValues;
    return this;
  }

  public CarRating addRatingValuesItem(RatingValue ratingValuesItem) {
    if (this.ratingValues == null) {
      this.ratingValues = new ArrayList<>();
    }
    this.ratingValues.add(ratingValuesItem);
    return this;
  }

   /**
   * Get ratingValues
   * @return ratingValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RATING_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RatingValue> getRatingValues() {
    return ratingValues;
  }


  @JsonProperty(JSON_PROPERTY_RATING_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatingValues(List<RatingValue> ratingValues) {
    this.ratingValues = ratingValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarRating carRating = (CarRating) o;
    return Objects.equals(this.ratingId, carRating.ratingId) &&
        Objects.equals(this.car, carRating.car) &&
        Objects.equals(this.ratingValues, carRating.ratingValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ratingId, car, ratingValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CarRating {\n");
    sb.append("    ratingId: ").append(toIndentedString(ratingId)).append("\n");
    sb.append("    car: ").append(toIndentedString(car)).append("\n");
    sb.append("    ratingValues: ").append(toIndentedString(ratingValues)).append("\n");
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
