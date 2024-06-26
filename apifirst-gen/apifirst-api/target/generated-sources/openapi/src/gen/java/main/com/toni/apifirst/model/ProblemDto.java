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
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

/**
 * The Problem Details JSON Object [[RFC7807](https://tools.ietf.org/html/rfc7807)].
 */
@JsonPropertyOrder({
  ProblemDto.JSON_PROPERTY_TYPE,
  ProblemDto.JSON_PROPERTY_TITLE,
  ProblemDto.JSON_PROPERTY_STATUS,
  ProblemDto.JSON_PROPERTY_DETAIL,
  ProblemDto.JSON_PROPERTY_INSTANCE
})
@JsonTypeName("Problem")
@lombok.Builder @lombok.AllArgsConstructor
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-04T10:40:23.417268387+02:00[Europe/Madrid]")
public class ProblemDto extends HashMap<String, Object> {
  public static final String JSON_PROPERTY_TYPE = "type";
  private URI type;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_DETAIL = "detail";
  private String detail;

  public static final String JSON_PROPERTY_INSTANCE = "instance";
  private String instance;

  public ProblemDto() {

  }

  public ProblemDto type(URI type) {
    
    this.type = type;
    return this;
  }

   /**
   * A URI reference [[RFC3986](https://tools.ietf.org/html/rfc3986)] that identifies the problem type. It should provide human-readable documentation for the problem type. When this member is not present, its value is assumed to be \&quot;about:blank\&quot;.
   * @return type
  **/
  @jakarta.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public URI getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(URI type) {
    this.type = type;
  }


  public ProblemDto title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * A short, human-readable summary of the problem type. It SHOULD NOT change from occurrence to occurrence of the problem, except for purposes of localization.
   * @return title
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public ProblemDto status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * The HTTP status code.
   * minimum: 400
   * maximum: 599
   * @return status
  **/
  @jakarta.annotation.Nullable
 @Min(400) @Max(599)
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Integer status) {
    this.status = status;
  }


  public ProblemDto detail(String detail) {
    
    this.detail = detail;
    return this;
  }

   /**
   * A human-readable explanation specific to this occurrence of the problem.
   * @return detail
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDetail() {
    return detail;
  }


  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetail(String detail) {
    this.detail = detail;
  }


  public ProblemDto instance(String instance) {
    
    this.instance = instance;
    return this;
  }

   /**
   * A URI reference that identifies the specific occurrence of the problem.  It may or may not yield further information if dereferenced.
   * @return instance
  **/
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInstance() {
    return instance;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstance(String instance) {
    this.instance = instance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProblemDto problem = (ProblemDto) o;
    return Objects.equals(this.type, problem.type) &&
        Objects.equals(this.title, problem.title) &&
        Objects.equals(this.status, problem.status) &&
        Objects.equals(this.detail, problem.detail) &&
        Objects.equals(this.instance, problem.instance) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, status, detail, instance, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProblemDto {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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

