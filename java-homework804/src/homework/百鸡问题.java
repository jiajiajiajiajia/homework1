package homework;

public class �ټ����� {
	
	public static void main(String[] args) {
		
		for(int x=0;x<=20;x++) {
			for(int y=0;y<35;y++) {
				for(int z=0;z<=300;z+=3) {
					if((x+y+z==100)&&(5*x+3*y+z/3==100)) {
						System.out.println("������"+x+" ĸ����"+y+" С����"+z);
					}
				}
					
			}
				
		}			
	}
}
