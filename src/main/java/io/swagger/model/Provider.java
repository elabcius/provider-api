package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Channel;

/**
 * Provider
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-04T14:03:22.034Z")

public class Provider   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("channel")
  private Channel channel = null;

  public Provider id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Provider name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "HBO", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Provider email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "admin@hbo.com", required = true, value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Provider channel(Channel channel) {
    this.channel = channel;
    return this;
  }

   /**
   * Get channel
   * @return channel
  **/
  @ApiModelProperty(value = "")
  public Channel getChannel() {
    return channel;
  }

  public void setChannel(Channel channel) {
    this.channel = channel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Provider provider = (Provider) o;
    return Objects.equals(this.id, provider.id) &&
        Objects.equals(this.name, provider.name) &&
        Objects.equals(this.email, provider.email) &&
        Objects.equals(this.channel, provider.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, email, channel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Provider {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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

