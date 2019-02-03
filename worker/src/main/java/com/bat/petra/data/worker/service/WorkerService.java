package com.bat.petra.data.worker.service;

import com.bat.petra.data.common.CommonApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.ParseException;

@Component
public class WorkerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(WorkerService.class);


    @Scheduled(cron = "${worker.scheduling.job.cron}")
    public void worker() throws InterruptedException, ParseException {

        new CommonApplication();



    }


}