package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A postal address.
 */
@ApiModel(description = "A postal address.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-27T13:42:32.904Z")

public class MerchantlocationContactInfoAddress   {
  @JsonProperty("addressLines")
  private List<String> addressLines = new ArrayList<String>();

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("state")
  private String state = null;

  @JsonProperty("postalCode")
  private String postalCode = null;

  @JsonProperty("isoCountryCode")
  private String isoCountryCode = "US";

  public MerchantlocationContactInfoAddress addressLines(List<String> addressLines) {
    this.addressLines = addressLines;
    return this;
  }

  public MerchantlocationContactInfoAddress addAddressLinesItem(String addressLinesItem) {
    this.addressLines.add(addressLinesItem);
    return this;
  }

   /**
   * One or more lines of identification within the city.
   * @return addressLines
  **/
  @ApiModelProperty(required = true, value = "One or more lines of identification within the city.")
  @NotNull


  public List<String> getAddressLines() {
    return addressLines;
  }

  public void setAddressLines(List<String> addressLines) {
    this.addressLines = addressLines;
  }

  public MerchantlocationContactInfoAddress city(String city) {
    this.city = city;
    return this;
  }

   /**
   * The city where the address is located.
   * @return city
  **/
  @ApiModelProperty(required = true, value = "The city where the address is located.")
  @NotNull


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public MerchantlocationContactInfoAddress state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The state where the address is located.
   * @return state
  **/
  @ApiModelProperty(value = "The state where the address is located.")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public MerchantlocationContactInfoAddress postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The zip/postal code for the address.
   * @return postalCode
  **/
  @ApiModelProperty(value = "The zip/postal code for the address.")


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public MerchantlocationContactInfoAddress isoCountryCode(String isoCountryCode) {
    this.isoCountryCode = isoCountryCode;
    return this;
  }

   /**
   * The ISO Alpha-2 country code where the address is located.
   * @return isoCountryCode
  **/
  @ApiModelProperty(required = true, value = "The ISO Alpha-2 country code where the address is located.")
  @NotNull


  public String getIsoCountryCode() {
    return isoCountryCode;
  }

  public void setIsoCountryCode(String isoCountryCode) {
    this.isoCountryCode = isoCountryCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantlocationContactInfoAddress merchantlocationContactInfoAddress = (MerchantlocationContactInfoAddress) o;
    return Objects.equals(this.addressLines, merchantlocationContactInfoAddress.addressLines) &&
        Objects.equals(this.city, merchantlocationContactInfoAddress.city) &&
        Objects.equals(this.state, merchantlocationContactInfoAddress.state) &&
        Objects.equals(this.postalCode, merchantlocationContactInfoAddress.postalCode) &&
        Objects.equals(this.isoCountryCode, merchantlocationContactInfoAddress.isoCountryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLines, city, state, postalCode, isoCountryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantlocationContactInfoAddress {\n");
    
    sb.append("    addressLines: ").append(toIndentedString(addressLines)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    isoCountryCode: ").append(toIndentedString(isoCountryCode)).append("\n");
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

