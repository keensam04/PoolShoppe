package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ShareBuddyInfo;
import java.util.ArrayList;
import java.util.List;

/**
 * Statusinfo
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-30T08:21:01.198Z")

public class Statusinfo   {
  @JsonProperty("orderStatusCode")
  private String orderStatusCode = null;

  @JsonProperty("orderStatusDescription")
  private String orderStatusDescription = null;

  @JsonProperty("amountPaid")
  private String amountPaid = null;

  @JsonProperty("walletmoneyleft")
  private String walletmoneyleft = null;

  @JsonProperty("shareId")
  private String shareId = null;

  @JsonProperty("ShareBuddies")
  private List<ShareBuddyInfo> shareBuddies = new ArrayList<ShareBuddyInfo>();

  public Statusinfo orderStatusCode(String orderStatusCode) {
    this.orderStatusCode = orderStatusCode;
    return this;
  }

   /**
   * Get orderStatusCode
   * @return orderStatusCode
  **/
  @ApiModelProperty(value = "")
  public String getOrderStatusCode() {
    return orderStatusCode;
  }

  public void setOrderStatusCode(String orderStatusCode) {
    this.orderStatusCode = orderStatusCode;
  }

  public Statusinfo orderStatusDescription(String orderStatusDescription) {
    this.orderStatusDescription = orderStatusDescription;
    return this;
  }

   /**
   * Get orderStatusDescription
   * @return orderStatusDescription
  **/
  @ApiModelProperty(value = "")
  public String getOrderStatusDescription() {
    return orderStatusDescription;
  }

  public void setOrderStatusDescription(String orderStatusDescription) {
    this.orderStatusDescription = orderStatusDescription;
  }

  public Statusinfo amountPaid(String amountPaid) {
    this.amountPaid = amountPaid;
    return this;
  }

   /**
   * Get amountPaid
   * @return amountPaid
  **/
  @ApiModelProperty(value = "")
  public String getAmountPaid() {
    return amountPaid;
  }

  public void setAmountPaid(String amountPaid) {
    this.amountPaid = amountPaid;
  }

  public Statusinfo walletmoneyleft(String walletmoneyleft) {
    this.walletmoneyleft = walletmoneyleft;
    return this;
  }

   /**
   * Get walletmoneyleft
   * @return walletmoneyleft
  **/
  @ApiModelProperty(value = "")
  public String getWalletmoneyleft() {
    return walletmoneyleft;
  }

  public void setWalletmoneyleft(String walletmoneyleft) {
    this.walletmoneyleft = walletmoneyleft;
  }

  public Statusinfo shareId(String shareId) {
    this.shareId = shareId;
    return this;
  }

   /**
   * Get shareId
   * @return shareId
  **/
  @ApiModelProperty(value = "")
  public String getShareId() {
    return shareId;
  }

  public void setShareId(String shareId) {
    this.shareId = shareId;
  }

  public Statusinfo shareBuddies(List<ShareBuddyInfo> shareBuddies) {
    this.shareBuddies = shareBuddies;
    return this;
  }

  public Statusinfo addShareBuddiesItem(ShareBuddyInfo shareBuddiesItem) {
    this.shareBuddies.add(shareBuddiesItem);
    return this;
  }

   /**
   * Get shareBuddies
   * @return shareBuddies
  **/
  @ApiModelProperty(value = "")
  public List<ShareBuddyInfo> getShareBuddies() {
    return shareBuddies;
  }

  public void setShareBuddies(List<ShareBuddyInfo> shareBuddies) {
    this.shareBuddies = shareBuddies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Statusinfo statusinfo = (Statusinfo) o;
    return Objects.equals(this.orderStatusCode, statusinfo.orderStatusCode) &&
        Objects.equals(this.orderStatusDescription, statusinfo.orderStatusDescription) &&
        Objects.equals(this.amountPaid, statusinfo.amountPaid) &&
        Objects.equals(this.walletmoneyleft, statusinfo.walletmoneyleft) &&
        Objects.equals(this.shareId, statusinfo.shareId) &&
        Objects.equals(this.shareBuddies, statusinfo.shareBuddies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderStatusCode, orderStatusDescription, amountPaid, walletmoneyleft, shareId, shareBuddies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Statusinfo {\n");
    
    sb.append("    orderStatusCode: ").append(toIndentedString(orderStatusCode)).append("\n");
    sb.append("    orderStatusDescription: ").append(toIndentedString(orderStatusDescription)).append("\n");
    sb.append("    amountPaid: ").append(toIndentedString(amountPaid)).append("\n");
    sb.append("    walletmoneyleft: ").append(toIndentedString(walletmoneyleft)).append("\n");
    sb.append("    shareId: ").append(toIndentedString(shareId)).append("\n");
    sb.append("    shareBuddies: ").append(toIndentedString(shareBuddies)).append("\n");
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

