package idv.example.demo.service.impl;

import org.apache.camel.Exchange;
import org.apache.camel.RuntimeCamelException;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import idv.example.demo.service.Angus01AppService;

public class Angus01AppServiceImpl implements Angus01AppService {

	private static final Logger logger = LoggerFactory.getLogger(Angus01AppServiceImpl.class);
	public static final Gson GSON = new GsonBuilder().create();

	@Override
	public void helloWord(Exchange exchange) {
		try {
			logger.info("===================helloWord===================");
			exchange.getOut().setBody("helloWord!!");
		} catch (Exception e) {
			String exceptionStr = ExceptionUtils.getStackTrace(e);
			throw new RuntimeCamelException(exceptionStr);
		}
	}

}
