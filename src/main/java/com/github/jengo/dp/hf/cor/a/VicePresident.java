package com.github.jengo.dp.hf.cor.a;

/**
 * {@link VicePresident} 具体处理者（副董事长类）
 */
public class VicePresident extends Approver {

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 100000) {
            System.out.println("副董事长"
                    + "审批采购单：" + request.getNumber()
                    + "，金额：" + request.getAmount()
                    + "元，采购目的：" + request.getPurpose() + "。");
        } else {
            this.successor.processRequest(request);
        }
    }

}
