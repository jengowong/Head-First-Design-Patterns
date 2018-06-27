package com.github.jengo.dp.hf.cor.a;

/**
 * {@link Director} 具体处理者（主任类）
 */
public class Director extends Approver {

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 50000) {
            System.out.println("主任"
                    + "审批采购单：" + request.getNumber()
                    + "，金额：" + request.getAmount()
                    + "元，采购目的：" + request.getPurpose() + "。");
        } else {
            this.successor.processRequest(request);
        }
    }

}
