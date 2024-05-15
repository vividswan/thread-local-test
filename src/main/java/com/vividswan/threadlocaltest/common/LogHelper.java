package com.vividswan.threadlocaltest.common;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LogHelper {
	public static void log(String message) {
		// 쓰레드 이름과 시간을 로그 메시지와 함께 출력
		String time = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
		String threadName = Thread.currentThread().getName();

		// 로그 메시지 기록
		log.info("Time: {}, Thread: {}, Message: {}", time, threadName, message);
	}

}
