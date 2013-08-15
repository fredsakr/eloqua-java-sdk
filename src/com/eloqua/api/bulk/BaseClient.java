package com.eloqua.api.bulk;

import com.eloqua.api.bulk.clients.ContactFieldClient;

public class BaseClient extends com.eloqua.api.BaseClient {

	public BaseClient(String site, String user, String password, String url) {
		super(site, user, password, url);
	}
}
