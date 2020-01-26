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

/**
 * APIV1POSTMasterKeyExportRequest is the request for &#x60;POST /v1/master-key/export&#x60;
 */
@ApiModel(description = "APIV1POSTMasterKeyExportRequest is the request for `POST /v1/master-key/export`")

public class ExportMasterKeyRequest {
  @SerializedName("wallet_handle_token")
  private String walletHandleToken = null;

  @SerializedName("wallet_password")
  private String walletPassword = null;

  public ExportMasterKeyRequest walletHandleToken(String walletHandleToken) {
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

  public ExportMasterKeyRequest walletPassword(String walletPassword) {
    this.walletPassword = walletPassword;
    return this;
  }

   /**
   * Get walletPassword
   * @return walletPassword
  **/
  @ApiModelProperty(value = "")
  public String getWalletPassword() {
    return walletPassword;
  }

  public void setWalletPassword(String walletPassword) {
    this.walletPassword = walletPassword;
  }


  @Override
  public boolean equals(Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    ExportMasterKeyRequest exportMasterKeyRequest = (ExportMasterKeyRequest) o;
    return ObjectUtils.equals(this.walletHandleToken, exportMasterKeyRequest.walletHandleToken) &&
    ObjectUtils.equals(this.walletPassword, exportMasterKeyRequest.walletPassword);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(walletHandleToken, walletPassword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExportMasterKeyRequest {\n");
    
    sb.append("    walletHandleToken: ").append(toIndentedString(walletHandleToken)).append("\n");
    sb.append("    walletPassword: ").append(toIndentedString(walletPassword)).append("\n");
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

