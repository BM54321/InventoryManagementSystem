package com.mycompany.inventorymanagementsystem;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.InputStream;

import javax.swing.*;

import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.ImageTranscoder;
import org.apache.batik.transcoder.image.PNGTranscoder;

public class SVGLoader {

    public static ImageIcon loadIcon(String path, int width, int height) {
    try {
        BufferedImageTranscoder transcoder =
            new BufferedImageTranscoder();

        transcoder.addTranscodingHint(
            PNGTranscoder.KEY_WIDTH, (float) width
        );

        transcoder.addTranscodingHint(
            PNGTranscoder.KEY_HEIGHT, (float) height
        );

        InputStream input = SVGLoader.class
            .getResourceAsStream(path);

        if (input == null) {
            throw new RuntimeException("SVG not found: " + path);
        }

        try (input) {
            TranscoderInput source = new TranscoderInput(input);

            transcoder.transcode(
                source, new TranscoderOutput()
            );
        }

        return new ImageIcon(transcoder.getImage());

    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }
}
}