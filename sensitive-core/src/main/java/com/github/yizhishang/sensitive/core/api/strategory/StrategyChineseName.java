package com.github.yizhishang.sensitive.core.api.strategory;

import com.github.houbb.heaven.util.lang.ObjectUtil;
import com.github.yizhishang.sensitive.api.IContext;
import com.github.yizhishang.sensitive.api.IStrategy;
import com.github.yizhishang.sensitive.core.util.strategy.SensitiveStrategyUtil;

/**
 * 中文名称脱敏策略：
 * 0. 少于等于1个字 直接返回
 * 1. 两个字 隐藏姓
 * 2. 三个及其以上 只保留第一个和最后一个 其他用星号代替
 *
 * @author binbin.hou
 * date 2019/1/2
 */
public class StrategyChineseName implements IStrategy {

    @Override
    public Object des(Object original, IContext context) {
        return SensitiveStrategyUtil.chineseName(ObjectUtil.objectToString(original));
    }

}
