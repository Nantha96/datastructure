public class StockSpanner {
    int[] stack;
    int idx = 0;
    int[] solve;
    public StockSpanner() {
        stack = new int[10001];
        solve = new int[10001];
    }

    public int next(int price) {
        stack[++idx]=price;
        solve[idx]=1;
        for(int i=idx-1;i>0;)
        {
            if(price >= stack[i])
            {
                solve[idx]+=solve[i];
                i-=solve[i];
            }else
                break;

        }
        return solve[idx];
    }

    public static void main(String[] args) {
        StockSpanner ss =new StockSpanner();
        System.out.println(ss.next(100));
        System.out.println(ss.next(80));
        System.out.println(ss.next(60));
        System.out.println(ss.next(70));
        System.out.println(ss.next(60));
        System.out.println(ss.next(75));
        System.out.println(ss.next(85));
    }
}
