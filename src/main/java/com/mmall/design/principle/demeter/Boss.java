package com.mmall.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 11790 on 2019/1/12.
 */
public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumber();
    }
}
