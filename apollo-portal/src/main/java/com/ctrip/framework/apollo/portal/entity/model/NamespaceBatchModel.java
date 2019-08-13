package com.ctrip.framework.apollo.portal.entity.model;

import com.ctrip.framework.apollo.common.dto.NamespaceBatchDTO;

public class NamespaceBatchModel {
    private String env;

    private NamespaceBatchDTO namespace;

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public NamespaceBatchDTO getNamespace() {
        return namespace;
    }

    public void setNamespace(NamespaceBatchDTO namespace) {
        this.namespace = namespace;
    }
}
