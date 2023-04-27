package com.zengdw.user.message;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author zengd
 * @version 1.0
 * @date 2023/4/27 14:25
 */
public interface Source {
    String OUTPUT = "output";

    @Output("output")
    MessageChannel output();
}
