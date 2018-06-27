package com.github.jengo.dp.hf.cor.a;

/**
 * {@link Approver} 抽象处理者（审批者类）
 */
public abstract class Approver {

    /** 定义后继处理对象 */
    protected Approver successor;

    /** 设置后继者 */
    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    /** 抽象请求处理方法 */
    public abstract void processRequest(PurchaseRequest request);

}
