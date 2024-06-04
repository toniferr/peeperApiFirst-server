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
import com.toni.apifirst.model.OrderCustomerDto;
import com.toni.apifirst.model.OrderLineDto;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

/**
 * OrderDto
 */
@JsonPropertyOrder({
  OrderDto.JSON_PROPERTY_ID,
  OrderDto.JSON_PROPERTY_CUSTOMER,
  OrderDto.JSON_PROPERTY_ORDER_STATUS,
  OrderDto.JSON_PROPERTY_SHIPMENT_INFO,
  OrderDto.JSON_PROPERTY_ORDER_LINES,
  OrderDto.JSON_PROPERTY_DATE_CREATED,
  OrderDto.JSON_PROPERTY_DATE_UPDATED
})
@JsonTypeName("order")
@lombok.Builder @lombok.AllArgsConstructor
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-04T10:40:23.417268387+02:00[Europe/Madrid]")
public class OrderDto {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_CUSTOMER = "customer";
  private OrderCustomerDto customer;

  /**
   * Gets or Sets orderStatus
   */
  public enum OrderStatusEnum {
    NEW("NEW"),
    
    HOLD("HOLD"),
    
    SHIPPED("SHIPPED"),
    
    DELIVERED("DELIVERED"),
    
    CLOSED("CLOSED");

    private String value;

    OrderStatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OrderStatusEnum fromValue(String value) {
      for (OrderStatusEnum b : OrderStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ORDER_STATUS = "orderStatus";
  private OrderStatusEnum orderStatus = OrderStatusEnum.NEW;

  public static final String JSON_PROPERTY_SHIPMENT_INFO = "shipmentInfo";
  private String shipmentInfo;

  public static final String JSON_PROPERTY_ORDER_LINES = "orderLines";
  private List<OrderLineDto> orderLines = new ArrayList<>();

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private OffsetDateTime dateCreated;

  public static final String JSON_PROPERTY_DATE_UPDATED = "dateUpdated";
  private OffsetDateTime dateUpdated;

  public OrderDto() {
  }

  @JsonCreator
  public OrderDto(
    @JsonProperty(JSON_PROPERTY_ID) UUID id, 
    @JsonProperty(JSON_PROPERTY_DATE_CREATED) OffsetDateTime dateCreated, 
    @JsonProperty(JSON_PROPERTY_DATE_UPDATED) OffsetDateTime dateUpdated
  ) {
    this();
    this.id = id;
    this.dateCreated = dateCreated;
    this.dateUpdated = dateUpdated;
  }

   /**
   * System generated unique identifier for the resource.
   * @return id
  **/
  @jakarta.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }




  public OrderDto customer(OrderCustomerDto customer) {
    
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @jakarta.annotation.Nonnull
  @NotNull
  @Valid

  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OrderCustomerDto getCustomer() {
    return customer;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCustomer(OrderCustomerDto customer) {
    this.customer = customer;
  }


  public OrderDto orderStatus(OrderStatusEnum orderStatus) {
    
    this.orderStatus = orderStatus;
    return this;
  }

   /**
   * Get orderStatus
   * @return orderStatus
  **/
  @jakarta.annotation.Nonnull
  @NotNull

  @JsonProperty(JSON_PROPERTY_ORDER_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OrderStatusEnum getOrderStatus() {
    return orderStatus;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrderStatus(OrderStatusEnum orderStatus) {
    this.orderStatus = orderStatus;
  }


  public OrderDto shipmentInfo(String shipmentInfo) {
    
    this.shipmentInfo = shipmentInfo;
    return this;
  }

   /**
   * Get shipmentInfo
   * @return shipmentInfo
  **/
  @jakarta.annotation.Nullable
 @Size(min=1,max=255)
  @JsonProperty(JSON_PROPERTY_SHIPMENT_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getShipmentInfo() {
    return shipmentInfo;
  }


  @JsonProperty(JSON_PROPERTY_SHIPMENT_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShipmentInfo(String shipmentInfo) {
    this.shipmentInfo = shipmentInfo;
  }


  public OrderDto orderLines(List<OrderLineDto> orderLines) {
    
    this.orderLines = orderLines;
    return this;
  }

  public OrderDto addOrderLinesItem(OrderLineDto orderLinesItem) {
    if (this.orderLines == null) {
      this.orderLines = new ArrayList<>();
    }
    this.orderLines.add(orderLinesItem);
    return this;
  }

   /**
   * The order lines of the order
   * @return orderLines
  **/
  @jakarta.annotation.Nonnull
  @NotNull
  @Valid

  @JsonProperty(JSON_PROPERTY_ORDER_LINES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<OrderLineDto> getOrderLines() {
    return orderLines;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_LINES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrderLines(List<OrderLineDto> orderLines) {
    this.orderLines = orderLines;
  }


   /**
   * ISO 8601 Timestamp. Date Created and Date Updated are system managed values, should not be sent in request payloads - will be ignored.
   * @return dateCreated
  **/
  @jakarta.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }




   /**
   * ISO 8601 Timestamp. Date Created and Date Updated are system managed values, should not be sent in request payloads - will be ignored.
   * @return dateUpdated
  **/
  @jakarta.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_DATE_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDateUpdated() {
    return dateUpdated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDto order = (OrderDto) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.customer, order.customer) &&
        Objects.equals(this.orderStatus, order.orderStatus) &&
        Objects.equals(this.shipmentInfo, order.shipmentInfo) &&
        Objects.equals(this.orderLines, order.orderLines) &&
        Objects.equals(this.dateCreated, order.dateCreated) &&
        Objects.equals(this.dateUpdated, order.dateUpdated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customer, orderStatus, shipmentInfo, orderLines, dateCreated, dateUpdated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    shipmentInfo: ").append(toIndentedString(shipmentInfo)).append("\n");
    sb.append("    orderLines: ").append(toIndentedString(orderLines)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUpdated: ").append(toIndentedString(dateUpdated)).append("\n");
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

