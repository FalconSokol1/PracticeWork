using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;

namespace DZ4_5.Core
{
    internal class Auth
    {
        public string Login { get; set; }
        public string Password { get; set; }


        public static ObservableCollection<Auth> GetUsersList()
        {

            var userList = new ObservableCollection<Auth>()
            {
                new Auth() { Login = "SOKOL", Password = "2004S" },
            };

            return userList;
        }


        public bool Check(string login, string password)
        {
            if (login != "" && (password != "" || password != ""))
            {
                foreach (var user in GetUsersList())
                {
                    if (user.Login == login && (user.Password == password || user.Password == password))
                    {
                        MessageBox.Show("ВЫ вошли", "Сообщение", MessageBoxButton.OK, MessageBoxImage.Information);
                        return true;
                    }
                    else
                    {
                        MessageBox.Show("Неверный логин или пароль", "Сообщение", MessageBoxButton.OK, MessageBoxImage.Stop);
                        return false;
                    }
                }
            }
            else MessageBox.Show("Заполните поля", "Сообщение", MessageBoxButton.OK, MessageBoxImage.Stop);
            return false;
        }
    }
}
