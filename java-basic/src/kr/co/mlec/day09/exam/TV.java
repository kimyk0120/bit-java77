package kr.co.mlec.day09.exam;

public class TV {
	int channel;
	int vol;
	
	TV(){}
	
	TV(int channel, int vol){
		this.channel = channel;
		this.vol = vol;
	}
	int getVolume(){
		return vol;
	}
	int getChannel(){
		return channel;
	}
	void setChannel(int newChannel){
		this.channel = newChannel;
	}
	void channelUp(){
		this.channel++;
	}
	void powerOn(){
		System.out.println("Ƽ�� ������ �մϴ�.");
	}
	void powerOff(){
		System.out.println("Ƽ�� ������ ���ϴ�.");
	}
}
