package com.example.demo;

public class Test {
    public static void main(String[] args) {
        VersionControlSystem vcs = new VersionControlSystem();
        Document document = new Document();
        document.content = "content1";
        document.otherContent = "otherContent1";
        System.out.println(document);
        /**
         * 保存备份
         */
        vcs.add(document.save());
        document.content = "content2";
        document.otherContent = "otherContent2";
        System.out.println(document);
        /**
         * 保存备份
         */
        vcs.add(document.save());
        document.content = "content3";
        document.otherContent = "otherContent3";
        System.out.println(document);
        /**
         * 恢复最新版本
         */
        document.resume(vcs.get(1));
        System.out.println(document);

        document.resume(vcs.get(2));
        System.out.println(document);
    }
}
