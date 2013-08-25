package com.eloqua.api.bulk;

import com.eloqua.api.bulk.clients.contacts.ContactFieldClient;
import com.eloqua.api.bulk.clients.contacts.ContactFilterClient;

public class BulkClient extends BaseClient {

	public BulkClient(String site, String user, String password, String url) {
		super(site, user, password, url);
	}
		
	public ContactFieldClient ContactFieldClient() {
		if (_contactFieldClient != null) {
			_contactFieldClient = new ContactFieldClient(this);
		}
		return _contactFieldClient;
	}	
	private ContactFieldClient _contactFieldClient;

	public ContactFilterClient ContactFilterClient() {
		if (_contactFilterClient != null) {
			_contactFilterClient = new ContactFilterClient(this);
		}
		return _contactFilterClient;
	}	
	private ContactFilterClient _contactFilterClient;
}
