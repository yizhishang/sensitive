package com.github.yizhishang.sensitive.core.api.strategory;

import com.github.houbb.heaven.util.lang.ObjectUtil;
import com.github.yizhishang.sensitive.api.IContext;
import com.github.yizhishang.sensitive.api.IStrategy;
import com.github.yizhishang.sensitive.core.util.strategy.SensitiveStrategyUtil;

/**
 * 手机号脱敏
 * 脱敏规则：139****6631
 *
 * @author binbin.hou
 * date 2019/1/2
 */
public class StrategyPhone implements IStrategy {

    @Override
    public Object des(Object original, IContext context) {
        return SensitiveStrategyUtil.phone(ObjectUtil.objectToString(original));
    }

}
