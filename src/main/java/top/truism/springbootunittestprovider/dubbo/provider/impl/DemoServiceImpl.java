package top.truism.springbootunittestprovider.dubbo.provider.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.truism.springbbotunittestinterface.service.DemoService;

import java.util.function.Function;

@DubboService
public class DemoServiceImpl implements DemoService<String, String> {

    private static Logger logger = LoggerFactory.getLogger(DemoServiceImpl.class);

    @Override
    public void printHello() {
        logger.info("Hello dubbo");
    }

    @Override
    public String doFunction(Function<String, String> function) {
        return function.apply("hello");
    }
}
