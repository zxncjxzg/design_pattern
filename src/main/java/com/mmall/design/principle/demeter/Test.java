package com.mmall.design.principle.demeter;

/**
 * Created by 11790 on 2019/1/12.
 */
public class Test {
    public static void main(String[] args) {
        Boss boss=new Boss();
        TeamLeader teamLeader=new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
