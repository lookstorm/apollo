package com.ctrip.framework.apollo.portal.enums;

public enum OpType {
    DEL("del"), AAM("aam"), RAY_RELEASE("ray_release"), MAIN_RELEASE("all_release"), ORI_RELEASE("main_release");
    private String name;

    OpType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
