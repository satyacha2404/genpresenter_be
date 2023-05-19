package com.manulife.genpresenter.model.consume;

import java.util.ArrayList;

public class TalksFaceConsumeResponse {
  private float mask_confidence;
  ArrayList <Object> detection = new ArrayList <Object> ();
  private String overlap;
  private float size;
  ArrayList<Object> top_left = new ArrayList <Object> ();
  private float face_id;
  private float detect_confidence;

  public TalksFaceConsumeResponse() {
  }

  public float getMask_confidence() {
    return mask_confidence;
  }

  public void setMask_confidence(float mask_confidence) {
    this.mask_confidence = mask_confidence;
  }

  public ArrayList<Object> getDetection() {
    return detection;
  }

  public void setDetection(ArrayList<Object> detection) {
    this.detection = detection;
  }

  public String getOverlap() {
    return overlap;
  }

  public void setOverlap(String overlap) {
    this.overlap = overlap;
  }

  public float getSize() {
    return size;
  }

  public void setSize(float size) {
    this.size = size;
  }

  public ArrayList<Object> getTop_left() {
    return top_left;
  }

  public void setTop_left(ArrayList<Object> top_left) {
    this.top_left = top_left;
  }

  public float getFace_id() {
    return face_id;
  }

  public void setFace_id(float face_id) {
    this.face_id = face_id;
  }

  public float getDetect_confidence() {
    return detect_confidence;
  }

  public void setDetect_confidence(float detect_confidence) {
    this.detect_confidence = detect_confidence;
  }
}
