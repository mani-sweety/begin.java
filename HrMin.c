#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main(void) {
	
	int t1,t2,t3,h1,h2,h3,m1,m2,m3;
	scanf("%d %d",&h1,&m1);
	scanf("%d %d",&h2,&m2);
	t1=(h1*60)+m1;
	t2=(h2*60)+m2;
	t3=t1-t2;
	h3=t3/60;
	m3=t3%60;
	printf("%d %d",abs(h3),abs(m3));
	
	return 0;
}
