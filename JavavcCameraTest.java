package org.example;//！！！！！！！！！！！！！薛逸舫！！！！！！！！！！！！
import org.bytedeco.javacv.CanvasFrame;
import org.bytedeco.javacv.FrameGrabber.Exception;
import org.bytedeco.javacv.OpenCVFrameGrabber;
import javax.swing.*;
public class JavavcCameraTest{
    public static void main(String[] args) throws Exception {
        OpenCVFrameGrabber grabber = new OpenCVFrameGrabber(0);
        grabber.start();

        CanvasFrame canvas = new CanvasFrame("摄像头预览");
        canvas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        while(canvas.isDisplayable()){
            canvas.showImage(grabber.grab());
        }
        grabber.close();
    }
}