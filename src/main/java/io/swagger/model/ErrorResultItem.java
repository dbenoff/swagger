package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Provides the source of a single error that is preventing the host from completing an operation.
 */
@ApiModel(description = "Provides the source of a single error that is preventing the host from completing an operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-27T13:42:32.904Z")

public class ErrorResultItem   {
  @JsonProperty("category")
  private String category = null;

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  public ErrorResultItem category(String category) {
    this.category = category;
    return this;
  }

   /**
   * The type of error that occurred.
   * @return category
  **/
  @ApiModelProperty(example = "parameter", required = true, value = "The type of error that occurred.")
  @NotNull


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public ErrorResultItem errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * The description of the error condition.
   * @return errorMessage
  **/
  @ApiModelProperty(required = true, value = "The description of the error condition.")
  @NotNull


  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResultItem errorResultItem = (ErrorResultItem) o;
    return Objects.equals(this.category, errorResultItem.category) &&
        Objects.equals(this.errorMessage, errorResultItem.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResultItem {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

