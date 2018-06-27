package com.github.jengo.dp.hf.cor.a;

/**
 * {@link Manager} 具体处理者（经理类）
 */
public class Manager extends Approver {

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 80000) {
            System.out.println("经理"
                    + "审批采购单：" + request.getNumber()
                    + "，金额：" + request.getAmount()
                    + "元，采购目的：" + request.getPurpose() + "。");
        } else {
            this.successor.processRequest(request);
        }
    }

}
