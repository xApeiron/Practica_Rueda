package RuedaSanchezValdesJuanPablo2324;

/**
 * La clase Rueda representa un depósito de combustible de un vehículo. Permite
 * gestionar el nivel de combustible, la capacidad del depósito, el consumo de
 * combustible y las operaciones relacionadas como realizar un viaje o rellenar
 * el depósito.
 */
public class Rueda {

    /**
     * Obtiene el nivel de combustible actual en litros.
     *
     * @return El nivel de combustible actual en litros.
     */
    public int getCombustible_queda() {
        return combustible_queda;
    }

    /**
     * Establece el nivel de combustible actual en litros.
     *
     * @param combustible_queda El nivel de combustible actual en litros a
     * establecer.
     */
    public void setCombustible_queda(int combustible_queda) {
        this.combustible_queda = combustible_queda;
    }

    /**
     * Obtiene el precio del combustible en céntimos por litro.
     *
     * @return El precio del combustible en céntimos por litro.
     */
    public double getCentimos_litro() {
        return centimos_litro;
    }

    /**
     * Establece el precio del combustible en céntimos por litro.
     *
     * @param centimos_litro El precio del combustible en céntimos por litro a
     * establecer.
     */
    public void setCentimos_litro(double centimos_litro) {
        this.centimos_litro = centimos_litro;
    }

    /**
     * Obtiene la capacidad máxima del depósito en litros.
     *
     * @return La capacidad máxima del depósito en litros.
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * Establece la capacidad máxima del depósito en litros.
     *
     * @param capacidad La capacidad máxima del depósito en litros a establecer.
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * Obtiene el consumo de combustible en litros a los cien kilómetros.
     *
     * @return El consumo de combustible en litros a los cien kilómetros.
     */
    public int getConsumoSanchezValdesJuanPablo() {
        return consumoSanchezValdesJuanPablo;
    }

    /**
     * Establece el consumo de combustible en litros a los cien kilómetros.
     *
     * @param consumoSanchezValdesJuanPablo El consumo de combustible en litros
     * a los cien kilómetros a establecer.
     */
    public void setConsumoSanchezValdesJuanPablo(int consumoSanchezValdesJuanPablo) {
        this.consumoSanchezValdesJuanPablo = consumoSanchezValdesJuanPablo;
    }

    private int combustible_queda;
    private double centimos_litro;
    private int capacidad;//capacidad depósito .Se supone que es litros.
    private int consumoSanchezValdesJuanPablo = 6;//litros a los cien

    /**
     * Constructor sin parámetros de la clase Rueda.
     */
    public Rueda() {
    }

    /**
     * Constructor de la clase Rueda con 3 parámetros
     *
     * @param combustible_queda El nivel de combustible actual en litros.
     * @param centimos_litro El precio del combustible en céntimos por litro.
     * @param capacidad La capacidad máxima del depósito en litros.
     */
    public Rueda(int combustible_queda, int centimos_litro, int capacidad) {
        this.combustible_queda = combustible_queda;
        this.centimos_litro = centimos_litro;
        this.capacidad = capacidad;

    }

    public int getcombustible() {
        return (getCombustible_queda());
    }

    /**
     * Simula un viaje con la cantidad de kilómetros indicada.
     *
     * @param km La cantidad de kilómetros que se va a recorrer en el viaje.
     * @throws Exception Si no hay suficiente combustible para la distancia
     * especificada o si la distancia es menor o igual a cero.
     */
    public void viaje(int km) throws Exception {

        if (km * this.getConsumoSanchezValdesJuanPablo() / 100 > this.getCombustible_queda()) {
            throw new Exception("No hay suficiente combustible para esa distancia");
        }
        if (km <= 0) {
            throw new Exception("No tiene sentido recorrer una distancia que no sea positiva");
        }
        this.setCombustible_queda(this.getCombustible_queda() - (km * this.getConsumoSanchezValdesJuanPablo() / 100));

    }

    /**
     * Rellena el depósito de combustible con la cantidad de litros
     * especificada, pagando con la cantidad de dinero especificada.
     *
     * @param litros La cantidad de litros con la que se va a rellenar el
     * depósito.
     * @param dinero La cantidad de dinero que se va a pagar por el combustible.
     * @throws Exception Si la cantidad de litros o de dinero es menor o igual a
     * cero, si se supera la capacidad del depósito al rellenar, o si no hay
     * suficiente dinero para el combustible.
     */
    public void rellenar(int litros, double dinero) throws Exception {

        if ((dinero <= 0) || (litros <= 0)) {
            throw new Exception("No se puede rellenar el depósito.");
        }

        if (this.getCombustible_queda() + litros > getCapacidad()) {
            throw new Exception("No se puede rellenar, porque se supera la capacidad del depósito");
        }
        if (dinero < litros * getCentimos_litro()) {
            throw new Exception("No tiene dinero suficiente para rellenar el depósito.");
        }
        this.setCombustible_queda(this.getCombustible_queda() + litros);

    }

}
