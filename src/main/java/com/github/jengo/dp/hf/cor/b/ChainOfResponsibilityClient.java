package com.github.jengo.dp.hf.cor.b;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link ChainOfResponsibilityClient} 责任链模模式工具类
 */
public class ChainOfResponsibilityClient {

    private List<Ratify> ratifies;

    public ChainOfResponsibilityClient() {
        ratifies = new ArrayList<>();
    }

    /** 为了展示“责任链模式”的真正的迷人之处（可扩展性），在这里构造该方法以便添加自定义的“责任人” */
    public void addRatify(Ratify ratify) {
        ratifies.add(ratify);
    }

    /** 执行请求 */
    public Result execute(Request request) {
        List<Ratify> l = new ArrayList<>();
        l.addAll(ratifies);
        l.add(new GroupLeader());
        l.add(new Manager());
        l.add(new DepartmentHeader());

        RealChain realChain = new RealChain(l, request, 0);
        return realChain.proceed(request);
    }

    public static void main(String[] args) {
        Request request = new Request.Builder()
                .setName("张三")
                .setDays(5)
                .setReason("事假")
                .build();
        ChainOfResponsibilityClient client = new ChainOfResponsibilityClient();
        client.addRatify(new CustomInterceptor());
        Result result = client.execute(request);
        System.out.println("结果：" + result.toString());
    }

}
