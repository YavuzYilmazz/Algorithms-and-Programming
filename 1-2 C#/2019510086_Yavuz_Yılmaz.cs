using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading;
using System.IO;

namespace _2019510086_YAVUZ_YILMAZ
{
    class Program
    {
        static void Main(string[] args)
        {
            //My teacher, the program does not work properly with f5 in the .NET framework but it works fine with f11
            //I tried it with .net core. I could not find a working solution in f5 and f11.I changed the code and rewrote it twice, but the problem continued.
            //I looked at forums and many sites but couldn't find anything about this type of problem.
            //im sorry :(  .....
            double option;
            int g = 0; // to count how many times you played and ask do you want to play again
            do
            { 
                if(g == 0)
                {
                    Console.ForegroundColor = ConsoleColor.DarkCyan;
                    Console.WriteLine("Do You Want To Play ?");
                    Console.ResetColor();
                    Console.ForegroundColor = ConsoleColor.DarkMagenta;
                    Console.WriteLine("---------------");
                    Console.ResetColor();
                    Console.ForegroundColor = ConsoleColor.DarkCyan;
                    Console.WriteLine("1.Yes");
                    Console.WriteLine("2.No");
                    Console.ResetColor();
                    Console.ForegroundColor = ConsoleColor.DarkMagenta;
                    Console.WriteLine("---------------");
                    Console.ResetColor();
                    Console.ForegroundColor = ConsoleColor.Yellow;
                    Console.WriteLine("Your Option (1/2) ?");
                    Console.ResetColor();
                    bool choose = Double.TryParse(Console.ReadLine(), out option);
                    Console.WriteLine();
                    Console.WriteLine();
                }
                else
                {
                    Console.ForegroundColor = ConsoleColor.DarkCyan;
                    Console.WriteLine("Do You Want To Play Again ?");
                    Console.ResetColor();
                    Console.ForegroundColor = ConsoleColor.DarkMagenta;
                    Console.WriteLine("---------------");
                    Console.ResetColor();
                    Console.ForegroundColor = ConsoleColor.DarkCyan;
                    Console.WriteLine("1.Yes");
                    Console.WriteLine("2.No");
                    Console.ResetColor();
                    Console.ForegroundColor = ConsoleColor.DarkMagenta;
                    Console.WriteLine("---------------");
                    Console.ResetColor();
                    Console.ForegroundColor = ConsoleColor.Yellow;
                    Console.WriteLine("Your Option (1/2) ?");
                    Console.ResetColor();
                    bool choose = Double.TryParse(Console.ReadLine(), out option);
                    Console.WriteLine();
                    Console.WriteLine();
                }

                switch (option)
                {
                    case 1:
                        
                        Console.ForegroundColor = ConsoleColor.DarkGray;
                        Console.Write("Randomly generated array: ");
                        Console.ResetColor();
                        int[] Randomarray = new int[9];
                        int redcounter = 0;
                        int greencounter = 0;
                        int bluecounter = 0;
                        for (int i = 0; i < Randomarray.Length; i++)
                        {
                            Random rand = new Random();
                            int x = rand.Next(1, 13);
                            if (redcounter < 3)
                            {
                                if (x == 1)
                                {
                                    redcounter++;
                                    Console.ForegroundColor = ConsoleColor.Red;
                                    Console.Write("A ");
                                    Console.ResetColor();
                                    Randomarray[i] = 1;
                                }
                                else if (x == 2)
                                {
                                    redcounter++;
                                    Console.ForegroundColor = ConsoleColor.Red;
                                    Console.Write("B ");
                                    Console.ResetColor();
                                    Randomarray[i] = 10;
                                }
                                else if (x == 3)
                                {
                                    redcounter++;
                                    Console.ForegroundColor = ConsoleColor.Red;
                                    Console.Write("C ");
                                    Console.ResetColor();
                                    Randomarray[i] = 100;
                                }
                                else if (x == 4)
                                {
                                    redcounter++;
                                    Console.ForegroundColor = ConsoleColor.Red;
                                    Console.Write("D ");
                                    Console.ResetColor();
                                    Randomarray[i] = 1000;
                                }
                            }
                            else if (redcounter == 3 && (x == 1 || x == 2 || x == 3 || x == 4))
                            {
                                x = rand.Next(5, 13);
                            }
                            if (bluecounter < 3)
                            {
                                if (x == 5)
                                {
                                    bluecounter++;
                                    Console.ForegroundColor = ConsoleColor.Blue;
                                    Console.Write("A ");
                                    Console.ResetColor();
                                    Randomarray[i] = 2;
                                }
                                else if (x == 6)
                                {
                                    bluecounter++;
                                    Console.ForegroundColor = ConsoleColor.Blue;
                                    Console.Write("B ");
                                    Console.ResetColor();
                                    Randomarray[i] = 20;
                                }
                                else if (x == 7)
                                {
                                    bluecounter++;
                                    Console.ForegroundColor = ConsoleColor.Blue;
                                    Console.Write("C ");
                                    Console.ResetColor();
                                    Randomarray[i] = 200;
                                }
                                else if (x == 8)
                                {
                                    bluecounter++;
                                    Console.ForegroundColor = ConsoleColor.Blue;
                                    Console.Write("D ");
                                    Console.ResetColor();
                                    Randomarray[i] = 2000;
                                }


                            }
                            else if (bluecounter == 3 && (x == 5 || x == 6 || x == 7 || x == 8))
                            {
                                x = rand.Next(9, 13);
                            }
                            if (greencounter < 3)
                            {
                                if (x == 9)
                                {
                                    greencounter++;
                                    Console.ForegroundColor = ConsoleColor.Green;
                                    Console.Write("A ");
                                    Console.ResetColor();
                                    Randomarray[i] = 5;
                                }
                                else if (x == 10)
                                {
                                    greencounter++;
                                    Console.ForegroundColor = ConsoleColor.Green;
                                    Console.Write("B ");
                                    Console.ResetColor();
                                    Randomarray[i] = 50;
                                }
                                else if (x == 11)
                                {
                                    greencounter++;
                                    Console.ForegroundColor = ConsoleColor.Green;
                                    Console.Write("C ");
                                    Console.ResetColor();
                                    Randomarray[i] = 500;
                                }
                                else if (x == 12)
                                {
                                    greencounter++;
                                    Console.ForegroundColor = ConsoleColor.Green;
                                    Console.Write("D ");
                                    Console.ResetColor();
                                    Randomarray[i] = 5000;
                                }


                            }
                            else if (greencounter == 3 && (x == 9 || x == 10 || x == 11 || x == 12))
                            {
                                if (redcounter < 3)
                                {
                                    x = rand.Next(1, 5);
                                    if (x == 1)
                                    {
                                        redcounter++;
                                        Console.ForegroundColor = ConsoleColor.Red;
                                        Console.Write("A ");
                                        Console.ResetColor();
                                        Randomarray[i] = 1;
                                    }
                                    else if (x == 2)
                                    {
                                        redcounter++;
                                        Console.ForegroundColor = ConsoleColor.Red;
                                        Console.Write("B ");
                                        Console.ResetColor();
                                        Randomarray[i] = 10;
                                    }
                                    else if (x == 3)
                                    {
                                        redcounter++;
                                        Console.ForegroundColor = ConsoleColor.Red;
                                        Console.Write("C ");
                                        Console.ResetColor();
                                        Randomarray[i] = 100;
                                    }
                                    else
                                    {
                                        redcounter++;
                                        Console.ForegroundColor = ConsoleColor.Red;
                                        Console.Write("D ");
                                        Console.ResetColor();
                                        Randomarray[i] = 1000;
                                    }
                                }
                                else if (bluecounter < 3)
                                {
                                    x = rand.Next(5, 9);
                                    if (x == 5)
                                    {
                                        bluecounter++;
                                        Console.ForegroundColor = ConsoleColor.Blue;
                                        Console.Write("A ");
                                        Console.ResetColor();
                                        Randomarray[i] = 2;
                                    }
                                    else if (x == 6)
                                    {
                                        bluecounter++;
                                        Console.ForegroundColor = ConsoleColor.Blue;
                                        Console.Write("B ");
                                        Console.ResetColor();
                                        Randomarray[i] = 20;
                                    }
                                    else if (x == 7)
                                    {
                                        bluecounter++;
                                        Console.ForegroundColor = ConsoleColor.Blue;
                                        Console.Write("C ");
                                        Console.ResetColor();
                                        Randomarray[i] = 200;
                                    }
                                    else
                                    {
                                        bluecounter++;
                                        Console.ForegroundColor = ConsoleColor.Blue;
                                        Console.Write("D ");
                                        Console.ResetColor();
                                        Randomarray[i] = 2000;
                                    }
                                }

                            }


                        }
                        int sum = 0;
                        for (int j = 0; j < 7; j++)
                        {
                            if ((Randomarray[j] == Randomarray[j+1]) && (Randomarray[j+1] == Randomarray[j + 2]))
                                sum = sum + 33;
                            else if ((Randomarray[j] + Randomarray[j+1] + Randomarray[j+2] == 7) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 70) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 700) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 7000))
                                sum = sum + 28;
                            else if ((Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 4) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 5) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 7) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 9) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 11) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 12) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 40) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 50) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 70) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 90) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 110) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 120) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 400) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 500) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 700) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 900) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 1100) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 1200) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 4000) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 5000) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 7000) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 9000) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 11000) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 12000))
                                sum = sum + 22;
                            else if ((Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 111) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 1110) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 222) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 2220) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 555) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 5550))
                                sum = sum + 18;
                            else if ((Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 521) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 251) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 512) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 215) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 125) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 152) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 5210) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 5120) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 2510) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 2150) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 1520) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 1250))
                                sum = sum + 16;
                            else if ((Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 211) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 511) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 122) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 522) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 155) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 255) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 2110) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 5110) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 1220) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 5220) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 1550) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 2550) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 121) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 151) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 252) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 212) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 515) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 525) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 1210) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 1510) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 2520) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 2120) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 5150) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 5250) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 112) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 115) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 221) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 225) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 551) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 552) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 1120) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 1150) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 2210) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 2250) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 5510) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 5520))
                                sum = sum + 14;
                            else if ((Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 1011) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 2022) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 5055) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 1101) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 2202) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 5505))
                                sum = sum + 12;
                            else if ((Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 53) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 26) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 17) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 503) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 206) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 107) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 5003) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 2006) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 1007) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 35) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 62) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 71) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 530) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 260) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 170) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 5030) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 2060) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 1070) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 305) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 602) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 701) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 350) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 620) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 710) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 5300) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 2600) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 1700) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 3005) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 6002) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 7001) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 3050) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 6020) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 7010) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 3500) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 6200) || (Randomarray[j] + Randomarray[j + 1] + Randomarray[j + 2] == 7100))
                                sum = sum + 10;
                        }
                        
                        Console.WriteLine();
                        Console.WriteLine("You Get" + " " + sum + " " + "Points");
                        Console.WriteLine();
                        Console.Write("Please Enter Your Name : ");
                        string name = Console.ReadLine();
                        String[] highscoretable = new String[10];
                        StreamWriter f = File.AppendText("d:\\HighScoreTable.txt");
                        f.WriteLine(name + ";" + sum);
                        f.Close();
                        Console.ForegroundColor = ConsoleColor.Red;
                        Console.WriteLine("----------------------");
                        Console.WriteLine("***HIGH SCORE TABLE***");
                        Console.WriteLine("----------------------");
                        Console.ResetColor();
                        Console.WriteLine();
                        StreamReader fr = File.OpenText("d:\\HighScoreTable.txt");
                        // I COULD NOT DO THE SORT PART :(...
                        int p = 1;
                        while(!fr.EndOfStream & p != 11)
                        {
                             string players = fr.ReadLine();
                            Console.WriteLine(p + "." + " " + players);
                            p++;
                        }
                        Console.ForegroundColor = ConsoleColor.Red;
                        Console.WriteLine("----------------------");
                        Console.ResetColor();
                        fr.Close();
                        StreamWriter ft = File.AppendText("d:\\HighScoreTable.txt");
                        Console.Write(name + ";" + sum);
                        
                        if(sum>= 40)
                        {
                            Console.ForegroundColor = ConsoleColor.DarkYellow;
                            Console.WriteLine("      <-------- IT'S YOU  " + "LUCKY!!!!");
                            Console.ResetColor();
                        }
                        else
                        {
                            Console.ForegroundColor = ConsoleColor.Blue;
                            Console.WriteLine("      <-------- IT'S YOU  ");
                            Console.ResetColor();
                        }
                        ft.Close();
                        Console.WriteLine();
                        Console.WriteLine();
                        Console.WriteLine();
                        Console.WriteLine();
                        g++; // play or play again
                        break;
                        
                }
            } while (option != 2);
            Console.Clear();
            Console.ForegroundColor = ConsoleColor.DarkRed;
            Console.WriteLine(":(" + "GOOD BYE!! " + "PLEASE COME AGAİN!!");
            Console.ResetColor();
            Console.ReadKey();
        }
    }
}
