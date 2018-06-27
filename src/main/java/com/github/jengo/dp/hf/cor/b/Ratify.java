package com.github.jengo.dp.hf.cor.b;

/**
 * {@link Ratify} 处理请求
 */
public interface Ratify {

    /** 处理请求 */
    Result deal(Chain chain);

    /** 对request和Result封装，用来转发 */
    interface Chain {
        // 获取当前request
        Request request();

        // 转发request
        Result proceed(Request request);
    }

}
