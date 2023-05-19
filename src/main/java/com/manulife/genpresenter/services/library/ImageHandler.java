package com.manulife.genpresenter.services.library;

import org.springframework.stereotype.Service;
import javax.xml.bind.DatatypeConverter;
import java.io.*;

@Service
public class ImageHandler {

    public void stringToFile (String pBase64, String pFileName) {
        byte[] data = DatatypeConverter.parseBase64Binary(pBase64);
        Object datdd;
        String path = "src/main/resources/media/" + pFileName;
        File file = new File(path);
        try (OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file))) {
            outputStream.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
