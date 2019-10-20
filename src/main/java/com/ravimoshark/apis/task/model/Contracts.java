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
import com.ravimoshark.apis.task.model.Clients;
import com.ravimoshark.apis.task.model.ImportedMachines;
import com.ravimoshark.apis.task.model.Locations;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.Serializable;
/**
 * Client&#x27;s contract.
 */
@Schema(description = "Client's contract.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-10-20T13:36:04.593821+02:00[Europe/Rome]")
public class Contracts implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("refContract")
  private Long refContract = null;

  @SerializedName("locations")
  private List<Locations> locations = null;

  @SerializedName("idLocations")
  private List<Long> idLocations = null;

  @SerializedName("importedMachines")
  private List<ImportedMachines> importedMachines = null;

  @SerializedName("idImportedMachines")
  private List<Long> idImportedMachines = null;

  @SerializedName("refClient")
  private String refClient = null;

  @SerializedName("client")
  private Clients client = null;

  @SerializedName("identification")
  private String identification = null;

  @SerializedName("dateDebut")
  private Date dateDebut = null;

  @SerializedName("dateFin")
  private Date dateFin = null;

  @SerializedName("reconduction")
  private String reconduction = null;

  @SerializedName("loyer")
  private Float loyer = null;

  @SerializedName("miniconso")
  private Float miniconso = null;

  @SerializedName("reviewed")
  private Boolean reviewed = null;

  @SerializedName("valid")
  private Boolean valid = null;

  @SerializedName("createdAt")
  private Date createdAt = null;

  @SerializedName("updatedAt")
  private Date updatedAt = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  public Contracts refContract(Long refContract) {
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

  public Contracts locations(List<Locations> locations) {
    this.locations = locations;
    return this;
  }

  public Contracts addLocationsItem(Locations locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<Locations>();
    }
    this.locations.add(locationsItem);
    return this;
  }

   /**
   * Get locations
   * @return locations
  **/
  @Schema(description = "")
  public List<Locations> getLocations() {
    return locations;
  }

  public void setLocations(List<Locations> locations) {
    this.locations = locations;
  }

  public Contracts idLocations(List<Long> idLocations) {
    this.idLocations = idLocations;
    return this;
  }

  public Contracts addIdLocationsItem(Long idLocationsItem) {
    if (this.idLocations == null) {
      this.idLocations = new ArrayList<Long>();
    }
    this.idLocations.add(idLocationsItem);
    return this;
  }

   /**
   * Get idLocations
   * @return idLocations
  **/
  @Schema(description = "")
  public List<Long> getIdLocations() {
    return idLocations;
  }

  public void setIdLocations(List<Long> idLocations) {
    this.idLocations = idLocations;
  }

  public Contracts importedMachines(List<ImportedMachines> importedMachines) {
    this.importedMachines = importedMachines;
    return this;
  }

  public Contracts addImportedMachinesItem(ImportedMachines importedMachinesItem) {
    if (this.importedMachines == null) {
      this.importedMachines = new ArrayList<ImportedMachines>();
    }
    this.importedMachines.add(importedMachinesItem);
    return this;
  }

   /**
   * Get importedMachines
   * @return importedMachines
  **/
  @Schema(description = "")
  public List<ImportedMachines> getImportedMachines() {
    return importedMachines;
  }

  public void setImportedMachines(List<ImportedMachines> importedMachines) {
    this.importedMachines = importedMachines;
  }

  public Contracts idImportedMachines(List<Long> idImportedMachines) {
    this.idImportedMachines = idImportedMachines;
    return this;
  }

  public Contracts addIdImportedMachinesItem(Long idImportedMachinesItem) {
    if (this.idImportedMachines == null) {
      this.idImportedMachines = new ArrayList<Long>();
    }
    this.idImportedMachines.add(idImportedMachinesItem);
    return this;
  }

   /**
   * Get idImportedMachines
   * @return idImportedMachines
  **/
  @Schema(description = "")
  public List<Long> getIdImportedMachines() {
    return idImportedMachines;
  }

  public void setIdImportedMachines(List<Long> idImportedMachines) {
    this.idImportedMachines = idImportedMachines;
  }

  public Contracts refClient(String refClient) {
    this.refClient = refClient;
    return this;
  }

   /**
   * Get refClient
   * @return refClient
  **/
  @Schema(description = "")
  public String getRefClient() {
    return refClient;
  }

  public void setRefClient(String refClient) {
    this.refClient = refClient;
  }

  public Contracts client(Clients client) {
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @Schema(description = "")
  public Clients getClient() {
    return client;
  }

  public void setClient(Clients client) {
    this.client = client;
  }

  public Contracts identification(String identification) {
    this.identification = identification;
    return this;
  }

   /**
   * Get identification
   * @return identification
  **/
  @Schema(description = "")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public Contracts dateDebut(Date dateDebut) {
    this.dateDebut = dateDebut;
    return this;
  }

   /**
   * Get dateDebut
   * @return dateDebut
  **/
  @Schema(description = "")
  public Date getDateDebut() {
    return dateDebut;
  }

  public void setDateDebut(Date dateDebut) {
    this.dateDebut = dateDebut;
  }

  public Contracts dateFin(Date dateFin) {
    this.dateFin = dateFin;
    return this;
  }

   /**
   * Get dateFin
   * @return dateFin
  **/
  @Schema(description = "")
  public Date getDateFin() {
    return dateFin;
  }

  public void setDateFin(Date dateFin) {
    this.dateFin = dateFin;
  }

  public Contracts reconduction(String reconduction) {
    this.reconduction = reconduction;
    return this;
  }

   /**
   * Get reconduction
   * @return reconduction
  **/
  @Schema(description = "")
  public String getReconduction() {
    return reconduction;
  }

  public void setReconduction(String reconduction) {
    this.reconduction = reconduction;
  }

  public Contracts loyer(Float loyer) {
    this.loyer = loyer;
    return this;
  }

   /**
   * Get loyer
   * @return loyer
  **/
  @Schema(description = "")
  public Float getLoyer() {
    return loyer;
  }

  public void setLoyer(Float loyer) {
    this.loyer = loyer;
  }

  public Contracts miniconso(Float miniconso) {
    this.miniconso = miniconso;
    return this;
  }

   /**
   * Get miniconso
   * @return miniconso
  **/
  @Schema(description = "")
  public Float getMiniconso() {
    return miniconso;
  }

  public void setMiniconso(Float miniconso) {
    this.miniconso = miniconso;
  }

  public Contracts reviewed(Boolean reviewed) {
    this.reviewed = reviewed;
    return this;
  }

   /**
   * Get reviewed
   * @return reviewed
  **/
  @Schema(description = "")
  public Boolean isReviewed() {
    return reviewed;
  }

  public void setReviewed(Boolean reviewed) {
    this.reviewed = reviewed;
  }

  public Contracts valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Get valid
   * @return valid
  **/
  @Schema(description = "")
  public Boolean isValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public Contracts createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Contracts updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Contracts deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @Schema(description = "")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contracts contracts = (Contracts) o;
    return Objects.equals(this.refContract, contracts.refContract) &&
        Objects.equals(this.locations, contracts.locations) &&
        Objects.equals(this.idLocations, contracts.idLocations) &&
        Objects.equals(this.importedMachines, contracts.importedMachines) &&
        Objects.equals(this.idImportedMachines, contracts.idImportedMachines) &&
        Objects.equals(this.refClient, contracts.refClient) &&
        Objects.equals(this.client, contracts.client) &&
        Objects.equals(this.identification, contracts.identification) &&
        Objects.equals(this.dateDebut, contracts.dateDebut) &&
        Objects.equals(this.dateFin, contracts.dateFin) &&
        Objects.equals(this.reconduction, contracts.reconduction) &&
        Objects.equals(this.loyer, contracts.loyer) &&
        Objects.equals(this.miniconso, contracts.miniconso) &&
        Objects.equals(this.reviewed, contracts.reviewed) &&
        Objects.equals(this.valid, contracts.valid) &&
        Objects.equals(this.createdAt, contracts.createdAt) &&
        Objects.equals(this.updatedAt, contracts.updatedAt) &&
        Objects.equals(this.deleted, contracts.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refContract, locations, idLocations, importedMachines, idImportedMachines, refClient, client, identification, dateDebut, dateFin, reconduction, loyer, miniconso, reviewed, valid, createdAt, updatedAt, deleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contracts {\n");
    
    sb.append("    refContract: ").append(toIndentedString(refContract)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    idLocations: ").append(toIndentedString(idLocations)).append("\n");
    sb.append("    importedMachines: ").append(toIndentedString(importedMachines)).append("\n");
    sb.append("    idImportedMachines: ").append(toIndentedString(idImportedMachines)).append("\n");
    sb.append("    refClient: ").append(toIndentedString(refClient)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    dateDebut: ").append(toIndentedString(dateDebut)).append("\n");
    sb.append("    dateFin: ").append(toIndentedString(dateFin)).append("\n");
    sb.append("    reconduction: ").append(toIndentedString(reconduction)).append("\n");
    sb.append("    loyer: ").append(toIndentedString(loyer)).append("\n");
    sb.append("    miniconso: ").append(toIndentedString(miniconso)).append("\n");
    sb.append("    reviewed: ").append(toIndentedString(reviewed)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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
