package com.appleyk.DMA10_桥接模式.DM10.paint.shape;

/**
 * <p>矩形、长方形</p>
 *
 * @Author Appleyk
 * @Blob https://blog.csdn.net/appleyk
 * @Date Created on 下午 1:09 2018-11-19
 * @Version V.1.0.1
 */
public class Rectangle extends AbstractShape {
    @Override
    public  void draw() {
        getColor().painting("矩形");
    }
}
