package com.github.yizhishang.sensitive.core.api.strategory;

import com.github.houbb.heaven.util.lang.ObjectUtil;
import com.github.yizhishang.sensitive.api.IContext;
import com.github.yizhishang.sensitive.api.IStrategy;
import com.github.yizhishang.sensitive.core.util.strategy.SensitiveStrategyUtil;

/**
 * 二代身份证号脱敏加密：
 * XXXXXX XXXXXXXX XXXX
 * 脱敏规则：421002**********34
 *
 * 只保留前6位和后2位，其他用*代替。
 * @author binbin.hou
 * date 2019/1/2
 */
public class StrategyCardId implements IStrategy {

    @Override
    public Object des(Object original, IContext context) {
        return SensitiveStrategyUtil.cardId(ObjectUtil.objectToString(original));
    }

}
