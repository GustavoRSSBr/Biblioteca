package br.com.gustavorssbr.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AlunoFragment extends Fragment {
    private View view;

    private EditText etRaAluno, etNomeAluno, etEmailAluno;
    private Button btnBuscarAluno, btnInserirAluno, btnModificarAluno, btnExcluirAluno, btnListarAluno;
    private TextView tvListarAluno;

    public AlunoFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_aluno, container, false);
        etRaAluno = view.findViewById(R.id.etRaAluno);
        etNomeAluno = view.findViewById(R.id.etNomeAluno);
        etEmailAluno = view.findViewById(R.id.etEmailAluno);

        btnBuscarAluno = view.findViewById(R.id.btnBuscarAluno);
        btnInserirAluno = view.findViewById(R.id.btnInserirAluno);
        btnModificarAluno = view.findViewById(R.id.btnModificarAluno);
        btnExcluirAluno = view.findViewById(R.id.btnExcluirAluno);
        btnListarAluno = view.findViewById(R.id.btnListarAluno);

        tvListarAluno = view.findViewById(R.id.tvListarAluno);

        return view;
    }
}