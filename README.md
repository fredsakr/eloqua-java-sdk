eloqua-java-sdk
===============

A software development kit initially supporting clients for Eloqua's Bulk API.

## Usage

### Create Client
	BulkClient client = new BulkClient("site", "user", "password", "https://secure.eloqua.com/API/Bulk/1.0");

### GET (list)
	SearchResponse<Field> fields = client.ContactFieldClient().Search("*", 1, count);	
	
## Endpoint URL
To determine the base url, you can use the following endpoint : login.eloqua.com/id 
The endpoint, when called with basic authentication, will return details about the URLs for the various APIs.
     
```json
{
    "site": {
        "id": 42,
        "name": "SampleClient"
    },
    "user": {
        "id": 314,
        "username": "Fred Sakr",
        "displayName": "Fred Sakr",
        "firstName": "Fred",
        "lastName": "Sakr",
        "emailAddress": "fred.sakr@oracle.com"
    },
    "urls": {
        "base": "https://www05.secure.eloqua.com",
        "apis"	...
	}
}
```

## License
	Copyright [2012] [Fred Sakr]
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at
	http://www.apache.org/licenses/LICENSE-2.0
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.