using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LoggerLibrary
{
    internal interface ILoger
    {
        Task<string>ReadLog(string path);
        Task WriteLog(string text);


    }
}
