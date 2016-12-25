package maxiaobu.mxbutilscodelibrary;

import android.content.Context;

/**
    *Created by 马小布 on 2016/12/25.
    *introduction: 真他娘的不知道说点啥
    *email:maxiaobu1999@163.com
    *功能：Utils初始化相关
    *伪码：
    *待完成：
*/


public class Utils {

    private static Context context;

    private Utils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * 初始化工具类
     *
     * @param context 上下文
     */
    public static void init(Context context) {
        Utils.context = context.getApplicationContext();
    }

    /**
     * 获取ApplicationContext
     *
     * @return ApplicationContext
     */
    public static Context getContext() {
        if (context != null) return context;
        throw new NullPointerException("u should init first");
    }
}