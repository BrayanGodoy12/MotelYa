package com.example.motelya;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import model.Habitacion;
import model.Motel;

public class activityCards extends AppCompatActivity {
    public ArrayList<Motel> moteles;
    public ArrayList<Habitacion> habitaciones;


    RecyclerView rv ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
       rv = (RecyclerView)findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(activityCards.this);
        rv.setLayoutManager(llm);
    }
    public void llenarDatos(){
        Motel motel = new Motel("Bunker", "Villa Del Rosario, Norte de Santander", "https://www.google.com/url?sa=i&url=https%3A%2F%2Factivanovias.com%2Flisting%2Fel-bunker%2F&psig=AOvVaw3x72Gw9PygVXNPCqEJj8Vm&ust=1574614262893000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCLiW9LDlgOYCFQAAAAAdAAAAABAD", new ArrayList<Habitacion>());
        Motel motel2 = new Motel("San Juanito", "Av 29 13B-08, Urbanización Las Margaritas, Vía Bocono, Cúcuta, Norte de Santander", "https://www.google.com/maps/uv?hl=es&pb=!1s0x8e664457c9bfd757%3A0x4e0fbf65d1558bd1!3m1!7e115!4shttps%3A%2F%2Flh5.googleusercontent.com%2Fp%2FAF1QipPmTMDsHsdui4atAzYLjWZwqanhPs2kKmuije4Y%3Dw335-h176-k-no!5ssan%20juanito%20motel%20-%20Buscar%20con%20Google!15sCAQ&imagekey=!1e10!2sAF1QipPmTMDsHsdui4atAzYLjWZwqanhPs2kKmuije4Y&sa=X&ved=2ahUKEwiy0OTx5YDmAhWOrFkKHRTdBHUQoiowEHoECBgQBg#", new ArrayList<Habitacion>());
        moteles.add(motel);
        moteles.add(motel2);
    }


}