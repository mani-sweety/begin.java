#include <stdio.h>

int main(void) 
{
	int m,rem,rev=0;

	scanf("%d",&m);
	while(m!=0)
	{
		rem=m%10;
		rev=(rev*10)+rem;
		m=m/10;
	}
	m=rev;
	while(m!=0)
	{
		rem=m%10;
		printf("%d ",rem);
		m=m/10;
	}
 
	return 0;

}
