package com.image;

import org.im4java.core.CompositeCmd;
import org.im4java.core.ConvertCmd;
import org.im4java.core.IM4JavaException;
import org.im4java.core.IMOperation;

import java.io.IOException;

public class ImageTools {
    /**
     *
     * 根据坐标裁剪图片
     *
     * @param srcPath   要裁剪图片的路径
     * @param newPath   裁剪图片后的路径
     * @param x         起始横坐标
     * @param y         起始纵坐标
     * @param x1        结束横坐标
     * @param y1        结束纵坐标
     */

    public static void cutImage(String srcPath, String newPath, int x, int y, int x1,   int y1) throws Exception {
        int width = x1 - x;
        int height = y1 - y;
        IMOperation op = new IMOperation();
        op.addImage(srcPath);
        /**
         * width：  裁剪的宽度
         * height： 裁剪的高度
         * x：       裁剪的横坐标
         * y：       裁剪的挫坐标
         */
        op.crop(width, height, x, y);
        op.addImage(newPath);
        ConvertCmd convert = new ConvertCmd();

        convert.run(op);
    }

    /**
     *
     * 根据尺寸缩放图片
     * @param width             缩放后的图片宽度
     * @param height            缩放后的图片高度
     * @param srcPath           源图片路径
     * @param newPath           缩放后图片的路径
     */
    public static void cutImage(int width, int height, String srcPath,  String newPath) throws Exception {
        IMOperation op = new IMOperation();
        op.addImage(srcPath);
        op.resize(width, height);
        op.addImage(newPath);
        ConvertCmd convert = new ConvertCmd();
        convert.run(op);

    }

    /**
     * 根据宽度缩放图片
     *
     * @param width            缩放后的图片宽度
     * @param srcPath          源图片路径
     * @param newPath          缩放后图片的路径
     */
    public static void cutImage(int width, String srcPath, String newPath)  throws Exception {
        IMOperation op = new IMOperation();
        op.addImage(srcPath);
        op.resize(width, null);
        op.addImage(newPath);
        ConvertCmd convert = new ConvertCmd();
        convert.run(op);
    }

    /**
     * 给图片加水印
     * @param srcPath            源图片路径
     */
    public static void addImgText(String srcPath) throws Exception {
        IMOperation op = new IMOperation();
        op.font("宋体").gravity("southeast").pointsize(18).fill("#FF0000")
                .draw("text 5,5 baidu.com");
        op.addImage();
        op.addImage();
        ConvertCmd convert = new ConvertCmd();
        convert.run(op, srcPath, srcPath);
    }


    /**
     * 图片水印
     *
     * @param srcImagePath   源图片
     * @param waterImagePath 水印
     * @param destImagePath  生成图片
     * @param gravity  图片位置
     * @param dissolve 水印透明度
     */
    public static void waterMark(String waterImagePath, String srcImagePath, String destImagePath, String gravity, int dissolve) {
        IMOperation op = new IMOperation();
        op.gravity(gravity); //位置center：中心;northwest：左上;southeast：右下
        op.dissolve(dissolve); //水印清晰度 ，0-100  最好设置高点要不看起来没效果
        op.addImage(waterImagePath);
        op.addImage(srcImagePath);
        op.addImage(destImagePath);
        CompositeCmd cmd = new CompositeCmd();
        try {
            cmd.run(op);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IM4JavaException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        // cutImage("D:\\test.jpg", "D:\\new.jpg", 98, 48, 370,320);
        // cutImage(200,300, "/home/1.jpg", "/home/2.jpg");
        //addImgText("/Users/lxf4456/Documents/test/haiys29.jpg");
        waterMark("/Users/lxf4456/Documents/test/th.jpeg","/Users/lxf4456/Documents/test/haiys29.jpg","/Users/lxf4456/Documents/test/haiys291.jpg","center",100);
    }
}
