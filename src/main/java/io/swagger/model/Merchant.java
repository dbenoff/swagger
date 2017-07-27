package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Describes a single merchant in the QLess system.
 */
@ApiModel(description = "Describes a single merchant in the QLess system.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-27T13:42:32.904Z")

public class Merchant   {

  public UUID uuid = UUID.randomUUID();

  @JsonProperty("source")
  private MerchantlocationSource source = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("locations")
  private List<InlineResponse200> locations = null;

  @JsonProperty("showTTbeforeQueue")
  private Boolean showTTbeforeQueue = null;

  public Merchant source(MerchantlocationSource source) {
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

  public Merchant name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The merchant descriptive name.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The merchant descriptive name.")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Merchant locations(List<InlineResponse200> locations) {
    this.locations = locations;
    return this;
  }

  public Merchant addLocationsItem(InlineResponse200 locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<InlineResponse200>();
    }
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * The physical locations this merchant serves.
   * @return locations
  **/
  @ApiModelProperty(value = "The physical locations this merchant serves.")

  @Valid

  public List<InlineResponse200> getLocations() {
    return locations;
  }

  public void setLocations(List<InlineResponse200> locations) {
    this.locations = locations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Merchant merchant = (Merchant) o;
    return Objects.equals(this.source, merchant.source) &&
        Objects.equals(this.name, merchant.name) &&
        Objects.equals(this.locations, merchant.locations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, name, locations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Merchant {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
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

