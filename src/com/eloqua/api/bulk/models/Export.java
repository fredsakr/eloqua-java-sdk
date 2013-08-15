package com.eloqua.api.bulk.models;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Export {
	public String createdBy;
    public Date createdAt;
    public Map<String, String> fields;
    public ExportFilter filter;
    public Long kbUsed;
    public String name;
    public Integer secondsToAutoDelete;
    public Integer secondsToRetainData;
    public List<SyncAction> syncActions;
    public String updatedBy;
    public Date updatedAt;
    public String uri;
}
