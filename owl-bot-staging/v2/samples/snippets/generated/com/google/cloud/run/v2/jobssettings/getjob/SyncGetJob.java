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

// [START run_v2_generated_JobsSettings_GetJob_sync]
import com.google.cloud.run.v2.JobsSettings;
import java.time.Duration;

public class SyncGetJob {

  public static void main(String[] args) throws Exception {
    syncGetJob();
  }

  public static void syncGetJob() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    JobsSettings.Builder jobsSettingsBuilder = JobsSettings.newBuilder();
    jobsSettingsBuilder
        .getJobSettings()
        .setRetrySettings(
            jobsSettingsBuilder.getJobSettings().getRetrySettings().toBuilder()
                .setTotalTimeout(Duration.ofSeconds(30))
                .build());
    JobsSettings jobsSettings = jobsSettingsBuilder.build();
  }
}
// [END run_v2_generated_JobsSettings_GetJob_sync]