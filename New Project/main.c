#include <stdio.h>

int gcd(int a,int b)
{
    int k=1;
    int p,q;
    if(a>b)
     { q=a; p=b;}
     else
     { q=b;p=a;}
     while(k==1)
     {
         r=q%p;
         q=p;
         p=r;
         if(r==0)
         {
             break;
         }
     }
     return p;
}
int main()
{
    int t;
    int a[1001];
    int n,q;
    int l,r;
    scanf("%d",&t);
    while(t--)
    {
        scanf("%d%d",&n,&q);
        for(int i=1;i<=n;i++)
        {
            scanf("%d",&a[i]);
        }
    }
    return 0;
}

