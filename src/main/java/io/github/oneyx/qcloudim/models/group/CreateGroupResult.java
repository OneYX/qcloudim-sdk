package io.github.oneyx.qcloudim.models.group;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.oneyx.qcloudim.models.QCloudIMResult;

public class CreateGroupResult extends QCloudIMResult {
    @JSONField(name = "GroupId")
    private String groupId;

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
}
