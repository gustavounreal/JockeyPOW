package com.grm.jockeypow;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private final Jogo jogo = new Jogo();
    private ImageView imagemApp;
    private TextView textoResultado;
    private TextView textoPlacar;
    private int vitorias;
    private int derrotas;
    private int empates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        imagemApp = findViewById(R.id.image_app);
        textoResultado = findViewById(R.id.textResultado);
        textoPlacar = findViewById(R.id.textPlacar);

        findViewById(R.id.imageView5).setOnClickListener(view -> jogar(Escolha.PEDRA));
        findViewById(R.id.imageView6).setOnClickListener(view -> jogar(Escolha.PAPEL));
        findViewById(R.id.imageView7).setOnClickListener(view -> jogar(Escolha.TESOURA));
    }

    private void jogar(Escolha escolhaUsuario) {
        Escolha escolhaComputador = jogo.escolherComputador();
        imagemApp.setImageResource(getImagemDaEscolha(escolhaComputador));
        Resultado resultado = jogo.avaliar(escolhaUsuario, escolhaComputador);
        atualizarPlacar(resultado);
        textoResultado.setText(getTextoDoResultado(resultado));
    }

    private void atualizarPlacar(Resultado resultado) {
        switch (resultado) {
            case VITORIA:
                vitorias++;
                break;
            case DERROTA:
                derrotas++;
                break;
            case EMPATE:
                empates++;
                break;
            default:
                throw new IllegalArgumentException("Resultado não suportado: " + resultado);
        }

        textoPlacar.setText(getString(
                R.string.placar, vitorias, derrotas, empates));
    }

    private int getImagemDaEscolha(Escolha escolha) {
        switch (escolha) {
            case PEDRA:
                return R.drawable.pedra;
            case PAPEL:
                return R.drawable.papel;
            case TESOURA:
                return R.drawable.tesoura;
            default:
                throw new IllegalArgumentException("Escolha não suportada: " + escolha);
        }
    }

    private int getTextoDoResultado(Resultado resultado) {
        switch (resultado) {
            case VITORIA:
                return R.string.resultado_vitoria;
            case DERROTA:
                return R.string.resultado_derrota;
            case EMPATE:
                return R.string.resultado_empate;
            default:
                throw new IllegalArgumentException("Resultado não suportado: " + resultado);
        }
    }
}
