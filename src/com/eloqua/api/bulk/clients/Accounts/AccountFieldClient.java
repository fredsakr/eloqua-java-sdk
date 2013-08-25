package com.eloqua.api.bulk.clients.accounts;

import com.eloqua.api.Response;
import com.eloqua.api.bulk.BaseClient;
import com.eloqua.api.bulk.models.Field;
import com.eloqua.api.bulk.models.SearchResponse;

public class AccountFieldClient {
	private BaseClient _client;
	
	public AccountFieldClient(BaseClient client) {
		_client = client;
	}
	
	public SearchResponse<Field> Search(String searchTerm, int page, int pageSize)
	{
		Response response = _client.get("/account/fields?search=" + searchTerm + "&page=" + page + "&pageSize=" + pageSize );
						
		SearchResponse<Field> fields = _client.Gson().fromJson(response.body, SearchResponse.class);		

		return fields;
	}
}
