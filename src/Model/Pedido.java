package Model;

import java.util.ArrayList;

public class Pedido {
    private Usuario usuario;
    private boolean retiraLocal;
    private TiposDePagos tiposDePago;
    private static int cont = 0;
    private Integer id;
    private ArrayList<Plato> platos;
    private Integer totalPagar;
    private String local;

}
