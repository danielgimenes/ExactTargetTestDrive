# ExactTargetTestDrive
Sample code to show crash when using Exact Target SDK 5.4.4 and Play Services 11.8.0.

When app starts, a fatal crash occurs and this error appears on the device's logs:

```
E/AndroidRuntime: FATAL EXCEPTION: AsyncTask #1
        Process: com.eduk.edukandroidapp, PID: 28926
        java.lang.RuntimeException: An error occurred while executing doInBackground()
           at android.os.AsyncTask$3.done(AsyncTask.java:353)
           at java.util.concurrent.FutureTask.finishCompletion(FutureTask.java:383)
           at java.util.concurrent.FutureTask.setException(FutureTask.java:252)
           at java.util.concurrent.FutureTask.run(FutureTask.java:271)
           at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162)
           at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636)
           at java.lang.Thread.run(Thread.java:764)
        Caused by: java.lang.NoSuchMethodError: No static method getNoBackupFilesDir(Landroid/content/Context;)Ljava/io/File; in class Lcom/google/android/gms/common/util/zzu; or its super classes (declaration of 'com.google.android.gms.common.util.zzu' appears in /data/app/com.eduk.edukandroidapp-PsLBjPi7vefmv1EP5XtqQQ==/split_lib_dependencies_apk.apk)
           at com.google.android.gms.iid.zzh.<init>(Unknown Source:35)
           at com.google.android.gms.iid.zzh.<init>(Unknown Source:3)
           at com.google.android.gms.iid.InstanceID.zza(Unknown Source:24)
           at com.google.android.gms.iid.InstanceID.getInstance(Unknown Source:1)
           at com.salesforce.marketingcloud.i.c(Unknown Source:30)
           at com.salesforce.marketingcloud.i.a(Unknown Source:172)
           at com.salesforce.marketingcloud.MCJobService$a.a(Unknown Source:24)
           at com.salesforce.marketingcloud.MCJobService$a.doInBackground(Unknown Source:2)
           at android.os.AsyncTask$2.call(AsyncTask.java:333)
           at java.util.concurrent.FutureTask.run(FutureTask.java:266)
           at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1162) 
           at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:636) 
           at java.lang.Thread.run(Thread.java:764)

```
