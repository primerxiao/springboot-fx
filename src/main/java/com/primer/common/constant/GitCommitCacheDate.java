package com.primer.common.constant;

import com.primer.gui.uicomponents.version.CommitInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * gitlabel工具的数据
 */
public class GitCommitCacheDate {

    public static List<CommitInfo> commitInfos=new ArrayList<>();

    public static List<String> commitSqlFile = new ArrayList<>();

    public static boolean dataIsEmpty() {
        return commitSqlFile.isEmpty() && commitInfos.isEmpty();
    }

}
