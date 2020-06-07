package com.demo.spring.cloud.stream.listner;

import com.demo.spring.cloud.stream.model.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;


@EnableBinding(Sink.class)
public class ProcessBookEvent {


    private Logger logger = LoggerFactory.getLogger(ProcessBookEvent.class);

    @StreamListener("input")
    public void consumeEvent(Book book) {
        logger.info("consume event : "+book);
    }
}
