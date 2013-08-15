package com.eloqua.api.bulk.clients;

import com.eloqua.api.Response;
import com.eloqua.api.bulk.BaseClient;
import com.eloqua.api.bulk.models.Export;
import com.eloqua.api.bulk.models.Field;
import com.eloqua.api.bulk.models.SearchResponse;
import com.eloqua.api.bulk.models.Sync;
import com.google.gson.Gson;

public class ContactExportClient {

	private BaseClient _client;
	
	public ContactExportClient(BaseClient client) {
		_client = client;
	}

	public Export CreateExport(Export export) {
		Gson gson = new Gson();
		Response response = _client.post("/contact/export", gson.toJson(export));
		
		Export updatedExport = gson.fromJson(response.body, Export.class);		

		return updatedExport;
	}
	
	public Sync CreateSync(Sync sync) {
		Gson gson = new Gson();
		Response response = _client.post("/sync", gson.toJson(sync));
		
		Sync updatedSync = gson.fromJson(response.body, Sync.class);		

		return updatedSync;		
	}
	
	public String GetExportData(String exportUri) {
		Response response = _client.get(exportUri + "/data");
		
		return response.body;
	}
}
