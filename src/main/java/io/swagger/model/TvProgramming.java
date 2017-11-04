package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.TvProgram;
import java.util.ArrayList;
import java.util.List;

/**
 * TvProgramming
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-11-04T14:03:22.034Z")

public class TvProgramming   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("tvPrograms")
  private List<TvProgram> tvPrograms = new ArrayList<TvProgram>();

  public TvProgramming id(String id) {
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

  public TvProgramming name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Holiday programming", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TvProgramming tvPrograms(List<TvProgram> tvPrograms) {
    this.tvPrograms = tvPrograms;
    return this;
  }

  public TvProgramming addTvProgramsItem(TvProgram tvProgramsItem) {
    this.tvPrograms.add(tvProgramsItem);
    return this;
  }

   /**
   * Get tvPrograms
   * @return tvPrograms
  **/
  @ApiModelProperty(required = true, value = "")
  public List<TvProgram> getTvPrograms() {
    return tvPrograms;
  }

  public void setTvPrograms(List<TvProgram> tvPrograms) {
    this.tvPrograms = tvPrograms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TvProgramming tvProgramming = (TvProgramming) o;
    return Objects.equals(this.id, tvProgramming.id) &&
        Objects.equals(this.name, tvProgramming.name) &&
        Objects.equals(this.tvPrograms, tvProgramming.tvPrograms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, tvPrograms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TvProgramming {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tvPrograms: ").append(toIndentedString(tvPrograms)).append("\n");
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

