package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * UserInfo
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-11-30T08:21:01.198Z")

public class UserInfo   {
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

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("offerId")
  private String offerId = null;

  public UserInfo id(String id) {
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

  public UserInfo name(String name) {
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

  public UserInfo pic(String pic) {
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

  public UserInfo phoneNumer(String phoneNumer) {
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

  public UserInfo gender(String gender) {
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

  public UserInfo status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public UserInfo offerId(String offerId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserInfo userInfo = (UserInfo) o;
    return Objects.equals(this.id, userInfo.id) &&
        Objects.equals(this.name, userInfo.name) &&
        Objects.equals(this.pic, userInfo.pic) &&
        Objects.equals(this.phoneNumer, userInfo.phoneNumer) &&
        Objects.equals(this.gender, userInfo.gender) &&
        Objects.equals(this.status, userInfo.status) &&
        Objects.equals(this.offerId, userInfo.offerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, pic, phoneNumer, gender, status, offerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pic: ").append(toIndentedString(pic)).append("\n");
    sb.append("    phoneNumer: ").append(toIndentedString(phoneNumer)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
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

