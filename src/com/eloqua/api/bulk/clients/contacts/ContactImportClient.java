package com.eloqua.api.bulk.clients.contacts;

import java.util.Map;

import com.eloqua.api.Response;
import com.eloqua.api.bulk.BaseClient;
import com.eloqua.api.bulk.models.Import;
import com.eloqua.api.bulk.models.Sync;

public class ContactImportClient {
	private BaseClient _client;
	
	public ContactImportClient(BaseClient client) {
		_client = client;
	}

	public Import CreateImport(Import contactImport) {
		Response response = _client.post("/contact/import", _client.Gson().toJson(contactImport));
		
		Import updatedImport = _client.Gson().fromJson(response.body, Import.class);		

		return updatedImport;
	}
	
	public Sync ImportData(String importUri, Map<String, String> data) {
		Response response = _client.post(importUri + "/data" , _client.Gson().toJson(data));
		
		Sync sync = _client.Gson().fromJson(response.body, Sync.class);		

		return sync;		
	}
	
	public Sync CheckSyncResult(Sync sync) {
		Response response = _client.get(sync.uri + "/results");
		
		Sync syncResults = _client.Gson().fromJson(response.body, Sync.class);		

		return syncResults;
	}
}
