/*
 * API First with Spring Boot
 * This is an **example** API to demonstrate features of the OpenAPI specification. 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: email@email.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.toni.apifirst.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

/**
 * CustomerAddressPatchDto
 */
@JsonPropertyOrder({
  CustomerAddressPatchDto.JSON_PROPERTY_ID,
  CustomerAddressPatchDto.JSON_PROPERTY_ADDRESS_LINE1,
  CustomerAddressPatchDto.JSON_PROPERTY_ADDRESS_LINE2,
  CustomerAddressPatchDto.JSON_PROPERTY_CITY,
  CustomerAddressPatchDto.JSON_PROPERTY_STATE,
  CustomerAddressPatchDto.JSON_PROPERTY_ZIP
})
@JsonTypeName("customer_address_patch")
@lombok.Builder @lombok.AllArgsConstructor
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-04T10:40:23.417268387+02:00[Europe/Madrid]")
public class CustomerAddressPatchDto {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_ADDRESS_LINE1 = "addressLine1";
  private String addressLine1;

  public static final String JSON_PROPERTY_ADDRESS_LINE2 = "addressLine2";
  private String addressLine2;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_ZIP = "zip";
  private String zip;

  public CustomerAddressPatchDto() {
  }

  public CustomerAddressPatchDto id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Unique identifier representing a specific customer address
   * @return id
  **/
  @jakarta.annotation.Nonnull
  @NotNull
  @Valid

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(UUID id) {
    this.id = id;
  }


  public CustomerAddressPatchDto addressLine1(String addressLine1) {
    
    this.addressLine1 = addressLine1;
    return this;
  }

   /**
   * Address Line 1
   * @return addressLine1
  **/
  @jakarta.annotation.Nullable
 @Size(min=3,max=100)
  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressLine1() {
    return addressLine1;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressLine1(String addressLine1) {
    this.addressLine1 = addressLine1;
  }


  public CustomerAddressPatchDto addressLine2(String addressLine2) {
    
    this.addressLine2 = addressLine2;
    return this;
  }

   /**
   * Address Line 2
   * @return addressLine2
  **/
  @jakarta.annotation.Nullable
 @Size(min=3,max=100)
  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressLine2() {
    return addressLine2;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddressLine2(String addressLine2) {
    this.addressLine2 = addressLine2;
  }


  public CustomerAddressPatchDto city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * City
   * @return city
  **/
  @jakarta.annotation.Nullable
 @Size(min=2,max=100)
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCity(String city) {
    this.city = city;
  }


  public CustomerAddressPatchDto state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * 2 character state code
   * @return state
  **/
  @jakarta.annotation.Nullable
 @Size(min=2,max=2)
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(String state) {
    this.state = state;
  }


  public CustomerAddressPatchDto zip(String zip) {
    
    this.zip = zip;
    return this;
  }

   /**
   * Zip Code
   * @return zip
  **/
  @jakarta.annotation.Nullable
 @Size(min=5,max=10)
  @JsonProperty(JSON_PROPERTY_ZIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getZip() {
    return zip;
  }


  @JsonProperty(JSON_PROPERTY_ZIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setZip(String zip) {
    this.zip = zip;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerAddressPatchDto customerAddressPatch = (CustomerAddressPatchDto) o;
    return Objects.equals(this.id, customerAddressPatch.id) &&
        Objects.equals(this.addressLine1, customerAddressPatch.addressLine1) &&
        Objects.equals(this.addressLine2, customerAddressPatch.addressLine2) &&
        Objects.equals(this.city, customerAddressPatch.city) &&
        Objects.equals(this.state, customerAddressPatch.state) &&
        Objects.equals(this.zip, customerAddressPatch.zip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, addressLine1, addressLine2, city, state, zip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerAddressPatchDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    addressLine1: ").append(toIndentedString(addressLine1)).append("\n");
    sb.append("    addressLine2: ").append(toIndentedString(addressLine2)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zip: ").append(toIndentedString(zip)).append("\n");
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
