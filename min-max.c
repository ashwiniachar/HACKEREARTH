
#include <stdio.h>

int main()
{
	int n,i,j,temp,min=0,max=0,minsum=0,maxsum=0;
	int a[100];
	scanf("%d", &n);              			

	for(i=0;i<n;i++)
	{
      scanf("%d\t",&a[i]);
	}
	    min=a[0];
	for(i=0;i<n;i++)
	{
	
	    if(a[i]<min)
	    {
	        min=a[i];
	    }
	}
    	max=a[0];
		for(i=0;i<n;i++)
    	{
	    if(a[i]>max)
	    {
	        max=a[i];
	    }
	}
	for(i=0;i<n;i++)
	{
	    if(a[i]!=max)
	    {
	        minsum=minsum+a[i];
	    }
	    if(a[i]!=min)
	    {
	        maxsum=maxsum+a[i];
	    }
	    
	}
	printf("%d %d",minsum,maxsum);
	

}
