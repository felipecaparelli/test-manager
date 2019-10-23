package org.caparelli.testmanager.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Test
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-23T23:28:27.788+02:00")

public class Test   {
  @JsonProperty("testId")
  private Long testId = null;

  /**
   * Test Type
   */
  public enum TypeEnum {
    BIOCHEMISTRY("BIOCHEMISTRY"),
    
    MICROBIOLOGY("MICROBIOLOGY"),
    
    HEMATOLOGY("HEMATOLOGY");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("operations")
  @Valid
  private List<Operation> operations = null;

  public Test testId(Long testId) {
    this.testId = testId;
    return this;
  }

  /**
   * Get testId
   * @return testId
  **/
  @ApiModelProperty(value = "")


  public Long getTestId() {
    return testId;
  }

  public void setTestId(Long testId) {
    this.testId = testId;
  }

  public Test type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Test Type
   * @return type
  **/
  @ApiModelProperty(value = "Test Type")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Test operations(List<Operation> operations) {
    this.operations = operations;
    return this;
  }

  public Test addOperationsItem(Operation operationsItem) {
    if (this.operations == null) {
      this.operations = new ArrayList<Operation>();
    }
    this.operations.add(operationsItem);
    return this;
  }

  /**
   * Get operations
   * @return operations
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Operation> getOperations() {
    return operations;
  }

  public void setOperations(List<Operation> operations) {
    this.operations = operations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Test test = (Test) o;
    return Objects.equals(this.testId, test.testId) &&
        Objects.equals(this.type, test.type) &&
        Objects.equals(this.operations, test.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(testId, type, operations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Test {\n");
    
    sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
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

