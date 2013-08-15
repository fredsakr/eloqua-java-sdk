package com.eloqua.api.bulk.clients;

import com.eloqua.api.Response;
import com.eloqua.api.bulk.BaseClient;
import com.eloqua.api.bulk.models.ContactFieldSearchResponse;
import com.eloqua.api.bulk.models.Field;
import com.eloqua.api.bulk.models.SearchResponse;
import com.google.gson.Gson;

public class ContactFieldClient {

	private BaseClient _client;
	
	public ContactFieldClient(BaseClient client) {
		_client = client;
	}
	
	public SearchResponse<Field> Search(String searchTerm, int page, int pageSize)
	{
		Response response = _client.get("/contact/fields?search=" + searchTerm + "&page=" + page + "&pageSize=" + pageSize );
						
		Gson gson = new Gson();
		SearchResponse<Field> fields = gson.fromJson(response.body, SearchResponse.class);		

		return fields;
	}
}