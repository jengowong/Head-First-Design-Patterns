package com.github.jengo.dp.hf.cor.a;

/**
 * {@link President} 具体处理者（董事长类）
 */
public class President extends Approver {

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 500000) {
            System.out.println("董事长"
                    + "审批采购单：" + request.getNumber()
                    + "，金额：" + request.getAmount()
                    + "元，采购目的：" + request.getPurpose() + "。");
        } else {
            this.successor.processRequest(request);
        }
    }

}
