package modelo;

import java.io.Serializable;

public class Pergunta implements Serializable {

    private static final long serialVersionUID = 1L;

    private String expressao;
    private int respostaCorreta;

    public Pergunta(String expressao, int respostaCorreta) {
        this.expressao = expressao;
        this.respostaCorreta = respostaCorreta;
    }

    public String getExpressao() {
        return expressao;
    }

    public int getRespostaCorreta() {
        return respostaCorreta;
    }

    public boolean verificarResposta(int resposta) {
        return resposta == respostaCorreta;
    }
}