package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Address;
import java.util.ArrayList;
import java.util.List;

/**
 * Order
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-30T08:21:01.198Z")

public class Order   {
  @JsonProperty("CustomerId")
  private String customerId = null;

  @JsonProperty("OfferId")
  private String offerId = null;

  @JsonProperty("pricepaid")
  private String pricepaid = null;

  @JsonProperty("walletmoney")
  private String walletmoney = null;

  @JsonProperty("coupon")
  private String coupon = null;

  @JsonProperty("Productid")
  private String productid = null;

  @JsonProperty("deliveryOption")
  private String deliveryOption = null;

  @JsonProperty("deliverAddress")
  private List<Address> deliverAddress = new ArrayList<Address>();

  public Order customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * id of the customer who is placing the order
   * @return customerId
  **/
  @ApiModelProperty(value = "id of the customer who is placing the order")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Order offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

   /**
   * Get offerId
   * @return offerId
  **/
  @ApiModelProperty(value = "")
  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public Order pricepaid(String pricepaid) {
    this.pricepaid = pricepaid;
    return this;
  }

   /**
   * Get pricepaid
   * @return pricepaid
  **/
  @ApiModelProperty(value = "")
  public String getPricepaid() {
    return pricepaid;
  }

  public void setPricepaid(String pricepaid) {
    this.pricepaid = pricepaid;
  }

  public Order walletmoney(String walletmoney) {
    this.walletmoney = walletmoney;
    return this;
  }

   /**
   * Get walletmoney
   * @return walletmoney
  **/
  @ApiModelProperty(value = "")
  public String getWalletmoney() {
    return walletmoney;
  }

  public void setWalletmoney(String walletmoney) {
    this.walletmoney = walletmoney;
  }

  public Order coupon(String coupon) {
    this.coupon = coupon;
    return this;
  }

   /**
   * coupon used
   * @return coupon
  **/
  @ApiModelProperty(value = "coupon used")
  public String getCoupon() {
    return coupon;
  }

  public void setCoupon(String coupon) {
    this.coupon = coupon;
  }

  public Order productid(String productid) {
    this.productid = productid;
    return this;
  }

   /**
   * Get productid
   * @return productid
  **/
  @ApiModelProperty(value = "")
  public String getProductid() {
    return productid;
  }

  public void setProductid(String productid) {
    this.productid = productid;
  }

  public Order deliveryOption(String deliveryOption) {
    this.deliveryOption = deliveryOption;
    return this;
  }

   /**
   * Get deliveryOption
   * @return deliveryOption
  **/
  @ApiModelProperty(value = "")
  public String getDeliveryOption() {
    return deliveryOption;
  }

  public void setDeliveryOption(String deliveryOption) {
    this.deliveryOption = deliveryOption;
  }



  public Order deliverAddress(List<Address> deliverAddress) {
    this.deliverAddress = deliverAddress;
    return this;
  }

  public Order addDeliverAddressItem(Address deliverAddressItem) {
    this.deliverAddress.add(deliverAddressItem);
    return this;
  }

   /**
   * Get deliverAddress
   * @return deliverAddress
  **/
  @ApiModelProperty(value = "")
  public List<Address> getDeliverAddress() {
    return deliverAddress;
  }

  public void setDeliverAddress(List<Address> deliverAddress) {
    this.deliverAddress = deliverAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.customerId, order.customerId) &&
        Objects.equals(this.offerId, order.offerId) &&
        Objects.equals(this.pricepaid, order.pricepaid) &&
        Objects.equals(this.walletmoney, order.walletmoney) &&
        Objects.equals(this.coupon, order.coupon) &&
        Objects.equals(this.productid, order.productid) &&
        Objects.equals(this.deliveryOption, order.deliveryOption) &&
        Objects.equals(this.deliverAddress, order.deliverAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, offerId, pricepaid, walletmoney, coupon, productid, deliveryOption, deliverAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    pricepaid: ").append(toIndentedString(pricepaid)).append("\n");
    sb.append("    walletmoney: ").append(toIndentedString(walletmoney)).append("\n");
    sb.append("    coupon: ").append(toIndentedString(coupon)).append("\n");
    sb.append("    productid: ").append(toIndentedString(productid)).append("\n");
    sb.append("    deliveryOption: ").append(toIndentedString(deliveryOption)).append("\n");
    sb.append("    deliverAddress: ").append(toIndentedString(deliverAddress)).append("\n");
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

