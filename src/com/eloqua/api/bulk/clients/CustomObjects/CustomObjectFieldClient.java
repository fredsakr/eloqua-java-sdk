package com.eloqua.api.bulk.clients.customObjects;

import com.eloqua.api.Response;
import com.eloqua.api.bulk.BaseClient;
import com.eloqua.api.bulk.models.Field;
import com.eloqua.api.bulk.models.SearchResponse;

public class CustomObjectFieldClient {
	private BaseClient _client;
	
	public CustomObjectFieldClient(BaseClient client) {
		_client = client;
	}
	
	public SearchResponse<Field> Search(String searchTerm, int customObjectId, int page, int pageSize)
	{
		Response response = _client.get("/customObject/" + customObjectId + "/fields?search=" + searchTerm + "&page=" + page + "&pageSize=" + pageSize );
						
		SearchResponse<Field> fields = _client.Gson().fromJson(response.body, SearchResponse.class);		

		return fields;
	}
}