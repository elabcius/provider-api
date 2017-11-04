package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;

/**
 * TvProgram
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-04T14:39:56.794Z")

public class TvProgram   {
  @JsonProperty("identification")
  private String identification = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("scheduleTime")
  private String scheduleTime = null;

  public TvProgram id(String id) {
    this.identification = id;
    return this;
  }

   /**
   * Get identification
   * @return identification
  **/
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, value = "")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public TvProgram name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Dragon Ball Super", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TvProgram scheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
    return this;
  }

   /**
   * Get scheduleTime
   * @return scheduleTime
  **/
  @ApiModelProperty(example = "10-10-2012T08:00", required = true, value = "")
  public String getScheduleTime() {
    return scheduleTime;
  }

  public void setScheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TvProgram tvProgram = (TvProgram) o;
    return Objects.equals(this.identification, tvProgram.identification) &&
        Objects.equals(this.name, tvProgram.name) &&
        Objects.equals(this.scheduleTime, tvProgram.scheduleTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identification, name, scheduleTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TvProgram {\n");
    
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scheduleTime: ").append(toIndentedString(scheduleTime)).append("\n");
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

