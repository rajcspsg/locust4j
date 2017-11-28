package com.github.myzhan.locust4j;

import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Queues {

    protected static final ConcurrentLinkedQueue<RequestSuccess> REPORT_SUCCESS_TO_STATS
        = new ConcurrentLinkedQueue<RequestSuccess>();
    protected static final ConcurrentLinkedQueue<RequestFailure> REPORT_FAILURE_TO_STATS
        = new ConcurrentLinkedQueue<RequestFailure>();

    protected static final ConcurrentLinkedQueue<Boolean> CLEAR_STATS = new ConcurrentLinkedQueue<Boolean>();

    protected static final ConcurrentLinkedQueue<Boolean> TIME_TO_REPORT = new ConcurrentLinkedQueue<Boolean>();

    protected static final BlockingQueue<Map> REPORT_TO_RUNNER = new LinkedBlockingDeque<Map>();

    protected static final BlockingQueue<Message> MESSAGE_FROM_MASTER = new LinkedBlockingDeque<Message>();

    protected static final BlockingQueue<Message> MESSAGE_TO_MASTER = new LinkedBlockingDeque<Message>();

    protected static final BlockingQueue<Boolean> DISCONNECTED_FROM_MASTER = new LinkedBlockingDeque<Boolean>();
}
