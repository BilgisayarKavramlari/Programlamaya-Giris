using System;

namespace ConsoleApplication
{
    class Program
    {
        static void Main(string[] args)
        {
            DateTime dateTime1; 
            DateTime dateTime2;
            TimeSpan day;
            int result = 0;

            dateTime1 = new DateTime(2018, 5, 3); // Year, Month, Day
            dateTime2 = new DateTime(2017, 7, 23);
            day       = dateTime1 - dateTime2;
            result = day.Days; 
        }
    }
}
