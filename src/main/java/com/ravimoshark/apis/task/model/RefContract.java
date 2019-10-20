/*
 * Ravimoshark Contract API
 * This is an API to interact with Ravimoshark contracts database. # Introduction This API allow to create, modify and delete contracts and machines. It also interacts with machines imported from SAGE database. # User Authentication This API does not contain any kind of user validation but It request to have a valid authentication user to interact with it. For more information about user Authentication, please refer to [Ravimoshark User Authentication](https://ravimoshark.com/back/apis/auth/latest). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: dev@ravimoshark.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.ravimoshark.apis.task.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.io.Serializable;
/**
 * Contract&#x27;s reference.
 */
@Schema(description = "Contract's reference.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-10-20T13:36:04.593821+02:00[Europe/Rome]")
public class RefContract implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("refContract")
  private Long refContract = null;

  public RefContract refContract(Long refContract) {
    this.refContract = refContract;
    return this;
  }

   /**
   * Get refContract
   * @return refContract
  **/
  @Schema(description = "")
  public Long getRefContract() {
    return refContract;
  }

  public void setRefContract(Long refContract) {
    this.refContract = refContract;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefContract refContract = (RefContract) o;
    return Objects.equals(this.refContract, refContract.refContract);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refContract);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefContract {\n");
    
    sb.append("    refContract: ").append(toIndentedString(refContract)).append("\n");
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
