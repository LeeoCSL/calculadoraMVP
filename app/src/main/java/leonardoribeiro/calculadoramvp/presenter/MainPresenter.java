package leonardoribeiro.calculadoramvp.presenter;

import leonardoribeiro.calculadoramvp.model.MainModel;
import leonardoribeiro.calculadoramvp.ui.activity.MVPMain;

public class MainPresenter implements MVPMain.Presenser {

    MVPMain.View view;
    MainModel mainModel = new MainModel();
    boolean primeiro = true;
    String op = "";

    public MainPresenter(MVPMain.View view, MainModel mainModel) {
        this.view = view;
        this.mainModel = mainModel;
    }

    @Override
    public void cliqueZero() {
        if (primeiro) {
            if (mainModel.primeiroNumero.equalsIgnoreCase("0")) {
                mainModel.primeiroNumero = "0";
            } else {
                mainModel.primeiroNumero = String.valueOf(mainModel.primeiroNumero) + "0";

            }
            getNumero(mainModel.primeiroNumero);
        }else{
            if (mainModel.segundoNumero.equalsIgnoreCase("0")) {
                mainModel.segundoNumero = "0";
            } else {
                mainModel.segundoNumero = String.valueOf(mainModel.segundoNumero) + "0";

            }
            getNumero(mainModel.segundoNumero);
        }

    }

    @Override
    public void cliqueUm() {
        if (primeiro) {
            if (mainModel.primeiroNumero.equalsIgnoreCase("0")) {
                mainModel.primeiroNumero = "1";
            } else {
                mainModel.primeiroNumero = String.valueOf(mainModel.primeiroNumero) + "1";

            }
            getNumero(mainModel.primeiroNumero);
        } else{
            if (mainModel.segundoNumero.equalsIgnoreCase("0")) {
                mainModel.segundoNumero = "1";
            } else {
                mainModel.segundoNumero = String.valueOf(mainModel.segundoNumero) + "1";

            }
            getNumero(mainModel.segundoNumero);
        }
        }


    @Override
    public void cliqueDois() {
        if (primeiro) {
            if (mainModel.primeiroNumero.equalsIgnoreCase("0")) {
                mainModel.primeiroNumero = "2";
            } else {
                mainModel.primeiroNumero = String.valueOf(mainModel.primeiroNumero) + "2";

            }
            getNumero(mainModel.primeiroNumero);
        } else{
            if (mainModel.segundoNumero.equalsIgnoreCase("0")) {
                mainModel.segundoNumero = "2";
            } else {
                mainModel.segundoNumero = String.valueOf(mainModel.segundoNumero) + "2";

            }
            getNumero(mainModel.segundoNumero);
        }

    }

    @Override
    public void cliqueTres() {
        if (primeiro) {
            if (mainModel.primeiroNumero.equalsIgnoreCase("0")) {
                mainModel.primeiroNumero = "3";
            } else {
                mainModel.primeiroNumero = String.valueOf(mainModel.primeiroNumero) + "3";

            }
            getNumero(mainModel.primeiroNumero);
        } else{
            if (mainModel.segundoNumero.equalsIgnoreCase("0")) {
                mainModel.segundoNumero = "3";
            } else {
                mainModel.segundoNumero = String.valueOf(mainModel.segundoNumero) + "3";

            }
            getNumero(mainModel.segundoNumero);
        }

    }

    @Override
    public void cliqueQuatro() {
        if (primeiro) {

            if (mainModel.primeiroNumero.equalsIgnoreCase("0")) {
                mainModel.primeiroNumero = "4";
            } else {
                mainModel.primeiroNumero = String.valueOf(mainModel.primeiroNumero) + "4";

            }
            getNumero(mainModel.primeiroNumero);
        } else{
            if (mainModel.segundoNumero.equalsIgnoreCase("0")) {
                mainModel.segundoNumero = "4";
            } else {
                mainModel.segundoNumero = String.valueOf(mainModel.segundoNumero) + "4";

            }
            getNumero(mainModel.segundoNumero);
        }

    }

    @Override
    public void cliqueCinco() {
        if (primeiro) {

            if (mainModel.primeiroNumero.equalsIgnoreCase("0")) {
                mainModel.primeiroNumero = "5";
            } else {
                mainModel.primeiroNumero = String.valueOf(mainModel.primeiroNumero) + "5";

            }
            getNumero(mainModel.primeiroNumero);
        } else{
            if (mainModel.segundoNumero.equalsIgnoreCase("0")) {
                mainModel.segundoNumero = "5";
            } else {
                mainModel.segundoNumero = String.valueOf(mainModel.segundoNumero) + "5";

            }
            getNumero(mainModel.segundoNumero);
        }
    }

    @Override
    public void cliqueSeis() {
        if (primeiro) {
            if (mainModel.primeiroNumero.equalsIgnoreCase("0")) {
                mainModel.primeiroNumero = "6";
            } else {
                mainModel.primeiroNumero = String.valueOf(mainModel.primeiroNumero) + "6";

            }

            getNumero(mainModel.primeiroNumero);
        } else{
            if (mainModel.segundoNumero.equalsIgnoreCase("0")) {
                mainModel.segundoNumero = "6";
            } else {
                mainModel.segundoNumero = String.valueOf(mainModel.segundoNumero) + "6";

            }
            getNumero(mainModel.segundoNumero);
        }


    }

