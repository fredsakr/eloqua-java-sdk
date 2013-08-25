package com.eloqua.api.bulk.clients.customObjects;

import com.eloqua.api.Response;
import com.eloqua.api.bulk.BaseClient;
import com.eloqua.api.bulk.models.ExportFilter;
import com.eloqua.api.bulk.models.SearchResponse;

public class CustomObjectFilterClient {
	private BaseClient _client;

	public CustomObjectFilterClient(BaseClient client) {
		_client = client;
	}
	
	public SearchResponse<ExportFilter> Search(String searchTerm, int customObjectId, int page, int pageSize)
	{
		Response response = _client.get("/customObject/" +customObjectId + "/filters?search=" + searchTerm + "&page=" + page + "&pageSize=" + pageSize );
						
		SearchResponse<ExportFilter> fields = _client.Gson().fromJson(response.body, SearchResponse.class);		

		return fields;
	}
}
