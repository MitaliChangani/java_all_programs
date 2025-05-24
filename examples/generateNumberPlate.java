public class generateNumberPlate {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=3;i++){
            char c =(char)(Math.random()*26+'A');
            sb.append(c);
        }
        for(int i=0; i<=4;i++){
            int digit = (int)(Math.random()*10+'0');
            sb.append(digit);
        }
        System.out.println(sb);
    }
}
