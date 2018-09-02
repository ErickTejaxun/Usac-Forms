using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace xForms.Clases
{
    class Objeto
    {
        public String nombre;
        public int edad;
        public String email;

        public Objeto()
        {
            this.nombre = "erick";
            this.edad = 18;
            this.email = "erickteja@gmail.com";
        }
        public Objeto(String nombre, int edad, String email)
        {
            this.nombre = nombre;
            this.edad = edad;
            this.email = email;
        }

        public Objeto Clonar()
        {
            return new Objeto(this.nombre, this.edad, this.email);
        }
    }
}
