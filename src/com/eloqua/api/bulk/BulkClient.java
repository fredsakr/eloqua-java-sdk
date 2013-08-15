package com.eloqua.api.bulk;

import com.eloqua.api.bulk.clients.ContactFieldClient;
import com.eloqua.api.bulk.clients.ContactFilterClient;

public class BulkClient extends BaseClient {

	public BulkClient(String site, String user, String password, String url) {
		super(site, user, password, url);
	}
	
	public ContactFieldClient ContactFieldClient() {
		return new ContactFieldClient(this);
	}

	public ContactFilterClient ContactFilterClient() {
		return new ContactFilterClient(this);
	}
}
