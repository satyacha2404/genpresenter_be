package com.manulife.genpresenter.services.consume;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ImageConsumeService {

  private String serverUrl = "https://api.d-id.com";
  private String apiAuth = "Basic c2F0eWEuY2hhbmRyYS5hbDFAb3V0bG9vay5jb20:Q4Wf7d8C8drR2Ou8CVkgP";
  private HttpHeaders httpHeaders = new HttpHeaders();
  private RestTemplate restTemplate = new RestTemplate();
  
  public String UploadImage() {
    return "UploadImage";
  }

}
