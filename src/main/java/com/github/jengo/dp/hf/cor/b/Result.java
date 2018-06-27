package com.github.jengo.dp.hf.cor.b;

/**
 * {@link Result} 结果对象
 */
public class Result {

    /** 是否批准 */
    public boolean isRatify;
    /** 信息 */
    public String info;

    public Result() {
    }

    public Result(boolean isRatify, String info) {
        super();
        this.isRatify = isRatify;
        this.info = info;
    }

    public boolean isRatify() {
        return isRatify;
    }

    public void setRatify(boolean isRatify) {
        this.isRatify = isRatify;
    }

    public String getReason() {
        return info;
    }

    public void setReason(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Result [isRatify=" + isRatify + ", info=" + info + "]";
    }

}
