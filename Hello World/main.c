#include<stdio.h>
void main(){
    char ms[12]="hello world";
    char ss[28]=" abcdefghijklmnopqrstuvwxyz";
    int i=0,j=0,k=0,count=0;
    for(i=0;i<11;i++)
    {

        for(j=0;j<25;j++)
        {
           for(k=0;k<i;k++)
        printf("%c",ms[k]);
        printf("%c\n",ss[j]);
            if(ms[i]==ss[j])
            break;
        }
    }
}
