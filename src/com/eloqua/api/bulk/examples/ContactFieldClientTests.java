package com.eloqua.api.bulk.examples;

import static org.junit.Assert.*;

import org.junit.Test;

import com.eloqua.api.bulk.BulkClient;
import com.eloqua.api.bulk.models.ContactFieldSearchResponse;
import com.eloqua.api.bulk.models.Field;
import com.eloqua.api.bulk.models.SearchResponse;

public class ContactFieldClientTests {

	@Test
	public void SearchFieldsTests() {
		BulkClient client = new BulkClient("site", "user", "password", "https://secure.eloqua.com/API/Bulk/1.0");
		
		ContactFieldSearchResponse fields = client.ContactFieldClient().Search("*", 1, 10);
	}
}
