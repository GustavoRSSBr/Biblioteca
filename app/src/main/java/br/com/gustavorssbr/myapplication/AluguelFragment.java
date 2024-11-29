package br.com.gustavorssbr.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class AluguelFragment extends Fragment {
    private View view;

    private Spinner spAlunoAluguel, spExemplarAluguel;

    private EditText etDataRetiradaAluguel, etDataDevolucaoAluguel;

    private Button btnInserirAluguel, btnListarAluguel, btnExcluirAluguel, btnModificarAluguel;

    private TextView tvListarAluguel;

    public AluguelFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_aluguel, container, false);
        spAlunoAluguel = view.findViewById(R.id.spAlunoAluguel);
        spExemplarAluguel = view.findViewById(R.id.spExemplarAluguel);
        etDataRetiradaAluguel = view.findViewById(R.id.etDataRetiradaAluguel);
        etDataDevolucaoAluguel = view.findViewById(R.id.etDataDevolucaoAluguel);
        btnInserirAluguel = view.findViewById(R.id.btnInserirAluguel);
        btnListarAluguel = view.findViewById(R.id.btnListarAluguel);
        btnExcluirAluguel = view.findViewById(R.id.btnExcluirAluguel);
        btnModificarAluguel = view.findViewById(R.id.btnModificarAluguel);
        tvListarAluguel = view.findViewById(R.id.tvListarAluguel);
        return view;
    }
}