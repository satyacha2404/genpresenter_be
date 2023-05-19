package com.manulife.genpresenter.model.consume;

public class TalksScriptConsumeRequest {
  private String type;
  private String input;
  private TalksProviderConsumeRequest provider;

  public TalksScriptConsumeRequest() {
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public TalksProviderConsumeRequest getProvider() {
    return provider;
  }

  public void setProvider(TalksProviderConsumeRequest provider) {
    this.provider = provider;
  }
}
