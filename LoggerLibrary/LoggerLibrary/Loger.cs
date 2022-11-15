using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace LoggerLibrary
{
    
    public class Loger :ILoger
    {
        private readonly string _path = @"C://Logs";

        public Loger()
        {
            if(!Directory.Exists(_path))
                Directory.CreateDirectory(_path);
        }


        async Task<string> ILoger.ReadLog(string name)
        {
            string date = DateTime.Now.ToString("yyyy-MM-dd-HH-mm");
            var filePath = _path + @"\" + date + ".txt";
            if (!File.Exists(_path))
            {
                throw new Exception("Лога не существует");
            }

            using (StreamReader reader = new StreamReader(filePath))
            {
                var text = await reader.ReadToEndAsync();
                return text;
            }
        }

        async Task ILoger.WriteLog(string text)
        {
            string date = DateTime.Now.ToString("yyyy-MM-dd-HH-mm");
            var filePath = _path + @"\" + date + ".txt";
            if (!File.Exists(_path))
            {
                File.Create(filePath).Close();
            }

            using (StreamWriter streamWriter = new StreamWriter(filePath,false))
            {
                await streamWriter.WriteLineAsync(text);
            }
        }

        public Task WriteLog()
        {
            throw new NotImplementedException();
        }
    }
}
