package io.github.oneyx.qcloudim.models.group;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.oneyx.qcloudim.models.QCloudIMResult;
import io.github.oneyx.qcloudim.models.member.GroupId;

import java.util.List;

public class GetJoinedGroupListResult extends QCloudIMResult {
    @JSONField(name = "TotalCount")
    private long totalCount;

    @JSONField(name = "GroupIdList")
    private List<GroupId> groupIdList;

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public List<GroupId> getGroupIdList() {
        return groupIdList;
    }

    public void setGroupIdList(List<GroupId> groupIdList) {
        this.groupIdList = groupIdList;
    }
}
