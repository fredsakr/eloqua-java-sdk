package com.eloqua.api.bulk.clients.contacts;

import com.eloqua.api.Response;
import com.eloqua.api.bulk.BaseClient;
import com.eloqua.api.bulk.models.ExportFilter;
import com.eloqua.api.bulk.models.SearchResponse;

public class ContactFilterClient {

	private BaseClient _client;

	public ContactFilterClient(BaseClient client) {
		_client = client;
	}
	
	public SearchResponse<ExportFilter> Search(String searchTerm, int page, int pageSize)
	{
		Response response = _client.get("/contact/filters?search=" + searchTerm + "&page=" + page + "&pageSize=" + pageSize );
						
		SearchResponse<ExportFilter> fields = _client.Gson().fromJson(response.body, SearchResponse.class);		

		return fields;
	}
}
