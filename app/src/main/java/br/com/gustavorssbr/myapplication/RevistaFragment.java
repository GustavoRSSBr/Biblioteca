package br.com.gustavorssbr.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RevistaFragment extends Fragment {
    private View view;

    private EditText etCodigoRevista, etNomeRevista, etQtdPaginasRevista, etIssnRevista;

    private Button btnBuscarRevista, btnInserirRevista, btnModificarRevista, btnExcluirRevista, btnListarRevista;

    private TextView tvListarRevista;

    public RevistaFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_revista, container, false);

        etCodigoRevista = view.findViewById(R.id.etCodigoRevista);
        etNomeRevista = view.findViewById(R.id.etNomeRevista);
        etQtdPaginasRevista = view.findViewById(R.id.etQtdPaginasRevista);
        etIssnRevista = view.findViewById(R.id.etIssnRevista);

        btnBuscarRevista = view.findViewById(R.id.btnBuscarRevista);
        btnInserirRevista = view.findViewById(R.id.btnInserirRevista);
        btnModificarRevista = view.findViewById(R.id.btnModificarRevista);
        btnExcluirRevista = view.findViewById(R.id.btnExcluirRevista);
        btnListarRevista = view.findViewById(R.id.btnListarRevista);

        return view;
    }
}