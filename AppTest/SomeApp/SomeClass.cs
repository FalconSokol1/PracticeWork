﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace App
{
    public class PcManager
    {
        public string LoadPcFeature(int numberOfCpus, bool os64)
        {
            try
            {
                if (numberOfCpus == 0)
                {
                    return "The number of CPUs cannot be zero";
                }


                BasicInfo myInfo = new BasicInfo
                {
                    OsVersion = Environment.OSVersion.ToString(),
                    Os64 = os64,
                    PcName = Environment.MachineName,
                    NumberOfCpus = numberOfCpus,
                    WindowsFolder = Environment.SystemDirectory,
                    LogicalDrives = Environment.GetLogicalDrives()
                };

                return "PC data has been successfully generated";
            }
            catch
            {

                return "An error occurred during data generation";
            }

        }
    }

    public class BasicInfo
    {
        public string OsVersion { get; set; } = null;
        public bool Os64 { get; set; }
        public string PcName { get; set; } = null;
        public int NumberOfCpus { get; set; }
        public string WindowsFolder { get; set; } = null;
        public string[] LogicalDrives { get; set; } = null;

        public override string ToString()
        {
            StringBuilder output = new StringBuilder();
            output.AppendFormat("Версия Windows: {0}\n", OsVersion);
            output.AppendFormat("64 Bit операционная система? : {0}\n", Os64 ? "Yes" : "No");
            output.AppendFormat("Имя компьютера: {0}\n", PcName);
            output.AppendFormat("Число процессоров: {0}\n", NumberOfCpus);
            output.AppendFormat("Системная папка : {0}\n", WindowsFolder);
            output.AppendFormat("Логические диски : {0}\n",
                  String.Join(", ", LogicalDrives)
               .Replace("\\", String.Empty));
            return output.ToString();
        }
    }
}
