package com.mq.mqdemo.kafka;

import com.mq.mqdemo.enums.ResultCodeEnum;
import com.mq.mqdemo.models.AjaxResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class Producer {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @RequestMapping(value = "/send", method = RequestMethod.GET)
    public AjaxResult sendKafka(HttpServletRequest request, HttpServletResponse response) {
        try {
            String message = request.getParameter("message");
            logger.info("kafka的消息={}",message);
//            kafkaTemplate.send("my-replicated-topic", "key", message);
            kafkaTemplate.send("test", "key", message);
            logger.info("发送kafka成功.");
            return new AjaxResult(ResultCodeEnum.SUCCESS.getValue(), "发送kafka成功", null);
        } catch (Exception e) {
            logger.error("发送kafka失败", e);
            logger.info(ResultCodeEnum.EXCEPTION.getValue(),"发送kafka失败", null);
            return new AjaxResult(ResultCodeEnum.EXCEPTION.getValue(), "发送kafka失败", null);
        }
    }
}
