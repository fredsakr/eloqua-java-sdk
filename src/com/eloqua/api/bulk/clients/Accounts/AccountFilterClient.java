package com.eloqua.api.bulk.clients.Accounts;

import com.eloqua.api.Response;
import com.eloqua.api.bulk.BaseClient;
import com.eloqua.api.bulk.models.ExportFilter;
import com.eloqua.api.bulk.models.SearchResponse;

public class AccountFilterClient {
	private BaseClient _client;

	public AccountFilterClient(BaseClient client) {
		_client = client;
	}
	
	public SearchResponse<ExportFilter> Search(String searchTerm, int page, int pageSize)
	{
		Response response = _client.get("/account/filters?search=" + searchTerm + "&page=" + page + "&pageSize=" + pageSize );
						
		SearchResponse<ExportFilter> fields = _client.Gson().fromJson(response.body, SearchResponse.class);		

		return fields;
	}

}
