import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Alay{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] seeds=new int[n];
		for(int i=0;i<n;i++){
			seeds[i]=s.nextInt();
		}
		String text;
		StringBuilder sb=new StringBuilder();
		try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			text=br.readLine();
		}catch(java.io.IOException e){text="";}

		for(int i=0;i<text.length();i++){
			char c=text.charAt(i);
			switch(c){
				case 'o':sb.append('0');break;
				case 'i':sb.append('1');break;
				case 'z':sb.append('2');break;
				case 'e':sb.append('3');break;
				case 'a':sb.append('4');break;
				case 's':sb.append('5');break;
				case 'g':sb.append('6');break;
				case 'j':sb.append('7');break;
				case 'b':sb.append('8');break;
				case 'q':sb.append('9');break;
				default:{
					int m=0;
					for(int j:seeds){
						if((i+1)%j==0)m++;
					}
					if(m%2!=0){
						sb.append(Character.toUpperCase(c));
					}else{
						sb.append(c);
					}
				}
			}
		}
		System.out.println(sb.toString());
	}
}