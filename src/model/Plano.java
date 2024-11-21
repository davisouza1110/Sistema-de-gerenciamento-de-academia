package model;

import enums.TipoPlano;

public class Plano {
    private TipoPlano tipoPlano;

    public Plano(TipoPlano tipoPlano) {
        this.tipoPlano = tipoPlano;
    }

    public TipoPlano getTipoPlano() {
        return tipoPlano;
    }
}
