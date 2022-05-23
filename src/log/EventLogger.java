package log;

//import Ű����� ���̺귯�� ����
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class EventLogger { //class �̸��� EventLogger�� ����
	FileHandler filehandler;
	LogManager logmanager;
	Logger logger;
	
	public EventLogger(String fileName) { //������ ����
		try { //try ���� (�������� �ƴ��� ����)
			logmanager = LogManager.getLogManager();
			//LogManager�� getLogManager �޼ҵ� ����
			logger = logmanager.getLogger(Logger.GLOBAL_LOGGER_NAME);
			//logmanager�� getLogger �޼ҵ� ����
			filehandler = new FileHandler(fileName);
			//fileName�� �����ϴ� FileHandler ��ü ����
			filehandler.setFormatter(new SimpleFormatter());
			//filehandler�� setFormatter �޼ҵ� ����
			logger.addHandler(filehandler);
			//filehandler�� �߰��ϴ� logger�� addHandler �޼ҵ� ����
		} catch (IOException e) {
			//������ ��� (IOException)
			e.printStackTrace();
		}
	}

	public void log(String logMessage) { //log �޼ҵ�
		logger.info(logMessage);
		//legMessage�� ������ ����ϴ� logger�� info �޼ҵ� ����
	}
}
