package com.eloqua.api.bulk.examples.login;

import org.junit.Test;
import com.eloqua.api.bulk.BulkClient;
import com.eloqua.api.bulk.models.login.AccountInfo;

public class AccountInfoTest {

	@Test
	public void GetAccountInfoTest() {
		BulkClient client = new BulkClient("site", "user", "password", "https://secure.eloqua.com/API/Bulk/1.0");
		
		AccountInfo info = client.GetAccountInfo();
		String baseUrl = info.urls.apis.rest.bulk;
	}
}
