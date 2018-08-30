package leonardoribeiro.calculadoramvp.ui.activity;

public interface MVPMain {

    interface View{
        void atualizaNumeroDigitado(String numero);

    }

    interface Presenser{
        void cliqueZero();
        void cliqueUm();
        void cliqueDois();
        void cliqueTres();
        void cliqueQuatro();
        void cliqueCinco();
        void cliqueSeis();
        void cliqueSete();
        void cliqueOito();
        void cliqueNove();
        void getNumero(String numero);
        void cliqueLimpar();
        void cliqueVirgula();
        void cliqueMais();
        void cliqueMenos();
        void cliqueDividir();
        void cliqueMultiplicar();

        void cliqueIgual();

    }

}
