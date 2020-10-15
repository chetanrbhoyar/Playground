#include<stdio.h>
struct employee
{
char name[20],des[20];
int id,age,salary;
}e;
int main()
{
printf("Enter name:\n");
scanf("%s",e.name);
printf("Enter ID:\n");
scanf("%d",&e.id);
printf("Enter age:\n");
scanf("%d",&e.age);
printf("Enter designation:\n");
scanf("%s",e.des);
printf("Enter Salary:\n");
scanf("%d",&e.salary);
printf("Employee Details\n");
printf("Name of the Employee : %s\n",e.name);
printf("ID of the Employee : %d\n",e.id);
printf("Age of the Employee : %d\n",e.age);
printf("Designation of the Employee : %s\n",e.des);
printf("Salary of the Employee : %d",e.salary);
return 0;
}