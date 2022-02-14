import java.util.ArrayList;
import java.util.List;
public class PythagoreanTriplet{
    int a,b,c;
    static List<PythagoreanTriplet> tripletList = new ArrayList<>();
    static PythagoreanTriplet instance = new PythagoreanTriplet();
    static int n;
    public PythagoreanTriplet() {
    }
    public PythagoreanTriplet(int a,int b,int c) {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public static PythagoreanTriplet makeTripletsList() {
        tripletList=new ArrayList<>();
        return instance;
    }
    public static PythagoreanTriplet withFactorsLessThanOrEqualTo(int limit) {
        return instance;
    }
    public static PythagoreanTriplet thatSumTo(int sum) {
        n=sum;
        return instance;
    }
    public static List<PythagoreanTriplet> build() {
        for (int a=1;a <= n/3;a++) {
            for (int b=a+1;b<=n/2;b++) 
            {
                 int c=n-a-b;
                 if (a*a + b*b==c*c)
                {
                    tripletList.add(new PythagoreanTriplet(a,b,c));
                }
            }
        }
        return tripletList;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PythagoreanTriplet))
            return false;
        PythagoreanTriplet triplet = (PythagoreanTriplet) other;
        return (triplet.a == this.a && triplet.b == this.b && triplet.c == this.c);
    }
   
}