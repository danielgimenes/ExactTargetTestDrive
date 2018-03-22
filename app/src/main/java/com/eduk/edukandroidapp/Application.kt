package com.eduk.edukandroidapp

import android.app.Application
import com.salesforce.marketingcloud.InitializationStatus
import com.salesforce.marketingcloud.MarketingCloudConfig
import com.salesforce.marketingcloud.MarketingCloudSdk

class Application : Application() {

    override fun onCreate() {
        super.onCreate()

        // ExactTarget / MobilePush
        configureExactTarget(this)
    }

    private fun configureExactTarget(application: Application) {
        MarketingCloudSdk.init(application,
                MarketingCloudConfig.builder()
                        .setApplicationId(application.getString(R.string.exact_target_app_id))
                        .setAccessToken(application.getString(R.string.exact_target_access_token))
                        .setGcmSenderId(application.getString(R.string.gcm_defaultSenderId))
                        .setNotificationChannelName(
                                application.getString(R.string.course_news_notification_channel_name))
                        .build(),
                { status ->
                    if (!status.isUsable) {
                        // log
                        return@init
                    }

                    if (status.status() == InitializationStatus.Status.COMPLETED_WITH_DEGRADED_FUNCTIONALITY) {
                        if (status.locationsError()) {
                            // log
                        } else if (status.messagingPermissionError()) {
                            // log
                        }
                    }
                })
    }
}