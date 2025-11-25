package org.example;

public enum OptionsContaBancaria {
  CONSULTAR_SALDO("Consultar saldo"),
  RECEBER_VALOR("Receber valor"),
  TRANSFERIR_VALOR("Transferir valor");

  private String description;

  OptionsContaBancaria(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
}
