package com.github.yizhishang.sensitive.core.api.strategory;

import com.github.houbb.heaven.util.lang.ObjectUtil;
import com.github.yizhishang.sensitive.api.IContext;
import com.github.yizhishang.sensitive.api.IStrategy;
import com.github.yizhishang.sensitive.core.util.strategy.SensitiveStrategyUtil;

/**
 * 密码的脱敏策略：
 * 1. 直接返回 null
 * @author binbin.hou
 * date 2018/12/29
 */
public class StrategyPassword implements IStrategy {

    @Override
    public Object des(Object original, IContext context) {
        return SensitiveStrategyUtil.password(ObjectUtil.objectToString(original));
    }

}
