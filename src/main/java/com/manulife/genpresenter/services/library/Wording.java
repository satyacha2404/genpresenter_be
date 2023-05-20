package com.manulife.genpresenter.services.library;

import com.manulife.genpresenter.model.serve.VideoServeRequest;
import org.springframework.stereotype.Service;

@Service
public class Wording {

  public String getStandardWording(VideoServeRequest videoServeRequest) {
    String wording;

    wording = "Sesuai dengan ketentuan Otoritas Jasa Keuangan, kami akan merekam konfirmasi Anda untuk hal-hal berikut: \n" +
        "•\tPemegang Polis adalah " + this.getName(videoServeRequest) +
        "•\tTertanggung adalah [nama Tertanggung]\n" +
        "•\tTanggal lahir Pemegang Polis \n" +
        "•\tDomisili Pemegang Polis di [domisili calon pemegang polis sesuai yang ada di tanda tangan proposal] \n";

    return wording;
  }

  private String getName(VideoServeRequest videoServeRequest) {
    return videoServeRequest.getName();
  }

  private String getGender(VideoServeRequest videoServeRequest) {
    String retValue;

    if (videoServeRequest.getGender().equals("L")) {
      retValue = "Laki - laki";
    } else {
      retValue = "Perempuan";
    }

    return retValue;
  }

  private String getBirthDate(VideoServeRequest videoServeRequest) {

//    String part0 = parts[0]; // Year
//    String part1 = parts[1]; // Month
//    String part2 = parts[2]; // Date

    String retValue;
    String[] parts = videoServeRequest.getBirthDate().split("-");

    switch (parts[2]) {
      case "01":
        retValue = "satu"; break;
      case "02":
        System.out.println("Monday"); break;
      case "03":
        System.out.println("Monday"); break;
      case "04":
        System.out.println("Monday"); break;
      case "05":
        System.out.println("Monday"); break;
      case "06":
        System.out.println("Monday"); break;
      case "07":
        System.out.println("Monday"); break;
      case "08":
        System.out.println("Monday"); break;
      case "09":
        System.out.println("Monday"); break;
      case "10":
        System.out.println("Monday"); break;
      case "11":
        System.out.println("Monday"); break;
      case "12":
        System.out.println("Monday"); break;
      case "13":
        System.out.println("Monday"); break;
      case "14":
        System.out.println("Monday"); break;
      case "15":
        System.out.println("Monday"); break;
      case "16":
        System.out.println("Monday"); break;
      case "17":
        System.out.println("Monday"); break;
      case "18":
        System.out.println("Monday"); break;
      case "19":
        System.out.println("Monday"); break;
      case "20":
        System.out.println("Monday"); break;
      case "21":
        System.out.println("Monday"); break;
      case "22":
        System.out.println("Monday"); break;
      case "23":
        System.out.println("Monday"); break;
      case "24":
        System.out.println("Monday"); break;
      case "25":
        System.out.println("Monday"); break;
      case "26":
        System.out.println("Monday"); break;
      case "27":
        System.out.println("Monday"); break;
      case "28":
        System.out.println("Monday"); break;
      case "29":
        System.out.println("Monday"); break;
      case "30":
        System.out.println("Monday"); break;
      case "31":
        System.out.println("Monday"); break;
    }

    return videoServeRequest.getName();
  }

  private String getDomisili(VideoServeRequest videoServeRequest) {
    return videoServeRequest.getDomisili();
  }

}
