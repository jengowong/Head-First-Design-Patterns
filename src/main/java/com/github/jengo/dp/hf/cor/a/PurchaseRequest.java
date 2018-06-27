package com.github.jengo.dp.hf.cor.a;

/**
 * {@link PurchaseRequest} 请求消息类（采购单）
 *
 * https://blog.csdn.net/justloveyou_/article/details/68489505
 */
public class PurchaseRequest {

    /** 采购单编号 */
    private int number;
    /** 采购目的 */
    private String purpose;
    /** 采购金额 */
    private double amount;

    public PurchaseRequest(double amount, int number, String purpose) {
        this.amount = amount;
        this.number = number;
        this.purpose = purpose;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return this.number;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getPurpose() {
        return this.purpose;
    }

}
