package com.dyleaf.behavior.VistorPattern;

import java.util.LinkedList;
import java.util.List;

public class BusinessReport {
    List<Staff> mStaffs = new LinkedList<>();

    public BusinessReport() {
        mStaffs.add(new Manager("王经理"));
        mStaffs.add(new Engineer("工程师-shang.xiong"));
        mStaffs.add(new Engineer("工程师--kael"));
        mStaffs.add(new Engineer("工程师--Tiiime"));

    }

    /**
     * 为来访者展示报表
     * @param visitor 公司高层 如CEO CTO
     */
    public void showReport(Visitor visitor) {
        for (Staff staff : mStaffs) {
            staff.accept(visitor);
        }
    }
}
