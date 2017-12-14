using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calculation
{
    class Program
    {
        void cal(double w, double h)
        {
            double area = 0.5 * w * h;
            Console.WriteLine("\n\tArea of Triangal=" + area);
        }

        void cal(int w, int h)
        {
            double area =w * h;
            Console.WriteLine("\n\tArea of Rectangal=" + area);
            
        }

        void cal(double w)
        {
            double area = w * w;
            Console.WriteLine("\n\tArea of Square=" + area);
        }

        void cal(int r)
        {
            double area = 3.14 *r *r;
            Console.WriteLine("\n\tArea of Circle=" + area);
            
        }

        void cal(float w, float h)
        {
            float area = w * h;
            Console.WriteLine("\n\tArea of Ellips=" + area);

        }

        static void Main(string[] args)
        {
            Program p = new Program();
            int ch,temp=0;
            double num1, num2;
            int val1, val2;
            float n1,n2;
            while (temp == 0)
            {
                Console.WriteLine("\n1.Triangal \n2.Rectangal \n3.Square \n4.Circle \n5.Ellips \n6.Exit");
                Console.Write("\nEnter the choice=");
                ch=Convert.ToInt32(Console.ReadLine());
                switch (ch)
                {
                    case 1:
                        Console.Write("\nEnter the Height=");
                        num1 = Convert.ToDouble(Console.ReadLine());
                        Console.Write("Enter the Weight=");
                        num2 = Convert.ToDouble(Console.ReadLine());
                        p.cal(num1, num2);
                        break;

                    case 2:
                        Console.Write("\nEnter the Height=");
                        val1 = Convert.ToInt32(Console.ReadLine());
                        Console.Write("Enter the Weight=");
                        val2 = Convert.ToInt32(Console.ReadLine());
                        p.cal(val1, val2);
                        break;

                    case 3:
                        Console.Write("\nEnter the Height=");
                        num1 = Convert.ToDouble(Console.ReadLine());
                        p.cal(num1);
                        break;

                    case 4:
                        Console.Write("\nEnter the Radius=");
                        val1 = Convert.ToInt32(Console.ReadLine());
                        p.cal(val1);
                        break;

                    case 5:
                        Console.Write("\nEnter the Vertical Radius=");
                        n1 = (float)Convert.ToDouble(Console.ReadLine());
                        Console.Write("Enter the Horizontal Radius=");
                        n2 = (float)Convert.ToDouble(Console.ReadLine());
                        p.cal(n1, n2);
                        break;

                    case 6:
                        temp = 1;
                        break;

                    default:
                        Console.WriteLine("\nWrong Choice\n");
                        break;
                }
            }
        }
    }
}
