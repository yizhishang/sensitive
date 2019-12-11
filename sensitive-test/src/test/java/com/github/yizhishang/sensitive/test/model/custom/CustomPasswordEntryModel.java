package com.github.yizhishang.sensitive.test.model.custom;

import com.github.yizhishang.sensitive.annotation.SensitiveEntry;

/**
 * @author binbin.hou
 * date 2019/1/17
 * @since 0.0.4
 */
public class CustomPasswordEntryModel {

    @SensitiveEntry
    private CustomPasswordModel entry;

    public CustomPasswordModel getEntry() {
        return entry;
    }

    public void setEntry(CustomPasswordModel entry) {
        this.entry = entry;
    }

    @Override
    public String toString() {
        return "CustomPasswordEntryModel{" +
                "entry=" + entry +
                '}';
    }

}
