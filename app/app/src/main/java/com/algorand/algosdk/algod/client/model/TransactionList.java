/*
 * Algod REST API.
 * API Endpoint for AlgoD Operations.
 *
 * OpenAPI spec version: 0.0.1
 * Contact: contact@algorand.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.algorand.algosdk.algod.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.ObjectUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * TransactionList contains a list of transactions
 */
@ApiModel(description = "TransactionList contains a list of transactions")

public class TransactionList {
  @SerializedName("transactions")
  private List<Transaction> transactions = new ArrayList<Transaction>();

  public TransactionList transactions(List<Transaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public TransactionList addTransactionsItem(Transaction transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * TransactionList is a list of transactions
   * @return transactions
  **/
  @ApiModelProperty(required = true, value = "TransactionList is a list of transactions")
  public List<Transaction> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<Transaction> transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(Object o) {
  if (this == o) {
    return true;
  }
  if (o == null || getClass() != o.getClass()) {
    return false;
  }
    TransactionList transactionList = (TransactionList) o;
    return ObjectUtils.equals(this.transactions, transactionList.transactions);
  }

  @Override
  public int hashCode() {
    return ObjectUtils.hashCodeMulti(transactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionList {\n");
    
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

