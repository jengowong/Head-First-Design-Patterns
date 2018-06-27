package com.github.jengo.dp.hf.cor.b;

/**
 * {@link Request} 请假对象
 *
 * https://blog.csdn.net/u012810020/article/details/71194853
 */
public class Request {

    /** 请假人 */
    private String name;
    /** 请假原因 */
    private String reason;
    /** 请假天数 */
    private int days;
    /** 请假信息 */
    private String customInfo;
    /** 组长审批信息 */
    private String groupLeaderInfo;
    /** 经理审批信息 */
    private String managerInfo;
    /** 部门领导审批信息 */
    private String departmentHeaderInfo;

    public Request(Builder builder) {
        super();
        this.name = builder.name;
        this.reason = builder.reason;
        this.days = builder.days;
        this.customInfo = builder.customInfo;
        this.groupLeaderInfo = builder.groupLeaderInfo;
        this.managerInfo = builder.managerInfo;
        this.departmentHeaderInfo = builder.departmentHeaderInfo;
    }

    public static class Builder {
        private String name;
        private String reason;
        private int days;
        private String customInfo;
        private String groupLeaderInfo;
        private String managerInfo;
        private String departmentHeaderInfo;

        public Builder() {
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = reason;
            return this;
        }

        public Builder setDays(int days) {
            this.days = days;
            return this;
        }

        public Builder setManagerInfo(String managerInfo) {
            this.managerInfo = managerInfo;
            return this;
        }

        public Builder setGroupLeaderInfo(String groupLeaderInfo) {
            this.groupLeaderInfo = groupLeaderInfo;
            return this;
        }

        public Builder setDepartmentHeaderInfo(String departmentHeaderInfo) {
            this.departmentHeaderInfo = departmentHeaderInfo;
            return this;
        }

        public Builder setCustomInfo(String customInfo) {
            this.customInfo = customInfo;
            return this;
        }

        public Builder newRequest(Request request) {
            this.name = request.name;
            this.days = request.days;
            this.reason = request.reason;
            if (request.managerInfo != null && !request.managerInfo.equals("")) {
                this.managerInfo = request.managerInfo;
            }
            if (request.groupLeaderInfo != null && !request.groupLeaderInfo.equals("")) {
                this.groupLeaderInfo = request.groupLeaderInfo;
            }
            if (request.departmentHeaderInfo != null && !request.departmentHeaderInfo.equals("")) {
                this.departmentHeaderInfo = request.departmentHeaderInfo;
            }
            if (request.customInfo != null && !request.customInfo.equals("")) {
                this.customInfo = request.customInfo;
            }
            return this;
        }

        public Request build() {
            return new Request(this);
        }
    }

    public String name() {
        return name;
    }

    public String reason() {
        return reason;
    }

    public int days() {
        return days;
    }

    public String groupLeaderInfo() {
        return groupLeaderInfo;
    }

    public String managerInfo() {
        return managerInfo;
    }

    public String departmentHeaderInfo() {
        return departmentHeaderInfo;
    }

    public String customInfo() {
        return customInfo;
    }

    @Override
    public String toString() {
        return "Request [name=" + name +
                ", reason=" + reason
                + ", days=" + days
                + ", customInfo=" + customInfo
                + ", groupLeaderInfo=" + groupLeaderInfo
                + ", managerInfo=" + managerInfo
                + ", departmentHeaderInfo=" + departmentHeaderInfo + "]";
    }

}
