Trivial Drive (Kotlin)
======================

Sample for porting an Android app using Google Play Billing Library version 4 to Amazon Appstore IAP

Introduction
------------

This sample is based on the Google sample explained here: [Trivial Drive (Kotlin) README](README_original.md)

This has been selected to be ported to the Amazon Appstore SDK IAP to provide a common showcase for developers
looking for porting their app from Google Play to Amazon Appstore.

Pre-requisites
--------------

- [Documentation](https://developer.amazon.com/docs/in-app-purchasing/iap-get-started.html)

Getting Started
---------------

For the Google IAB set up follow the instruction here [README_original.md](README_original.md).

To Set up for the Amazon Appstore IAP

1. Create an application on the Amazon Developer Console, available at
   https://developer.amazon.com/apps-and-games/console/apps/list.html .

2. Download the AppstoreAuthenticationKey.pem and copy it into the assets folder

3. Under In-app Items, create 2 consumables with these Product IDs:
   premium, gas ( You can follow the instructions [here](https://developer.amazon.com/docs/in-app-purchasing/iap-create-and-submit-iap-items.html))

4. Create 2 Subscription items with these IDs:
   infinite_gas_monthly, infinite_gas_yearly

5. On your testing device configure the App tester (more info [here](https://developer.amazon.com/docs/in-app-purchasing/iap-testing-overview.html))

6. Build and run your app.

7. Make some purchases.

Notes
-----

To check if the app has to use Google IAB or the Amazon Appstore SDK IAP, there is a check in the file
[TrivialDriveApplication.kt](app/src/main/java/com/sample/android/trivialdrivesample/TrivialDriveApplication.kt)

```kotlin
        val billingDataSource =  if (installerPackageName == "com.amazon.venezia" || installerPackageName.isNullOrEmpty()) {
            AmazonAppstoreIAPDataSource.getInstance(
                this@TrivialDriveApplication,
                GlobalScope,
                TrivialDriveRepository.INAPP_SKUS,
                TrivialDriveRepository.SUBSCRIPTION_SKUS,
                TrivialDriveRepository.AUTO_CONSUME_SKUS
            )
        } else {
            BillingDataSource.getInstance(
            this@TrivialDriveApplication,
                GlobalScope,
            TrivialDriveRepository.INAPP_SKUS,
            TrivialDriveRepository.SUBSCRIPTION_SKUS,
            TrivialDriveRepository.AUTO_CONSUME_SKUS
        )
```
The string "com.amazon.venezia" is the one to test for to check if the app is installed from the Amazon Appstore.
Due this is a development app, the installerPackageName will always return an empty string, handle the configuration manually to
select which API to use.

License
-------
Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.
