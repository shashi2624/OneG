package com.avaya.ept.onegas.bl.service;

import com.avaya.ept.onegas.bl.model.AnnounceValueMode;

class AnnounceParameter {
  private String announce = null;
  
  private String value = null;
  
  private AnnounceValueMode mode = null;
  
  AnnounceParameter(String announce, String value, AnnounceValueMode mode) {
    this.announce = announce;
    this.value = value;
    this.mode = mode;
  }
  
  public String getAnnounce() {
    return this.announce;
  }
  
  public String getValue() {
    return this.value;
  }
  
  public AnnounceValueMode getMode() {
    return this.mode;
  }
}
