package com.manulife.genpresenter.model.consume;

public class TalksConfigConsumeResponse {
  private boolean stitch;
  private float pad_audio;
  private boolean align_driver;
  private boolean sharpen;
  private boolean reduce_noise;
  private boolean auto_match;
  private float normalization_factor;
  private TalksLogoConsumeResponse logo;
  private float motion_factor;
  private String result_format;
  private boolean fluent;
  private float align_expand_factor;

  public TalksConfigConsumeResponse() {
  }

  public boolean isStitch() {
    return stitch;
  }

  public void setStitch(boolean stitch) {
    this.stitch = stitch;
  }

  public float getPad_audio() {
    return pad_audio;
  }

  public void setPad_audio(float pad_audio) {
    this.pad_audio = pad_audio;
  }

  public boolean isAlign_driver() {
    return align_driver;
  }

  public void setAlign_driver(boolean align_driver) {
    this.align_driver = align_driver;
  }

  public boolean isSharpen() {
    return sharpen;
  }

  public void setSharpen(boolean sharpen) {
    this.sharpen = sharpen;
  }

  public boolean isReduce_noise() {
    return reduce_noise;
  }

  public void setReduce_noise(boolean reduce_noise) {
    this.reduce_noise = reduce_noise;
  }

  public boolean isAuto_match() {
    return auto_match;
  }

  public void setAuto_match(boolean auto_match) {
    this.auto_match = auto_match;
  }

  public float getNormalization_factor() {
    return normalization_factor;
  }

  public void setNormalization_factor(float normalization_factor) {
    this.normalization_factor = normalization_factor;
  }

  public TalksLogoConsumeResponse getLogo() {
    return logo;
  }

  public void setLogo(TalksLogoConsumeResponse logo) {
    this.logo = logo;
  }

  public float getMotion_factor() {
    return motion_factor;
  }

  public void setMotion_factor(float motion_factor) {
    this.motion_factor = motion_factor;
  }

  public String getResult_format() {
    return result_format;
  }

  public void setResult_format(String result_format) {
    this.result_format = result_format;
  }

  public boolean isFluent() {
    return fluent;
  }

  public void setFluent(boolean fluent) {
    this.fluent = fluent;
  }

  public float getAlign_expand_factor() {
    return align_expand_factor;
  }

  public void setAlign_expand_factor(float align_expand_factor) {
    this.align_expand_factor = align_expand_factor;
  }
}
