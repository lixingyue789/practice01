/**
 * Author:lxy1999
 * Created:2019/12/5
 */
enum State{
    NORMAL,//开始状态，平时状态
    READ_CR,//已经读到\r的状态
    READ_LF;//已经读到\r\n的状态
}
public class Main {
    private static String process(byte[] bytes){
        State state = State.NORMAL;
        StringBuilder sb = new StringBuilder();
        for (byte b:bytes){
            switch (b){
                case '\r':
                    if(state==State.READ_CR){
                        sb.append((char) b);//ok\r\r \n
                    }
                    state = State.READ_CR;
                    break;
                case '\n':
                    if(state==State.READ_CR){
                        state = State.READ_LF;
                        return sb.toString();//ok\r\n
                    }
                    sb.append((char) b);//ok\r
                    break;
                default:
                    if(state==State.READ_CR){//ok\ro \r\n
                        sb.append((char) b);
                    }
                    state = State.NORMAL;
                    sb.append((char) b);
                    break;
            }
        }
        return String.valueOf(sb);
    }
    public static void main(String[] args) {
        String m = "hello\r\n";
        System.out.println(process(m.getBytes()));;
    }
}
