package com.example.demo;

/**
 * 代表版本控制系统中保存的每一个备份
 */
public class Backup {
    /**
     * 备份的内容
     */
    String content;
    /**
     * 版本
     */
    int version;
    public Backup(String content) {
        this.content = content;
    }
}
