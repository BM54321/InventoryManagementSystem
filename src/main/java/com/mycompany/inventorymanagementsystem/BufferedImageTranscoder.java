/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventorymanagementsystem;

import java.awt.image.BufferedImage;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.ImageTranscoder;

public class BufferedImageTranscoder extends ImageTranscoder {

    private BufferedImage image;

    @Override
    public BufferedImage createImage(int width, int height) {
        return new BufferedImage(
            width,
            height,
            BufferedImage.TYPE_INT_ARGB
        );
    }

    @Override
    public void writeImage(
        BufferedImage img,
        TranscoderOutput output
    ) {
        this.image = img;
    }

    public BufferedImage getImage() {
        return image;
    }
}