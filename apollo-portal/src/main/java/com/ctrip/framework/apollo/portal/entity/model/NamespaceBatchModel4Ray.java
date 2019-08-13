package com.ctrip.framework.apollo.portal.entity.model;

import com.ctrip.framework.apollo.common.dto.NamespaceBatchRayDTO;

public class NamespaceBatchModel4Ray {
    private String env;

    private NamespaceBatchRayDTO namespace;

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public NamespaceBatchRayDTO getNamespace() {
        return namespace;
    }

    public void setNamespace(NamespaceBatchRayDTO namespace) {
        this.namespace = namespace;
    }
}
