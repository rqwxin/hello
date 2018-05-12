package com.cgx.springboot.hello.aspect;

public class PerformanceImpl implements  Performance {
    @Override
    public void perform() {
        System.out.println("表演《红灯记》戏");
    }

    @Override
    public void highTide() {
        System.out.println("表演《红灯记》正在高潮中........");
    }
}
