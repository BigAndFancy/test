import java.util.Scanner;

class task1 {
    public static void main(String[] args)
    {
            Scanner sc= new Scanner(System.in);
            int n=sc.nextInt();
            int buf;
            int[] mas=new int[n];
            for (int i=0;i<n;i++)
            {
                mas[i]=(int)(Math.random()*100);
                System.out.print(mas[i]+" ");
            }
            System.out.println();
            for (int i=0;i<n/2;i++)
            {
                buf=mas[i];
                mas[i]=mas[n-i-1];
                mas[n-i-1]=buf;

            }
           for (int i=0;i<n;i++)
           {
               System.out.print(mas[i]+" ");
           }
    }
}

class task2{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int buf;
        int[] mas=new int[n];
        for (int i=0;i<n;i++)
        {
            mas[i]=(int)(Math.random()*100);
            System.out.print(mas[i]+" ");
        }
        System.out.println();
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
               if (mas[j]>mas[j+1])
               {
                   buf = mas[j];
                   mas[j] = mas[j+1];
                   mas[j+1] = buf;
               }
        }
        for (int i=0;i<n;i++)
        {
            System.out.print(mas[i]+" ");
        }
    }
}

class task3{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int buf,n=0,num1;
        num1=num;
        while(num1!=0)
        {
            n++;
            num1=num1/10;
        }
        int[] mas=new int[n];
        int n1=1;
        for (int i=0;i<n;i++)
        {
            buf=num%10;
            num=num/10;
            mas[i]=buf;
        }
        for (int i=0;i<n/2;i++)
        {
            if (mas[i]!=mas[n-i-1])
            {
                n1=-1;
            }
        }
        if(n1!=-1)
            System.out.print("Polindorm");
        else
            System.out.print("Ne Polindorm");
    }
}

class task4{
    public static void main (String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int buf,sum=0;
        while(num!=0)
        {
            buf=num%10;
            num=num/10;
            sum=sum+buf;
        }
        System.out.print(sum);
    }
}

class task5{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        double n=sc.nextInt();
        n=n*0.17;
        System.out.print(n);
    }
}

class task6{
    public static void main(String[] args)
    {
        int buf,n;
        for(int i=2;i<=100;i++)
        {
            n=0;
            for(int j=1;j<=i;j++)
            {
                buf=i%j;
                if(buf==0)
                {
                    n++;
                }
            }
            if (n==2)
                System.out.print(i+" ");
        }
    }
}

class task7{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        long n1=0,n2=1,sum=0;
        if ((n<100)&&(n>2))
        {
            System.out.print(n1+" ");
            for(int i=0;i<n-1;i++)
            {
                sum = n1 + n2;
                n1=n2;
                n2=sum;
                System.out.print(n1 + " ");
            }
        }
        else System.out.print("Nevernii diapazon");
    }
}

class task8{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int c;

        if (n<n1)
        {
            do {
                c=(int)(Math.random()*n1);
            }
            while((c<=n)&&(c>n1));
            System.out.print(c);
        }
        else System.out.print("b must be > a");
    }
}

class task9{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s=new String(sc.nextLine());
        int n=s.indexOf(' ');
        int a=s.length();
        char[] ss=new char[1];
        s.getChars(n+1,a,ss,0);
        for (int i=0;i<1;i++)
        {
            System.out.print(ss[i]);
        }
    }
}
