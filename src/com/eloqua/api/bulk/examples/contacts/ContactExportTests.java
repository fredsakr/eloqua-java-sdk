package com.eloqua.api.bulk.examples.contacts;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;
import com.eloqua.api.bulk.BulkClient;
import com.eloqua.api.bulk.models.Data;
import com.eloqua.api.bulk.models.Export;
import com.eloqua.api.bulk.models.ExportFilter;
import com.eloqua.api.bulk.models.FilterRuleType;
import com.eloqua.api.bulk.models.Sync;
import com.eloqua.api.bulk.models.SyncStatusType;

public class ContactExportTests {
	
	@Test
	public void ExportTest() 
	{
		// instantiate a new instance of the client
		BulkClient client = new BulkClient("site", "user", "password", "https://secure.eloqua.com/API/Bulk/1.0");
		
		// define the list of fields to be included in the Export
		// use : client.ContactFieldClient().Search(searchTerm, page, pageSize)
		HashMap<String, String> fields = new HashMap<String, String>();
		fields.put("C_EmailAddress", "{{Contact.Field(C_EmailAddress)}}");
		fields.put("C_FirstName", "{{Contact.Field(C_FirstName)}}");
		
		// define the filter criteria for the export
		// use : client.ContactFilterClient().Search(searchTerm, page, pageSize)
		ExportFilter filter = new ExportFilter();
		filter.filterRule = FilterRuleType.member;
		filter.membershipUri = "/contact/segment/4268";
		
		// create the definition for the Export
		Export export = new Export();
		export.name = "sample export";
		export.fields = fields;
		export.filter = filter;		
		export.secondsToAutoDelete = 3600;
		export.secondsToRetainData = 3600;
				
		Export exportResult = client.ContactExportClient().CreateExport(export);

		// create the sync for the Export
		Sync sync = new Sync();
		sync.status = SyncStatusType.pending;
		sync.syncedInstanceUri = exportResult.uri;
		
		// check Sync results (use polling)
		Sync syncResult = client.ContactExportClient().CreateSync(sync);
		assertNotNull(syncResult);
		
		// retrieve the data
		Data data = client.ContactExportClient().GetExportData(exportResult.uri);		
		assertNotNull(data);
	}
}
