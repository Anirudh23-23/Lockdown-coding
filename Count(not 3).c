int count(int n) 
{ 
    if (n < 3) 

        return n; 

    if (n >= 3 && n < 10) 

       return n-1;

    int power = 1; 

    while (n/power > 9) 

        power = power*10; 

    int x=n/power; 

    if (x!=3) 


      return count(x)*count(power - 1) + count(x) + count(n%power); 

    else


      return count(x*power - 1); 
} 


int main() 
{ 

    printf ("%d ", count(578)); 

    return 0; 
} 
