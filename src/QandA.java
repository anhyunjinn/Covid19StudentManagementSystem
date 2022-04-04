
public class QandA {//class 이름을 QandA로 설정
	String question;//변수 question 설정
	
	public QandA() {//기본생성자 호출
	}
	
	public QandA (String question) {
		//QandA 생성자를 사용하여 아래 변수를 초기화
		this.question = question;
	}
	
	public void printQnA() {
		//사용자가 남긴 문의의 내용을 출력하는 printQnA 메소드 생성
		System.out.println("your question is '"+ question + "'");
	}
}
