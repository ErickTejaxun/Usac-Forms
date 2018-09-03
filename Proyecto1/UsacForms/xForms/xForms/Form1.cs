using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using xForms.Clases;

namespace xForms
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {


        }


        public void metodo()
        {
            List<Objeto> lista = new List<Objeto>();
            lista.Add(new Objeto());
            lista.Add(new Objeto());
            lista.Add(new Objeto());
            lista.Add(new Objeto());

            List<Objeto> lista2 = new List<Objeto>();

            foreach (Objeto ob in lista)
            {
                lista2.Add(ob.Clonar());
            }

            foreach (Objeto ob2 in lista2)
            {
                ob2.nombre = "erick tejaxun";
                ob2.edad = 20;
                ob2.email = "jjj.@gmail.com";
            }



            foreach (Objeto ob in lista)
            {
                Console.WriteLine(ob.nombre + "\t" + ob.edad + "\t" + ob.email);
            }

            foreach (Objeto ob in lista2)
            {
                Console.WriteLine(ob.nombre + "\t" + ob.edad + "\t" + ob.email);
            }

        }

        private void button1_Click_1(object sender, EventArgs e)
        {

        }
    }
}
