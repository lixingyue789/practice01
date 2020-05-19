package 练习4;

/**
 * Author:lxy1999
 * Created:2020/4/12
 */
public class Solution2 {
    public int GetMaxStaffs (char[][] pos) {
        // write code here
        int flag = 0;
        for(int i = 0;i<pos.length;i++){
            for(int j = 0;j<pos[i].length;j++){
                char ch = pos[i][j];
                if(ch=='.'){
                    flag=1;
                }
            }
        }
        if(flag==0){
            return 0;
        }else{
            int r = 0;
            for(int i = 0;i<pos.length;i=i+2) {
                for (int j = 0; j < pos[i].length; j++) {
                    char ch = pos[i][j];
                    if(ch=='.'){
                        if(j==0&&(pos[i][1]=='*'||pos[i][1]!=1)){
                            pos[i][j]=1;
                            r++;
                        }else if((j==pos[i].length-1)&&(pos[i][j-1]=='*'||pos[i][j-1]!=1)){
                            pos[i][j]=1;
                            r++;
                        }else {
                            if((pos[i][j-1]=='*'||pos[i][j-1]==1)&&(pos[i][j+1]=='*'||pos[i][j+1]==1)){
                                pos[i][j]=1;
                                r++;
                            }
                        }
                    }
                }
            }
            return r;
        }
    }
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        char[][] pos = new char[2][2];
        pos[0][0]='.';
        pos[0][1]='.';
        pos[1][1]='.';
        pos[1][0]='.';
        int r = s.GetMaxStaffs(pos);
        System.out.println(r);
    }
}
