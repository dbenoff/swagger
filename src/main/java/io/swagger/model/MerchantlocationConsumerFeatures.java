package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Describes the queuing features for the location that are influence consumer experience.
 */
@ApiModel(description = "Describes the queuing features for the location that are influence consumer experience.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-27T13:42:32.904Z")

public class MerchantlocationConsumerFeatures   {
  @JsonProperty("hasAppointments")
  private Boolean hasAppointments = false;

  @JsonProperty("hasCustomScreens")
  private Boolean hasCustomScreens = false;

  @JsonProperty("hasSMSSummoning")
  private Boolean hasSMSSummoning = false;

  @JsonProperty("hasVoiceQueuing")
  private Boolean hasVoiceQueuing = false;

  @JsonProperty("hasTransactionTypes")
  private Boolean hasTransactionTypes = false;

  @JsonProperty("maxSimultaneousQueues")
  private Integer maxSimultaneousQueues = null;

  @JsonProperty("supportsPartySize")
  private Boolean supportsPartySize = false;

  @JsonProperty("shouldDisplayTransactionTypesBeforeQueues")
  private Boolean shouldDisplayTransactionTypesBeforeQueues = false;

  @JsonProperty("supportedLocales")
  private List<String> supportedLocales = new ArrayList<String>();

  public MerchantlocationConsumerFeatures hasAppointments(Boolean hasAppointments) {
    this.hasAppointments = hasAppointments;
    return this;
  }

   /**
   * Appointments may be scheduled at this location.
   * @return hasAppointments
  **/
  @ApiModelProperty(required = true, value = "Appointments may be scheduled at this location.")
  @NotNull


  public Boolean getHasAppointments() {
    return hasAppointments;
  }

  public void setHasAppointments(Boolean hasAppointments) {
    this.hasAppointments = hasAppointments;
  }

  public MerchantlocationConsumerFeatures hasCustomScreens(Boolean hasCustomScreens) {
    this.hasCustomScreens = hasCustomScreens;
    return this;
  }

   /**
   * Queuing a customer at the location recommends providing additional custom content.
   * @return hasCustomScreens
  **/
  @ApiModelProperty(required = true, value = "Queuing a customer at the location recommends providing additional custom content.")
  @NotNull


  public Boolean getHasCustomScreens() {
    return hasCustomScreens;
  }

  public void setHasCustomScreens(Boolean hasCustomScreens) {
    this.hasCustomScreens = hasCustomScreens;
  }

  public MerchantlocationConsumerFeatures hasSMSSummoning(Boolean hasSMSSummoning) {
    this.hasSMSSummoning = hasSMSSummoning;
    return this;
  }

   /**
   * Consumers may be summoned via SMS.
   * @return hasSMSSummoning
  **/
  @ApiModelProperty(required = true, value = "Consumers may be summoned via SMS.")
  @NotNull


  public Boolean getHasSMSSummoning() {
    return hasSMSSummoning;
  }

  public void setHasSMSSummoning(Boolean hasSMSSummoning) {
    this.hasSMSSummoning = hasSMSSummoning;
  }

  public MerchantlocationConsumerFeatures hasVoiceQueuing(Boolean hasVoiceQueuing) {
    this.hasVoiceQueuing = hasVoiceQueuing;
    return this;
  }

   /**
   * Consumers may call a dedicated phone number to manage their queue position.
   * @return hasVoiceQueuing
  **/
  @ApiModelProperty(required = true, value = "Consumers may call a dedicated phone number to manage their queue position.")
  @NotNull


  public Boolean getHasVoiceQueuing() {
    return hasVoiceQueuing;
  }

  public void setHasVoiceQueuing(Boolean hasVoiceQueuing) {
    this.hasVoiceQueuing = hasVoiceQueuing;
  }

  public MerchantlocationConsumerFeatures hasTransactionTypes(Boolean hasTransactionTypes) {
    this.hasTransactionTypes = hasTransactionTypes;
    return this;
  }

   /**
   * Queued customers may include transaction types describing their desired service.
   * @return hasTransactionTypes
  **/
  @ApiModelProperty(required = true, value = "Queued customers may include transaction types describing their desired service.")
  @NotNull


  public Boolean getHasTransactionTypes() {
    return hasTransactionTypes;
  }

  public void setHasTransactionTypes(Boolean hasTransactionTypes) {
    this.hasTransactionTypes = hasTransactionTypes;
  }

  public MerchantlocationConsumerFeatures maxSimultaneousQueues(Integer maxSimultaneousQueues) {
    this.maxSimultaneousQueues = maxSimultaneousQueues;
    return this;
  }

   /**
   * The maximum number of queues that may be entered at one time.
   * minimum: 0
   * @return maxSimultaneousQueues
  **/
  @ApiModelProperty(required = true, value = "The maximum number of queues that may be entered at one time.")
  @NotNull

 @Min(0)
  public Integer getMaxSimultaneousQueues() {
    return maxSimultaneousQueues;
  }

