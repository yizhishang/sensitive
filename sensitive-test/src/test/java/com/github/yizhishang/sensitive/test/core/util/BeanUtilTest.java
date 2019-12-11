package com.github.yizhishang.sensitive.test.core.util;

import com.github.yizhishang.sensitive.core.util.BeanUtil;
import com.github.yizhishang.sensitive.test.core.DataPrepareTest;
import com.github.yizhishang.sensitive.test.model.sensitive.entry.UserGroup;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author binbin.hou
 * date 2019/1/9
 * @since 0.0.1
 */
public class BeanUtilTest {

    @Test
    public void deepCopyTest() {
        UserGroup userGroup = DataPrepareTest.buildUserGroup();
        UserGroup copyUserGroup = BeanUtil.deepCopy(userGroup);

        Assert.assertEquals(copyUserGroup.toString(), userGroup.toString());
    }

}
