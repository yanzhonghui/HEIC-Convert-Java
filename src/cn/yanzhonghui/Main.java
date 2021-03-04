package cn.yanzhonghui;

import org.im4java.core.*;

import java.io.IOException;

public class Main {

    private static final String IMAGE_MAGICK_PATH = "C:\\Program Files\\ImageMagick-7.0.11-Q16-HDRI";

    public static void main(String[] args) {
        ConvertCmd cmd = new ConvertCmd();
        cmd.setSearchPath(IMAGE_MAGICK_PATH);

        IMOperation op = new IMOperation();
        op.addImage("file/Flower.HEIC");
        op.addImage("file/Flower.PNG");

        try {
            cmd.run(op);
        } catch (IOException | InterruptedException | IM4JavaException e) {
            e.printStackTrace();
        }

    }
}
