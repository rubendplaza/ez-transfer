/*
 * for KMD HTTP API
 * API for KMD (Key Management Daemon)
 *
 * OpenAPI spec version: 0.0.1
 * Contact: contact@algorand.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.algorand.algosdk.kmd.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.ObjectUtils;
import com.algorand.algosdk.crypto.Ed25519PublicKey;

import java.util.ArrayList;
import java.util.List;

/**
 * APIV1POSTMultisigImportRequest is the request for &#x60;POST /v1/multisig/import&#x60;
 */
@ApiModel(description = "APIV1POSTMultisigImportRequest is the request for `POST /v1/multisig/import`")

public class ImportMultisigRequest {
  @SerializedName("multisig_version")
  private Integer multisigVersion = null;

  @SerializedName("pks")
  private List<byte[]> pks = null; 

  @SerializedName("threshold")
  private Integer threshold = null;

  @SerializedName("wallet_handle_token")
  private String walletHandleToken = null;

  public ImportMultisigRequest multisigVersion(Integer multisigVersion) {
    this.multisigVersion = multisigVersion;
    return this;
  }

   /**
   * Get multisigVersion
   * @return multisigVersion
  **/
  @ApiModelProperty(value = "")
  public Integer getMultisigVersion() {
    return multisigVersion;
  }

  public void setMultisigVersion(Integer multisigVersion) {
    this.multisigVersion = multisigVersion;
  }

  public ImportMultisigRequest pks(List<Ed25519PublicKey> pks) {
    if (this.pks == null) {
      this.pks = new ArrayList<byte[]>();
    }
    for (Ed25519PublicKey pk : pks) {
      this.pks.add(pk.getBytes());
    }
    return this;
  }

  public ImportMultisigRequest addPksItem(Ed25519PublicKey pksItem) {
    if (this.pks == null) {
      this.pks = new ArrayList<byte[]>();
    }
    this.pks.add(pksItem.getBytes());
    return this;
  }

   /**
   * Get pks
   * @return pks
  **/
  @ApiModelProperty(value = "")
  public List<Ed25519PublicKey> getPks() {
    List<Ed25519PublicKey> pkObjs = new ArrayList<Ed25519PublicKey>();
    for (byte[] pk : this.pks) {
      pkObjs.add(new Ed25519PublicKey(pk));
    }
    return pkObjs;
  }

  public void setPks(List<Ed25519PublicKey> pks) {
    if (this.pks == null) {
      this.pks = new ArrayList<byte[]>();
    }
    for (Ed25519PublicKey pk : pks) {
      this.pks.add(pk.getBytes());
    }
  }

  public ImportMultisigRequest threshold(Integer threshold) {
    this.threshold = threshold;
    return this;
  }

   /**
   * Get threshold
   * @return threshold
  **/
  @ApiModelProperty(value = "")
  public Integer getThreshold() {
    return threshold;
  }

  public void setThreshold(Integer threshold) {
    this.threshold = threshold;
  }

  public ImportMultisigRequest walletHandleToken(String walletHandleToken) {
    this.walletHandleToken = walletHandleToken;
    return this;
  }

   /**
   * Get walletHandleToken
   * @return walletHandleToken
  **/
  @ApiModelProperty(value = "")
  public String getWalletHandleToken() {
    return walletHandleToken;
  }

  public void setWalletHandleToken(String walletHandleToken) {
    this.walletHandleToken = walletHandleToken;
  }


  @Override
  public boolean equals(Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    ImportMultisigRequest importMultisigRequest = (ImportMultisigRequest) o;
    return ObjectUtils.equals(this.multisigVersion, importMultisigRequest.multisigVersion) &&
    ObjectUtils.equals(this.pks, importMultisigRequest.pks) &&
    ObjectUtils.equals(this.threshold, importMultisigRequest.threshold) &&
    ObjectUtils.equals(this.walletHandleToken, importMultisigRequest.walletHandleToken);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(multisigVersion, pks, threshold, walletHandleToken);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImportMultisigRequest {\n");
    
    sb.append("    multisigVersion: ").append(toIndentedString(multisigVersion)).append("\n");
    sb.append("    pks: ").append(toIndentedString(pks)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    walletHandleToken: ").append(toIndentedString(walletHandleToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

