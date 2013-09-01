package com.eloqua.api.bulk.examples.login;

import org.junit.Test;
import com.eloqua.api.bulk.BulkClient;
import com.eloqua.api.bulk.models.login.AccountInfo;

public class AccountInfoTest {

	@Test
	public void GetAccountInfoTest() {		
		AccountInfo info = BulkClient.GetAccountInfo("site", "user", "password");
		String baseUrl = info.urls.apis.rest.bulk;
	}
}
