package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ShareBuddyInfo
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-30T08:21:01.198Z")

public class ShareBuddyInfo   {
  @JsonProperty("time")
  private String time = null;

  @JsonProperty("shareid")
  private String shareid = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("pic")
  private String pic = null;

  @JsonProperty("phoneNumer")
  private String phoneNumer = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("rating")
  private String rating = null;

  @JsonProperty("amountPaid")
  private String amountPaid = null;

  public ShareBuddyInfo time(String time) {
    this.time = time;
    return this;
  }

   /**
   * time when the pairing of the buddy has been done
   * @return time
  **/
  @ApiModelProperty(value = "time when the pairing of the buddy has been done")
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public ShareBuddyInfo shareid(String shareid) {
    this.shareid = shareid;
    return this;
  }

   /**
   * id shared by all the customers who are paired
   * @return shareid
  **/
  @ApiModelProperty(value = "id shared by all the customers who are paired")
  public String getShareid() {
    return shareid;
  }

  public void setShareid(String shareid) {
    this.shareid = shareid;
  }

  public ShareBuddyInfo id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ShareBuddyInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ShareBuddyInfo pic(String pic) {
    this.pic = pic;
    return this;
  }

   /**
   * Get pic
   * @return pic
  **/
  @ApiModelProperty(value = "")
  public String getPic() {
    return pic;
  }

  public void setPic(String pic) {
    this.pic = pic;
  }

  public ShareBuddyInfo phoneNumer(String phoneNumer) {
    this.phoneNumer = phoneNumer;
    return this;
  }

   /**
   * Get phoneNumer
   * @return phoneNumer
  **/
  @ApiModelProperty(value = "")
  public String getPhoneNumer() {
    return phoneNumer;
  }

  public void setPhoneNumer(String phoneNumer) {
    this.phoneNumer = phoneNumer;
  }

  public ShareBuddyInfo gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(value = "")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public ShareBuddyInfo rating(String rating) {
    this.rating = rating;
    return this;
  }

   /**
   * Get rating
   * @return rating
  **/
  @ApiModelProperty(value = "")
  public String getRating() {
    return rating;
  }

  public void setRating(String rating) {
    this.rating = rating;
  }

  public ShareBuddyInfo amountPaid(String amountPaid) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShareBuddyInfo shareBuddyInfo = (ShareBuddyInfo) o;
    return Objects.equals(this.time, shareBuddyInfo.time) &&
        Objects.equals(this.shareid, shareBuddyInfo.shareid) &&
        Objects.equals(this.id, shareBuddyInfo.id) &&
        Objects.equals(this.name, shareBuddyInfo.name) &&
        Objects.equals(this.pic, shareBuddyInfo.pic) &&
        Objects.equals(this.phoneNumer, shareBuddyInfo.phoneNumer) &&
        Objects.equals(this.gender, shareBuddyInfo.gender) &&
        Objects.equals(this.rating, shareBuddyInfo.rating) &&
        Objects.equals(this.amountPaid, shareBuddyInfo.amountPaid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, shareid, id, name, pic, phoneNumer, gender, rating, amountPaid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShareBuddyInfo {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    shareid: ").append(toIndentedString(shareid)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pic: ").append(toIndentedString(pic)).append("\n");
    sb.append("    phoneNumer: ").append(toIndentedString(phoneNumer)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
    sb.append("    amountPaid: ").append(toIndentedString(amountPaid)).append("\n");
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

