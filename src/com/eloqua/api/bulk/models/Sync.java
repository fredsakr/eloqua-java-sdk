package com.eloqua.api.bulk.models;

import java.util.Date;

public class Sync {
	public Date createdAt;
    public String createdBy;
    public SyncStatusType status;
    public String syncedInstanceUri;
    public Date syncEndedAt;
    public Date syncStartedAt;
    public String uri;
}
