package com.example.demo;

import java.util.LinkedList;

/**
 * 版本控制系统
 */
public class VersionControlSystem {
    /**
     * 所有备份版本
     */
    LinkedList<Backup> backups = new LinkedList<>();
    /**
     * 下一个版本
     */
    int nextVersion;
    /**
     * 添加备份
     */
    public void add(Backup backup) {
        backup.version = ++nextVersion;
        backups.add(backup);
    }
    /**
     * 获得某个版本的备份
     */
    public Backup get(int version) {
        for (Backup backup : backups) {
            if (backup.version == version) {
                return backup;
            }
        }
        return null;
    }
    /**
     * 获取最后一个版本的备份
     */
    public Backup getLastVersion() {
        return backups.getLast();
    }
}
