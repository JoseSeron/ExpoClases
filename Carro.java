
package expoclase;

public class Carro {
     
    //ATRIBUTOS 
    String marca = "";
    String modelo = "";
    int año = 0;
    int cantidadPuertas = 0;
    String color = "";
    String motor = "";

    
    //CONSTRUCTOR

    public Carro(String marca, String modelo, int año, int cantidadPuertas, String color, String motor) {
        this.año=año;
        this.cantidadPuertas=cantidadPuertas;
        this.color=color;
        this.marca=marca;
        this.modelo=modelo;
        this.motor=motor;
    }

    //METODOS

        //MUTADORES
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
    
    
    @Override
    public String toString() {

      //  0->Carro{marca=ford, modelo=asdfa, a�o=235, cantidadPuertas=2, color=sdfa, motor=v8}
      // 0-> **Ford Thunderbird (Año: 2003, Color: Verde, Puertas: 2, Motor: V8)**
        return marca+" "+modelo+" (Año: "+año+", Color: "+color+", Puertas: "+cantidadPuertas+", Motor: "+motor+')';
    }    
} // fin clase Carro
