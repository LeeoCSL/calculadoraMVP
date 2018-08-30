package leonardoribeiro.calculadoramvp.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import leonardoribeiro.calculadoramvp.R;
import leonardoribeiro.calculadoramvp.model.MainModel;
import leonardoribeiro.calculadoramvp.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MVPMain.View{

    MainPresenter presenter = new MainPresenter(this, new MainModel());

    Button btnZero, btnUm, btnDois, btnTres, btnQuatro, btnCinco,
            btnSeis, btnSete, btnOito, btnNove, btnLimpa,
             btnIgual, btnMais, btnMenos, btnMultiplicar, btnDividir, btnVirgula;

    TextView tvNumeros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoadUI();

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.cliqueZero();
            }
        });

        btnUm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.cliqueUm();
            }
        });

        btnDois.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.cliqueDois();
            }
        });

        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.cliqueTres();
            }
        });

        btnQuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.cliqueQuatro();
            }
        });

        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.cliqueCinco();
            }
        });

        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.cliqueSeis();
            }
        });

        btnSete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.cliqueSete();
            }
        });

        btnOito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.cliqueOito();
            }
        });

        btnNove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.cliqueNove();
            }
        });

        btnLimpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.cliqueLimpar();
            }
        });

        btnVirgula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.cliqueVirgula();
            }
        });

        btnMais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.cliqueMais();
            }
        });

        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.cliqueMenos();
            }
        });

        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.cliqueDividir();
            }
        });

        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.cliqueMultiplicar();
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.cliqueIgual();
            }
        });
    }

    @Override
    public void atualizaNumeroDigitado(String numero) {
        tvNumeros.setText(numero);

    }

    private void LoadUI() {

        btnZero = findViewById(R.id.btnZero);
        btnUm = findViewById(R.id.btnUm);
        btnDois = findViewById(R.id.btnDois);
        btnTres = findViewById(R.id.btnTres);
        btnQuatro = findViewById(R.id.btnQuatro);
        btnCinco = findViewById(R.id.btnCinco);
        btnSeis = findViewById(R.id.btnSeis);
        btnSete = findViewById(R.id.btnSete);
        btnOito = findViewById(R.id.btnOito);
        btnNove = findViewById(R.id.btnNove);
        btnLimpa = findViewById(R.id.btnLimpa);
        btnIgual = findViewById(R.id.btnIgual);
        btnMais = findViewById(R.id.btnMais);
        btnMenos = findViewById(R.id.btnMenos);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnDividir = findViewById(R.id.btnDividir);
        btnVirgula = findViewById(R.id.btnVirgula);
        tvNumeros = findViewById(R.id.tvNumeros);
    }
}
