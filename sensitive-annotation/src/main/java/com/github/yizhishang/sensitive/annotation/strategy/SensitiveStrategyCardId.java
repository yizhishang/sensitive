package com.github.yizhishang.sensitive.annotation.strategy;

import com.github.yizhishang.sensitive.annotation.metadata.SensitiveStrategy;
import com.github.yizhishang.sensitive.api.impl.SensitiveStrategyBuiltIn;

import java.lang.annotation.*;

/**
 * 手机号脱敏注解
 * @author binbin.hou
 * date 2019/1/9
 * @since 0.0.2
 */
@Inherited
@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@SensitiveStrategy(SensitiveStrategyBuiltIn.class)
public @interface SensitiveStrategyCardId {
}
