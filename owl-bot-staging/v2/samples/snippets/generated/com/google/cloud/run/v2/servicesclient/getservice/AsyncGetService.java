/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.run.v2.samples;

// [START run_v2_generated_servicesclient_getservice_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.run.v2.GetServiceRequest;
import com.google.cloud.run.v2.Service;
import com.google.cloud.run.v2.ServiceName;
import com.google.cloud.run.v2.ServicesClient;

public class AsyncGetService {

  public static void main(String[] args) throws Exception {
    asyncGetService();
  }

  public static void asyncGetService() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ServicesClient servicesClient = ServicesClient.create()) {
      GetServiceRequest request =
          GetServiceRequest.newBuilder()
              .setName(ServiceName.of("[PROJECT]", "[LOCATION]", "[SERVICE]").toString())
              .build();
      ApiFuture<Service> future = servicesClient.getServiceCallable().futureCall(request);
      // Do something.
      Service response = future.get();
    }
  }
}
// [END run_v2_generated_servicesclient_getservice_async]
