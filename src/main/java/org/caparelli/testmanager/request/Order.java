package org.caparelli.testmanager.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Order
 */
@Validated
public class Order   {

  @JsonProperty("orderId")
  private Long orderId = null;

  @JsonProperty("orderedBy")
  private Clinician orderedBy = null;

  @JsonProperty("patient")
  private Patient patient = null;

  @JsonProperty("tests")
  @Valid
  private List<Test> tests = new ArrayList<Test>();

  /**
   * order status in the laboratory
   */
  public enum StatusEnum {
    PENDING("pending"),
    
    PROCESSED("processed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  public Order orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
  **/
  @ApiModelProperty(value = "")


  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public Order orderedBy(Clinician orderedBy) {
    this.orderedBy = orderedBy;
    return this;
  }

  /**
   * Get orderedBy
   * @return orderedBy
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Clinician getOrderedBy() {
    return orderedBy;
  }

  public void setOrderedBy(Clinician orderedBy) {
    this.orderedBy = orderedBy;
  }

  public Order patient(Patient patient) {
    this.patient = patient;
    return this;
  }

  /**
   * Get patient
   * @return patient
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Patient getPatient() {
    return patient;
  }

  public void setPatient(Patient patient) {
    this.patient = patient;
  }

  public Order tests(List<Test> tests) {
    this.tests = tests;
    return this;
  }

  public Order addTestsItem(Test testsItem) {
    this.tests.add(testsItem);
    return this;
  }

  /**
   * Get tests
   * @return tests
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<Test> getTests() {
    return tests;
  }

  public void setTests(List<Test> tests) {
    this.tests = tests;
  }

  public Order status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * order status in the laboratory
   * @return status
  **/
  @ApiModelProperty(value = "order status in the laboratory")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.orderId, order.orderId) &&
        Objects.equals(this.orderedBy, order.orderedBy) &&
        Objects.equals(this.patient, order.patient) &&
        Objects.equals(this.tests, order.tests) &&
        Objects.equals(this.status, order.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, orderedBy, patient, tests, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderedBy: ").append(toIndentedString(orderedBy)).append("\n");
    sb.append("    patient: ").append(toIndentedString(patient)).append("\n");
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

