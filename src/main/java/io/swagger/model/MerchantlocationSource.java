package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * Provides reliable addressing for the associated data element to find the origin where associated queries can be performed.
 */
@ApiModel(description = "Provides reliable addressing for the associated data element to find the origin where associated queries can be performed.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-27T13:42:32.904Z")

public class MerchantlocationSource   {
  /**
   * The type of source this represents.
   */
  public enum TypeEnum {
    LOCATION("location"),
    
    MERCHANT("merchant");

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

  @JsonProperty("globalId")
  private String globalId = null;

  @JsonProperty("hostName")
  private String hostName = null;

  @JsonProperty("hostId")
  private BigDecimal hostId = null;

  @JsonProperty("indirectId")
  private String indirectId = null;

  public MerchantlocationSource type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of source this represents.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of source this represents.")
  @NotNull


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MerchantlocationSource globalId(String globalId) {
    this.globalId = globalId;
    return this;
  }

   /**
   * A globally-unique (GUUID) identification for the associated object within the API platform.
   * @return globalId
  **/
  @ApiModelProperty(required = true, value = "A globally-unique (GUUID) identification for the associated object within the API platform.")
  @NotNull


  public String getGlobalId() {
    return globalId;
  }

  public void setGlobalId(String globalId) {
    this.globalId = globalId;
  }

  public MerchantlocationSource hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

   /**
   * The host that owns the data element.
   * @return hostName
  **/
  @ApiModelProperty(required = true, value = "The host that owns the data element.")
  @NotNull


  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public MerchantlocationSource hostId(BigDecimal hostId) {
    this.hostId = hostId;
    return this;
  }

   /**
   * The QLess host-specific data element identifier for the given item.
   * @return hostId
  **/
  @ApiModelProperty(required = true, value = "The QLess host-specific data element identifier for the given item.")
  @NotNull

  @Valid

  public BigDecimal getHostId() {
    return hostId;
  }

  public void setHostId(BigDecimal hostId) {
    this.hostId = hostId;
  }

  public MerchantlocationSource indirectId(String indirectId) {
    this.indirectId = indirectId;
    return this;
  }

   /**
   * A globally-unique (GUUID) identification for the associated object and is equivalent to the QLess indirectId in its database.
   * @return indirectId
  **/
  @ApiModelProperty(value = "A globally-unique (GUUID) identification for the associated object and is equivalent to the QLess indirectId in its database.")


  public String getIndirectId() {
    return indirectId;
  }

  public void setIndirectId(String indirectId) {
    this.indirectId = indirectId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantlocationSource merchantlocationSource = (MerchantlocationSource) o;
    return Objects.equals(this.type, merchantlocationSource.type) &&
        Objects.equals(this.globalId, merchantlocationSource.globalId) &&
        Objects.equals(this.hostName, merchantlocationSource.hostName) &&
        Objects.equals(this.hostId, merchantlocationSource.hostId) &&
        Objects.equals(this.indirectId, merchantlocationSource.indirectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, globalId, hostName, hostId, indirectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantlocationSource {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    globalId: ").append(toIndentedString(globalId)).append("\n");
    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
    sb.append("    indirectId: ").append(toIndentedString(indirectId)).append("\n");
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

