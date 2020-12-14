//se muestra el paquete al que pertenece
//esta clase
package modelo;
//esta clase se utilizara para declarar los metodos y variables a utilizar
//asi como ejecutar las operaciones
public class PagosModel {
    //se declaran las variables
    //datos a usar (encapsulados)
    private double salario;
    private int cate;
    /*Este sera el metodo que nos ayudara a indicar la categoria del
    empleado asi como a realizar las operaciones correspondientes para
     saber el salario final*/
    //operaciones (metodos)
    public String calcularSalarioFinal(){
        //se declaran las variables a utilizar
        double salarioFinal;
        double aumento = 0;
        boolean bandera = true;
        /*para hacer mas facil las deciciones, estas seran reaizadas
         en un switch*/
        switch (getCate()){
            case 1://se crea el caso de cada categoria
                //y se ejecuta su operacion indicada
                aumento = getSalario() * 13 /100 ;
                break;
            case 2:
                aumento = getSalario() * 16 /100;
                break;
                 default:
                bandera = false;
                
        }
        /*ademas esta decicion nos ayudara a resolver el bug de que
        no sea seleccionada ninguna categoria y se realizara la operacion
         para calcular el salario final ya con el incremento del
         % correspondiente */
         if (bandera) {
            salarioFinal = getSalario() + aumento;
            return "tu salario es de $" + salarioFinal;
        } else {
            return "Debe seleccionar su categoria";

        }
    }
    /*para poder interactuar con estos metodos se deben de declarar sus
     get y set respectivos */

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }
    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }
    /**
     * @return the cate
     */
    public int getCate() {
        return cate;
    }
    /**
     * @param cate the cate to set
     */
    public void setCate(int cate) {
        this.cate = cate;
    }   
}




