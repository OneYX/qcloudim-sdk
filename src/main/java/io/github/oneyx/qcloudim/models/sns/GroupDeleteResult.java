package io.github.oneyx.qcloudim.models.sns;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.oneyx.qcloudim.models.QCloudIMResult;

public class GroupDeleteResult extends QCloudIMResult {
    @JSONField(name = "CurrentSequence")
    private int currentSequence;

    public int getCurrentSequence() {
        return currentSequence;
    }

    public void setCurrentSequence(int currentSequence) {
        this.currentSequence = currentSequence;
    }
}
