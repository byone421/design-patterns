package com.byone421.responsibility.heima;

public class Manager extends Handler {

    public Manager() {
        super(Handler.NUM_ONE,Handler.NUM_THREE);
    }

    protected void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天，" + leave.getContent() + "。");
        System.out.println("部门经理审批：同意");
    }
}
