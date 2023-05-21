package com.manulife.genpresenter.services.consume;

import com.manulife.genpresenter.model.consume.ImageConsumeResponse;
import com.manulife.genpresenter.services.library.Base64Util;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
public class ImageConsumeService {

  private String serverUrl = "http://localhost:8000/d-id";
  private String apiAuth = "Basic c2F0eWFjaGFuZHJhYnVhbmFAZ21haWwuY29t:bC5X9HPKUdscIN2BQoxq5";
  private HttpHeaders httpHeaders = new HttpHeaders();
  private RestTemplate restTemplate = new RestTemplate();

  public ImageConsumeResponse UploadImage(String base64) {
    String url = this.serverUrl + "/images";
    ImageConsumeResponse imageConsumeResponse = new ImageConsumeResponse();

    httpHeaders.setContentType(MediaType.MULTIPART_FORM_DATA);
    try {
      ResponseEntity<ImageConsumeResponse> responseEntity = restTemplate.postForEntity(url, constructRequest(base64), ImageConsumeResponse.class);
      imageConsumeResponse = responseEntity.getBody();
      System.out.println(responseEntity);
    } catch (Exception e) {
      System.out.println(e.getMessage() + "-err");
    }
    return imageConsumeResponse;
  }

  private HttpEntity<MultiValueMap<String, Object>> constructRequest(String base64Image) throws IOException {
    MultiValueMap<String, Object> body = new LinkedMultiValueMap<>();
    body.add("image", Base64Util.convertToHttpEntity(Base64Util.generateFilename(base64Image)+".jpg", Base64Util.stripStartBase64(base64Image)));

    HttpHeaders headers = new HttpHeaders();
    headers.setContentType(MediaType.MULTIPART_FORM_DATA);
    headers.add("Authorization", this.apiAuth);

    return new HttpEntity<>(body, headers);
  }

}