  public void setMaxSimultaneousQueues(Integer maxSimultaneousQueues) {
    this.maxSimultaneousQueues = maxSimultaneousQueues;
  }

  public MerchantlocationConsumerFeatures supportsPartySize(Boolean supportsPartySize) {
    this.supportsPartySize = supportsPartySize;
    return this;
  }

   /**
   * Party size is required when entering queues.
   * @return supportsPartySize
  **/
  @ApiModelProperty(required = true, value = "Party size is required when entering queues.")
  @NotNull


  public Boolean getSupportsPartySize() {
    return supportsPartySize;
  }

  public void setSupportsPartySize(Boolean supportsPartySize) {
    this.supportsPartySize = supportsPartySize;
  }

  public MerchantlocationConsumerFeatures shouldDisplayTransactionTypesBeforeQueues(Boolean shouldDisplayTransactionTypesBeforeQueues) {
    this.shouldDisplayTransactionTypesBeforeQueues = shouldDisplayTransactionTypesBeforeQueues;
    return this;
  }

   /**
   * Recommends that consumers being queued be allowed to first choose their desired transaction type before their target queue.
   * @return shouldDisplayTransactionTypesBeforeQueues
  **/
  @ApiModelProperty(required = true, value = "Recommends that consumers being queued be allowed to first choose their desired transaction type before their target queue.")
  @NotNull


  public Boolean getShouldDisplayTransactionTypesBeforeQueues() {
    return shouldDisplayTransactionTypesBeforeQueues;
  }

  public void setShouldDisplayTransactionTypesBeforeQueues(Boolean shouldDisplayTransactionTypesBeforeQueues) {
    this.shouldDisplayTransactionTypesBeforeQueues = shouldDisplayTransactionTypesBeforeQueues;
  }

  public MerchantlocationConsumerFeatures supportedLocales(List<String> supportedLocales) {
    this.supportedLocales = supportedLocales;
    return this;
  }

  public MerchantlocationConsumerFeatures addSupportedLocalesItem(String supportedLocalesItem) {
    this.supportedLocales.add(supportedLocalesItem);
    return this;
  }

   /**
   * Provides the list of supported languages for consumers at the location.
   * @return supportedLocales
  **/
  @ApiModelProperty(required = true, value = "Provides the list of supported languages for consumers at the location.")
  @NotNull


  public List<String> getSupportedLocales() {
    return supportedLocales;
  }

  public void setSupportedLocales(List<String> supportedLocales) {
    this.supportedLocales = supportedLocales;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantlocationConsumerFeatures merchantlocationConsumerFeatures = (MerchantlocationConsumerFeatures) o;
    return Objects.equals(this.hasAppointments, merchantlocationConsumerFeatures.hasAppointments) &&
        Objects.equals(this.hasCustomScreens, merchantlocationConsumerFeatures.hasCustomScreens) &&
        Objects.equals(this.hasSMSSummoning, merchantlocationConsumerFeatures.hasSMSSummoning) &&
        Objects.equals(this.hasVoiceQueuing, merchantlocationConsumerFeatures.hasVoiceQueuing) &&
        Objects.equals(this.hasTransactionTypes, merchantlocationConsumerFeatures.hasTransactionTypes) &&
        Objects.equals(this.maxSimultaneousQueues, merchantlocationConsumerFeatures.maxSimultaneousQueues) &&
        Objects.equals(this.supportsPartySize, merchantlocationConsumerFeatures.supportsPartySize) &&
        Objects.equals(this.shouldDisplayTransactionTypesBeforeQueues, merchantlocationConsumerFeatures.shouldDisplayTransactionTypesBeforeQueues) &&
        Objects.equals(this.supportedLocales, merchantlocationConsumerFeatures.supportedLocales);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasAppointments, hasCustomScreens, hasSMSSummoning, hasVoiceQueuing, hasTransactionTypes, maxSimultaneousQueues, supportsPartySize, shouldDisplayTransactionTypesBeforeQueues, supportedLocales);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantlocationConsumerFeatures {\n");
    
    sb.append("    hasAppointments: ").append(toIndentedString(hasAppointments)).append("\n");
    sb.append("    hasCustomScreens: ").append(toIndentedString(hasCustomScreens)).append("\n");
    sb.append("    hasSMSSummoning: ").append(toIndentedString(hasSMSSummoning)).append("\n");
    sb.append("    hasVoiceQueuing: ").append(toIndentedString(hasVoiceQueuing)).append("\n");
    sb.append("    hasTransactionTypes: ").append(toIndentedString(hasTransactionTypes)).append("\n");
    sb.append("    maxSimultaneousQueues: ").append(toIndentedString(maxSimultaneousQueues)).append("\n");
    sb.append("    supportsPartySize: ").append(toIndentedString(supportsPartySize)).append("\n");
    sb.append("    shouldDisplayTransactionTypesBeforeQueues: ").append(toIndentedString(shouldDisplayTransactionTypesBeforeQueues)).append("\n");
    sb.append("    supportedLocales: ").append(toIndentedString(supportedLocales)).append("\n");
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

