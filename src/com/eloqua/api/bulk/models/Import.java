package com.eloqua.api.bulk.models;

import java.util.List;
import java.util.Map;

public class Import 
{
    public Map<String, String> fields;
    public String importPriorityUri;
    public String identifierFieldName;
    public boolean isSyncTriggeredOnImport;
    public long kbUsed;
    public String name;
    public Integer secondsToRetainData;
    public Integer secondsToAutoDelete;
    public List<SyncAction> syncActions;
    public RuleType updateRule;
    public String uri;
}
