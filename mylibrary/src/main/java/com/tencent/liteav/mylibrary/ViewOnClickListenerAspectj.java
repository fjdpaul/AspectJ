package com.tencent.liteav.mylibrary;

import android.view.View;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

/**
 * @Description: 类作用描述
 * @Author: shuidi
 * @CreateDate: 2020/10/26 上午11:45
 * @Version: 1.0
 */
@Aspect
public class ViewOnClickListenerAspectj {

    @After("execution(* android.view.View.OnClickListener.onClick(android.view.View))")
    public void onViewClickAop(final JoinPoint joinPoint) {
        View view = (View) joinPoint.getArgs()[0];
        SensorsDataPrivate.trackViewOnClick(view);
    }
}
