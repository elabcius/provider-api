package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.hateoas.ResourceSupport;

/**
 * Channel
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-04T14:39:56.794Z")

public class Channel extends ResourceSupport {
  @JsonProperty("channelId")
  private String channelId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("tvProgramming")
  private TvProgramming tvProgramming = null;

  public Channel id(String id) {
    this.channelId = id;
    return this;
  }

   /**
   * Get channelId
   * @return channelId
  **/
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, value = "")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String id) {
    this.channelId = id;
  }

  public Channel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "HBO+", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Channel type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "Family channel", required = true, value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Channel tvProgramming(TvProgramming tvProgramming) {
    this.tvProgramming = tvProgramming;
    return this;
  }

   /**
   * Get tvProgramming
   * @return tvProgramming
  **/
  @ApiModelProperty(value = "")
  public TvProgramming getTvProgramming() {
    return tvProgramming;
  }

  public void setTvProgramming(TvProgramming tvProgramming) {
    this.tvProgramming = tvProgramming;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Channel channel = (Channel) o;
    return Objects.equals(this.channelId, channel.channelId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Channel {\n");
    
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    tvProgramming: ").append(toIndentedString(tvProgramming)).append("\n");
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

