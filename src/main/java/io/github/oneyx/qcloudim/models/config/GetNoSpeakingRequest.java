package io.github.oneyx.qcloudim.models.config;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.oneyx.qcloudim.models.QCloudIMRequest;

public class GetNoSpeakingRequest extends QCloudIMRequest {
    @JSONField(name = "Get_Account")
    private String getAccount;

    public String getGetAccount() {
        return getAccount;
    }

    public void setGetAccount(String getAccount) {
        this.getAccount = getAccount;
    }
}
