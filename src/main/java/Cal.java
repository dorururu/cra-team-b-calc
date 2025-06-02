public class Cal {
    int getDivide(int a, int b){
        if(b==0)
            throw new RuntimeException("0으로 나눌수 없습니다");
        return a/b;
    }
    public int getGopGop(int a, int b, int c) {
        return a * b * c;
    }
    public int getMinus(int a, int b)
    {
        return a-b;
    }
    public int getSumSum(int a, int b, int c) {
        return a + b + c;
    }
    public int getZegop(int number){
        return number * number;
    }
    public int getSum(int a, int b){
        return a+b;
    }

}
