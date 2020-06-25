import java.util.Scanner;
import java.util.concurrent.TimeUnit;
class java_1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("게임이 시작 됩니다.");
		try{
			TimeUnit.SECONDS.sleep(1);
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		System.out.println("당신의 이름은?");
		try{
			TimeUnit.SECONDS.sleep(1);
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		String name = sc.nextLine();
		System.out.println("그런가요 " + name + " 그것이 당신의 이름 인가요");
		try{
			TimeUnit.SECONDS.sleep(1);
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("지금 세상이 좀비세상으로 변했어요 저랑 같이 다닐까요?");
		try{
			TimeUnit.SECONDS.sleep(1);
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("선택지1 : 네 같이 가요");
		System.out.println("선택지2 : 아니요 저 혼자 다닐래요");
		
		int choice = sc.nextInt();
		
		if(choice==1) {
			System.out.println("오 현명한 선택을 하셨군요 앞으로 잘해봅시다.");
			try{
				TimeUnit.SECONDS.sleep(1);
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
			System.out.println("그리고 가방 안에 있는 물을 놓고 죽으시죠ㅎㅎ");
			try{
				TimeUnit.SECONDS.sleep(1);
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
			System.out.println("시스템 : 당신은 죽었습니다. 숫자가 1000가 될때까지 기다리세요");
			try{
				TimeUnit.SECONDS.sleep(1);
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}	
			int b = 1;
			
			while(b<=1000) {
				System.out.println(b);
				try{
					TimeUnit.SECONDS.sleep(1);
				}catch(InterruptedException e){
					System.out.println(e.getMessage());
				}
				b++;
			} 
		}else {
			System.out.println("혼자 다니시겠다고요?");
			try{
				TimeUnit.SECONDS.sleep(1);
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
			System.out.println("하..어이가없네 가방속에 있는 물을 보고 구해줬는데");
			try{
				TimeUnit.SECONDS.sleep(1);
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
			System.out.println("그냥 죽어야겠다");
			try{
				TimeUnit.SECONDS.sleep(1);
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
			System.out.println("시스템 : 당신은 죽었습니다. 숫자가 1000가 될때까지 기다리세요");
			try{
				TimeUnit.SECONDS.sleep(1);
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
			int b = 1;
			
			while(b<=1000) {
				System.out.println(b);
				try{
					TimeUnit.SECONDS.sleep(1);
				}catch(InterruptedException e){
					System.out.println(e.getMessage());
				}
				b++;
			}
		}
	}
}