package com.dsa.patterns;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Patterns
{
   public void printPattern(int n)
   {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------------------------");

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
        for(int i=1;i<=5;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print((n-j)+1);
            }
            System.out.println();
        }
        System.out.println("----------------------------");
        for(int i=1;i<=n;i++)
        {

            for(int j=1;j<=(2*n-1);j++)
            {
                int k=(j-n+i);
                if(k>0 && k<=(2*i-1))
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        System.out.println("----------------------------");

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------------------------");

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=(n-i);j++)
            {
               System.out.print(" ");
            }

            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("----------------------------");

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
    System.out.println(" ");
        }

        for(int i=1;i<=n;i++)
        {
          for(int j=1;j<=i-1;j++)
          {
              System.out.print(" ");
          }
          for(int j=1;j<=(2*n-(2*i-1));j++)
          {
              System.out.print("*");
          }
            for(int j=1;j<=i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        System.out.println("----------------------------");

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
 System.out.println("---------------");

        for(int i=1;i<=(2*n-1);i++)
        {
            int stars=i;
            if(i>n)
            {
                stars=(2*n)-i;
            }
            for(int j=1;j<=stars;j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println("---------------");

        for(int i=1;i<=n;i++)
        {
           int print=i%2;


           for(int j=1;j<=i;j++)
           {

               System.out.print(print+" ");
               print=1-print;

           }
           System.out.println(" ");


        }
        System.out.println("---------------");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int j=1;j<=(2*(n-i));j++)
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)
            {
               System.out.print(j);
            }
            System.out.println(" ");
        }
        System.out.println("---------------");

        int k=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println(" ");
        }
        System.out.println("---------------");

        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print((char)(65+j)+" ");
            }
            System.out.println(" ");
        }
        System.out.println("---------------");
        for(int i=1;i<=n;i++)
        {
            for(char ch='A';ch<='A'+(n-i);ch++)
            {
                System.out.print(ch+" ");
            }
            System.out.println(" ");
        }
        System.out.println("-------------------");

        for(int i=1;i<=n;i++)
        {
            char c=(char)(65+i-1);
            for(int j=1;j<=i;j++)
            {

                System.out.print(c+" ");

            }
            System.out.println(" ");
        }
        System.out.println("-------------------");


        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                char c=(char)(65+j-1);
                System.out.print(c);
            }
            for(int j=i-1;j>=1;j--)
            {
                char c=(char)(65+j-1);
                System.out.print(c);
            }
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        System.out.println("-------------------");

        for(int i=1;i<=n;i++)
        {
            char c=(char)(65+n-i);
            for(int j=1;j<=i;j++)
            {
                System.out.print(c+" ");
                c++;
            }
            System.out.println(" ");
        }
        System.out.println("-------------------");


        for(int i=1;i<=(2*n);i++)
        {
      int stars=0;
            if (i > n) {
                stars=Math.abs(n-i);
            }
            else {
                stars=Math.abs(n-i)+1;
            }


           int spaces=Math.abs(2*n-(2*stars));
           for(int j=1;j<=stars;j++)
           {
               System.out.print("*");
           }
           for(int j=1;j<=spaces;j++)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=stars;j++)
           {
           System.out.print("*");
           }

           System.out.println();
        }
        System.out.println("-------------------");
     for(int i=1;i<=2*n-1;i++)
     {
         int stars=0;
         if(n>i)
         {
            stars=i;
         }
         else {
             stars=2*n-i;
         }
         int spaces=(2*n)-2*stars;
         for(int j=1;j<=stars;j++)
         {
             System.out.print("*");
         }
         for(int j=1;j<=spaces;j++)
         {
             System.out.print(" ");
         }
         for(int j=1;j<=stars;j++)
         {
             System.out.print("*");
         }
         System.out.println();
     }
        System.out.println("-------------------");

     for(int i=1;i<=n;i++)
     {
         for(int j=1;j<=n;j++)
         {
             if(i==1 || j==1 || i==n || j==n)
             {
                 System.out.print("*");
             }
             else {
                 System.out.print(" ");
             }
         }
         System.out.println();
     }
        System.out.println("-------------------");
     for(int i=0;i<(2*n-1);i++)
        {
            for(int j=0;j<(2*n)-1;j++)
            {
                int top=i;
                int bottom=(2*n)-2-i;
                int left=j;
                int right=(2*n)-2-j;
                int value=n-(Math.min(Math.min(left,right),Math.min(top,bottom)));
                System.out.print(value);
            }
            System.out.println();
        }
        
    }
}

