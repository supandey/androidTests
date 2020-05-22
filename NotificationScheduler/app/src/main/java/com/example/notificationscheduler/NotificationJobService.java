package com.example.notificationscheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;

import JobSer;

public class NotificationJobScheduler extends JobService {
    @Override
    public boolean onStartJob(JobParameters params) {
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return false;
    }
}
