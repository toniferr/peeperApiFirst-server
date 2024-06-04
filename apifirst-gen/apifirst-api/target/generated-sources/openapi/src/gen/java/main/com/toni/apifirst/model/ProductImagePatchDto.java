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
 * ProductImagePatchDto
 */
@JsonPropertyOrder({
  ProductImagePatchDto.JSON_PROPERTY_ID,
  ProductImagePatchDto.JSON_PROPERTY_URL,
  ProductImagePatchDto.JSON_PROPERTY_ALT_TEXT
})
@JsonTypeName("product_image_patch")
@lombok.Builder @lombok.AllArgsConstructor
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-04T10:40:23.417268387+02:00[Europe/Madrid]")
public class ProductImagePatchDto {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public static final String JSON_PROPERTY_ALT_TEXT = "altText";
  private String altText;

  public ProductImagePatchDto() {
  }

  public ProductImagePatchDto id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the image
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


  public ProductImagePatchDto url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The url of the image
   * @return url
  **/
  @jakarta.annotation.Nullable
 @Size(min=5,max=500)
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUrl(String url) {
    this.url = url;
  }


  public ProductImagePatchDto altText(String altText) {
    
    this.altText = altText;
    return this;
  }

   /**
   * Get altText
   * @return altText
  **/
  @jakarta.annotation.Nullable
 @Size(min=3,max=255)
  @JsonProperty(JSON_PROPERTY_ALT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAltText() {
    return altText;
  }


  @JsonProperty(JSON_PROPERTY_ALT_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAltText(String altText) {
    this.altText = altText;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductImagePatchDto productImagePatch = (ProductImagePatchDto) o;
    return Objects.equals(this.id, productImagePatch.id) &&
        Objects.equals(this.url, productImagePatch.url) &&
        Objects.equals(this.altText, productImagePatch.altText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, altText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductImagePatchDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
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

