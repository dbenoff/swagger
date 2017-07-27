package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Fully describes a single QLess merchant location.
 */
@ApiModel(description = "Fully describes a single QLess merchant location.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-27T13:42:32.904Z")

public class Location   {
  @JsonProperty("source")
  private MerchantlocationSource source = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("merchantInfo")
  private Merchant merchantInfo = null;

  @JsonProperty("contactInfo")
  private MerchantlocationContactInfo contactInfo = null;

  @JsonProperty("consumerFeatures")
  private MerchantlocationConsumerFeatures consumerFeatures = null;

  public Location source(MerchantlocationSource source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MerchantlocationSource getSource() {
    return source;
  }

  public void setSource(MerchantlocationSource source) {
    this.source = source;
  }

  public Location name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this location.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of this location.")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Location description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Descriptive text for this location.
   * @return description
  **/
  @ApiModelProperty(value = "Descriptive text for this location.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Location merchantInfo(Merchant merchantInfo) {
    this.merchantInfo = merchantInfo;
    return this;
  }

   /**
   * Get merchantInfo
   * @return merchantInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Merchant getMerchantInfo() {
    return merchantInfo;
  }

  public void setMerchantInfo(Merchant merchantInfo) {
    this.merchantInfo = merchantInfo;
  }

  public Location contactInfo(MerchantlocationContactInfo contactInfo) {
    this.contactInfo = contactInfo;
    return this;
  }

   /**
   * Get contactInfo
   * @return contactInfo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MerchantlocationContactInfo getContactInfo() {
    return contactInfo;
  }

  public void setContactInfo(MerchantlocationContactInfo contactInfo) {
    this.contactInfo = contactInfo;
  }

  public Location consumerFeatures(MerchantlocationConsumerFeatures consumerFeatures) {
    this.consumerFeatures = consumerFeatures;
    return this;
  }

   /**
   * Get consumerFeatures
   * @return consumerFeatures
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MerchantlocationConsumerFeatures getConsumerFeatures() {
    return consumerFeatures;
  }

  public void setConsumerFeatures(MerchantlocationConsumerFeatures consumerFeatures) {
    this.consumerFeatures = consumerFeatures;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.source, location.source) &&
        Objects.equals(this.name, location.name) &&
        Objects.equals(this.description, location.description) &&
        Objects.equals(this.merchantInfo, location.merchantInfo) &&
        Objects.equals(this.contactInfo, location.contactInfo) &&
        Objects.equals(this.consumerFeatures, location.consumerFeatures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, name, description, merchantInfo, contactInfo, consumerFeatures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    merchantInfo: ").append(toIndentedString(merchantInfo)).append("\n");
    sb.append("    contactInfo: ").append(toIndentedString(contactInfo)).append("\n");
    sb.append("    consumerFeatures: ").append(toIndentedString(consumerFeatures)).append("\n");
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

