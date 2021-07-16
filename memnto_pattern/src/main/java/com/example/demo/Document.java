package com.example.demo;

public class Document {
    /**
     * 需要备份的状态
     */
    String content;
    /**
     * 不需要备份的状态
     */
    String otherContent;
    public Backup save() {
        System.out.println("保存备份");
        return new Backup(content);
    }

    /**
     * 恢复为某个状态
     */
    public void resume(Backup backup) {
        System.out.println("恢复备份");
        content = backup.content;
    }

    @Override
    public String toString() {
        return "content:"+content+",otherContent:"+otherContent;
    }
}
