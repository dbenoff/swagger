package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * The information necessary to contact a specific geographic location.
 */
@ApiModel(description = "The information necessary to contact a specific geographic location.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-27T13:42:32.904Z")

public class LocationContactInfo   {
  @JsonProperty("timeZone")
  private String timeZone = null;

  @JsonProperty("address")
  private MerchantlocationContactInfoAddress address = null;

  @JsonProperty("phone")
  private MerchantlocationContactInfoPhone phone = null;

  @JsonProperty("fax")
  private MerchantlocationContactInfoPhone fax = null;

  @JsonProperty("gps")
  private MerchantlocationContactInfoGps gps = null;

  public LocationContactInfo timeZone(String timeZone) {
    this.timeZone = timeZone;
    return this;
  }

   /**
   * The Olson-formatted timezone.
   * @return timeZone
  **/
  @ApiModelProperty(required = true, value = "The Olson-formatted timezone.")
  @NotNull


  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public LocationContactInfo address(MerchantlocationContactInfoAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MerchantlocationContactInfoAddress getAddress() {
    return address;
  }

  public void setAddress(MerchantlocationContactInfoAddress address) {
    this.address = address;
  }

  public LocationContactInfo phone(MerchantlocationContactInfoPhone phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MerchantlocationContactInfoPhone getPhone() {
    return phone;
  }

  public void setPhone(MerchantlocationContactInfoPhone phone) {
    this.phone = phone;
  }

  public LocationContactInfo fax(MerchantlocationContactInfoPhone fax) {
    this.fax = fax;
    return this;
  }

   /**
   * Get fax
   * @return fax
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MerchantlocationContactInfoPhone getFax() {
    return fax;
  }

  public void setFax(MerchantlocationContactInfoPhone fax) {
    this.fax = fax;
  }

  public LocationContactInfo gps(MerchantlocationContactInfoGps gps) {
    this.gps = gps;
    return this;
  }

   /**
   * Get gps
   * @return gps
  **/
  @ApiModelProperty(value = "")

  @Valid

  public MerchantlocationContactInfoGps getGps() {
    return gps;
  }

  public void setGps(MerchantlocationContactInfoGps gps) {
    this.gps = gps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationContactInfo locationContactInfo = (LocationContactInfo) o;
    return Objects.equals(this.timeZone, locationContactInfo.timeZone) &&
        Objects.equals(this.address, locationContactInfo.address) &&
        Objects.equals(this.phone, locationContactInfo.phone) &&
        Objects.equals(this.fax, locationContactInfo.fax) &&
        Objects.equals(this.gps, locationContactInfo.gps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeZone, address, phone, fax, gps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationContactInfo {\n");
    
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    gps: ").append(toIndentedString(gps)).append("\n");
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

