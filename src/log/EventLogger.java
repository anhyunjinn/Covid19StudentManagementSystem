package log;

//import 키워드로 라이브러리 선언
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EventLogger { //class 이름을 EventLogger로 설정
	FileHandler filehandler;
	LogManager logmanager;
	Logger logger;
	
	public EventLogger(String fileName) { //생성자 생성
		try { //try 실행 (예외인지 아닌지 구분)
			logmanager = LogManager.getLogManager();
			//LogManager의 getLogManager 메소드 실행
			logger = logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
			//logmanager의 getLogger 메소드 실행
			filehandler = new FileHandler(fileName);
			//fileName을 저장하는 FileHandler 객체 생성
			filehandler.setFormatter(new SimpleFormatter());
			//filehandler의 setFormatter 메소드 실행
			logger.addHandler(filehandler);
			//filehandler을 추가하는 logger의 addHandler 메소드 실행
		} catch (IOException e) {
			//예외인 경우 (IOException)
			e.printStackTrace();
		}
	}

	public void log(String logMessage) { //log 메소드
		logger.info(logMessage);
		//legMessage의 정보를 출력하는 logger의 info 메소드 실행
	}
}
