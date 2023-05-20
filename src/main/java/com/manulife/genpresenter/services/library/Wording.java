package com.manulife.genpresenter.services.library;

import com.manulife.genpresenter.model.serve.VideoServeRequest;
import org.springframework.stereotype.Service;

@Service
public class Wording {

  public String getStandardWording(VideoServeRequest videoServeRequest) {
    String wording;

    wording = "Selamat [pagi/siang/sore] Bapak/Ibu .\n" +
        "\n" +
        "Kami mengucapkan terima kasih kepada Bapak/Ibu karena telah tertarik untuk memiliki perlindungan produk MiSMART INSURANCE SOLUTION atau MiSSION\n" +
        "\n" +
        "Selanjutnya, Bapak/Ibu [Sebutkan Nama Calon Pemegang Polis] dapat mempelajari secara lebih jelas syarat dan ketentuan produk MiSSION pada Ringkasan Informasi Produk yang terlampir di Ilustrasi atau Proposal.\n" +
//        "\n" +
//        "Apabila pengajuan polis asuransi Bapak/Ibu telah disetujui dan polis telah terbit, maka pemegang polis memiliki hak untuk mempelajari Polis (Free Look Period) dalam waktu 14 hari kalender sejak tanggal polis diterima oleh Pemegang Polis, dimana dalam periode masa mempelajari Polis (Free Look Period) tersebut, Bapak/Ibu diberikan kesempatan mempelajari polis dan menyatakan persetujuan/keberatan dengan Ketentuan Umum dan/atau Ketentuan Khusus Polis. \n" +
//        "\n" +
//        "Apabila Bapak/Ibu tidak menyetujui ketentuan Polis, maka Bapak/Ibu harus memberitahukan secara tertulis dan mengembalikan Polis (jika ada) sebelum melewati periode masa mempelajari Polis dan oleh karenanya Polis akan dibatalkan.\n" +
//        "\n" +
//        "Dalam periode mempelajari Polis (Free Look Period) tersebut Manulife akan menghubungi Bapak/Ibu melalui nomor telepon [Sebutkan Nomor Telepon Calon Pemegang Polis yang diinput Pada SPAJ] untuk proses welcoming call untuk melakukan konfirmasi bahwa Bapak/Ibu memahami ketentuan Polis.\n" +
//        "\n" +
//        "Polis Bapak/Ibu tetap aktif dan tidak batal apabila kami tidak menerima pernyataan keberatan atas ketentuan Polis dari Bapak/Ibu dalam masa mempelajari Polis (Free Look) dan apabila kami telah berhasil melakukan konfirmasi pemahaman Bapak/Ibu akan ketentuan Polis dalam proses welcoming call. Apabila kedua hal tersebut tidak kami terima, maka Polis menjadi batal dan premi pertama yang telah Bapak/Ibu bayarkan akan dikembalikan sesuai dengan ketentuan Polis.\n" +
        "\n";

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
