package com.ppdai.framework.raptor.rpc;

import com.ppdai.framework.raptor.util.RaptorFrameworkUtil;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

@Setter
@Getter
public class DefaultRequest implements Serializable, Request {

    private String requestId;
    private String interfaceName;
    private String methodName;
    private Object argument;
    private String returnType;
    private Map<String, String> attachments = new HashMap<>();

    @Override
    public void setAttachment(String key, String value) {
        this.attachments.put(key, value);
    }

    @Override
    public String toString() {
        return RaptorFrameworkUtil.toString(this);
    }

}
