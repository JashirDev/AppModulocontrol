package com.example.gamer.modulocontrolrecibo.Api;

import com.example.gamer.modulocontrolrecibo.modelo.PersonaRespuesta;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ControlService {
    @GET("recaudaciones")
    Call<PersonaRespuesta>obtenerlistapersona();
}
