package Interface;

public interface RemoteControl {
	
	//��� 
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	//�߻�޼ҵ�
	
	//@Override
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	//����Ʈ �޼ҵ� 
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�");
		}
		else {
			System.out.println("���� �����մϴ�");
		}
	}
	
	//���� �޼ҵ� 
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�");
	}
}