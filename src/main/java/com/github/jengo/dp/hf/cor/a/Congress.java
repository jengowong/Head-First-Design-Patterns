package com.github.jengo.dp.hf.cor.a;

/**
 * {@link Congress} 具体处理者（董事会类）
 */
public class Congress extends Approver {

    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("召开董事会审批采购单：" + request.getNumber()
                + "，金额：" + request.getAmount()
                + "元，采购目的：" + request.getPurpose() + "。");        //处理请求
    }

}
