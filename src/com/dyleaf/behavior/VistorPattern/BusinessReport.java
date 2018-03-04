package behavior.VistorPattern;

import java.util.LinkedList;
import java.util.List;

public class BusinessReport {
    List<Staff> mStaffs = new LinkedList<>();

    public BusinessReport() {
        mStaffs.add(new Manager("王经理"));
        mStaffs.add(new Engineer("工程师小刘"));
//...
    }

    public void showReport(Visitor _visitor) {
        for (Staff staff : mStaffs) {
            staff.accept(_visitor);
        }
    }
}
