package com.cgx.springboot.hello.aspect;

public class PerformanceImpl implements  Performance {
    @Override
    public String perform(String name) {
        System.out.println("表演《红灯记》戏");
        String result = "戏名:"+name+",现场人数123";
        return result;
    }

    @Override
    public void highTide() {
        System.out.println("表演《红灯记》正在高潮中........");
    }
}
