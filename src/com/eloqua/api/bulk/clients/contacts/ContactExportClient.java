package com.eloqua.api.bulk.clients.contacts;

import com.eloqua.api.Response;
import com.eloqua.api.bulk.BaseClient;
import com.eloqua.api.bulk.models.Data;
import com.eloqua.api.bulk.models.Export;
import com.eloqua.api.bulk.models.Sync;

public class ContactExportClient {

	private BaseClient _client;
	
	public ContactExportClient(BaseClient client) {
		_client = client;
	}

	public Export CreateExport(Export export) {
		Response response = _client.post("/contact/export", _client.Gson().toJson(export));
		
		Export updatedExport = _client.Gson().fromJson(response.body, Export.class);		

		return updatedExport;
	}
	
	public Sync CreateSync(Sync sync) {
		Response response = _client.post("/sync", _client.Gson().toJson(sync));
		
		Sync updatedSync = _client.Gson().fromJson(response.body, Sync.class);		

		return updatedSync;		
	}
	
	public Data GetExportData(String exportUri) {
		Response response = _client.get(exportUri + "/data");
		Data data = _client.Gson().fromJson(response.body, Data.class);
		return data;
	}
}
