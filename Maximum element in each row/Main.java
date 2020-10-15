#include <iostream>
using namespace std;

int main()
 {
   int i,j,max = 0;
int m,n;
cin>>m>>n;
int arr[m][n];
   for (i = 0; i < m; i++)
{
   for (j = 0; j < n; j++)
{
   cin>>arr[i][j];
 }
}
   for (i = 0; i < m; ++i) 
{
      for (j = 0; j < n; ++j) 
{
        if (max <arr [i][j])
        {
         max =  arr[i][j];
        }
      }
      cout << max << "\n";
      max = 0;
   }
}