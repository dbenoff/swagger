package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * GPS coordinates for a location on earth.
 */
@ApiModel(description = "GPS coordinates for a location on earth.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-27T13:42:32.904Z")

public class MerchantlocationContactInfoGps   {
  @JsonProperty("latitude")
  private BigDecimal latitude = null;

  @JsonProperty("longitude")
  private BigDecimal longitude = null;

  public MerchantlocationContactInfoGps latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * The latitude for the site.
   * @return latitude
  **/
  @ApiModelProperty(required = true, value = "The latitude for the site.")
  @NotNull

  @Valid

  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public MerchantlocationContactInfoGps longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * The longitude for the site.
   * @return longitude
  **/
  @ApiModelProperty(required = true, value = "The longitude for the site.")
  @NotNull

  @Valid

  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantlocationContactInfoGps merchantlocationContactInfoGps = (MerchantlocationContactInfoGps) o;
    return Objects.equals(this.latitude, merchantlocationContactInfoGps.latitude) &&
        Objects.equals(this.longitude, merchantlocationContactInfoGps.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantlocationContactInfoGps {\n");
    
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