    @Override
    public void cliqueSete() {
        if (primeiro) {
            if (mainModel.primeiroNumero.equalsIgnoreCase("0")) {
                mainModel.primeiroNumero = "7";
            } else {
                mainModel.primeiroNumero = String.valueOf(mainModel.primeiroNumero) + "7";

            }

            getNumero(mainModel.primeiroNumero);
        } else{
            if (mainModel.segundoNumero.equalsIgnoreCase("0")) {
                mainModel.segundoNumero = "7";
            } else {
                mainModel.segundoNumero = String.valueOf(mainModel.segundoNumero) + "7";

            }
            getNumero(mainModel.segundoNumero);
        }

    }

    @Override
    public void cliqueOito() {
        if (primeiro) {
            if (mainModel.primeiroNumero.equalsIgnoreCase("0")) {
                mainModel.primeiroNumero = "8";
            } else {
                mainModel.primeiroNumero = String.valueOf(mainModel.primeiroNumero) + "8";

            }

            getNumero(mainModel.primeiroNumero);
        } else{
            if (mainModel.segundoNumero.equalsIgnoreCase("0")) {
                mainModel.segundoNumero = "8";
            } else {
                mainModel.segundoNumero = String.valueOf(mainModel.segundoNumero) + "8";

            }
            getNumero(mainModel.segundoNumero);
        }

    }

    @Override
    public void cliqueNove() {
        if (primeiro) {
            if (mainModel.primeiroNumero.equalsIgnoreCase("0")) {
                mainModel.primeiroNumero = "9";
            } else {
                mainModel.primeiroNumero = String.valueOf(mainModel.primeiroNumero) + "9";

            }

            getNumero(mainModel.primeiroNumero);
        } else{
        if (mainModel.segundoNumero.equalsIgnoreCase("0")) {
        mainModel.segundoNumero = "9";
        } else {
        mainModel.segundoNumero = String.valueOf(mainModel.segundoNumero) + "9";

        }
        getNumero(mainModel.segundoNumero);
        }
}


    @Override
    public void cliqueLimpar() {

            mainModel.primeiroNumero = "0";
            mainModel.segundoNumero = "0";
            primeiro = true;
            op = "";
        getNumero("00");
    }


    @Override
    public void cliqueVirgula() {
        if (primeiro) {
            if (!mainModel.primeiroNumero.contains(",")) {
                mainModel.primeiroNumero = mainModel.primeiroNumero + ",";
                getNumero(mainModel.primeiroNumero);
            }
        }else{
            if (!mainModel.segundoNumero.contains(",")) {
                mainModel.segundoNumero = mainModel.segundoNumero + ",";
                getNumero(mainModel.segundoNumero);
            }
        }
    }

    @Override
    public void cliqueMais() {
        primeiro = false;
        op = "soma";
        if(!mainModel.primeiroNumero.equals("0") && !mainModel.segundoNumero.equals("0")){
            cliqueIgual();
        }else {
            getNumero(mainModel.segundoNumero);
        }
    }

    @Override
    public void cliqueMenos() {
        if(mainModel.primeiroNumero.equals("0")){
            mainModel.primeiroNumero = "-";
            getNumero(mainModel.primeiroNumero);
        }else {
            primeiro = false;
            op = "subtracao";
            if (!mainModel.primeiroNumero.equals("0") && !mainModel.segundoNumero.equals("0")) {
                cliqueIgual();
            } else {
                getNumero(mainModel.segundoNumero);
            }
        }
    }

    @Override
    public void cliqueDividir() {
        primeiro = false;
        op = "divisao";
        if(!mainModel.primeiroNumero.equals("0") && !mainModel.segundoNumero.equals("0")){
            cliqueIgual();
        }else {
            getNumero(mainModel.segundoNumero);
        }
    }

    @Override
    public void cliqueMultiplicar() {
        primeiro = false;
        op = "multiplicacao";
        if(!mainModel.primeiroNumero.equals("0") && !mainModel.segundoNumero.equals("0")){
            cliqueIgual();
        }else {
            getNumero(mainModel.segundoNumero);
        }
    }

    @Override
    public void cliqueIgual() {
        if(op.equalsIgnoreCase("soma")){
            mainModel.primeiroNumero = (String.valueOf(MainModel.soma(Double.parseDouble(mainModel.primeiroNumero.replace(",",".")), Double.parseDouble(mainModel.segundoNumero.replace(",",".")))));
            getNumero(mainModel.primeiroNumero);
            mainModel.segundoNumero = "0";
        } else if(op.equalsIgnoreCase("subtracao")){
            mainModel.primeiroNumero = (String.valueOf(MainModel.subtracao(Double.parseDouble(mainModel.primeiroNumero.replace(",",".")), Double.parseDouble(mainModel.segundoNumero.replace(",",".")))));
            getNumero(mainModel.primeiroNumero);
            mainModel.segundoNumero = "0";
        }else if(op.equalsIgnoreCase("divisao")){
            mainModel.primeiroNumero = (String.valueOf(MainModel.divisao(Double.parseDouble(mainModel.primeiroNumero.replace(",",".")), Double.parseDouble(mainModel.segundoNumero.replace(",",".")))));
            getNumero(mainModel.primeiroNumero);
            mainModel.segundoNumero = "0";
        }else if(op.equalsIgnoreCase("multiplicacao")){
            mainModel.primeiroNumero = (String.valueOf(MainModel.multiplicacao(Double.parseDouble(mainModel.primeiroNumero.replace(",",".")), Double.parseDouble(mainModel.segundoNumero.replace(",",".")))));
            getNumero(mainModel.primeiroNumero);
            mainModel.segundoNumero = "0";
        }
    }

    @Override
    public void getNumero(String numero) {

        view.atualizaNumeroDigitado(numero);
    }
}
