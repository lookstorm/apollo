package com.ctrip.framework.apollo.portal.enums;

public enum OpType {
    DEL("del"), AAM("aam");
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
