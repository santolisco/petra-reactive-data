package com.bat.petra.data.worker.service;

import com.bat.petra.data.common.CommonApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Component;


@Component
public class WorkerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(WorkerService.class);


    public void worker()  {

        new CommonApplication();



    }


}