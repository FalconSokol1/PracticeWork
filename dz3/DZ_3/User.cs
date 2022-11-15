using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace dz3
{
    public class User
    {
        public string Login { get; set; }
        public string Password { get; set; }

        public static ObservableCollection<User> GetUser()
        {
            var userList = new ObservableCollection<User>()
            {
                new User()
                {
                    Login = "Sokol",
                    Password = "2004S"
                },

                new User()
                {
                    Login = "shir",
                    Password = "qwysz"
                },

                 new User()
                {
                    Login = "shirzxz",
                    Password = "xsz"
                },
            };

            return userList;
        }
    }
}
