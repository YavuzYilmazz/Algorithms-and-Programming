using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;
namespace algo_homework_3
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.BackgroundColor = ConsoleColor.White;
            double option;
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
                _ = double.TryParse(Console.ReadLine(), out option);
                Console.WriteLine();
                switch (option)
                {
                    case 1:
                        StreamReader f = File.OpenText("D:\\poem.txt");
                        int counter = 0;
                        int counter2 = 0;
                        bool flag1 = false;
                        bool flag2 = false;
                        while (!f.EndOfStream)
                        {
                            f.ReadLine();
                            counter++;
                        }
                        f.Close();
                        StreamReader f1 = File.OpenText("D:\\poem.txt");//save poem as an array
                        string poem;
                        string[] poem1 = new string[counter];
                        int a = 0;
                        do
                        {

                            poem = f1.ReadLine();
                            for (int i = poem.Length; 0 < i; i--)
                            {
                                poem1[a] += poem.Substring(i - 1, 1);
                            }
                            a++;
                        } while (!f1.EndOfStream);
                        string[] additional = new string[poem1.Length - 1];
                        int b;
                        for (int i = 0; i < poem1.Length - 1; i++)
                        {
                            b = 0;
                            if (poem1[i + 1] == null) break;

                            while (poem1[i].Substring(b, 1) == poem1[i + 1].Substring(b, 1))
                            {
                                additional[i] += poem1[i].Substring(b, 1);
                                b++;
                                flag1 = true;
                                if (poem1[i].Substring(b, 1) == " ") counter2++;//for word ryhme 
                            }

                        }
                        if (counter2 >= 2)
                        {
                            Console.ForegroundColor = ConsoleColor.Yellow;
                            Console.Write(" Phrase Rhyme --> ");
                            Console.ResetColor();
                            for (int i = additional[0].Length - 1; 0 <= i; i--)
                            {
                                Console.ForegroundColor = ConsoleColor.Blue;
                                Console.Write(additional[0].Substring(i, 1));
                                Console.ResetColor();
                            }
                        }
                        if (counter2 == 1)
                        {
                            Console.ForegroundColor = ConsoleColor.Yellow;
                            Console.Write(" Word Rhyme ---> ");
                            Console.ResetColor();
                            for (int i = additional[0].Length - 1; 0 <= i; i--)
                            {
                                Console.ForegroundColor = ConsoleColor.Blue;
                                Console.Write(additional[0].Substring(i, 1));
                                Console.ResetColor();
                            }
                        }
                        if (flag1 && counter2 == 0)
                        {
                            Console.ForegroundColor = ConsoleColor.Yellow;
                            Console.Write(" Additional Rhymes ---> ");
                            Console.ResetColor();
                            for (int i = additional[0].Length - 1; 0 <= i; i--)
                            {
                                Console.ForegroundColor = ConsoleColor.Blue;
                                Console.Write(additional[0].Substring(i, 1));
                                Console.ResetColor();
                            }
                            Console.ResetColor();
                        }
                        string[] hoarse_ryhme = new string[3];
                        int letter_control;
                        for (int i = 0; i < poem1.Length - 3; i++)//hoarse ryhme control
                        {

                            if (i <= 3 && i % 2 != 1)
                            {
                                letter_control = 0;
                                while (poem1[i].Substring(letter_control, 1) == poem1[i + 2].Substring(letter_control, 1))
                                {
                                    hoarse_ryhme[0] += poem1[i].Substring(letter_control, 1);
                                    letter_control++;
                                }
                            }

                            if (i == 1)
                            {
                                letter_control = 0;
                                while (poem1[i].Substring(letter_control, 1) == poem1[i + 2].Substring(letter_control, 1) && poem1[i + 2].Substring(letter_control, 1) == poem1[i + 4].Substring(letter_control, 1))
                                {
                                    hoarse_ryhme[1] += poem1[i].Substring(letter_control, 1);
                                    letter_control++;
                                }
                            }
                            if (i == 4 && poem1.Length > 8)
                            {
                                letter_control = 0;
                                while (poem1[i].Substring(letter_control, 1) == poem1[i + 2].Substring(letter_control, 1) && poem1[i + 2].Substring(letter_control, 1) == poem1[i + 4].Substring(letter_control, 1))
                                {
                                    hoarse_ryhme[2] += poem1[i].Substring(letter_control, 1);
                                    letter_control++;
                                }
                            }
                        }
                        bool hoarse_ryhmeflag = true;
                        for (int i = 0; i < hoarse_ryhme.Length; i++)
                        {
                            if (hoarse_ryhme[i] == null)
                            {

                                hoarse_ryhmeflag = false;
                            }

                        }
                        if (hoarse_ryhmeflag)//write horse ryhme 
                        {
                            for (int i = 0; i < hoarse_ryhme.Length; i++)
                            {
                                if (hoarse_ryhme[i] == null) break;
                                if (hoarse_ryhme[i] != null && i == 0)
                                {
                                    Console.ForegroundColor = ConsoleColor.Yellow;
                                    Console.Write("  Type : Hoarse Ryhme ----> ");
                                    Console.ResetColor();
                                }


                                for (int j = hoarse_ryhme[i].Length; 0 < j; j--)
                                {
                                    Console.ForegroundColor = ConsoleColor.Blue;
                                    Console.Write(hoarse_ryhme[i].Substring(j - 1, 1));
                                    Console.ResetColor();
                                }
                                Console.Write("   ");
                            }
                        }
                        string[] winding_rhyme = new string[counter / 2];//winding ryhme control
                        if (!flag1 && poem1.Length == 4)
                        {
                            for (int i = 0; i < poem1.Length / 2; i++)
                            {
                                b = 0;//letter counter

                                while (poem1[i].Substring(b, 1) == poem1[i + 2].Substring(b, 1))
                                {
                                    winding_rhyme[i] += poem1[i].Substring(b, 1);
                                    b++;
                                }

                            }
                        }
                        bool winding_flag = false;
                        for (int i = 0; i < winding_rhyme.Length - 1; i++)
                        {
                            if (winding_rhyme[i] != null && winding_rhyme[i].Contains(" "))
                            {
                                winding_flag = true;
                            }
                        }
                        for (int i = 0; i < winding_rhyme.Length; i++)//write winding ryhme
                        {

                            if (winding_rhyme[i] != null && !flag1 && winding_flag)
                            {
                                if (i == 0)
                                {
                                    Console.ForegroundColor = ConsoleColor.Yellow;
                                    Console.Write(" Type Winding Ryhme  --->");
                                    Console.ResetColor();
                                }
                                Console.ForegroundColor = ConsoleColor.Yellow;
                                Console.Write(" {0} -->  ", i + 1);
                                Console.ResetColor();
                                for (int j = winding_rhyme[i].Length; 0 < j; j--)
                                {
                                    Console.ForegroundColor = ConsoleColor.Blue;
                                    Console.Write(winding_rhyme[i].Substring(j - 1, 1));
                                    Console.ResetColor();
                                }

                            }

                        }
                        for (int i = 0; i < additional.Length - 1; i++)//additional control
                        {
                            if (additional[i] != additional[i + 1] || additional[i] == null) flag1 = false;
                        }
                        string[] alternating = new string[counter / 2];
                        int letter_check;
                        int counter3 = 0;
                        if (counter >= 3)
                        {
                            for (int i = 0; i < counter / 4; i++)//alternating control
                            {
                                letter_check = 0;
                                if (poem1[i + 2] == null) break;
                                while (poem1[i].Substring(letter_check, 1) == poem1[i + 2].Substring(letter_check, 1) && poem1[i].Substring(letter_check, 1) != poem1[i + 1].Substring(letter_check, 1))
                                {
                                    alternating[counter3] += poem1[i].Substring(letter_check, 1);
                                    flag2 = true;
                                    letter_check++;

                                }

                                counter3++;

                            }
                        }
                        if (counter > 5 && poem1.Length % 2 == 0)//If more than 4 lines
                        {
                            for (int i = 4; i <= poem1.Length - 3; i++)
                            {
                                letter_check = 0;
                                while (poem1[i].Substring(letter_check, 1) == poem1[i + 2].Substring(letter_check, 1))
                                {
                                    alternating[counter3] += poem1[i].Substring(letter_check, 1);
                                    letter_check++;

                                }

                                counter3++;
                            }
                        }
                        for (int i = 0; i < alternating.Length; i++)//alternating control
                        {
                            if (alternating[i] == null) flag2 = false;
                        }
                        if (!flag1 && flag2)
                        {
                            Console.ForegroundColor = ConsoleColor.Yellow;
                            Console.Write("  Type : Alternating Ryhme ");
                            Console.ResetColor();
                            for (int i = 0; i < alternating.Length; i++)
                            {
                                Console.Write("  ---->  ");
                                if (alternating[i] == null) break;
                                for (int j = 0; j < alternating[i].Length; j++)
                                {
                                    Console.ForegroundColor = ConsoleColor.Blue;
                                    Console.Write(alternating[i].Substring(alternating[i].Length - j - 1, 1));
                                    Console.ResetColor();
                                }
                            }
                        }
                        string[] Straight_rhyme = new string[counter];//straight ryhme control
                        if (flag1)
                        {
                            for (int i = 0; i < counter - 1; i++)
                            {
                                counter3 = 0;

                                while (poem1[i].Substring(counter3, 1) == poem1[i + 1].Substring(counter3, 1))
                                {
                                    Straight_rhyme[i] += poem1[i].Substring(counter3, 1);
                                    counter3++;
                                }

                            }
                        }
                        for (int t = 0; t < alternating.Length; t++)
                        {
                            if (Straight_rhyme[t] == null) break;
                            if (t == 0)
                            {
                                Console.ForegroundColor = ConsoleColor.Yellow;
                                Console.Write("  Type : Straight Ryhme ");
                                Console.ResetColor();
                            }
                            Console.ForegroundColor = ConsoleColor.Yellow;
                            Console.Write("  ---->  ");
                            Console.ResetColor();
                            for (int j = 0; j < Straight_rhyme[t].Length; j++)
                            {
                                Console.ForegroundColor = ConsoleColor.Blue;
                                Console.Write(Straight_rhyme[t].Substring(Straight_rhyme[t].Length - j - 1, 1));
                                Console.ResetColor();
                            }
                            break;
                        }
                        Console.WriteLine();
                        break;
                }
            } while (option != 2);
            Console.ResetColor();
        }

    }
}
