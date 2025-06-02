public class Cal {
    int getDivide(int a, int b){
        if(b==0)
            throw new RuntimeException("0으로 나눌수 없습니다");
        return a/b;
    }
}
