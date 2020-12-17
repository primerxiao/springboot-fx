package com.primer.common;

import com.primer.bean.CommitInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据
 */
public class Constanst {

    public static List<CommitInfo> commitInfos=new ArrayList<>();

    public static List<String> commitSqlFile = new ArrayList<>();

    public static boolean dataIsEmpty() {
        if (commitSqlFile.isEmpty() && commitInfos.isEmpty()) {
            return true;
        }
        return false;
    }

}
