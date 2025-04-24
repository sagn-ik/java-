public int convert(int n)
    {
        if(n==1)
         return 1;
        else
        return (n%2) + (10*conv(n/2));
    }
