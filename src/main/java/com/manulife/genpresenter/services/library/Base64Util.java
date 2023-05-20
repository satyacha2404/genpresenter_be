package com.manulife.genpresenter.services.library;

import io.micrometer.common.util.StringUtils;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.ContentDisposition;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.UUID;

public class Base64Util {

  private Base64Util() {}

  public static String generateFilename(String base64String) {
    if (StringUtils.isBlank(base64String)) {
      return base64String;
    }
    String[] arrayString = base64String.split(",");
    String header = arrayString[0].split(";")[0];
    String uuid = UUID.randomUUID().toString();
    String filename = String.format("%s.%s", uuid, header.split("/")[1]);
    return filename;
  }

  public static String stripStartBase64(String base64String) {
    if (StringUtils.isBlank(base64String)) {
      return base64String;
    }
    return base64String.replaceAll("^data:image/[^;]*;base64,?", "");
  }

  public static HttpEntity<byte[]> convertToHttpEntity(String filename, String base64) {
    byte[] imageByte = Base64.decodeBase64(base64);
    ContentDisposition contentDisposition = ContentDisposition.builder("form-data")
        .name("image")
        .filename(filename)
        .build();

    MultiValueMap<String, String> fileMap = new LinkedMultiValueMap<>();
    fileMap.add(HttpHeaders.CONTENT_DISPOSITION, contentDisposition.toString());
    return new HttpEntity<>(imageByte, fileMap);
  }
}