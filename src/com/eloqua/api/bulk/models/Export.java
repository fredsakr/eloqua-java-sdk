package com.eloqua.api.bulk.models;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Export {
	public String createdBy;
    public String createdAt;
    public HashMap<String, String> fields;
    public ExportFilter filter;
    public Long kbUsed;
    public String name;
    public Integer secondsToAutoDelete;
    public Integer secondsToRetainData;
    public List<SyncAction> syncActions;
    public String updatedBy;
    public String updatedAt;
    public String uri;
}
