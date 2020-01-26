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
 * APIV1POSTWalletRenewResponse is the response to &#x60;POST /v1/wallet/renew&#x60; friendly:RenewWalletHandleTokenResponse
 */
@ApiModel(description = "APIV1POSTWalletRenewResponse is the response to `POST /v1/wallet/renew` friendly:RenewWalletHandleTokenResponse")

public class APIV1POSTWalletRenewResponse {
  @SerializedName("error")
  private Boolean error = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("wallet_handle")
  private APIV1WalletHandle walletHandle = null;

  public APIV1POSTWalletRenewResponse error(Boolean error) {
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @ApiModelProperty(value = "")
  public Boolean isError() {
    return error;
  }

  public void setError(Boolean error) {
    this.error = error;
  }

  public APIV1POSTWalletRenewResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public APIV1POSTWalletRenewResponse walletHandle(APIV1WalletHandle walletHandle) {
    this.walletHandle = walletHandle;
    return this;
  }

   /**
   * Get walletHandle
   * @return walletHandle
  **/
  @ApiModelProperty(value = "")
  public APIV1WalletHandle getWalletHandle() {
    return walletHandle;
  }

  public void setWalletHandle(APIV1WalletHandle walletHandle) {
    this.walletHandle = walletHandle;
  }


  @Override
  public boolean equals(Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    APIV1POSTWalletRenewResponse apIV1POSTWalletRenewResponse = (APIV1POSTWalletRenewResponse) o;
    return ObjectUtils.equals(this.error, apIV1POSTWalletRenewResponse.error) &&
    ObjectUtils.equals(this.message, apIV1POSTWalletRenewResponse.message) &&
    ObjectUtils.equals(this.walletHandle, apIV1POSTWalletRenewResponse.walletHandle);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(error, message, walletHandle);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIV1POSTWalletRenewResponse {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    walletHandle: ").append(toIndentedString(walletHandle)).append("\n");
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
