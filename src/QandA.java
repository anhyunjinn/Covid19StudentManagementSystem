
public class QandA {//class �̸��� QandA�� ����
	String question;//���� question ����
	
	public QandA() {//�⺻������ ȣ��
	}
	
	public QandA (String question) {
		//QandA �����ڸ� ����Ͽ� �Ʒ� ������ �ʱ�ȭ
		this.question = question;
	}
	
	public void printQnA() {
		//����ڰ� ���� ������ ������ ����ϴ� printQnA �޼ҵ� ����
		System.out.println("your question is '"+ question + "'");
	}
}
