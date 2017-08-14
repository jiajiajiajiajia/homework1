package homework;

public class 百鸡问题 {
	
	public static void main(String[] args) {
		
		for(int x=0;x<=20;x++) {
			for(int y=0;y<35;y++) {
				for(int z=0;z<=300;z+=3) {
					if((x+y+z==100)&&(5*x+3*y+z/3==100)) {
						System.out.println("公鸡："+x+" 母鸡："+y+" 小鸡："+z);
					}
				}
					
			}
				
		}			
	}
}
