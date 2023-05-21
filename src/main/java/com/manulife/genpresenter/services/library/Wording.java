package com.manulife.genpresenter.services.library;

import com.manulife.genpresenter.model.serve.VideoServeRequest;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

@Service
public class Wording {

  private static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

  public String getStandardWording(VideoServeRequest videoServeRequest) {
    String wording;

    System.out.println("getStandardWording");

    wording = "Selamat " + this.getTimeGreetings() + " " + this.getGreetingGender(videoServeRequest) + " .\n" +
        "\n" +
        "Kami mengucapkan terima kasih kepada " + this.getGreetingGender(videoServeRequest) + " karena telah tertarik untuk memiliki perlindungan produk MiSMART INSURANCE SOLUTION atau MiSSION\n" +
        "\n" ;
//        "Selanjutnya, " + this.getGreetingGender(videoServeRequest) + " " + this.getName(videoServeRequest) + " dapat mempelajari secara lebih jelas syarat dan ketentuan produk MiSSION pada Ringkasan Informasi Produk yang terlampir di Ilustrasi atau Proposal.\n" +
//        "\n" ;
//        "Apabila pengajuan polis asuransi " + this.getGreetingGender(videoServeRequest) + " telah disetujui dan polis telah terbit, maka pemegang polis memiliki hak untuk mempelajari Polis (Free Look Period) dalam waktu 14 hari kalender sejak tanggal polis diterima oleh Pemegang Polis, dimana dalam periode masa mempelajari Polis (Free Look Period) tersebut, " + this.getGreetingGender(videoServeRequest) + " diberikan kesempatan mempelajari polis dan menyatakan persetujuan/keberatan dengan Ketentuan Umum dan/atau Ketentuan Khusus Polis. \n" +
//        "\n" +
//        "Apabila Bapak/Ibu tidak menyetujui ketentuan Polis, maka " + this.getGreetingGender(videoServeRequest) + " harus memberitahukan secara tertulis dan mengembalikan Polis (jika ada) sebelum melewati periode masa mempelajari Polis dan oleh karenanya Polis akan dibatalkan.\n" +
//        "\n" +
//        "Dalam periode mempelajari Polis (Free Look Period) tersebut Manulife akan menghubungi " + this.getGreetingGender(videoServeRequest) + " melalui nomor telepon yang terdaftar untuk proses welcoming call untuk melakukan konfirmasi bahwa " + this.getGreetingGender(videoServeRequest) + " memahami ketentuan Polis.\n" +
//        "\n" +
//        "Polis " + this.getGreetingGender(videoServeRequest) + " tetap aktif dan tidak batal apabila kami tidak menerima pernyataan keberatan atas ketentuan Polis dari " + this.getGreetingGender(videoServeRequest) + " dalam masa mempelajari Polis (Free Look) dan apabila kami telah berhasil melakukan konfirmasi pemahaman " + this.getGreetingGender(videoServeRequest) + " akan ketentuan Polis dalam proses welcoming call. Apabila kedua hal tersebut tidak kami terima, maka Polis menjadi batal dan premi pertama yang telah " + this.getGreetingGender(videoServeRequest) + " bayarkan akan dikembalikan sesuai dengan ketentuan Polis.\n" +
//        "\n";

    System.out.println(wording);
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

  private String getGreetingGender(VideoServeRequest videoServeRequest) {
    String retValue;

    if (videoServeRequest.getGender().equals("L")) {
      retValue = "Bapak";
    } else {
      retValue = "Ibu";
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

  private String getTimeGreetings() {
    System.out.println("getTimeGreetings");

    String retValue;
    Timestamp timestamp = new Timestamp(System.currentTimeMillis());
    String dateTime = (String) simpleDateFormat.format(timestamp).subSequence(11, 13);

    int number = Integer.parseInt(dateTime);
    if (number >= 0 && number < 10) {
      retValue = "pagi";
    } else {
      if (number >= 10 && number < 15) {
        retValue = "siang";
      } else {
        if (number >= 15 && number < 18) {
          retValue = "sore";
        } else {
          retValue = "malam";
        }
      }
    }

    return retValue;
  }

}
