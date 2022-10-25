using System;

namespace _2019510086_Yavuz_Yılmaz
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.Title = "2019510086_Yavuz_Yılmaz";
            double option1;
            do
            {
                Console.WriteLine();
                Console.ForegroundColor = ConsoleColor.Red;
                Console.WriteLine("1.Run Program");
                Console.WriteLine("2.Quit");
                Console.ResetColor();
                Console.ForegroundColor = ConsoleColor.Green;
                Console.Write("Your Option? ");
                Console.ResetColor();
                bool choose = double.TryParse(Console.ReadLine(), out option1);
                switch (option1)
                {
                    case 1:
                        Console.Clear();
                        double x;
                        Console.WriteLine();
                        Console.ForegroundColor = ConsoleColor.DarkMagenta;
                        Console.Write("Please Enter a Number:");
                        Console.ResetColor();
                        Console.WriteLine("[0,25]");
                        bool number = double.TryParse(Console.ReadLine(), out x);
                        if (number == true && (x <= 25 && x >= 0))
                        {
                            double option;
                            do
                            {
                                Console.WriteLine();
                                Console.ForegroundColor = ConsoleColor.Green;
                                Console.WriteLine("Please Choose The Action");
                                Console.ResetColor();
                                Console.ForegroundColor = ConsoleColor.Red;
                                Console.WriteLine("1. (*)");
                                Console.WriteLine("2. (/)");
                                Console.WriteLine("3. Return");
                                Console.ResetColor();
                                Console.WriteLine();
                                Console.WriteLine();
                                Console.ForegroundColor = ConsoleColor.Green;
                                Console.Write("Your Option? ");
                                Console.ResetColor();
                                bool character = double.TryParse(Console.ReadLine(), out option);

                                switch (option)
                                {
                                    case 1:
                                        double result = 0;
                                        for (int i = 1; i <= 30; i++)
                                        {
                                            double y = 1;
                                            for (int j = 1; j <= 3 * i - 1; j++)
                                            {

                                                y *= x;
                                            }
                                            double z = 1;
                                            for (int t = 1; t <= 2 * i + 2; t++)
                                            {

                                                z *= t;
                                            }
                                            double c = 0;
                                            for (int l = 4 * i; l >= 2 * i; l = l - 2)
                                            {

                                                double m = 1;
                                                for (int r = 1; r <= i + 1; r++)
                                                {

                                                    m *= l;
                                                }
                                                c += m;
                                            }
                                            if ((4 * i - 1) * y > z)
                                            {
                                                if (i % 2 == 1)
                                                    result += ((z * (5 * i - 3)) / c);
                                                else
                                                    result -= ((z * (5 * i - 3)) / c);
                                            }
                                            else
                                            {
                                                if (i % 2 == 1)
                                                    result += ((((4 * i) - 1) * y * (5 * i - 3)) / c);
                                                else
                                                    result -= ((((4 * i) - 1) * y * (5 * i - 3)) / c);
                                            }



                                        }
                                        Console.WriteLine();
                                        Console.ForegroundColor = ConsoleColor.DarkBlue;
                                        Console.WriteLine("The Result = " + result);
                                        Console.ResetColor();
                                        Console.ForegroundColor = ConsoleColor.Yellow;
                                        Console.WriteLine("------------------------------------------------------------------------------------------------------------------------");
                                        Console.ResetColor();
                                        Console.WriteLine();
                                        Console.WriteLine();
                                        break;
                                    case 2:
                                        double result1 = 0;
                                        for (int i = 1; i <= 30; i++)
                                        {
                                            double y = 1;
                                            for (int j = 1; j <= 3 * i - 1; j++)
                                            {
                                                y *= x;
                                            }
                                            double z = 1;
                                            for (int t = 1; t <= 2 * i + 2; t++)
                                            {
                                                z *= t;
                                            }
                                            double c = 0;
                                            for (int l = 4 * i; l >= 2 * i; l = l - 2)
                                            {

                                                double m = 1;
                                                for (int r = 1; r <= i + 1; r++)
                                                {

                                                    m *= l;
                                                }
                                                c += m;
                                            }
                                            if ((4 * i - 1) * y > z)
                                            {
                                                if (i % 2 == 1)
                                                    result1 += ((z / (5 * i - 3)) / c);
                                                else
                                                    result1 -= ((z / (5 * i - 3)) / c);
                                            }
                                            else
                                            {
                                                if (i % 2 == 1)
                                                    result1 += ((((4 * i) - 1) * y / (5 * i - 3)) / c);
                                                else
                                                    result1 -= ((((4 * i) - 1) * y / (5 * i - 3)) / c);
                                            }

                                        }
                                        Console.WriteLine();
                                        Console.ForegroundColor = ConsoleColor.DarkBlue;
                                        Console.WriteLine("The Result = " + result1);
                                        Console.ResetColor();
                                        Console.ForegroundColor = ConsoleColor.Yellow;
                                        Console.WriteLine("------------------------------------------------------------------------------------------------------------------------");
                                        Console.ResetColor();
                                        Console.WriteLine();
                                        break;

                                }


                            } while (option != 3);



                        }
                        else
                        {
                            Console.ForegroundColor = ConsoleColor.Yellow;
                            Console.WriteLine("---------Wrong Input-------------");
                            Console.ResetColor();
                            Console.WriteLine();

                        }
                        break;
                }

            } while (option1 != 2);
        }
    }
}
